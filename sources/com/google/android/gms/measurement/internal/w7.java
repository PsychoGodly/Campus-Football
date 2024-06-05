package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class w7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ AtomicReference f25213a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f25214b = null;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f25215c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ String f25216d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ b7 f25217f;

    w7(b7 b7Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f25217f = b7Var;
        this.f25213a = atomicReference;
        this.f25215c = str2;
        this.f25216d = str3;
    }

    public final void run() {
        this.f25217f.f25124a.E().L(this.f25213a, (String) null, this.f25215c, this.f25216d);
    }
}
