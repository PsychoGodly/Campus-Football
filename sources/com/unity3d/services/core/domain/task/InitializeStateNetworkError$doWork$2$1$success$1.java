package com.unity3d.services.core.domain.task;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError$doWork$2$1$success$1", f = "InitializeStateNetworkError.kt", l = {82}, m = "invokeSuspend")
/* compiled from: InitializeStateNetworkError.kt */
final class InitializeStateNetworkError$doWork$2$1$success$1 extends l implements p<p0, d<? super w>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$2$1$success$1(InitializeStateNetworkError initializeStateNetworkError, d<? super InitializeStateNetworkError$doWork$2$1$success$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateNetworkError;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateNetworkError$doWork$2$1$success$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((InitializeStateNetworkError$doWork$2$1$success$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            InitializeStateNetworkError initializeStateNetworkError = this.this$0;
            this.L$0 = initializeStateNetworkError;
            this.label = 1;
            pe.p pVar = new pe.p(c.b(this), 1);
            pVar.C();
            initializeStateNetworkError.startListening(pVar);
            Object z10 = pVar.z();
            if (z10 == d.c()) {
                h.c(this);
            }
            if (z10 == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            InitializeStateNetworkError initializeStateNetworkError2 = (InitializeStateNetworkError) this.L$0;
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
