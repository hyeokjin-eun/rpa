package com.rpa.selenium.web.service.function.facebook;

import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.exception.FunctionTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FaceBookFunctionFactory {

    private final List<FaceBookFunction> faceBookFunctionList;

    public FaceBookFunction getInstance(FunctionType functionType) {
        for (FaceBookFunction faceBookFunction : faceBookFunctionList) {
            if (faceBookFunction.getFunctionType() == functionType) return faceBookFunction;
        }

        throw new FunctionTypeNotSupportException();
    }
}
