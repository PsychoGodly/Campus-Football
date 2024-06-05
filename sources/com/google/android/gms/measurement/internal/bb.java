package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.q;

/* compiled from: com.google.android.gms:play-services-measurement@@21.5.0 */
final class bb implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24411a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24412b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f24413c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ cb f24414d;

    bb(cb cbVar, String str, String str2, Bundle bundle) {
        this.f24414d = cbVar;
        this.f24411a = str;
        this.f24412b = str2;
        this.f24413c = bundle;
    }

    public final void run() {
        this.f24414d.f24445a.p((d0) q.k(this.f24414d.f24445a.i0().B(this.f24411a, this.f24412b, this.f24413c, "auto", this.f24414d.f24445a.zzb().a(), false, true)), this.f24411a);
    }
}
