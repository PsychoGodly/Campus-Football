package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.i;
import pe.k0;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1", f = "InitializeStateLoadWeb.kt", l = {57}, m = "invokeSuspend")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 extends l implements p<Integer, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    /* synthetic */ int I$0;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    @f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1", f = "InitializeStateLoadWeb.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1$1  reason: invalid class name */
    /* compiled from: InitializeStateLoadWeb.kt */
    static final class AnonymousClass1 extends l implements p<p0, d<? super HttpResponse>, Object> {
        int label;

        public final d<w> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(initializeStateLoadWeb, httpRequest, dVar);
        }

        public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
            return ((AnonymousClass1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
        }

        public final Object invokeSuspend(Object obj) {
            Object c10 = d.c();
            int i10 = this.label;
            if (i10 == 0) {
                sd.p.b(obj);
                HttpClient access$getHttpClient$p = initializeStateLoadWeb.httpClient;
                HttpRequest httpRequest = httpRequest;
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
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, d<? super InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1> dVar) {
        super(2, dVar);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1 = new InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1(this.this$0, this.$request, dVar);
        initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1.I$0 = ((Number) obj).intValue();
        return initializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1;
    }

    public final Object invoke(int i10, d<? super HttpResponse> dVar) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewDataResult$1$1) create(Integer.valueOf(i10), dVar)).invokeSuspend(w.f38141a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (d<? super HttpResponse>) (d) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            if (this.I$0 > 0) {
                InitializeEventsMetricSender.getInstance().onRetryWebview();
            }
            k0 io2 = this.this$0.dispatchers.getIo();
            final InitializeStateLoadWeb initializeStateLoadWeb = this.this$0;
            final HttpRequest httpRequest = this.$request;
            AnonymousClass1 r12 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.label = 1;
            obj = i.g(io2, r12, this);
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
