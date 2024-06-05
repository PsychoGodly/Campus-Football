package com.applovin.impl.mediation;

import android.app.Activity;
import android.view.ViewGroup;
import androidx.lifecycle.i;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f9593a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9594b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i f9595c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ Activity f9596d;

    public /* synthetic */ d0(g gVar, ViewGroup viewGroup, i iVar, Activity activity) {
        this.f9593a = gVar;
        this.f9594b = viewGroup;
        this.f9595c = iVar;
        this.f9596d = activity;
    }

    public final void run() {
        this.f9593a.b(this.f9594b, this.f9595c, this.f9596d);
    }
}
