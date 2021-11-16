package com.bside.whatMeal.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Basic {
    //기본 선택 관련 : 밥, 면, 빵
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String basic;
}
