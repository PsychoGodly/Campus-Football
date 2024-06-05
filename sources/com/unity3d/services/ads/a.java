package com.unity3d.services.ads;

import com.unity3d.ads.IUnityAdsTokenListener;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IUnityAdsTokenListener f32049a;

    public /* synthetic */ a(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.f32049a = iUnityAdsTokenListener;
    }

    public final void run() {
        this.f32049a.onUnityAdsTokenReady((String) null);
    }
}
