package com.unity3d.ads.core.domain;

import com.unity3d.services.core.properties.SdkProperties;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.TriggerInitializeListener$success$1", f = "TriggerInitializeListener.kt", l = {}, m = "invokeSuspend")
/* compiled from: TriggerInitializeListener.kt */
final class TriggerInitializeListener$success$1 extends l implements p<p0, d<? super w>, Object> {
    int label;

    TriggerInitializeListener$success$1(d<? super TriggerInitializeListener$success$1> dVar) {
        super(2, dVar);
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new TriggerInitializeListener$success$1(dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((TriggerInitializeListener$success$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            SdkProperties.notifyInitializationComplete();
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
