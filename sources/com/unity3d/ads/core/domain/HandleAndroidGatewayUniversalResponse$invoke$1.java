package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.w3;

@f(c = "com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse", f = "HandleAndroidGatewayUniversalResponse.kt", l = {30, 36, 39}, m = "invoke")
/* compiled from: HandleAndroidGatewayUniversalResponse.kt */
final class HandleAndroidGatewayUniversalResponse$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HandleAndroidGatewayUniversalResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleAndroidGatewayUniversalResponse$invoke$1(HandleAndroidGatewayUniversalResponse handleAndroidGatewayUniversalResponse, xd.d<? super HandleAndroidGatewayUniversalResponse$invoke$1> dVar) {
        super(dVar);
        this.this$0 = handleAndroidGatewayUniversalResponse;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((w3) null, this);
    }
}
