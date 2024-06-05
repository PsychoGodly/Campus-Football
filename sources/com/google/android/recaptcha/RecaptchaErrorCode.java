package com.google.android.recaptcha;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public enum RecaptchaErrorCode {
    UNKNOWN_ERROR(0, "Unknown Error"),
    NETWORK_ERROR(1, "Network Error"),
    INVALID_SITEKEY(2, "Site key invalid"),
    INVALID_KEYTYPE(3, "Key type invalid"),
    INVALID_PACKAGE_NAME(4, "Package name not allowed"),
    INVALID_ACTION(5, "Invalid action name, may only include alphanumeric characters like [A-Z], [a-z], [0-9], / and _. Do not include user-specific information"),
    INTERNAL_ERROR(100, "Internal Error");
    
    private final int errorCode;
    private final String errorMessage;

    private RecaptchaErrorCode(int i10, String str) {
        this.errorCode = i10;
        this.errorMessage = str;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }
}
