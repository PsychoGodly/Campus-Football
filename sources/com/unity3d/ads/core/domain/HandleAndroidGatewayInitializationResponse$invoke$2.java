package com.unity3d.ads.core.domain;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.HandleAndroidGatewayInitializationResponse$invoke$2", f = "HandleAndroidGatewayInitializationResponse.kt", l = {31}, m = "invokeSuspend")
/* compiled from: HandleAndroidGatewayInitializationResponse.kt */
final class HandleAndroidGatewayInitializationResponse$invoke$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ HandleAndroidGatewayInitializationResponse this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HandleAndroidGatewayInitializationResponse$invoke$2(HandleAndroidGatewayInitializationResponse handleAndroidGatewayInitializationResponse, d<? super HandleAndroidGatewayInitializationResponse$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = handleAndroidGatewayInitializationResponse;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new HandleAndroidGatewayInitializationResponse$invoke$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((HandleAndroidGatewayInitializationResponse$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            TriggerInitializationCompletedRequest access$getTriggerInitializationCompletedRequest$p = this.this$0.triggerInitializationCompletedRequest;
            this.label = 1;
            if (access$getTriggerInitializationCompletedRequest$p.invoke(this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
