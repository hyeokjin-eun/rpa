package com.rpa.selenium.selenium;

import org.openqa.selenium.Keys;

public enum Key {
    F1("F1", Keys.F1),
    F2("F2", Keys.F2),
    F3("F3", Keys.F3),
    F4("F4", Keys.F4),
    F5("F5", Keys.F5),
    F6("F6", Keys.F6),
    F7("F7", Keys.F7),
    F8("F8", Keys.F8),
    F9("F9", Keys.F9),
    F10("F10", Keys.F10),
    F11("F11", Keys.F11),
    F12("F12", Keys.F12),
    TAB("TAB", Keys.TAB),
    LEFT_CONTROL("LEFT_CONTROL", Keys.LEFT_CONTROL),
    CONTROL("CONTROL", Keys.CONTROL),
    LEFT_ALT("LEFT_ALT", Keys.LEFT_ALT),
    ALT("ALT", Keys.ALT),
    LEFT_SHIFT("LEFT_SHIFT", Keys.LEFT_SHIFT),
    SHIFT("SHIFT", Keys.SHIFT),
    ARROW_UP("ARROW_UP", Keys.ARROW_UP),
    ARROW_DOWN("ARROW_DOWN", Keys.ARROW_DOWN),
    ARROW_LEFT("ARROW_LEFT", Keys.ARROW_LEFT),
    ARROW_RIGHT("ARROW_RIGHT", Keys.ARROW_RIGHT),
    INSERT("INSERT", Keys.INSERT),
    DELETE("DELETE", Keys.DELETE),
    HOME("HOME", Keys.HOME),
    END("END", Keys.END),
    PAGE_UP("PAGE_UP", Keys.PAGE_UP),
    PAGE_DOWN("PAGE_DOWN", Keys.PAGE_DOWN),
    SPACE("SPACE", Keys.SPACE),
    BACK_SPACE("BACK_SPACE", Keys.BACK_SPACE)
    ;

    private final String text;
    private final Keys keys;

    Key(String text, Keys keys) {
        this.text = text;
        this.keys = keys;
    }

    public String getText() {
        return text;
    }

    public Keys getKeys() {
        return keys;
    }
}
