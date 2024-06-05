package com.applovin.impl.mediation;

import android.app.Activity;
import com.applovin.impl.be;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9644a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ be f9645b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f9646c;

    public /* synthetic */ e0(g gVar, be beVar, Activity activity) {
        this.f9644a = gVar;
        this.f9645b = beVar;
        this.f9646c = activity;
    }

    public final void run() {
        this.f9644a.a(this.f9645b, this.f9646c);
    }
}
