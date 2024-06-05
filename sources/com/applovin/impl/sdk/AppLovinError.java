package com.applovin.impl.sdk;

public class AppLovinError {
    public static final AppLovinError NO_FILL = new AppLovinError(204, "No Fill");

    /* renamed from: a  reason: collision with root package name */
    private final int f11413a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11414b;

    public AppLovinError(int i10, String str) {
        this.f11413a = i10;
        this.f11414b = str;
    }

    /* access modifiers changed from: protected */
    public boolean canEqual(Object obj) {
        return obj instanceof AppLovinError;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AppLovinError)) {
            return false;
        }
        AppLovinError appLovinError = (AppLovinError) obj;
        if (!appLovinError.canEqual(this) || getCode() != appLovinError.getCode()) {
            return false;
        }
        String message = getMessage();
        String message2 = appLovinError.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    public int getCode() {
        return this.f11413a;
    }

    public String getMessage() {
        return this.f11414b;
    }

    public int hashCode() {
        String message = getMessage();
        return ((getCode() + 59) * 59) + (message == null ? 43 : message.hashCode());
    }

    public String toString() {
        return "AppLovinError(code=" + getCode() + ", message=" + getMessage() + ")";
    }
}
