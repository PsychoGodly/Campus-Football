package com.unity3d.services.core.extensions;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.extensions.CoroutineExtensionsKt$memoize$2$deferred$2", f = "CoroutineExtensions.kt", l = {39}, m = "invokeSuspend")
/* compiled from: CoroutineExtensions.kt */
public final class CoroutineExtensionsKt$memoize$2$deferred$2 extends l implements p<p0, d<? super T>, Object> {
    final /* synthetic */ p<p0, d<? super T>, Object> $action;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineExtensionsKt$memoize$2$deferred$2(p<? super p0, ? super d<? super T>, ? extends Object> pVar, d<? super CoroutineExtensionsKt$memoize$2$deferred$2> dVar) {
        super(2, dVar);
        this.$action = pVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        CoroutineExtensionsKt$memoize$2$deferred$2 coroutineExtensionsKt$memoize$2$deferred$2 = new CoroutineExtensionsKt$memoize$2$deferred$2(this.$action, dVar);
        coroutineExtensionsKt$memoize$2$deferred$2.L$0 = obj;
        return coroutineExtensionsKt$memoize$2$deferred$2;
    }

    public final Object invoke(p0 p0Var, d<? super T> dVar) {
        return ((CoroutineExtensionsKt$memoize$2$deferred$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            p<p0, d<? super T>, Object> pVar = this.$action;
            this.label = 1;
            obj = pVar.invoke((p0) this.L$0, this);
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

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$action.invoke((p0) this.L$0, this);
    }
}
