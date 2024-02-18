package com.rpa.selenium.api.data.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DataRequestDto {

    private OpenData openData;

    private List<DataCommand> dataCommands;
}
