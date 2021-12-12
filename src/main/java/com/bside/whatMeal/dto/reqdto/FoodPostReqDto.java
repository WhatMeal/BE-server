package com.bside.whatMeal.dto.reqdto;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FoodPostReqDto {
    private String food; //음식 이름
    private List<Integer> basics; //기본값
    private String soup; //국물 유무
    private List<Integer> cooks; //조리 방법
    private List<Integer> ingredients; //재료
    private List<Integer> states; //상태
}
