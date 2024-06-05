package com.unity3d.services.ads.gmascar.managers;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BiddingBaseManager f32053a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32054b;

    public /* synthetic */ c(BiddingBaseManager biddingBaseManager, String str) {
        this.f32053a = biddingBaseManager;
        this.f32054b = str;
    }

    public final void run() {
        this.f32053a.lambda$onUnityAdsTokenReady$0(this.f32054b);
    }
}
