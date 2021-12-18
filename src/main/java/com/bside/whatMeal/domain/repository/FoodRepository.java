package com.bside.whatMeal.domain.repository;

import com.bside.whatMeal.domain.entity.Food;
import com.bside.whatMeal.utils.FoodMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    //In을 사용할 경우 Collections<>를 받아서 그 안에 있는 값이 있는 것들을 return 해줌
    //중복되는 값도 보내주기 때문에 Distinct 제약 추가
    List<FoodMapping> findDistinctAllBySoupAndBasicsIdInAndCooksIdInAndIngredientsIdInAndStatesIdIn
            (String soup, List<Integer> basic, List<Integer> cook, List<Integer> ingredient, List<Integer> state);
}
