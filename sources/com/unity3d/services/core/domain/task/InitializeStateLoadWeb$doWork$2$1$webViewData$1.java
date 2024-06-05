package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", f = "InitializeStateLoadWeb.kt", l = {71}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends l implements p<p0, d<? super String>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, d<? super InitializeStateLoadWeb$doWork$2$1$webViewData$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super String> dVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            HttpClient access$getHttpClient$p = this.this$0.httpClient;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = access$getHttpClient$p.execute(httpRequest, this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return ((HttpResponse) obj).getBody().toString();
    }
}
