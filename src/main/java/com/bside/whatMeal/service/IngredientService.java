package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Ingredient;
import com.bside.whatMeal.domain.repository.IngredientRepository;
import com.bside.whatMeal.dto.reqdto.IngredientPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public List<Ingredient> getIngredient() {
        //DB에 존재하는 모든 값을 불러옴
        return ingredientRepository.findAll();
    }

    @Transactional
    public void addIngredient(IngredientPostReqDto reqDto) {
        ingredientRepository.save(Ingredient.builder().id(reqDto.getId()).ingredient(reqDto.getIngredient()).build());
    }
}
