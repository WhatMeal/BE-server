package com.bside.whatMeal.domain.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity

public class Info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int age; //나이대
    private String mealTime; //식사시간(아침, 점심, 저녁)
    private String standard1; //메뉴 선정 기준1
    private String standard2; //메뉴 선정 기준2
    private String foodName; //최종 선택한 음식

    @Builder(builderClassName = "onboarding", builderMethodName = "onboarding")
    public Info(int age, String mealTime, String standard1, String standard2){
        this.age = age;
        this.mealTime = mealTime;
        this.standard1 = standard1;
        this.standard2 = standard2;
    }
    @Builder(builderClassName = "finalFoodName", builderMethodName = "finalFoodName")
    public Info(int id, String foodName) {
        this.id = id;
        this.foodName = foodName;
    }
}
