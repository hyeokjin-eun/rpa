package com.rpa.selenium.web.config;

import com.rpa.selenium.web.enums.converter.FunctionTypeConverter;
import com.rpa.selenium.web.enums.converter.PlatformTypeConverter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(new PlatformTypeConverter());
        registry.addConverter(new FunctionTypeConverter());
    }
}
