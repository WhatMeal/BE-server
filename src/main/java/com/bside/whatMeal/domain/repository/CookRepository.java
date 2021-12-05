package com.bside.whatMeal.domain.repository;

import com.bside.whatMeal.domain.entity.Cook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CookRepository extends JpaRepository<Cook, Integer> {
}
