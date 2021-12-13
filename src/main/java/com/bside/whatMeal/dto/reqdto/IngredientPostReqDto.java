package com.bside.whatMeal.dto.reqdto;

import lombok.Getter;

@Getter
public class IngredientPostReqDto {
//    private int id; >> auto inc로 하지 않을 경우 필요
    private int id;
    private String ingredient;
}
