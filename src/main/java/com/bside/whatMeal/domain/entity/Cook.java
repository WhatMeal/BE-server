package com.bside.whatMeal.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Cook {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String cook;

    @Builder
    public Cook(int id, String cook){
        this.id = id;
        this.cook = cook;
    }
}
