package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.dto.reqdto.FoodPostReqDto;
import com.bside.whatMeal.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/foods")
@RequiredArgsConstructor
public class FoodController {

    private final FoodService foodService;

    @GetMapping()
    public void getFoodList(@RequestParam List<Integer> basic,
                            @RequestParam int soup,
                            @RequestParam(required = false) List<Integer> cook,
                            @RequestParam(required = false) List<Integer> ingredient,
                            @RequestParam(required = false) List<Integer> state,
                            @RequestParam int page){
        //조건에 맞는 음식 추천 리스트(5개씩) 가져오기 >> paging 사용
        //basic, soup는 필수값
        //basic은 최대 2개까지
        //soup, ingredient, state 0-2개
        //내용값이 아닌 id 값을 받아옴
        //pagination해서 내려줄 것이므로 page 필요
    }

    @PostMapping()
    public void postFood(@RequestBody FoodPostReqDto reqDto){
        //신규 음식 추가 -> 사용자가 요청으로 넣은 음식 검토 후 추가 진행
        //admin으로 옮겨야하는 기능
        foodService.postFood(reqDto);
    }
}
