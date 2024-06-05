package com.applovin.impl;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class ic {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f8514h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f8515a;

    /* renamed from: b  reason: collision with root package name */
    public final j5 f8516b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f8517c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f8518d;

    /* renamed from: e  reason: collision with root package name */
    public final long f8519e;

    /* renamed from: f  reason: collision with root package name */
    public final long f8520f;

    /* renamed from: g  reason: collision with root package name */
    public final long f8521g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ic(long r13, com.applovin.impl.j5 r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f8675a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ic.<init>(long, com.applovin.impl.j5, long):void");
    }

    public static long a() {
        return f8514h.getAndIncrement();
    }

    public ic(long j10, j5 j5Var, Uri uri, Map map, long j11, long j12, long j13) {
        this.f8515a = j10;
        this.f8516b = j5Var;
        this.f8517c = uri;
        this.f8518d = map;
        this.f8519e = j11;
        this.f8520f = j12;
        this.f8521g = j13;
    }
}
