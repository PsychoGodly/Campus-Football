package com.unity3d.services.ads.operation.load;

import com.unity3d.ads.UnityAds;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f32058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsLoadError f32059b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f32060c;

    public /* synthetic */ c(LoadOperationState loadOperationState, UnityAds.UnityAdsLoadError unityAdsLoadError, String str) {
        this.f32058a = loadOperationState;
        this.f32059b = unityAdsLoadError;
        this.f32060c = str;
    }

    public final void run() {
        this.f32058a.lambda$onUnityAdsFailedToLoad$0(this.f32059b, this.f32060c);
    }
}
