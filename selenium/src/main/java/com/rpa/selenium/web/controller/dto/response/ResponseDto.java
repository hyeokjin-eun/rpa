package com.rpa.selenium.web.controller.dto.response;

import com.rpa.selenium.web.enums.ResponseCode;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Builder
@Getter
@RequiredArgsConstructor(staticName = "of")
public class ResponseDto<T> {

    private final int code;

    private final String message;

    private final LocalDateTime responseTime;

    private final T data;

    public static <T> ResponseDto<T> ofSuccess(T data) {
        return ResponseDto.of(
                ResponseCode.WEB_SUCCESS.getCode(),
                ResponseCode.WEB_SUCCESS.getMessage(),
                LocalDateTime.now(),
                data);
    }
}
