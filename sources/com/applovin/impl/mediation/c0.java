package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.i;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9550b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f9551c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f9552d;

    public /* synthetic */ c0(g gVar, ViewGroup viewGroup, i iVar, Activity activity) {
        this.f9549a = gVar;
        this.f9550b = viewGroup;
        this.f9551c = iVar;
        this.f9552d = activity;
    }

    public final void run() {
        this.f9549a.a(this.f9550b, this.f9551c, this.f9552d);
    }
}
