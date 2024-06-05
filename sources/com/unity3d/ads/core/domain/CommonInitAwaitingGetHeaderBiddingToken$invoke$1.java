package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.IUnityAdsTokenListener;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {46}, m = "invoke")
/* compiled from: CommonInitAwaitingGetHeaderBiddingToken.kt */
final class CommonInitAwaitingGetHeaderBiddingToken$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonInitAwaitingGetHeaderBiddingToken this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonInitAwaitingGetHeaderBiddingToken$invoke$1(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, xd.d<? super CommonInitAwaitingGetHeaderBiddingToken$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonInitAwaitingGetHeaderBiddingToken;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((IUnityAdsTokenListener) null, this);
    }
}
