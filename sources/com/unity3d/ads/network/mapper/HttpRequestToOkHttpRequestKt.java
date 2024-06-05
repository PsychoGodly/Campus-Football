package com.unity3d.ads.network.mapper;

import bf.q;
import bf.t;
import bf.x;
import bf.y;
import com.unity3d.ads.network.model.HttpBody;
import com.unity3d.ads.network.model.HttpRequest;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import sd.l;

/* compiled from: HttpRequestToOkHttpRequest.kt */
public final class HttpRequestToOkHttpRequestKt {
    private static final y generateOkHttpBody(HttpBody httpBody) {
        if (httpBody instanceof HttpBody.StringBody) {
            return y.c(t.d("text/plain;charset=utf-8"), ((HttpBody.StringBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.ByteArrayBody) {
            return y.d(t.d("text/plain;charset=utf-8"), ((HttpBody.ByteArrayBody) httpBody).getContent());
        }
        if (httpBody instanceof HttpBody.EmptyBody) {
            return null;
        }
        throw new l();
    }

    private static final q generateOkHttpHeaders(HttpRequest httpRequest) {
        q.a aVar = new q.a();
        for (Map.Entry next : httpRequest.getHeaders().entrySet()) {
            aVar.a((String) next.getKey(), y.y((List) next.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (fe.l) null, 62, (Object) null));
        }
        q d10 = aVar.d();
        m.d(d10, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return d10;
    }

    public static final x toOkHttpRequest(HttpRequest httpRequest) {
        m.e(httpRequest, "<this>");
        x.a aVar = new x.a();
        x a10 = aVar.g(p.Z(p.A0(httpRequest.getBaseURL(), '/') + '/' + p.A0(httpRequest.getPath(), '/'), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH)).d(httpRequest.getMethod().toString(), generateOkHttpBody(httpRequest.getBody())).c(generateOkHttpHeaders(httpRequest)).a();
        m.d(a10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return a10;
    }
}
