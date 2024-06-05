package com.unity3d.ads.gatewayclient;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.OperationType;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.t3;

@f(c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", f = "CommonGatewayClient.kt", l = {94, 103, 110}, m = "request")
/* compiled from: CommonGatewayClient.kt */
final class CommonGatewayClient$request$1 extends d {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGatewayClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonGatewayClient$request$1(CommonGatewayClient commonGatewayClient, xd.d<? super CommonGatewayClient$request$1> dVar) {
        super(dVar);
        this.this$0 = commonGatewayClient;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.request((String) null, (t3) null, (RequestPolicy) null, (OperationType) null, this);
    }
}
