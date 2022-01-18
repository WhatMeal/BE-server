package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Cook;
import com.bside.whatMeal.domain.repository.CookRepository;
import com.bside.whatMeal.dto.reqdto.CookPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CookService {

    private final CookRepository cookRepository;

    public List<Cook> getCook(){
        return cookRepository.findAll();
    }

    @Transactional
    public void addCook(CookPostReqDto reqDto) {
        cookRepository.save(Cook.builder().id(reqDto.getId()).cook(reqDto.getCook()).build());
    }
}
