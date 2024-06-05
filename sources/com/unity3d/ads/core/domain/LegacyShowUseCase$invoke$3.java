package com.unity3d.ads.core.domain;

import com.applovin.mediation.MaxReward;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.core.data.model.ShowEvent;
import fe.q;
import fe.t;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {149}, m = "invokeSuspend")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$invoke$3 extends l implements q<se.f<? super ShowEvent>, Throwable, d<? super w>, Object> {
    final /* synthetic */ boolean $isBanner;
    final /* synthetic */ t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> $reportShowError;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$3(t<? super String, ? super UnityAds.UnityAdsShowError, ? super String, ? super Integer, ? super String, ? super d<? super w>, ? extends Object> tVar, boolean z10, LegacyShowUseCase legacyShowUseCase, d<? super LegacyShowUseCase$invoke$3> dVar) {
        super(3, dVar);
        this.$reportShowError = tVar;
        this.$isBanner = z10;
        this.this$0 = legacyShowUseCase;
    }

    public final Object invoke(se.f<? super ShowEvent> fVar, Throwable th, d<? super w> dVar) {
        LegacyShowUseCase$invoke$3 legacyShowUseCase$invoke$3 = new LegacyShowUseCase$invoke$3(this.$reportShowError, this.$isBanner, this.this$0, dVar);
        legacyShowUseCase$invoke$3.L$0 = th;
        return legacyShowUseCase$invoke$3.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            t<String, UnityAds.UnityAdsShowError, String, Integer, String, d<? super w>, Object> tVar = this.$reportShowError;
            UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
            String message = ((Throwable) this.L$0).getMessage();
            if (message == null) {
                message = MaxReward.DEFAULT_LABEL;
            }
            this.label = 1;
            if (tVar.invoke("uncaught_exception", unityAdsShowError, message, null, null, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!this.$isBanner) {
            this.this$0.isFullscreenAdShowing = false;
        }
        return w.f38141a;
    }
}
