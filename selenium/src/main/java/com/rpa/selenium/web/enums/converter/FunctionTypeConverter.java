package com.rpa.selenium.web.enums.converter;

import com.rpa.selenium.web.enums.FunctionType;
import com.rpa.selenium.web.exception.FunctionTypeNotSupportException;
import org.springframework.core.convert.converter.Converter;

public class FunctionTypeConverter implements Converter<String, FunctionType> {

    @Override
    public FunctionType convert(String source) {
        try {
            return FunctionType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new FunctionTypeNotSupportException();
        }
    }
}
