package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.5.0 */
final class p7 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f24923a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f24924b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ long f24925c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Bundle f24926d;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ boolean f24927f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ boolean f24928g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f24929h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ String f24930i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ b7 f24931j;

    p7(b7 b7Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f24931j = b7Var;
        this.f24923a = str;
        this.f24924b = str2;
        this.f24925c = j10;
        this.f24926d = bundle;
        this.f24927f = z10;
        this.f24928g = z11;
        this.f24929h = z12;
        this.f24930i = str3;
    }

    public final void run() {
        this.f24931j.O(this.f24923a, this.f24924b, this.f24925c, this.f24926d, this.f24927f, this.f24928g, this.f24929h, this.f24930i);
    }
}
