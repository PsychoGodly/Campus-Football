package com.unity3d.ads.core.utils;

import fe.a;
import kotlin.jvm.internal.m;
import pe.a0;
import pe.c2;
import pe.k0;
import pe.p0;
import pe.q0;
import pe.r0;
import pe.z2;
import sd.w;
import xd.d;

/* compiled from: CommonCoroutineTimer.kt */
public final class CommonCoroutineTimer implements CoroutineTimer {
    private final k0 dispatcher;
    private final a0 job;
    private final p0 scope;

    public CommonCoroutineTimer(k0 k0Var) {
        m.e(k0Var, "dispatcher");
        this.dispatcher = k0Var;
        a0 b10 = z2.b((c2) null, 1, (Object) null);
        this.job = b10;
        this.scope = q0.a(k0Var.plus(b10));
    }

    public c2 start(long j10, long j11, a<w> aVar) {
        m.e(aVar, "action");
        return k.d(this.scope, this.dispatcher, (r0) null, new CommonCoroutineTimer$start$1(j10, aVar, j11, (d<? super CommonCoroutineTimer$start$1>) null), 2, (Object) null);
    }
}
