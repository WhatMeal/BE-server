package com.bside.whatMeal.service;

import com.bside.whatMeal.domain.entity.State;
import com.bside.whatMeal.domain.repository.StateRepository;
import com.bside.whatMeal.dto.reqdto.StatePostReqDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StateService {

    private final StateRepository stateRepository;

    public List<State> getState() {
        return stateRepository.findAll();
    }

    @PostMapping()
    public void addState(StatePostReqDto reqDto){
        stateRepository.save(State.builder().state(reqDto.getState()).build());
    }
}
