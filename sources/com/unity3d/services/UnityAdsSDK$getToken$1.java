package com.unity3d.services;

import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {123}, m = "invokeSuspend")
/* compiled from: UnityAdsSDK.kt */
final class UnityAdsSDK$getToken$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ p0 $getTokenScope;
    final /* synthetic */ IUnityAdsTokenListener $listener;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$getToken$1(IUnityAdsTokenListener iUnityAdsTokenListener, p0 p0Var, d<? super UnityAdsSDK$getToken$1> dVar) {
        super(2, dVar);
        this.$listener = iUnityAdsTokenListener;
        this.$getTokenScope = p0Var;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$getToken$1(this.$listener, this.$getTokenScope, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$getToken$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            GetAsyncHeaderBiddingToken access$getGetAsyncHeaderBiddingToken = UnityAdsSDK.INSTANCE.getGetAsyncHeaderBiddingToken();
            IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
            this.label = 1;
            if (access$getGetAsyncHeaderBiddingToken.invoke(iUnityAdsTokenListener, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0.d(this.$getTokenScope, (CancellationException) null, 1, (Object) null);
        return w.f38141a;
    }
}
