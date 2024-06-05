package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.InitializationState;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import se.g;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", f = "CommonAwaitInitialization.kt", l = {15}, m = "invokeSuspend")
/* compiled from: CommonAwaitInitialization.kt */
final class CommonAwaitInitialization$invoke$2 extends l implements p<p0, d<? super InitializationState>, Object> {
    int label;
    final /* synthetic */ CommonAwaitInitialization this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonAwaitInitialization$invoke$2(CommonAwaitInitialization commonAwaitInitialization, d<? super CommonAwaitInitialization$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = commonAwaitInitialization;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new CommonAwaitInitialization$invoke$2(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super InitializationState> dVar) {
        return ((CommonAwaitInitialization$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1 commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1 = new CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1(this.this$0.sessionRepository.getObserveInitializationState());
            this.label = 1;
            obj = g.q(commonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
