package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f32065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowCompletionState f32066b;

    public /* synthetic */ c(ShowOperationState showOperationState, UnityAds.UnityAdsShowCompletionState unityAdsShowCompletionState) {
        this.f32065a = showOperationState;
        this.f32066b = unityAdsShowCompletionState;
    }

    public final void run() {
        this.f32065a.lambda$onUnityAdsShowComplete$3(this.f32066b);
    }
}
