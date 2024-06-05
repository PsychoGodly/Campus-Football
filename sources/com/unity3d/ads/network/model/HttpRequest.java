package com.unity3d.ads.network.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: HttpRequest.kt */
public final class HttpRequest {
    public static final Companion Companion = new Companion((h) null);
    private static final String DEFAULT_SCHEME = "https";
    private static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final HttpBody body;
    private final int callTimeout;
    private final int connectTimeout;
    private final Map<String, List<String>> headers;
    private final RequestType method;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int readTimeout;
    private final String scheme;
    private final int writeTimeout;

    /* compiled from: HttpRequest.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4094(0xffe, float:5.737E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4092(0xffc, float:5.734E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4088(0xff8, float:5.729E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4080(0xff0, float:5.717E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4064(0xfe0, float:5.695E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 4032(0xfc0, float:5.65E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            java.lang.String r0 = "scheme"
            r8 = r23
            kotlin.jvm.internal.m.e(r8, r0)
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 3968(0xf80, float:5.56E-42)
            r15 = 0
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, java.lang.Integer r24) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            java.lang.String r0 = "scheme"
            r8 = r23
            kotlin.jvm.internal.m.e(r8, r0)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 3840(0xf00, float:5.381E-42)
            r15 = 0
            r1 = r16
            r9 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, java.lang.Integer r24, int r25) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            java.lang.String r0 = "scheme"
            r8 = r23
            kotlin.jvm.internal.m.e(r8, r0)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 3584(0xe00, float:5.022E-42)
            r15 = 0
            r1 = r16
            r9 = r24
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, java.lang.Integer r24, int r25, int r26) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            java.lang.String r0 = "scheme"
            r8 = r23
            kotlin.jvm.internal.m.e(r8, r0)
            r12 = 0
            r13 = 0
            r14 = 3072(0xc00, float:4.305E-42)
            r15 = 0
            r1 = r16
            r9 = r24
            r10 = r25
            r11 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r17, java.lang.String r18, com.unity3d.ads.network.model.RequestType r19, com.unity3d.ads.network.model.HttpBody r20, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r21, java.util.Map<java.lang.String, java.lang.String> r22, java.lang.String r23, java.lang.Integer r24, int r25, int r26, int r27) {
        /*
            r16 = this;
            java.lang.String r0 = "baseURL"
            r2 = r17
            kotlin.jvm.internal.m.e(r2, r0)
            java.lang.String r0 = "path"
            r3 = r18
            kotlin.jvm.internal.m.e(r3, r0)
            java.lang.String r0 = "method"
            r4 = r19
            kotlin.jvm.internal.m.e(r4, r0)
            java.lang.String r0 = "body"
            r5 = r20
            kotlin.jvm.internal.m.e(r5, r0)
            java.lang.String r0 = "headers"
            r6 = r21
            kotlin.jvm.internal.m.e(r6, r0)
            java.lang.String r0 = "parameters"
            r7 = r22
            kotlin.jvm.internal.m.e(r7, r0)
            java.lang.String r0 = "scheme"
            r8 = r23
            kotlin.jvm.internal.m.e(r8, r0)
            r13 = 0
            r14 = 2048(0x800, float:2.87E-42)
            r15 = 0
            r1 = r16
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int, int, int):void");
    }

    public HttpRequest(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11, int i12, int i13) {
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(httpBody, "body");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(str3, "scheme");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = httpBody;
        this.headers = map;
        this.parameters = map2;
        this.scheme = str3;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, HttpBody httpBody, Map map, Map map2, String str3, Integer num, int i10, int i11, int i12, int i13, int i14, Object obj) {
        HttpRequest httpRequest2 = httpRequest;
        int i15 = i14;
        return httpRequest.copy((i15 & 1) != 0 ? httpRequest2.baseURL : str, (i15 & 2) != 0 ? httpRequest2.path : str2, (i15 & 4) != 0 ? httpRequest2.method : requestType, (i15 & 8) != 0 ? httpRequest2.body : httpBody, (i15 & 16) != 0 ? httpRequest2.headers : map, (i15 & 32) != 0 ? httpRequest2.parameters : map2, (i15 & 64) != 0 ? httpRequest2.scheme : str3, (i15 & 128) != 0 ? httpRequest2.port : num, (i15 & 256) != 0 ? httpRequest2.connectTimeout : i10, (i15 & 512) != 0 ? httpRequest2.readTimeout : i11, (i15 & 1024) != 0 ? httpRequest2.writeTimeout : i12, (i15 & 2048) != 0 ? httpRequest2.callTimeout : i13);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.readTimeout;
    }

    public final int component11() {
        return this.writeTimeout;
    }

    public final int component12() {
        return this.callTimeout;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final HttpBody component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final String component7() {
        return this.scheme;
    }

    public final Integer component8() {
        return this.port;
    }

    public final int component9() {
        return this.connectTimeout;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, HttpBody httpBody, Map<String, ? extends List<String>> map, Map<String, String> map2, String str3, Integer num, int i10, int i11, int i12, int i13) {
        m.e(str, "baseURL");
        String str4 = str2;
        m.e(str4, "path");
        RequestType requestType2 = requestType;
        m.e(requestType2, "method");
        HttpBody httpBody2 = httpBody;
        m.e(httpBody2, "body");
        Map<String, ? extends List<String>> map3 = map;
        m.e(map3, "headers");
        Map<String, String> map4 = map2;
        m.e(map4, "parameters");
        String str5 = str3;
        m.e(str5, "scheme");
        return new HttpRequest(str, str4, requestType2, httpBody2, map3, map4, str5, num, i10, i11, i12, i13);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return m.a(this.baseURL, httpRequest.baseURL) && m.a(this.path, httpRequest.path) && this.method == httpRequest.method && m.a(this.body, httpRequest.body) && m.a(this.headers, httpRequest.headers) && m.a(this.parameters, httpRequest.parameters) && m.a(this.scheme, httpRequest.scheme) && m.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final HttpBody getBody() {
        return this.body;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final Map<String, String> getParameters() {
        return this.parameters;
    }

    public final String getPath() {
        return this.path;
    }

    public final Integer getPort() {
        return this.port;
    }

    public final int getReadTimeout() {
        return this.readTimeout;
    }

    public final String getScheme() {
        return this.scheme;
    }

    public final int getWriteTimeout() {
        return this.writeTimeout;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31) + this.body.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        return ((((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HttpRequest(java.lang.String r13, java.lang.String r14, com.unity3d.ads.network.model.RequestType r15, com.unity3d.ads.network.model.HttpBody r16, java.util.Map r17, java.util.Map r18, java.lang.String r19, java.lang.Integer r20, int r21, int r22, int r23, int r24, int r25, kotlin.jvm.internal.h r26) {
        /*
            r12 = this;
            r0 = r25
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000a
        L_0x0009:
            r1 = r14
        L_0x000a:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0011
            com.unity3d.ads.network.model.RequestType r2 = com.unity3d.ads.network.model.RequestType.GET
            goto L_0x0012
        L_0x0011:
            r2 = r15
        L_0x0012:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x0019
            com.unity3d.ads.network.model.HttpBody$EmptyBody r3 = com.unity3d.ads.network.model.HttpBody.EmptyBody.INSTANCE
            goto L_0x001b
        L_0x0019:
            r3 = r16
        L_0x001b:
            r4 = r0 & 16
            if (r4 == 0) goto L_0x0024
            java.util.Map r4 = td.k0.g()
            goto L_0x0026
        L_0x0024:
            r4 = r17
        L_0x0026:
            r5 = r0 & 32
            if (r5 == 0) goto L_0x002f
            java.util.Map r5 = td.k0.g()
            goto L_0x0031
        L_0x002f:
            r5 = r18
        L_0x0031:
            r6 = r0 & 64
            if (r6 == 0) goto L_0x0038
            java.lang.String r6 = "https"
            goto L_0x003a
        L_0x0038:
            r6 = r19
        L_0x003a:
            r7 = r0 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0040
            r7 = 0
            goto L_0x0042
        L_0x0040:
            r7 = r20
        L_0x0042:
            r8 = r0 & 256(0x100, float:3.59E-43)
            r9 = 30000(0x7530, float:4.2039E-41)
            if (r8 == 0) goto L_0x004b
            r8 = 30000(0x7530, float:4.2039E-41)
            goto L_0x004d
        L_0x004b:
            r8 = r21
        L_0x004d:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0054
            r10 = 30000(0x7530, float:4.2039E-41)
            goto L_0x0056
        L_0x0054:
            r10 = r22
        L_0x0056:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x005d
            r11 = 30000(0x7530, float:4.2039E-41)
            goto L_0x005f
        L_0x005d:
            r11 = r23
        L_0x005f:
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r9 = r24
        L_0x0066:
            r14 = r12
            r15 = r13
            r16 = r1
            r17 = r2
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r10
            r25 = r11
            r26 = r9
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.ads.network.model.RequestType, com.unity3d.ads.network.model.HttpBody, java.util.Map, java.util.Map, java.lang.String, java.lang.Integer, int, int, int, int, int, kotlin.jvm.internal.h):void");
    }
}
