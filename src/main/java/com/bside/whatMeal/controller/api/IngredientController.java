package com.bside.whatMeal.controller.api;


import com.bside.whatMeal.domain.entity.Ingredient;
import com.bside.whatMeal.dto.reqdto.IngredientPostReqDto;
import com.bside.whatMeal.service.IngredientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
@RequiredArgsConstructor
public class IngredientController {

    private final IngredientService ingredientService;

    @GetMapping()
    public List<Ingredient> getIngredient(){
        //선택할 수 있는 재료 종류를 전달하는 API
        return ingredientService.getIngredient();
    }

    @PostMapping()
    public void postIngredient(@RequestBody IngredientPostReqDto reqDto){
        //재료 종류 선택지를 추가하는 API
        //음식 하나에 메인 재료(?)가 여러개 존재할 수 있는가?
        ingredientService.postIngredient(reqDto);
    }
}
