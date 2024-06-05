package com.google.android.recaptcha;

import kotlin.jvm.internal.h;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class RecaptchaException extends Exception {
    private final RecaptchaErrorCode errorCode;
    private final String errorMessage;

    public RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str) {
        super(str);
        this.errorCode = recaptchaErrorCode;
        this.errorMessage = str;
    }

    public final RecaptchaErrorCode getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RecaptchaException(RecaptchaErrorCode recaptchaErrorCode, String str, int i10, h hVar) {
        this(recaptchaErrorCode, (i10 & 2) != 0 ? recaptchaErrorCode.getErrorMessage() : str);
    }
}
