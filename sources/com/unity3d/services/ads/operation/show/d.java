package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f32067a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f32068b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f32069c;

    public /* synthetic */ d(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        this.f32067a = showOperationState;
        this.f32068b = unityAdsShowError;
        this.f32069c = str;
    }

    public final void run() {
        this.f32067a.lambda$onUnityAdsShowFailure$0(this.f32068b, this.f32069c);
    }
}
