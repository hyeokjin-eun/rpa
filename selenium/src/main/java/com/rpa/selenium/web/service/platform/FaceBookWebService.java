package com.rpa.selenium.web.service.platform;

import com.rpa.selenium.web.controller.dto.request.WebRequestDto;
import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.exception.SeleniumFailException;
import com.rpa.selenium.web.service.function.facebook.FaceBookFunction;
import com.rpa.selenium.web.service.function.facebook.FaceBookFunctionFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FaceBookWebService implements PlatformWebService {

    private final FaceBookFunctionFactory faceBookFunctionFactory;

    @Override
    public PlatformType getPlatformType() {
        return PlatformType.FACEBOOK;
    }

    @Override
    public boolean auto(FunctionType functionType, WebRequestDto webRequestDto) {
        FaceBookFunction faceBookFunction = faceBookFunctionFactory.getInstance(functionType);
        String driverId = faceBookFunction.open();
        boolean success;
        try {
            success = faceBookFunction.logic(driverId, webRequestDto.getWebCommands());
        } catch (Exception exception) {
            log.error("{}", exception);
            faceBookFunction.close(driverId);
            throw new SeleniumFailException();
        }
        faceBookFunction.close(driverId);
        return success;
    }
}
