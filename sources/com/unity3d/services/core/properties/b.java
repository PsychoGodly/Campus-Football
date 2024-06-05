package com.unity3d.services.core.properties;

import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IUnityAdsInitializationListener f32078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsInitializationError f32079b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f32080c;

    public /* synthetic */ b(IUnityAdsInitializationListener iUnityAdsInitializationListener, UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        this.f32078a = iUnityAdsInitializationListener;
        this.f32079b = unityAdsInitializationError;
        this.f32080c = str;
    }

    public final void run() {
        this.f32078a.onInitializationFailed(this.f32079b, this.f32080c);
    }
}
