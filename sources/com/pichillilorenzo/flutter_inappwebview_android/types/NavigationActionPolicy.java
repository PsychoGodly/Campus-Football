package com.pichillilorenzo.flutter_inappwebview_android.types;

public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);
    
    private final int value;

    private NavigationActionPolicy(int i10) {
        this.value = i10;
    }

    public static NavigationActionPolicy fromValue(int i10) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i10 == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i10);
    }

    public boolean equalsValue(int i10) {
        return this.value == i10;
    }

    public int rawValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
