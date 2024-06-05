package com.unity3d.services.core.network.mapper;

import bf.q;
import bf.t;
import bf.x;
import bf.y;
import com.applovin.mediation.MaxReward;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.network.model.HttpRequest;
import fe.l;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;

/* compiled from: HttpRequestToOkHttpRequest.kt */
public final class HttpRequestToOkHttpRequestKt {
    private static final y generateOkHttpBody(Object obj) {
        if (obj instanceof byte[]) {
            y d10 = y.d(t.d("text/plain;charset=utf-8"), (byte[]) obj);
            m.d(d10, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return d10;
        } else if (obj instanceof String) {
            y c10 = y.c(t.d("text/plain;charset=utf-8"), (String) obj);
            m.d(c10, "create(MediaType.parse(\"…in;charset=utf-8\"), body)");
            return c10;
        } else {
            y c11 = y.c(t.d("text/plain;charset=utf-8"), MaxReward.DEFAULT_LABEL);
            m.d(c11, "create(MediaType.parse(\"…lain;charset=utf-8\"), \"\")");
            return c11;
        }
    }

    private static final q generateOkHttpHeaders(HttpRequest httpRequest) {
        q.a aVar = new q.a();
        for (Map.Entry next : httpRequest.getHeaders().entrySet()) {
            aVar.a((String) next.getKey(), y.y((List) next.getValue(), ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62, (Object) null));
        }
        q d10 = aVar.d();
        m.d(d10, "Builder()\n    .also { he…ng(\",\")) } }\n    .build()");
        return d10;
    }

    private static final y generateOkHttpProtobufBody(Object obj) {
        if (obj instanceof byte[]) {
            y d10 = y.d(t.d("application/x-protobuf"), (byte[]) obj);
            m.d(d10, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return d10;
        } else if (obj instanceof String) {
            y c10 = y.c(t.d("application/x-protobuf"), (String) obj);
            m.d(c10, "create(MediaType.parse(\"…ation/x-protobuf\"), body)");
            return c10;
        } else {
            y c11 = y.c(t.d("application/x-protobuf"), MaxReward.DEFAULT_LABEL);
            m.d(c11, "create(MediaType.parse(\"…ication/x-protobuf\"), \"\")");
            return c11;
        }
    }

    public static final x toOkHttpProtoRequest(HttpRequest httpRequest) {
        m.e(httpRequest, "<this>");
        x.a aVar = new x.a();
        x.a g10 = aVar.g(p.Z(p.A0(httpRequest.getBaseURL(), '/') + '/' + p.A0(httpRequest.getPath(), '/'), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH));
        String str = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        x a10 = g10.d(str, body != null ? generateOkHttpProtobufBody(body) : null).c(generateOkHttpHeaders(httpRequest)).a();
        m.d(a10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return a10;
    }

    public static final x toOkHttpRequest(HttpRequest httpRequest) {
        m.e(httpRequest, "<this>");
        x.a aVar = new x.a();
        x.a g10 = aVar.g(p.Z(p.A0(httpRequest.getBaseURL(), '/') + '/' + p.A0(httpRequest.getPath(), '/'), UnityAdsConstants.DefaultUrls.AD_ASSET_PATH));
        String str = httpRequest.getMethod().toString();
        Object body = httpRequest.getBody();
        x a10 = g10.d(str, body != null ? generateOkHttpBody(body) : null).c(generateOkHttpHeaders(httpRequest)).a();
        m.d(a10, "Builder()\n    .url(\"${ba…tpHeaders())\n    .build()");
        return a10;
    }
}
