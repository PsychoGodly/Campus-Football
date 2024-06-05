package com.unity3d.services.core.extensions;

import kotlin.jvm.internal.m;

/* compiled from: TaskExtensions.kt */
public final class AbortRetryException extends Exception {
    private final String reason;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbortRetryException(String str) {
        super(str);
        m.e(str, "reason");
        this.reason = str;
    }
}
