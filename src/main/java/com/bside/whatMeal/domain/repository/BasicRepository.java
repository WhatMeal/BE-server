package com.bside.whatMeal.domain.repository;

import com.bside.whatMeal.domain.entity.Basic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BasicRepository extends JpaRepository<Basic, Long> {
}
