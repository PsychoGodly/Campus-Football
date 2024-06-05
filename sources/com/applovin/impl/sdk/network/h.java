package com.applovin.impl.sdk.network;

import com.applovin.sdk.AppLovinPostbackListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f11963a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d f11964b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppLovinPostbackListener f11965c;

    public /* synthetic */ h(b bVar, d dVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f11963a = bVar;
        this.f11964b = dVar;
        this.f11965c = appLovinPostbackListener;
    }

    public final void run() {
        this.f11963a.b(this.f11964b, this.f11965c);
    }
}
