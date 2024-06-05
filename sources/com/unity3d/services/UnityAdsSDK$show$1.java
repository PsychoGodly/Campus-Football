package com.unity3d.services;

import android.content.Context;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {106}, m = "invokeSuspend")
/* compiled from: UnityAdsSDK.kt */
final class UnityAdsSDK$show$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ Listeners $listener;
    final /* synthetic */ String $placementId;
    final /* synthetic */ UnityAdsShowOptions $showOptions;
    final /* synthetic */ p0 $showScope;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$show$1(String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, p0 p0Var, d<? super UnityAdsSDK$show$1> dVar) {
        super(2, dVar);
        this.$placementId = str;
        this.$showOptions = unityAdsShowOptions;
        this.$listener = listeners;
        this.$showScope = p0Var;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$show$1(this.$placementId, this.$showOptions, this.$listener, this.$showScope, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$show$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.INSTANCE;
            LegacyShowUseCase access$getShowBoldSDK = unityAdsSDK.getShowBoldSDK();
            Context access$getContext = unityAdsSDK.getContext();
            String str = this.$placementId;
            UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
            Listeners listeners = this.$listener;
            this.label = 1;
            if (access$getShowBoldSDK.invoke(access$getContext, str, unityAdsShowOptions, listeners, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0.d(this.$showScope, (CancellationException) null, 1, (Object) null);
        return w.f38141a;
    }
}
