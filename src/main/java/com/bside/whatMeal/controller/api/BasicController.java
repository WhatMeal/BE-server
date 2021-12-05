package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.domain.entity.Basic;
import com.bside.whatMeal.dto.reqdto.BasicPostReqDto;
import com.bside.whatMeal.service.BasicService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/basics")
@RequiredArgsConstructor
public class BasicController {

    private final BasicService basicService;

    @GetMapping()
    public List<Basic> getBasic(){
        return basicService.getBasic();
    }

    @PostMapping("/add_basic")
    public void addBasic(@RequestBody BasicPostReqDto reqDto){
        basicService.addBasic(reqDto);
    }
}
