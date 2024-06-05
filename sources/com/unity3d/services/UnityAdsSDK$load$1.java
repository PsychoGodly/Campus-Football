package com.unity3d.services;

import android.content.Context;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.services.banners.UnityBannerSize;
import fe.p;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.a0;
import pe.p0;
import pe.q0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {98}, m = "invokeSuspend")
/* compiled from: UnityAdsSDK.kt */
final class UnityAdsSDK$load$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ UnityBannerSize $bannerSize;
    final /* synthetic */ IUnityAdsLoadListener $listener;
    final /* synthetic */ UnityAdsLoadOptions $loadOptions;
    final /* synthetic */ p0 $loadScope;
    final /* synthetic */ String $placementId;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UnityAdsSDK$load$1(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, p0 p0Var, d<? super UnityAdsSDK$load$1> dVar) {
        super(2, dVar);
        this.$placementId = str;
        this.$loadOptions = unityAdsLoadOptions;
        this.$listener = iUnityAdsLoadListener;
        this.$bannerSize = unityBannerSize;
        this.$loadScope = p0Var;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new UnityAdsSDK$load$1(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((UnityAdsSDK$load$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            UnityAdsSDK unityAdsSDK = UnityAdsSDK.INSTANCE;
            Context access$getContext = unityAdsSDK.getContext();
            String str = this.$placementId;
            UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
            IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
            UnityBannerSize unityBannerSize = this.$bannerSize;
            this.label = 1;
            if (((LegacyLoadUseCase) unityAdsSDK.getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(LegacyLoadUseCase.class))).invoke(access$getContext, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q0.d(this.$loadScope, (CancellationException) null, 1, (Object) null);
        return w.f38141a;
    }
}
