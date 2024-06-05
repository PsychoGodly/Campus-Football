package com.unity3d.ads.core.domain;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken f32011a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f32012b;

    public /* synthetic */ b(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        this.f32011a = commonInitAwaitingGetHeaderBiddingToken;
        this.f32012b = str;
    }

    public final void run() {
        CommonInitAwaitingGetHeaderBiddingToken.tokenSuccess$lambda$0(this.f32011a, this.f32012b);
    }
}
