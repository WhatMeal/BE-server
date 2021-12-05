package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Basic;
import com.bside.whatMeal.domain.entity.Food;
import com.bside.whatMeal.domain.entity.FoodBasic;
import com.bside.whatMeal.domain.repository.BasicRepository;
import com.bside.whatMeal.domain.repository.FoodBasicRepository;
import com.bside.whatMeal.domain.repository.FoodRepository;
import com.bside.whatMeal.dto.FoodPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FoodService {

    private final FoodRepository foodRepository;
    private final BasicRepository basicRepository;
    private final FoodBasicRepository foodBasicRepository;

    public void postFood(FoodPostReqDto reqDto){
//        ArrayList<Long> basicList = reqDto.getBasic();
        //Food table에 음식 이름 추가
        Food newFood = new Food();
        newFood = foodRepository.save(newFood);

//        없을 경우의 exception 처리 필요
        Basic basic = basicRepository.findById(reqDto.getBasic()).orElse(null);

        //추가된 내용 관계 테이블에 추가
        FoodBasic newFoodBasic = new FoodBasic();
        newFoodBasic.setFood(newFood);
        newFoodBasic.setBasic(basic);
        foodBasicRepository.save(newFoodBasic);
    }
}
