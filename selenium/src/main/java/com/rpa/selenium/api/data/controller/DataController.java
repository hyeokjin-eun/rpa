package com.rpa.selenium.api.data.controller;

import com.rpa.selenium.api.data.dto.request.DataRequestDto;
import com.rpa.selenium.core.dto.response.ResponseDto;
import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.core.enums.PlatformType;
import com.rpa.selenium.core.service.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/data")
@RequiredArgsConstructor
public class DataController {

    private final DataService dataService;

    @PostMapping("/{platformType}/{functionType}")
    public ResponseDto<Boolean> web(
            @PathVariable PlatformType platformType,
            @PathVariable FunctionType functionType,
            @RequestBody DataRequestDto dataRequestDto) {
        return ResponseDto.ofSuccess(dataService.auto(platformType, functionType, dataRequestDto));
    }
}
