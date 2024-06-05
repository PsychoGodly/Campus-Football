package com.unity3d.services.core.network.core;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.network.mapper.HttpRequestToWebRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.request.WebRequest;
import fe.p;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.services.core.network.core.LegacyHttpClient$execute$2", f = "LegacyHttpClient.kt", l = {}, m = "invokeSuspend")
/* compiled from: LegacyHttpClient.kt */
final class LegacyHttpClient$execute$2 extends l implements p<p0, d<? super HttpResponse>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyHttpClient$execute$2(HttpRequest httpRequest, d<? super LegacyHttpClient$execute$2> dVar) {
        super(2, dVar);
        this.$request = httpRequest;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new LegacyHttpClient$execute$2(this.$request, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super HttpResponse> dVar) {
        return ((LegacyHttpClient$execute$2) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            WebRequest webRequest = HttpRequestToWebRequestKt.toWebRequest(this.$request);
            String makeRequest = webRequest.makeRequest();
            int responseCode = webRequest.getResponseCode();
            Map<String, List<String>> headers = webRequest.getHeaders();
            String url = webRequest.getUrl().toString();
            if (makeRequest == null) {
                makeRequest = MaxReward.DEFAULT_LABEL;
            }
            m.d(headers, "headers");
            m.d(url, "toString()");
            return new HttpResponse(makeRequest, responseCode, headers, url, (String) null, "legacy", 0, 80, (h) null);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
