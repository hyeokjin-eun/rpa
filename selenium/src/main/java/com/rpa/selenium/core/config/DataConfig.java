package com.rpa.selenium.core.config;

import com.rpa.selenium.core.enums.converter.FunctionTypeConverter;
import com.rpa.selenium.core.enums.converter.PlatformTypeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class DataConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new PlatformTypeConverter());
        registry.addConverter(new FunctionTypeConverter());
    }
}
