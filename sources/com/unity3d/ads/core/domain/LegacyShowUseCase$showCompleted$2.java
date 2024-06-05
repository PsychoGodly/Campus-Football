package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$showCompleted$2 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ Listeners $listeners;
    final /* synthetic */ String $placement;
    final /* synthetic */ ShowStatus $status;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$showCompleted$2(Listeners listeners, String str, ShowStatus showStatus, d<? super LegacyShowUseCase$showCompleted$2> dVar) {
        super(2, dVar);
        this.$listeners = listeners;
        this.$placement = str;
        this.$status = showStatus;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyShowUseCase$showCompleted$2(this.$listeners, this.$placement, this.$status, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((LegacyShowUseCase$showCompleted$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            this.$listeners.onComplete(this.$placement, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(this.$status));
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}