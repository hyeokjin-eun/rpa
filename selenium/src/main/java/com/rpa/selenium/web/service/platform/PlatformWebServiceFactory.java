package com.rpa.selenium.web.service.platform;

import com.rpa.selenium.web.enums.PlatformType;
import com.rpa.selenium.web.exception.PlatformTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlatformWebServiceFactory {

    private final List<PlatformWebService> platformWebServiceList;

    public PlatformWebService getInstance(PlatformType platformType) {
        for (PlatformWebService platformWebService : platformWebServiceList) {
            if (platformWebService.getPlatformType() == platformType) return platformWebService;
        }

        throw new PlatformTypeNotSupportException();
    }
}
