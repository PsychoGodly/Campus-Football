package com.unity3d.services.ads.operation.show;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ShowOperationState f32070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32071b;

    public /* synthetic */ e(ShowOperationState showOperationState, String str) {
        this.f32070a = showOperationState;
        this.f32071b = str;
    }

    public final void run() {
        this.f32070a.lambda$onUnityAdsShowStart$2(this.f32071b);
    }
}
