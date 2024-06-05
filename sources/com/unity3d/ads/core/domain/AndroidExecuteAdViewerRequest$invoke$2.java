package com.unity3d.ads.core.domain;

import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.domain.AndroidExecuteAdViewerRequest$invoke$2", f = "AndroidExecuteAdViewerRequest.kt", l = {24}, m = "invokeSuspend")
/* compiled from: AndroidExecuteAdViewerRequest.kt */
final class AndroidExecuteAdViewerRequest$invoke$2 extends l implements p<p0, d<? super HttpResponse>, Object> {
    final /* synthetic */ Object[] $parameters;
    final /* synthetic */ RequestType $type;
    int label;
    final /* synthetic */ AndroidExecuteAdViewerRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidExecuteAdViewerRequest$invoke$2(AndroidExecuteAdViewerRequest androidExecuteAdViewerRequest, RequestType requestType, Object[] objArr, d<? super AndroidExecuteAdViewerRequest$invoke$2> dVar) {
        super(2, dVar);
        this.this$0 = androidExecuteAdViewerRequest;
        this.$type = requestType;
        this.$parameters = objArr;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidExecuteAdViewerRequest$invoke$2(this.this$0, this.$type, this.$parameters, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
        return ((AndroidExecuteAdViewerRequest$invoke$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            HttpRequest access$createRequest = this.this$0.createRequest(this.$type, this.$parameters);
            HttpClient access$getHttpClient$p = this.this$0.httpClient;
            this.label = 1;
            obj = access$getHttpClient$p.execute(access$createRequest, this);
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
