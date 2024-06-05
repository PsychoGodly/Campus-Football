package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.q;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class v4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final t4 f25117a;

    /* renamed from: b  reason: collision with root package name */
    private final int f25118b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f25119c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f25120d;

    /* renamed from: f  reason: collision with root package name */
    private final String f25121f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, List<String>> f25122g;

    private v4(String str, t4 t4Var, int i10, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        q.k(t4Var);
        this.f25117a = t4Var;
        this.f25118b = i10;
        this.f25119c = th;
        this.f25120d = bArr;
        this.f25121f = str;
        this.f25122g = map;
    }

    public final void run() {
        this.f25117a.a(this.f25121f, this.f25118b, this.f25119c, this.f25120d, this.f25122g);
    }
}
