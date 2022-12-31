package com.rpa.selenium.web.controller;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.controller.dto.response.ResponseDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.service.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web")
@RequiredArgsConstructor
public class WebController {

    private final WebService webService;

    @PostMapping("/{platformType}/{functionType}")
    public ResponseDto<Boolean> web(
            @PathVariable PlatformType platformType,
            @PathVariable FunctionType functionType,
            @RequestBody WebRequestDto webRequestDto) {
        return ResponseDto.ofSuccess(webService.auto(platformType, functionType, webRequestDto));
    }
}
