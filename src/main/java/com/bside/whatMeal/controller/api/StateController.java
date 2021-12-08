package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.domain.entity.State;
import com.bside.whatMeal.dto.reqdto.StatePostReqDto;
import com.bside.whatMeal.service.StateService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/states")
public class StateController {
    //TODO: delete, modify
    //TODO: error & exception
    //TODO: data validation

    private final StateService stateService;

    @GetMapping()
    public List<State> getState(){
        //선택할 수 있는 상태를 전달하는 API
        return stateService.getState();
    }

    @PostMapping()
    public void addState(@RequestBody StatePostReqDto reqDto){
        //상태 선택지를 추가하는 API
        stateService.addState(reqDto);
    }
}
