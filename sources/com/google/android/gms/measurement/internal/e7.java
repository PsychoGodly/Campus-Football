package com.google.android.gms.measurement.internal;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
public final /* synthetic */ class e7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ b7 f24558a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ List f24559b;

    public /* synthetic */ e7(b7 b7Var, List list) {
        this.f24558a = b7Var;
        this.f24559b = list;
    }

    public final void run() {
        this.f24558a.W(this.f24559b);
    }
}
