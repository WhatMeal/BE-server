package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Basic;
import com.bside.whatMeal.domain.repository.BasicRepository;
import com.bside.whatMeal.dto.reqdto.BasicPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasicService {
    private final BasicRepository basicRepository;

    public List<Basic> getBasic() {
        return basicRepository.findAll();
    }

    @Transactional
    public void addBasic(BasicPostReqDto reqDto){
        //basic 테이블에 데이터 추가
        basicRepository.save(Basic.builder().id(reqDto.getId()).basic(reqDto.getBasic()).build());
    }

}
