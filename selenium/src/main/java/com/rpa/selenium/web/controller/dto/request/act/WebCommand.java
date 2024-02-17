package com.rpa.selenium.web.controller.dto.request.act;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.rpa.selenium.selenium.WebDriver;
import com.rpa.selenium.web.controller.dto.request.act.*;
import com.rpa.selenium.web.enums.CommandType;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "type",
        visible = true
)
@JsonSubTypes(value = {
        @JsonSubTypes.Type(value = ClickWebCommand.class, name = CommandType.Values.CLICK),
        @JsonSubTypes.Type(value = FocusWebCommand.class, name = CommandType.Values.FOCUS),
        @JsonSubTypes.Type(value = WaitWebCommand.class, name = CommandType.Values.WAIT),
        @JsonSubTypes.Type(value = InputWebCommand.class, name = CommandType.Values.INPUT),
        @JsonSubTypes.Type(value = EnterWebCommand.class, name = CommandType.Values.ENTER),
        @JsonSubTypes.Type(value = ScrollWebCommand.class, name = CommandType.Values.SCROLL),
        @JsonSubTypes.Type(value = KeyTargetWebCommand.class, name = CommandType.Values.KEY_TARGET),
        @JsonSubTypes.Type(value = KeyWindowWebCommand.class, name = CommandType.Values.KEY_WINDOW),
        @JsonSubTypes.Type(value = DataWebCommand.class, name = CommandType.Values.DATA)
})
public interface WebCommand {

    boolean logic(WebDriver webDriver);
}
