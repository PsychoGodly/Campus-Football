package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.o;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2$1$webViewData$1", f = "InitializeSDK.kt", l = {75}, m = "invokeSuspend")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$doWork$2$1$webViewData$1 extends l implements p<p0, d<? super w>, Object> {
    final /* synthetic */ Object $configResult;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2$1$webViewData$1(InitializeSDK initializeSDK, Object obj, d<? super InitializeSDK$doWork$2$1$webViewData$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeSDK;
        this.$configResult = obj;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeSDK$doWork$2$1$webViewData$1(this.this$0, this.$configResult, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((InitializeSDK$doWork$2$1$webViewData$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            InitializeStateLoadWeb access$getInitializeStateLoadWeb$p = this.this$0.initializeStateLoadWeb;
            Object obj2 = this.$configResult;
            sd.p.b(obj2);
            InitializeStateLoadWeb.Params params = new InitializeStateLoadWeb.Params((Configuration) obj2);
            this.label = 1;
            if (access$getInitializeStateLoadWeb$p.m65invokegIAlus(params, this) == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
            ((o) obj).i();
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
