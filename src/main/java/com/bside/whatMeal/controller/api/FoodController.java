package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.dto.FoodListReqDto;
import com.bside.whatMeal.dto.FoodPostReqDto;
import com.bside.whatMeal.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foodList")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    public void getFoodList(){
        //조건에 맞는 음식 추천 리스트(5개씩) 가져오기
    }

    @PostMapping("/postNewFood")
    public void postFood(@RequestBody FoodPostReqDto reqDto){
        //신규 음식 추가 -> 사용자가 요청으로 넣은 음식 검토 후 추가 진행
        //admin으로 옮겨야하는 기능
        foodService.postFood(reqDto);
    }
}
