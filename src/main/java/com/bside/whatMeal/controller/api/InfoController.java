package com.bside.whatMeal.controller.api;

import com.bside.whatMeal.domain.entity.Info;
import com.bside.whatMeal.dto.reqdto.InfoFinalFoodPostReqDto;
import com.bside.whatMeal.dto.reqdto.InfoPostReqDto;
import com.bside.whatMeal.dto.resdto.InfoIdResDto;
import com.bside.whatMeal.dto.resdto.PostResultResDto;
import com.bside.whatMeal.service.InfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("/infos")
@RequiredArgsConstructor

public class InfoController {
    private final InfoService infoService;

    @GetMapping()
    public List<Info> getInfoList() {
        return infoService.getInfo();
    }

    @PostMapping("/onboarding")
    //온보딩 이후 저장 되는 info
    public InfoIdResDto addInfoOnboarding(@RequestBody InfoPostReqDto reqDto) {
        return infoService.addInfoOnboarding(reqDto);
    }

    @PutMapping("/finalfood")
    //최종 음식 정한 후 음식 추가 info
    public PostResultResDto addInfoFinalFood(@RequestBody InfoFinalFoodPostReqDto reqDto) throws UnsupportedEncodingException {
        return infoService.addInfoFinalFood(reqDto);
    }
}
