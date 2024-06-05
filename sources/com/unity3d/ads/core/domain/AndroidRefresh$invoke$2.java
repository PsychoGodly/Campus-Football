package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import vb.e;
import vb.t3;
import vb.w3;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.AndroidRefresh$invoke$2", f = "AndroidRefresh.kt", l = {26, 28}, m = "invokeSuspend")
/* compiled from: AndroidRefresh.kt */
final class AndroidRefresh$invoke$2 extends l implements p<p0, d<? super e>, Object> {
    final /* synthetic */ i $adDataRefreshToken;
    final /* synthetic */ i $opportunityId;
    int label;
    final /* synthetic */ AndroidRefresh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidRefresh$invoke$2(AndroidRefresh androidRefresh, i iVar, i iVar2, d<? super AndroidRefresh$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidRefresh;
        this.$adDataRefreshToken = iVar;
        this.$opportunityId = iVar2;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidRefresh$invoke$2(this.this$0, this.$adDataRefreshToken, this.$opportunityId, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super e> dVar) {
        return ((AndroidRefresh$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            GetAdDataRefreshRequest access$getGetAdDataRefreshRequest$p = this.this$0.getAdDataRefreshRequest;
            i iVar = this.$adDataRefreshToken;
            i iVar2 = this.$opportunityId;
            this.label = 1;
            obj = access$getGetAdDataRefreshRequest$p.invoke(iVar, iVar2, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else if (i10 == 2) {
            sd.p.b(obj);
            return ((w3) obj).i0().f0();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        RequestPolicy invoke = this.this$0.getRequestPolicy.invoke();
        GatewayClient access$getGatewayClient$p = this.this$0.gatewayClient;
        OperationType operationType = OperationType.REFRESH;
        this.label = 2;
        obj = GatewayClient.DefaultImpls.request$default(access$getGatewayClient$p, (String) null, (t3) obj, invoke, operationType, this, 1, (Object) null);
        if (obj == c10) {
            return c10;
        }
        return ((w3) obj).i0().f0();
    }
}
