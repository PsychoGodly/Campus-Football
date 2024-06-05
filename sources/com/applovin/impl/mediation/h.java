package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.de;
import com.applovin.impl.mediation.ads.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f9702a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ de f9703b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9704c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f9705d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ a.C0126a f9706f;

    public /* synthetic */ h(MediationServiceImpl mediationServiceImpl, de deVar, g gVar, Activity activity, a.C0126a aVar) {
        this.f9702a = mediationServiceImpl;
        this.f9703b = deVar;
        this.f9704c = gVar;
        this.f9705d = activity;
        this.f9706f = aVar;
    }

    public final void run() {
        this.f9702a.a(this.f9703b, this.f9704c, this.f9705d, this.f9706f);
    }
}
