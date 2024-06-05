package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.i;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class n1<O extends a.d> extends b0 {

    /* renamed from: c  reason: collision with root package name */
    private final e<O> f15212c;

    public n1(e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f15212c = eVar;
    }

    public final <A extends a.b, T extends d<? extends i, A>> T e(T t10) {
        return this.f15212c.doWrite(t10);
    }

    public final Looper f() {
        return this.f15212c.getLooper();
    }

    public final void j(k2 k2Var) {
    }
}
