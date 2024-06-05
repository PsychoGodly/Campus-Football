package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.services.core.misc.Utilities;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2", f = "LegacyLoadUseCase.kt", l = {}, m = "invokeSuspend")
/* compiled from: LegacyLoadUseCase.kt */
final class LegacyLoadUseCase$loadSuccess$2 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$loadSuccess$2(LegacyLoadUseCase legacyLoadUseCase, d<? super LegacyLoadUseCase$loadSuccess$2> dVar) {
        super(2, dVar);
        this.this$0 = legacyLoadUseCase;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase) {
        IUnityAdsLoadListener access$getListener$p = legacyLoadUseCase.listener;
        if (access$getListener$p != null) {
            access$getListener$p.onUnityAdsAdLoaded(legacyLoadUseCase.placement);
        }
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyLoadUseCase$loadSuccess$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((LegacyLoadUseCase$loadSuccess$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            Utilities.wrapCustomerListener(new d(this.this$0));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
