package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Cook;
import com.bside.whatMeal.domain.repository.CookRepository;
import com.bside.whatMeal.dto.reqdto.CookPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CookService {

    private final CookRepository cookRepository;

    public List<Cook> getCook(){
        return cookRepository.findAll();
    }

    public void postCook(CookPostReqDto reqDto) {
        cookRepository.save(Cook.builder().cook(reqDto.getCook()).build());
    }
}
