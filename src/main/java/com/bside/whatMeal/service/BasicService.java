package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.Basic;
import com.bside.whatMeal.domain.repository.BasicRepository;
import com.bside.whatMeal.dto.reqdto.BasicPostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BasicService {
    private final BasicRepository basicRepository;

    public List<Basic> getBasic() {
        List<Basic> basics = basicRepository.findAll();

        return basics;
    }

    public void addBasic(BasicPostReqDto reqDto){
        //basic 테이블에 데이터 추가
        Basic new_basic = new Basic();
        new_basic.setBasic(reqDto.getBasic());
        basicRepository.save(new_basic); //basic의 값 저장
    }

}
