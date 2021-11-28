package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.dto.BasicPostReqDto;
import com.bside.whatMeal.service.BasicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basic")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @PostMapping("/add_basic")
    public void addBasic(@RequestBody BasicPostReqDto reqDto){
        basicService.addBasic(reqDto);
    }
}
