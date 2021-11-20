package com.bside.whatMeal.dto;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class FoodPostReqDto {

    private String food;
//    private ArrayList<Long> basic;
    //일단 basic을 한 번에 한 개씩만 입력 받을 수 있다고 가정 -> 추후 여러개로 변동
    private Long basic;

    //추후 추가될 카테고리들
//    private String soup;
//    private ArrayList<String>
}
