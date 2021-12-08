package com.bside.whatMeal.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Food {
    //음식 이름
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String food;
    private String soup;
}
