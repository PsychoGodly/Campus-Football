package com.unity3d.ads.core.domain;

import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.services.core.misc.Utilities;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2", f = "LegacyLoadUseCase.kt", l = {}, m = "invokeSuspend")
/* compiled from: LegacyLoadUseCase.kt */
final class LegacyLoadUseCase$loadFailure$2 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ LoadResult.Failure $loadResult;
    int label;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$loadFailure$2(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure, d<? super LegacyLoadUseCase$loadFailure$2> dVar) {
        super(2, dVar);
        this.this$0 = legacyLoadUseCase;
        this.$loadResult = failure;
    }

    /* access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        IUnityAdsLoadListener access$getListener$p = legacyLoadUseCase.listener;
        if (access$getListener$p != null) {
            access$getListener$p.onUnityAdsFailedToLoad(legacyLoadUseCase.placement, failure.getError(), failure.getMessage());
        }
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyLoadUseCase$loadFailure$2(this.this$0, this.$loadResult, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((LegacyLoadUseCase$loadFailure$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            Utilities.wrapCustomerListener(new c(this.this$0, this.$loadResult));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
