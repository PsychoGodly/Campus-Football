package com.unity3d.services.core.network.mapper;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.core.network.model.BodyType;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.RequestType;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: WebRequestToHttpRequest.kt */
public final class WebRequestToHttpRequestKt {
    public static final HttpRequest toHttpRequest(WebRequest webRequest) {
        m.e(webRequest, "<this>");
        String url = webRequest.getUrl().toString();
        String requestType = webRequest.getRequestType();
        m.d(requestType, "requestType");
        RequestType valueOf = RequestType.valueOf(requestType);
        Map<String, List<String>> headers = webRequest.getHeaders();
        byte[] body = webRequest.getBody();
        m.d(url, "toString()");
        m.d(headers, "headers");
        return new HttpRequest(url, (String) null, valueOf, body, headers, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131042, (h) null);
    }
}
