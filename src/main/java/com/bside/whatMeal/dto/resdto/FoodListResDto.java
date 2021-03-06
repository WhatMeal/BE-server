package com.bside.whatMeal.dto.resdto;


import lombok.*;

import java.util.List;

@Getter
@NoArgsConstructor
public class FoodListResDto {
    //사용자가 요청한 정보 기반으로 산출된 음식 리스트를 반환하는 dto
    //paging 처리하여 각 5개씩 return하도록

    private List<ResFood> resFood;
    private int page; //현재 페이지
    private boolean has_next; //전체 페이지 수

    @Builder
    public FoodListResDto(List<ResFood> resFood, int page, boolean has_next){
        this.resFood = resFood;
        this.page = page;
        this.has_next = has_next;
    }

    @Data
    @AllArgsConstructor
    public static class ResFood {
        private String food;
        private String imgSrc;
    }
}
