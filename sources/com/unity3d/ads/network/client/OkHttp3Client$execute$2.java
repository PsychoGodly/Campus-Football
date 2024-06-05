package com.unity3d.ads.network.client;

import bf.a0;
import bf.x;
import bf.z;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.ads.network.model.HttpResponse;
import fe.p;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.network.client.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {35}, m = "invokeSuspend")
/* compiled from: OkHttp3Client.kt */
final class OkHttp3Client$execute$2 extends l implements p<p0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OkHttp3Client$execute$2(HttpRequest httpRequest, OkHttp3Client okHttp3Client, d<? super OkHttp3Client$execute$2> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
        this.this$0 = okHttp3Client;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new OkHttp3Client$execute$2(this.$request, this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
        return ((OkHttp3Client$execute$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            x okHttpRequest = HttpRequestToOkHttpRequestKt.toOkHttpRequest(this.$request);
            this.label = 1;
            obj = this.this$0.makeRequest(okHttpRequest, (long) this.$request.getConnectTimeout(), (long) this.$request.getReadTimeout(), this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z zVar = (z) obj;
        int j10 = zVar.j();
        Map<String, List<String>> h10 = zVar.A().h();
        String rVar = zVar.Z().h().toString();
        a0 h11 = zVar.h();
        String A = h11 != null ? h11.A() : null;
        if (A == null) {
            A = MaxReward.DEFAULT_LABEL;
        }
        m.d(h10, "toMultimap()");
        m.d(rVar, "toString()");
        return new HttpResponse(A, j10, h10, rVar);
    }
}
