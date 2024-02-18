package com.rpa.selenium.core.enums.converter;

import com.rpa.selenium.core.enums.FunctionType;
import com.rpa.selenium.data.exception.FunctionTypeNotSupportException;
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
