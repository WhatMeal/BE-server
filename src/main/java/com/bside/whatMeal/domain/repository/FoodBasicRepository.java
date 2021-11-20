package com.bside.whatMeal.domain.repository;

import com.bside.whatMeal.domain.entity.FoodBasic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodBasicRepository extends JpaRepository<FoodBasic, Long> {
}