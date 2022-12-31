package com.rpa.selenium.web.enums.converter;

import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.exception.PlatformTypeNotSupportException;
import org.springframework.core.convert.converter.Converter;

public class PlatformTypeConverter implements Converter<String, PlatformType> {

    @Override
    public PlatformType convert(String source) {
        try {
            return PlatformType.valueOf(source.toUpperCase());
        } catch (IllegalArgumentException exception) {
            throw new PlatformTypeNotSupportException();
        }
    }
}
