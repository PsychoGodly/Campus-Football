package com.applovin.impl;

import com.applovin.impl.adview.g;
import com.applovin.sdk.AppLovinSdkUtils;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class oz implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f10550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Runnable f10551b;

    public /* synthetic */ oz(g gVar, Runnable runnable) {
        this.f10550a = gVar;
        this.f10551b = runnable;
    }

    public final void run() {
        AppLovinSdkUtils.runOnUiThread(new mz(this.f10550a, this.f10551b));
    }
}
