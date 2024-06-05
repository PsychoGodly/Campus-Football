package com.pichillilorenzo.flutter_inappwebview_android.types;

public enum UserScriptInjectionTime {
    AT_DOCUMENT_START(0),
    AT_DOCUMENT_END(1);
    
    private final int value;

    private UserScriptInjectionTime(int i10) {
        this.value = i10;
    }

    public static UserScriptInjectionTime fromValue(int i10) {
        for (UserScriptInjectionTime userScriptInjectionTime : values()) {
            if (i10 == userScriptInjectionTime.toValue()) {
                return userScriptInjectionTime;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i10);
    }

    public boolean equalsValue(int i10) {
        return this.value == i10;
    }

    public int toValue() {
        return this.value;
    }
}
