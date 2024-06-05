package com.unity3d.ads.core.data.model.exception;

import kotlin.jvm.internal.m;

/* compiled from: ExposureException.kt */
public final class ExposureException extends Exception {
    private final Object[] parameters;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExposureException(String str, Object[] objArr) {
        super(str);
        m.e(str, "message");
        m.e(objArr, "parameters");
        this.parameters = objArr;
    }

    public final Object[] getParameters() {
        return this.parameters;
    }
}
