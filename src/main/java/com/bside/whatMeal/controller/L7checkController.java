package com.bside.whatMeal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/l7check")
public class L7checkController {

    @GetMapping
    public String l7check(){
        //서버가 제대로 연결됐는지 확인
        return "connection success";
    }
}
