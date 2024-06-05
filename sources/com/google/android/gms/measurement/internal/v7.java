package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class v7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f25125a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f25126b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f25127c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f25128d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f25129f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ b7 f25130g;

    v7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f25130g = b7Var;
        this.f25125a = atomicReference;
        this.f25127c = str2;
        this.f25128d = str3;
        this.f25129f = z10;
    }

    public final void run() {
        this.f25130g.f25124a.E().M(this.f25125a, (String) null, this.f25127c, this.f25128d, this.f25129f);
    }
}
