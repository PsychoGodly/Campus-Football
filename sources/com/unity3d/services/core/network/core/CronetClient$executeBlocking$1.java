package com.unity3d.services.core.network.core;

import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.network.core.CronetClient$executeBlocking$1", f = "CronetClient.kt", l = {26}, m = "invokeSuspend")
/* compiled from: CronetClient.kt */
final class CronetClient$executeBlocking$1 extends l implements p<p0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ CronetClient this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CronetClient$executeBlocking$1(CronetClient cronetClient, HttpRequest httpRequest, d<? super CronetClient$executeBlocking$1> dVar) {
        super(2, dVar);
        this.this$0 = cronetClient;
        this.$request = httpRequest;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new CronetClient$executeBlocking$1(this.this$0, this.$request, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
        return ((CronetClient$executeBlocking$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            CronetClient cronetClient = this.this$0;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = cronetClient.execute(httpRequest, this);
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
