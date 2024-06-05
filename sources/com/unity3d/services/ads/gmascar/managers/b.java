package com.unity3d.services.ads.gmascar.managers;

import com.unity3d.services.ads.gmascar.models.BiddingSignals;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BiddingBaseManager f32051a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BiddingSignals f32052b;

    public /* synthetic */ b(BiddingBaseManager biddingBaseManager, BiddingSignals biddingSignals) {
        this.f32051a = biddingBaseManager;
        this.f32052b = biddingSignals;
    }

    public final void run() {
        this.f32051a.lambda$uploadSignals$2(this.f32052b);
    }
}
