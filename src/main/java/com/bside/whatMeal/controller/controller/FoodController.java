package com.bside.whatMeal.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodList")
public class FoodController {

    public void getFoodList(){
        //조건에 맞는 음식 추천 리스트(5개씩) 가져오기
    }

    public void postFood(){
        //신규 음식 추가 -> 사용자가 요청으로 넣은 음식 검토 후 추가 진행
    }
}
