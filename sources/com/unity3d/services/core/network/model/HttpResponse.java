package com.unity3d.services.core.network.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import nf.b;

/* compiled from: HttpResponse.kt */
public final class HttpResponse {
    private final Object body;
    private final String client;
    private final long contentSize;
    private final Map<String, List<String>> headers;
    private final String protocol;
    private final int statusCode;
    private final String urlString;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj) {
        this(obj, 0, (Map) null, (String) null, (String) null, (String) null, 0, 126, (h) null);
        m.e(obj, "body");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10) {
        this(obj, i10, (Map) null, (String) null, (String) null, (String) null, 0, 124, (h) null);
        m.e(obj, "body");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map) {
        this(obj, i10, map, (String) null, (String) null, (String) null, 0, 120, (h) null);
        m.e(obj, "body");
        m.e(map, "headers");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpResponse(java.lang.Object r13, int r14, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r15, java.lang.String r16) {
        /*
            r12 = this;
            java.lang.String r0 = "body"
            r2 = r13
            kotlin.jvm.internal.m.e(r13, r0)
            java.lang.String r0 = "headers"
            r4 = r15
            kotlin.jvm.internal.m.e(r15, r0)
            java.lang.String r0 = "urlString"
            r5 = r16
            kotlin.jvm.internal.m.e(r5, r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r10 = 112(0x70, float:1.57E-43)
            r11 = 0
            r1 = r12
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpResponse.<init>(java.lang.Object, int, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpResponse(java.lang.Object r13, int r14, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r15, java.lang.String r16, java.lang.String r17) {
        /*
            r12 = this;
            java.lang.String r0 = "body"
            r2 = r13
            kotlin.jvm.internal.m.e(r13, r0)
            java.lang.String r0 = "headers"
            r4 = r15
            kotlin.jvm.internal.m.e(r15, r0)
            java.lang.String r0 = "urlString"
            r5 = r16
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "protocol"
            r6 = r17
            kotlin.jvm.internal.m.e(r6, r0)
            r7 = 0
            r8 = 0
            r10 = 96
            r11 = 0
            r1 = r12
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpResponse.<init>(java.lang.Object, int, java.util.Map, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpResponse(java.lang.Object r13, int r14, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r12 = this;
            java.lang.String r0 = "body"
            r2 = r13
            kotlin.jvm.internal.m.e(r13, r0)
            java.lang.String r0 = "headers"
            r4 = r15
            kotlin.jvm.internal.m.e(r15, r0)
            java.lang.String r0 = "urlString"
            r5 = r16
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "protocol"
            r6 = r17
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "client"
            r7 = r18
            kotlin.jvm.internal.m.e(r7, r0)
            r8 = 0
            r10 = 64
            r11 = 0
            r1 = r12
            r3 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpResponse.<init>(java.lang.Object, int, java.util.Map, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public HttpResponse(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j10) {
        m.e(obj, "body");
        m.e(map, "headers");
        m.e(str, "urlString");
        m.e(str2, "protocol");
        m.e(str3, "client");
        this.body = obj;
        this.statusCode = i10;
        this.headers = map;
        this.urlString = str;
        this.protocol = str2;
        this.client = str3;
        this.contentSize = j10;
    }

    public static /* synthetic */ HttpResponse copy$default(HttpResponse httpResponse, Object obj, int i10, Map map, String str, String str2, String str3, long j10, int i11, Object obj2) {
        HttpResponse httpResponse2 = httpResponse;
        return httpResponse.copy((i11 & 1) != 0 ? httpResponse2.body : obj, (i11 & 2) != 0 ? httpResponse2.statusCode : i10, (i11 & 4) != 0 ? httpResponse2.headers : map, (i11 & 8) != 0 ? httpResponse2.urlString : str, (i11 & 16) != 0 ? httpResponse2.protocol : str2, (i11 & 32) != 0 ? httpResponse2.client : str3, (i11 & 64) != 0 ? httpResponse2.contentSize : j10);
    }

    public final Object component1() {
        return this.body;
    }

    public final int component2() {
        return this.statusCode;
    }

    public final Map<String, List<String>> component3() {
        return this.headers;
    }

    public final String component4() {
        return this.urlString;
    }

    public final String component5() {
        return this.protocol;
    }

    public final String component6() {
        return this.client;
    }

    public final long component7() {
        return this.contentSize;
    }

    public final HttpResponse copy(Object obj, int i10, Map<String, ? extends List<String>> map, String str, String str2, String str3, long j10) {
        m.e(obj, "body");
        m.e(map, "headers");
        m.e(str, "urlString");
        m.e(str2, "protocol");
        String str4 = str3;
        m.e(str4, "client");
        return new HttpResponse(obj, i10, map, str, str2, str4, j10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpResponse)) {
            return false;
        }
        HttpResponse httpResponse = (HttpResponse) obj;
        return m.a(this.body, httpResponse.body) && this.statusCode == httpResponse.statusCode && m.a(this.headers, httpResponse.headers) && m.a(this.urlString, httpResponse.urlString) && m.a(this.protocol, httpResponse.protocol) && m.a(this.client, httpResponse.client) && this.contentSize == httpResponse.contentSize;
    }

    public final Object getBody() {
        return this.body;
    }

    public final String getClient() {
        return this.client;
    }

    public final long getContentSize() {
        return this.contentSize;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final int getStatusCode() {
        return this.statusCode;
    }

    public final String getUrlString() {
        return this.urlString;
    }

    public int hashCode() {
        return (((((((((((this.body.hashCode() * 31) + this.statusCode) * 31) + this.headers.hashCode()) * 31) + this.urlString.hashCode()) * 31) + this.protocol.hashCode()) * 31) + this.client.hashCode()) * 31) + b.a(this.contentSize);
    }

    public String toString() {
        return "HttpResponse(body=" + this.body + ", statusCode=" + this.statusCode + ", headers=" + this.headers + ", urlString=" + this.urlString + ", protocol=" + this.protocol + ", client=" + this.client + ", contentSize=" + this.contentSize + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HttpResponse(java.lang.Object r8, int r9, java.util.Map r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, long r14, int r16, kotlin.jvm.internal.h r17) {
        /*
            r7 = this;
            r0 = r16 & 2
            if (r0 == 0) goto L_0x0007
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0008
        L_0x0007:
            r0 = r9
        L_0x0008:
            r1 = r16 & 4
            if (r1 == 0) goto L_0x0011
            java.util.Map r1 = td.k0.g()
            goto L_0x0012
        L_0x0011:
            r1 = r10
        L_0x0012:
            r2 = r16 & 8
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x001a
            r2 = r3
            goto L_0x001b
        L_0x001a:
            r2 = r11
        L_0x001b:
            r4 = r16 & 16
            if (r4 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r3 = r12
        L_0x0021:
            r4 = r16 & 32
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = "unknown"
            goto L_0x0029
        L_0x0028:
            r4 = r13
        L_0x0029:
            r5 = r16 & 64
            if (r5 == 0) goto L_0x0030
            r5 = -1
            goto L_0x0031
        L_0x0030:
            r5 = r14
        L_0x0031:
            r9 = r7
            r10 = r8
            r11 = r0
            r12 = r1
            r13 = r2
            r14 = r3
            r15 = r4
            r16 = r5
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpResponse.<init>(java.lang.Object, int, java.util.Map, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.h):void");
    }
}
