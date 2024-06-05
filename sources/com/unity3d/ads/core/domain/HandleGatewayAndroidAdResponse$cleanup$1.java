package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import com.unity3d.ads.adplayer.AdPlayer;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.s;

@f(c = "com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse", f = "HandleGatewayAndroidAdResponse.kt", l = {199, 205}, m = "cleanup")
/* compiled from: HandleGatewayAndroidAdResponse.kt */
final class HandleGatewayAndroidAdResponse$cleanup$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HandleGatewayAndroidAdResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleGatewayAndroidAdResponse$cleanup$1(HandleGatewayAndroidAdResponse handleGatewayAndroidAdResponse, xd.d<? super HandleGatewayAndroidAdResponse$cleanup$1> dVar) {
        super(dVar);
        this.this$0 = handleGatewayAndroidAdResponse;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.cleanup((Throwable) null, (i) null, (s) null, (AdPlayer) null, this);
    }
}
