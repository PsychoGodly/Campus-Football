package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.m;

/* compiled from: LoadException.kt */
public final class LoadException extends Exception {
    private final int errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadException(int i10, String str) {
        super(str);
        m.e(str, "message");
        this.errorCode = i10;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
