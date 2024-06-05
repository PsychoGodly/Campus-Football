package com.pichillilorenzo.flutter_inappwebview_android.types;

public enum PreferredContentModeOptionType {
    RECOMMENDED(0),
    MOBILE(1),
    DESKTOP(2);
    
    private final int value;

    private PreferredContentModeOptionType(int i10) {
        this.value = i10;
    }

    public static PreferredContentModeOptionType fromValue(int i10) {
        for (PreferredContentModeOptionType preferredContentModeOptionType : values()) {
            if (i10 == preferredContentModeOptionType.toValue()) {
                return preferredContentModeOptionType;
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
