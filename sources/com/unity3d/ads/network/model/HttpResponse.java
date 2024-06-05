package com.unity3d.ads.network.model;

import com.applovin.mediation.MaxReward;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: HttpResponse.kt */
public final class HttpResponse {
    private final Object body;
    private final Map<String, Object> headers;
    private final int statusCode;
    private final String urlString;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, (Map) null, (String) null, 14, (h) null);
        m.e(obj, "body");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10) {
        this(obj, i10, (Map) null, (String) null, 12, (h) null);
        m.e(obj, "body");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends Object> map) {
        this(obj, i10, map, (String) null, 8, (h) null);
        m.e(obj, "body");
        m.e(map, "headers");
    }

    public HttpResponse(Object obj, int i10, Map<String, ? extends Object> map, String str) {
        m.e(obj, "body");
        m.e(map, "headers");
        m.e(str, "urlString");
        this.body = obj;
        this.statusCode = i10;
        this.headers = map;
        this.urlString = str;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map<String, Object> map, String str, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            obj = httpResponse.body;
        }
        if ((i11 & 2) != 0) {
            i10 = httpResponse.statusCode;
        }
        if ((i11 & 4) != 0) {
            map = httpResponse.headers;
        }
        if ((i11 & 8) != 0) {
            str = httpResponse.urlString;
        }
        return httpResponse.copy(obj, i10, map, str);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, Object> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final HttpResponse copy(Object obj, int i10, Map<String, ? extends Object> map, String str) {
        m.e(obj, "body");
        m.e(map, "headers");
        m.e(str, "urlString");
        return new HttpResponse(obj, i10, map, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return m.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && m.a(this.headers, httpResponse.headers) && m.a(this.urlString, httpResponse.urlString);
    }

    public final Object getBody() {
        return this.body;
    }

    public final Map<String, Object> getHeaders() {
        return this.headers;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode();
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HttpResponse(Object obj, int i10, Map map, String str, int i11, h hVar) {
        this(obj, (i11 & 2) != 0 ? 200 : i10, (i11 & 4) != 0 ? k0.g() : map, (i11 & 8) != 0 ? MaxReward.DEFAULT_LABEL : str);
    }
}
