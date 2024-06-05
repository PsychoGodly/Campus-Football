package com.unity3d.ads.adplayer;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.adplayer.Invocation$handle$3", f = "Invocation.kt", l = {23}, m = "invokeSuspend")
/* compiled from: Invocation.kt */
final class Invocation$handle$3 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ fe.l<d<Object>, Object> $handler;
    int label;
    final /* synthetic */ Invocation this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Invocation$handle$3(fe.l<? super d<Object>, ? extends Object> lVar, Invocation invocation, d<? super Invocation$handle$3> dVar) {
        super(2, dVar);
        this.$handler = lVar;
        this.this$0 = invocation;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new Invocation$handle$3(this.$handler, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((Invocation$handle$3) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            fe.l<d<Object>, Object> lVar = this.$handler;
            this.label = 1;
            obj = lVar.invoke(this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            try {
                sd.p.b(obj);
            } catch (Throwable th) {
                this.this$0.completableDeferred.l0(th);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.this$0.completableDeferred.n0(obj);
        return w.f38141a;
    }
}
