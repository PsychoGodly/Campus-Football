package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import com.applovin.impl.de;
import com.applovin.impl.mediation.ads.a;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MediationServiceImpl f9708a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ de f9709b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f9710c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9711d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.i f9712f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Activity f9713g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a.C0126a f9714h;

    public /* synthetic */ i(MediationServiceImpl mediationServiceImpl, de deVar, g gVar, ViewGroup viewGroup, androidx.lifecycle.i iVar, Activity activity, a.C0126a aVar) {
        this.f9708a = mediationServiceImpl;
        this.f9709b = deVar;
        this.f9710c = gVar;
        this.f9711d = viewGroup;
        this.f9712f = iVar;
        this.f9713g = activity;
        this.f9714h = aVar;
    }

    public final void run() {
        this.f9708a.a(this.f9709b, this.f9710c, this.f9711d, this.f9712f, this.f9713g, this.f9714h);
    }
}
