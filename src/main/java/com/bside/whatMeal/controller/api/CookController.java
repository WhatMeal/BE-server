package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.domain.entity.Cook;
import com.bside.whatMeal.dto.reqdto.CookPostReqDto;
import com.bside.whatMeal.service.CookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cooks")
public class CookController {
    //TODO: delete, modify api
    //TODO: error 처리, validation >> dto에서 진행?
    private final CookService cookService;

    @GetMapping()
    public List<Cook> getCook(){
        //선택할 수 있는 조리 종류를 전달하는 API
        return cookService.getCook();
    }

    @PostMapping()
    public void addCook(@RequestBody CookPostReqDto reqDto){
        //조리 종류 선택지를 추가하는 API
        //
        cookService.addCook(reqDto);
    }
}
