package com.unity3d.ads.adplayer;

import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.Invocation$handle$2", f = "Invocation.kt", l = {}, m = "invokeSuspend")
/* compiled from: Invocation.kt */
final class Invocation$handle$2 extends l implements fe.l<d<? super w>, Object> {
    int label;

    Invocation$handle$2(d<? super Invocation$handle$2> dVar) {
        super(1, dVar);
    }

    public final d<w> create(d<?> dVar) {
        return new Invocation$handle$2(dVar);
    }

    public final Object invoke(d<? super w> dVar) {
        return ((Invocation$handle$2) create(dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            p.b(obj);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
