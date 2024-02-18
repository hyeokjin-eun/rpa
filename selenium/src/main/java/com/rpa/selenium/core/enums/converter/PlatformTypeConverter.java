package com.rpa.selenium.core.enums.converter;

import com.rpa.selenium.core.enums.PlatformType;
import com.rpa.selenium.data.exception.PlatformTypeNotSupportException;
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
