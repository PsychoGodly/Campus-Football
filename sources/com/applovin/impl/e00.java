package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e00 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ob f7338a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f7339b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7340c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppLovinFullscreenAdViewObserver f7341d;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f7342f;

    public /* synthetic */ e00(ob obVar, Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j10) {
        this.f7338a = obVar;
        this.f7339b = context;
        this.f7340c = viewGroup;
        this.f7341d = appLovinFullscreenAdViewObserver;
        this.f7342f = j10;
    }

    public final void run() {
        this.f7338a.a(this.f7339b, this.f7340c, this.f7341d, this.f7342f);
    }
}
