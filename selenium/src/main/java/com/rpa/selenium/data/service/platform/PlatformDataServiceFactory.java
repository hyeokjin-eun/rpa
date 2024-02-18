package com.rpa.selenium.data.service.platform;

import com.rpa.selenium.core.enums.PlatformType;
import com.rpa.selenium.data.exception.PlatformTypeNotSupportException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PlatformDataServiceFactory {

    private final List<PlatformDataService> platformDataServiceList;

    public PlatformDataService getInstance(PlatformType platformType) {
        for (PlatformDataService platformDataService : platformDataServiceList) {
            if (platformDataService.getPlatformType() == platformType) return platformDataService;
        }

        throw new PlatformTypeNotSupportException();
    }
}
