package com.unity3d.ads.core.extensions;

import com.google.protobuf.t1;
import com.google.protobuf.z;
import kotlin.jvm.internal.m;

/* compiled from: TimestampExtensions.kt */
public final class TimestampExtensionsKt {
    public static final long duration(long j10) {
        return System.nanoTime() - j10;
    }

    public static final t1 fromMillis(long j10) {
        long j11 = (long) 1000;
        z s10 = t1.k0().G(j10 / j11).F((int) ((j10 % j11) * ((long) 1000000))).build();
        m.d(s10, "newBuilder().setSeconds(…000000).toInt())).build()");
        return (t1) s10;
    }
}
