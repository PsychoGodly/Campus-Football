package com.unity3d.services.ads.operation.show;

import com.unity3d.ads.UnityAds;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f32061a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnityAds.UnityAdsShowError f32062b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f32063c;

    public /* synthetic */ a(ShowOperationState showOperationState, UnityAds.UnityAdsShowError unityAdsShowError, String str) {
        this.f32061a = showOperationState;
        this.f32062b = unityAdsShowError;
        this.f32063c = str;
    }

    public final void run() {
        this.f32061a.onUnityAdsShowFailure(this.f32062b, this.f32063c);
    }
}
