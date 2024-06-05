package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfvf extends TimeoutException {
    /* synthetic */ zzfvf(String str, zzfve zzfve) {
        super(str);
    }

    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
