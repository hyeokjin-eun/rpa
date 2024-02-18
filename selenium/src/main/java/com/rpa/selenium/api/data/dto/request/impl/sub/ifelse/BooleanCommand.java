package com.rpa.selenium.api.data.dto.request.impl.sub.ifelse;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.impl.EqualsCommand;
import com.rpa.selenium.api.data.dto.request.impl.sub.ifelse.impl.IsCommand;
import com.rpa.selenium.data.enums.BooleanType;
import com.rpa.selenium.selenium.WebDriver;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = EqualsCommand.class, name = BooleanType.Values.EQUALS),
        @JsonSubTypes.Type(value = IsCommand.class, name = BooleanType.Values.IS)
})
public interface BooleanCommand {

    boolean is(WebDriver webDriver);
}
