package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Info;
import com.bside.whatMeal.domain.repository.InfoRepository;
import com.bside.whatMeal.dto.reqdto.InfoFinalFoodPostReqDto;
import com.bside.whatMeal.dto.reqdto.InfoPostReqDto;
import com.bside.whatMeal.dto.resdto.InfoIdResDto;
import com.bside.whatMeal.dto.resdto.PostResultResDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfoService {
    private final InfoRepository infoRepository;

    public List<Info> getInfo() {
        List<Info> infos = infoRepository.findAll();
        return infos;
    }

    //온보딩 후 Info저장
    @Transactional
    public InfoIdResDto addInfoOnboarding(InfoPostReqDto reqDto) {
        Info info = infoRepository.saveAndFlush(
                Info
                        .onboarding()
                        .age(reqDto.getAge())
                        .mealTime(reqDto.getMealTime())
                        .standard1(reqDto.getStandard1())
                        .standard2(reqDto.getStandard2())
                        .build()
        );

        InfoIdResDto resDto = new InfoIdResDto();
        resDto.setId(info.getId());

        return resDto;
    }

    //최종 음식 정한 후 Info에 추가 저장
    @Transactional
    public PostResultResDto addInfoFinalFood(InfoFinalFoodPostReqDto reqDto) {
        infoRepository.updateFinalFoodName(reqDto.getId(), reqDto.getFoodName());

        PostResultResDto resDto = new PostResultResDto();
        resDto.setResult("success");

        return resDto;
    }
}
