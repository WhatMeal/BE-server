package com.bside.whatMeal.dto.reqdto;

import lombok.Getter;

@Getter
public class InfoPostReqDto {

    private int age; //나이대
    private String mealTime; //식사시간(아침, 점심, 저녁)
    private String standard1; //메뉴 선정 기준1
    private String standard2; //메뉴 선정 기준2
    private String foodName; //최종 선택한 음식
}
