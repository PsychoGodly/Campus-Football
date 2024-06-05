package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class f00 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ob f7562a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7563b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Context f7564c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AppLovinFullscreenAdViewObserver f7565d;

    public /* synthetic */ f00(ob obVar, ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f7562a = obVar;
        this.f7563b = viewGroup;
        this.f7564c = context;
        this.f7565d = appLovinFullscreenAdViewObserver;
    }

    public final void run() {
        this.f7562a.a(this.f7563b, this.f7564c, this.f7565d);
    }
}
