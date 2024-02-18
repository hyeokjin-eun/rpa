package com.rpa.selenium.api.data.dto.request.impl.sub.foreach;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rpa.selenium.api.data.dto.request.impl.sub.foreach.impl.DataCommand;
import com.rpa.selenium.data.enums.ForEachType;
import com.rpa.selenium.selenium.WebElement;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = DataCommand.class, name = ForEachType.Values.DATA),
})
public interface ForEachCommand {

    boolean logic(WebElement webElement);
}
