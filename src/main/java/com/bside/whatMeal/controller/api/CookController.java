package com.bside.whatMeal.controller.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class CookController {

    @GetMapping()
    public void getIngredient(){
        //선택할 수 있는 조리 종류를 전달하는 API
    }

    @PostMapping
    public void postIngredient(){
        //조리 종류 선택지를 추가하는 API
    }
}
