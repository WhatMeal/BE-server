package com.bside.whatMeal.dto.resdto;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class FoodListResDto {
    //사용자가 요청한 정보 기반으로 산출된 음식 리스트를 반환하는 dto
    //paging 처리하여 각 5개씩 return하도록

    private List<String> food;
    private int page; //현재 페이지
    private int total_page; //전체 페이지 수

    @Builder
    public FoodListResDto(List<String> food, int page, int total_page){
        this.food = food;
        this.page = page;
        this.total_page = total_page;
    }
}
