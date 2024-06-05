package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import com.unity3d.services.core.properties.SdkProperties;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$error$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* compiled from: TriggerInitializeListener.kt */
final class TriggerInitializeListener$error$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ String $errorMsg;
    final /* synthetic */ UnityAds.UnityAdsInitializationError $unityAdsInitializationError;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TriggerInitializeListener$error$1(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str, d<? super TriggerInitializeListener$error$1> dVar) {
        super(2, dVar);
        this.$unityAdsInitializationError = unityAdsInitializationError;
        this.$errorMsg = str;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new TriggerInitializeListener$error$1(this.$unityAdsInitializationError, this.$errorMsg, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((TriggerInitializeListener$error$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            SdkProperties.notifyInitializationFailed(this.$unityAdsInitializationError, this.$errorMsg);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
