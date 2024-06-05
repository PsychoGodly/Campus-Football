package com.unity3d.services.core.network.core;

import bf.a0;
import bf.z;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import fe.p;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import lf.e;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.network.core.OkHttp3Client$execute$2", f = "OkHttp3Client.kt", l = {49}, m = "invokeSuspend")
/* compiled from: OkHttp3Client.kt */
final class OkHttp3Client$execute$2 extends l implements p<p0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ OkHttp3Client this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OkHttp3Client$execute$2(OkHttp3Client okHttp3Client, HttpRequest httpRequest, d<? super OkHttp3Client$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = okHttp3Client;
        this.$request = httpRequest;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new OkHttp3Client$execute$2(this.this$0, this.$request, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
        return ((OkHttp3Client$execute$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        e u10;
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            sd.p.b(obj);
            OkHttp3Client okHttp3Client = this.this$0;
            HttpRequest httpRequest = this.$request;
            this.label = 1;
            obj = okHttp3Client.makeRequest(httpRequest, (long) httpRequest.getConnectTimeout(), (long) this.$request.getReadTimeout(), this);
            if (obj == c10) {
                return c10;
            }
        } else if (i10 == 1) {
            sd.p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z zVar = (z) obj;
        Object obj2 = null;
        if (this.$request.isProtobuf()) {
            a0 h10 = zVar.h();
            if (!(h10 == null || (u10 = h10.u()) == null)) {
                obj2 = u10.D();
            }
            obj2 = (Serializable) obj2;
        } else {
            a0 h11 = zVar.h();
            if (h11 != null) {
                obj2 = h11.A();
            }
        }
        int j10 = zVar.j();
        Map<String, List<String>> h12 = zVar.A().h();
        String rVar = zVar.Z().h().toString();
        if (obj2 == null) {
            obj2 = MaxReward.DEFAULT_LABEL;
        }
        String vVar = zVar.L().toString();
        m.d(h12, "toMultimap()");
        m.d(rVar, "toString()");
        m.d(vVar, "toString()");
        return new HttpResponse(obj2, j10, h12, rVar, vVar, "okhttp", 0, 64, (h) null);
    }
}
