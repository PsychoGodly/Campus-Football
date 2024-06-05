package com.unity3d.ads.core.domain;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import com.unity3d.ads.UnityAdsLoadOptions;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.r0;
import vb.s;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse", f = "HandleGatewayAndroidAdResponse.kt", l = {85, 118, 153, 162, 165, 177, 181}, m = "invoke")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HandleGatewayAndroidAdResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$invoke$1(HandleGatewayAndroidAdResponse handleGatewayAndroidAdResponse, xd.d<? super HandleGatewayAndroidAdResponse$invoke$1> dVar) {
        super(dVar);
        this.this$0 = handleGatewayAndroidAdResponse;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((UnityAdsLoadOptions) null, (i) null, (s) null, (Context) null, (String) null, (r0) null, false, this);
    }
}
