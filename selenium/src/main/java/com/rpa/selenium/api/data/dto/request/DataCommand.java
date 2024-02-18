package com.rpa.selenium.api.data.dto.request;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rpa.selenium.api.data.dto.request.impl.*;
import com.rpa.selenium.api.data.dto.request.impl.sub.foreach.ForEachCommand;
import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.data.enums.CommandType;
import org.openqa.selenium.WebElement;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = ClickDataCommand.class, name = CommandType.Values.CLICK),
        @JsonSubTypes.Type(value = WaitDataCommand.class, name = CommandType.Values.WAIT),
        @JsonSubTypes.Type(value = InputDataCommand.class, name = CommandType.Values.INPUT),
        @JsonSubTypes.Type(value = ScrollDataCommand.class, name = CommandType.Values.SCROLL),
        @JsonSubTypes.Type(value = KeyTargetDataCommand.class, name = CommandType.Values.KEY_TARGET),
        @JsonSubTypes.Type(value = KeyWindowDataCommand.class, name = CommandType.Values.KEY_WINDOW),
        @JsonSubTypes.Type(value = IfElseDataCommand.class, name = CommandType.Values.IF_ELSE),
        @JsonSubTypes.Type(value = ForEachDataCommand.class, name = CommandType.Values.FOR_EACH)
})
public interface DataCommand {

    boolean logic(WebDriver webDriver);
}
