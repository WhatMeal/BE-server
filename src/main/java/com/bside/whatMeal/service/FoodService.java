package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Food;
import com.bside.whatMeal.domain.repository.*;
import com.bside.whatMeal.dto.reqdto.FoodPostReqDto;
import com.bside.whatMeal.dto.resdto.FoodListResDto;
import com.bside.whatMeal.utils.FoodMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final BasicRepository basicRepository;
    private final CookRepository cookRepository;
    private final IngredientRepository ingredientRepository;
    private final StateRepository stateRepository;

    public FoodListResDto getFoodList(List<Integer> basics,
                                            String soup,
                                            List<Integer> cooks,
                                            List<Integer> ingredients,
                                            List<Integer> states,
                                            int page){
        //없는 경우에는 전부로 해당됨 -> 조건에서 빼놓고 진행하기 or 모든 값 다 넣어주기? -> 선택 안하면 모든 값 다 보내주기(FE)
        //조인 필요한 테이블 : food - basic - cook - ingredient- state
        //pagination 진행
        PageRequest pageRequest = PageRequest.of(page - 1, 5);
        //DB로부터 정보 받아오기
        Page<FoodMapping> result =
                foodRepository.findDistinctAllBySoupAndBasicsIdInAndCooksIdInAndIngredientsIdInAndStatesIdIn(
                        pageRequest, soup, basics, cooks, ingredients, states);
        List<String> foods = new ArrayList<>();
        result.getContent().forEach(food -> foods.add(food.getFood()));
        return new FoodListResDto(foods, page, result.hasNext());
    }

    @Transactional
    public void postFood(FoodPostReqDto reqDto){
//        ArrayList<Long> basicList = reqDto.getBasic();
        //Food table에 음식 이름 추가
        Food newFood = Food.builder().food(reqDto.getFood()).soup(reqDto.getSoup()).build();
//        newFood = foodRepository.save(newFood);
        //TODO: 없을 경우의 exception 처리 필요
        reqDto.getBasics().forEach(basic -> newFood.addBasic(basicRepository.findById(basic).orElse(null)));
        reqDto.getCooks().forEach(cook -> newFood.addCook(cookRepository.findById(cook).orElse(null)));
        reqDto.getIngredients().forEach(ingredient -> newFood.addIngredient(ingredientRepository.findById(ingredient).orElse(null)));
        reqDto.getStates().forEach(state -> newFood.addState(stateRepository.findById(state).orElse(null)));

        foodRepository.save(newFood);
    }
}
