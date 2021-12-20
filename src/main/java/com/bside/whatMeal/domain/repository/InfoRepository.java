package com.bside.whatMeal.domain.repository;

import com.bside.whatMeal.domain.entity.Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface InfoRepository extends JpaRepository<Info, Integer> {
    @Modifying(clearAutomatically = true)
    @Query("UPDATE Info i SET i.foodName = :foodName WHERE i.id = :id")
    void updateFinalFoodName(int id, String foodName);
}
