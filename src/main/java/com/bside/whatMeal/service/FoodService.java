package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Basic;
import com.bside.whatMeal.domain.entity.Food;
import com.bside.whatMeal.domain.repository.BasicRepository;
import com.bside.whatMeal.domain.repository.FoodRepository;
import com.bside.whatMeal.dto.reqdto.FoodPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final BasicRepository basicRepository;

    public void getFoodList(List<Integer> basic,
                            int soup,
                            List<Integer> cook,
                            List<Integer> ingredient,
                            List<Integer> state,
                            int page){
        //cook, ingredient, state는 없는 경우 존재
        //없는 경우에는 전부로 해당됨
        //조인 필요한 테이블 : food - basic - cook - ingredient- state
    }

    public void postFood(FoodPostReqDto reqDto){
//        ArrayList<Long> basicList = reqDto.getBasic();
        //Food table에 음식 이름 추가
        Food newFood = new Food();
        newFood = foodRepository.save(newFood);

//        없을 경우의 exception 처리 필요
        Basic basic = basicRepository.findById(reqDto.getBasic()).orElse(null);

        //추가된 내용 관계 테이블에 추가
    }
}
