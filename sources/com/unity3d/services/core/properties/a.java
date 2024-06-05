package com.unity3d.services.core.properties;

import com.unity3d.ads.IUnityAdsInitializationListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f32077a;

    public /* synthetic */ a(IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        this.f32077a = iUnityAdsInitializationListener;
    }

    public final void run() {
        this.f32077a.onInitializationComplete();
    }
}
