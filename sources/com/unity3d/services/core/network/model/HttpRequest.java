package com.unity3d.services.core.network.model;

import com.unity3d.ads.core.data.model.OperationType;
import java.io.File;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: HttpRequest.kt */
public final class HttpRequest {
    public static final Companion Companion = new Companion((h) null);
    public static final String DEFAULT_SCHEME = "https";
    public static final int DEFAULT_TIMEOUT = 30000;
    private final String baseURL;
    private final Object body;
    private final BodyType bodyType;
    private final int callTimeout;
    private final int connectTimeout;
    private final File downloadDestination;
    private final Map<String, List<String>> headers;
    private final boolean isProtobuf;
    private final RequestType method;
    private final OperationType operationType;
    private final Map<String, String> parameters;
    private final String path;
    private final Integer port;
    private final int priority;
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

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str) {
        this(str, (String) null, (RequestType) null, (Object) null, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131070, (h) null);
        m.e(str, "baseURL");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2) {
        this(str, str2, (RequestType) null, (Object) null, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131068, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType) {
        this(str, str2, requestType, (Object) null, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131064, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj) {
        this(str, str2, requestType, obj, (Map) null, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131056, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map) {
        this(str, str2, requestType, obj, map, (Map) null, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131040, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2) {
        this(str, str2, requestType, obj, map, map2, (BodyType) null, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 131008, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2) {
        this(str, str2, requestType, obj, map, map2, bodyType2, (String) null, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 130944, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, (Integer) null, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 130816, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, 0, 0, 0, 0, false, (OperationType) null, (File) null, 0, 130560, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, 0, 0, 0, false, (OperationType) null, (File) null, 0, 130048, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, i11, 0, 0, false, (OperationType) null, (File) null, 0, 129024, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, i11, i12, 0, false, (OperationType) null, (File) null, 0, 126976, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12, int i13) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, i11, i12, i13, false, (OperationType) null, (File) null, 0, 122880, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10) {
        this(str, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, i11, i12, i13, z10, (OperationType) null, (File) null, 0, 114688, (h) null);
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r23, java.lang.String r24, com.unity3d.services.core.network.model.RequestType r25, java.lang.Object r26, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r27, java.util.Map<java.lang.String, java.lang.String> r28, com.unity3d.services.core.network.model.BodyType r29, java.lang.String r30, java.lang.Integer r31, int r32, int r33, int r34, int r35, boolean r36, com.unity3d.ads.core.data.model.OperationType r37) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r20 = r0
            java.lang.String r0 = "baseURL"
            r21 = r1
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "path"
            r1 = r24
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "method"
            r1 = r25
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "headers"
            r1 = r27
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "parameters"
            r1 = r28
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "bodyType"
            r1 = r29
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "scheme"
            r1 = r30
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "operationType"
            r1 = r37
            kotlin.jvm.internal.m.e(r1, r0)
            r16 = 0
            r17 = 0
            r18 = 98304(0x18000, float:1.37753E-40)
            r19 = 0
            r0 = r20
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public HttpRequest(java.lang.String r23, java.lang.String r24, com.unity3d.services.core.network.model.RequestType r25, java.lang.Object r26, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r27, java.util.Map<java.lang.String, java.lang.String> r28, com.unity3d.services.core.network.model.BodyType r29, java.lang.String r30, java.lang.Integer r31, int r32, int r33, int r34, int r35, boolean r36, com.unity3d.ads.core.data.model.OperationType r37, java.io.File r38) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r20 = r0
            java.lang.String r0 = "baseURL"
            r21 = r1
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "path"
            r1 = r24
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "method"
            r1 = r25
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "headers"
            r1 = r27
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "parameters"
            r1 = r28
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "bodyType"
            r1 = r29
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "scheme"
            r1 = r30
            kotlin.jvm.internal.m.e(r1, r0)
            java.lang.String r0 = "operationType"
            r1 = r37
            kotlin.jvm.internal.m.e(r1, r0)
            r17 = 0
            r18 = 65536(0x10000, float:9.18355E-41)
            r19 = 0
            r0 = r20
            r1 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File):void");
    }

    public HttpRequest(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType2, File file, int i14) {
        Map<String, String> map3 = map2;
        BodyType bodyType3 = bodyType2;
        String str4 = str3;
        OperationType operationType3 = operationType2;
        m.e(str, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map3, "parameters");
        m.e(bodyType3, "bodyType");
        m.e(str4, "scheme");
        m.e(operationType3, "operationType");
        this.baseURL = str;
        this.path = str2;
        this.method = requestType;
        this.body = obj;
        this.headers = map;
        this.parameters = map3;
        this.bodyType = bodyType3;
        this.scheme = str4;
        this.port = num;
        this.connectTimeout = i10;
        this.readTimeout = i11;
        this.writeTimeout = i12;
        this.callTimeout = i13;
        this.isProtobuf = z10;
        this.operationType = operationType3;
        this.downloadDestination = file;
        this.priority = i14;
    }

    public static /* synthetic */ HttpRequest copy$default(HttpRequest httpRequest, String str, String str2, RequestType requestType, Object obj, Map map, Map map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType2, File file, int i14, int i15, Object obj2) {
        HttpRequest httpRequest2 = httpRequest;
        int i16 = i15;
        return httpRequest.copy((i16 & 1) != 0 ? httpRequest2.baseURL : str, (i16 & 2) != 0 ? httpRequest2.path : str2, (i16 & 4) != 0 ? httpRequest2.method : requestType, (i16 & 8) != 0 ? httpRequest2.body : obj, (i16 & 16) != 0 ? httpRequest2.headers : map, (i16 & 32) != 0 ? httpRequest2.parameters : map2, (i16 & 64) != 0 ? httpRequest2.bodyType : bodyType2, (i16 & 128) != 0 ? httpRequest2.scheme : str3, (i16 & 256) != 0 ? httpRequest2.port : num, (i16 & 512) != 0 ? httpRequest2.connectTimeout : i10, (i16 & 1024) != 0 ? httpRequest2.readTimeout : i11, (i16 & 2048) != 0 ? httpRequest2.writeTimeout : i12, (i16 & 4096) != 0 ? httpRequest2.callTimeout : i13, (i16 & 8192) != 0 ? httpRequest2.isProtobuf : z10, (i16 & 16384) != 0 ? httpRequest2.operationType : operationType2, (i16 & 32768) != 0 ? httpRequest2.downloadDestination : file, (i16 & 65536) != 0 ? httpRequest2.priority : i14);
    }

    public final String component1() {
        return this.baseURL;
    }

    public final int component10() {
        return this.connectTimeout;
    }

    public final int component11() {
        return this.readTimeout;
    }

    public final int component12() {
        return this.writeTimeout;
    }

    public final int component13() {
        return this.callTimeout;
    }

    public final boolean component14() {
        return this.isProtobuf;
    }

    public final OperationType component15() {
        return this.operationType;
    }

    public final File component16() {
        return this.downloadDestination;
    }

    public final int component17() {
        return this.priority;
    }

    public final String component2() {
        return this.path;
    }

    public final RequestType component3() {
        return this.method;
    }

    public final Object component4() {
        return this.body;
    }

    public final Map<String, List<String>> component5() {
        return this.headers;
    }

    public final Map<String, String> component6() {
        return this.parameters;
    }

    public final BodyType component7() {
        return this.bodyType;
    }

    public final String component8() {
        return this.scheme;
    }

    public final Integer component9() {
        return this.port;
    }

    public final HttpRequest copy(String str, String str2, RequestType requestType, Object obj, Map<String, ? extends List<String>> map, Map<String, String> map2, BodyType bodyType2, String str3, Integer num, int i10, int i11, int i12, int i13, boolean z10, OperationType operationType2, File file, int i14) {
        String str4 = str;
        m.e(str4, "baseURL");
        m.e(str2, "path");
        m.e(requestType, "method");
        m.e(map, "headers");
        m.e(map2, "parameters");
        m.e(bodyType2, "bodyType");
        m.e(str3, "scheme");
        m.e(operationType2, "operationType");
        return new HttpRequest(str4, str2, requestType, obj, map, map2, bodyType2, str3, num, i10, i11, i12, i13, z10, operationType2, file, i14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpRequest)) {
            return false;
        }
        HttpRequest httpRequest = (HttpRequest) obj;
        return m.a(this.baseURL, httpRequest.baseURL) && m.a(this.path, httpRequest.path) && this.method == httpRequest.method && m.a(this.body, httpRequest.body) && m.a(this.headers, httpRequest.headers) && m.a(this.parameters, httpRequest.parameters) && this.bodyType == httpRequest.bodyType && m.a(this.scheme, httpRequest.scheme) && m.a(this.port, httpRequest.port) && this.connectTimeout == httpRequest.connectTimeout && this.readTimeout == httpRequest.readTimeout && this.writeTimeout == httpRequest.writeTimeout && this.callTimeout == httpRequest.callTimeout && this.isProtobuf == httpRequest.isProtobuf && this.operationType == httpRequest.operationType && m.a(this.downloadDestination, httpRequest.downloadDestination) && this.priority == httpRequest.priority;
    }

    public final String getBaseURL() {
        return this.baseURL;
    }

    public final Object getBody() {
        return this.body;
    }

    public final BodyType getBodyType() {
        return this.bodyType;
    }

    public final int getCallTimeout() {
        return this.callTimeout;
    }

    public final int getConnectTimeout() {
        return this.connectTimeout;
    }

    public final File getDownloadDestination() {
        return this.downloadDestination;
    }

    public final Map<String, List<String>> getHeaders() {
        return this.headers;
    }

    public final RequestType getMethod() {
        return this.method;
    }

    public final OperationType getOperationType() {
        return this.operationType;
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

    public final int getPriority() {
        return this.priority;
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
        int hashCode = ((((this.baseURL.hashCode() * 31) + this.path.hashCode()) * 31) + this.method.hashCode()) * 31;
        Object obj = this.body;
        int i10 = 0;
        int hashCode2 = (((((((((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.headers.hashCode()) * 31) + this.parameters.hashCode()) * 31) + this.bodyType.hashCode()) * 31) + this.scheme.hashCode()) * 31;
        Integer num = this.port;
        int hashCode3 = (((((((((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.connectTimeout) * 31) + this.readTimeout) * 31) + this.writeTimeout) * 31) + this.callTimeout) * 31;
        boolean z10 = this.isProtobuf;
        if (z10) {
            z10 = true;
        }
        int hashCode4 = (((hashCode3 + (z10 ? 1 : 0)) * 31) + this.operationType.hashCode()) * 31;
        File file = this.downloadDestination;
        if (file != null) {
            i10 = file.hashCode();
        }
        return ((hashCode4 + i10) * 31) + this.priority;
    }

    public final boolean isProtobuf() {
        return this.isProtobuf;
    }

    public String toString() {
        return "HttpRequest(baseURL=" + this.baseURL + ", path=" + this.path + ", method=" + this.method + ", body=" + this.body + ", headers=" + this.headers + ", parameters=" + this.parameters + ", bodyType=" + this.bodyType + ", scheme=" + this.scheme + ", port=" + this.port + ", connectTimeout=" + this.connectTimeout + ", readTimeout=" + this.readTimeout + ", writeTimeout=" + this.writeTimeout + ", callTimeout=" + this.callTimeout + ", isProtobuf=" + this.isProtobuf + ", operationType=" + this.operationType + ", downloadDestination=" + this.downloadDestination + ", priority=" + this.priority + ')';
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ HttpRequest(java.lang.String r19, java.lang.String r20, com.unity3d.services.core.network.model.RequestType r21, java.lang.Object r22, java.util.Map r23, java.util.Map r24, com.unity3d.services.core.network.model.BodyType r25, java.lang.String r26, java.lang.Integer r27, int r28, int r29, int r30, int r31, boolean r32, com.unity3d.ads.core.data.model.OperationType r33, java.io.File r34, int r35, int r36, kotlin.jvm.internal.h r37) {
        /*
            r18 = this;
            r0 = r36
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0009
            java.lang.String r1 = ""
            goto L_0x000b
        L_0x0009:
            r1 = r20
        L_0x000b:
            r2 = r0 & 4
            if (r2 == 0) goto L_0x0012
            com.unity3d.services.core.network.model.RequestType r2 = com.unity3d.services.core.network.model.RequestType.GET
            goto L_0x0014
        L_0x0012:
            r2 = r21
        L_0x0014:
            r3 = r0 & 8
            if (r3 == 0) goto L_0x001a
            r3 = 0
            goto L_0x001c
        L_0x001a:
            r3 = r22
        L_0x001c:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0025
            java.util.Map r5 = td.k0.g()
            goto L_0x0027
        L_0x0025:
            r5 = r23
        L_0x0027:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0030
            java.util.Map r6 = td.k0.g()
            goto L_0x0032
        L_0x0030:
            r6 = r24
        L_0x0032:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0039
            com.unity3d.services.core.network.model.BodyType r7 = com.unity3d.services.core.network.model.BodyType.UNKNOWN
            goto L_0x003b
        L_0x0039:
            r7 = r25
        L_0x003b:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0042
            java.lang.String r8 = "https"
            goto L_0x0044
        L_0x0042:
            r8 = r26
        L_0x0044:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x004a
            r9 = 0
            goto L_0x004c
        L_0x004a:
            r9 = r27
        L_0x004c:
            r10 = r0 & 512(0x200, float:7.175E-43)
            r11 = 30000(0x7530, float:4.2039E-41)
            if (r10 == 0) goto L_0x0055
            r10 = 30000(0x7530, float:4.2039E-41)
            goto L_0x0057
        L_0x0055:
            r10 = r28
        L_0x0057:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x005e
            r12 = 30000(0x7530, float:4.2039E-41)
            goto L_0x0060
        L_0x005e:
            r12 = r29
        L_0x0060:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L_0x0067
            r13 = 30000(0x7530, float:4.2039E-41)
            goto L_0x0069
        L_0x0067:
            r13 = r30
        L_0x0069:
            r14 = r0 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L_0x006e
            goto L_0x0070
        L_0x006e:
            r11 = r31
        L_0x0070:
            r14 = r0 & 8192(0x2000, float:1.14794E-41)
            r15 = 0
            if (r14 == 0) goto L_0x0077
            r14 = 0
            goto L_0x0079
        L_0x0077:
            r14 = r32
        L_0x0079:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0080
            com.unity3d.ads.core.data.model.OperationType r4 = com.unity3d.ads.core.data.model.OperationType.UNKNOWN
            goto L_0x0082
        L_0x0080:
            r4 = r33
        L_0x0082:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x008c
            r16 = 0
            goto L_0x008e
        L_0x008c:
            r16 = r34
        L_0x008e:
            r17 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r17
            if (r0 == 0) goto L_0x0095
            goto L_0x0097
        L_0x0095:
            r15 = r35
        L_0x0097:
            r20 = r18
            r21 = r19
            r22 = r1
            r23 = r2
            r24 = r3
            r25 = r5
            r26 = r6
            r27 = r7
            r28 = r8
            r29 = r9
            r30 = r10
            r31 = r12
            r32 = r13
            r33 = r11
            r34 = r14
            r35 = r4
            r36 = r16
            r37 = r15
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.network.model.HttpRequest.<init>(java.lang.String, java.lang.String, com.unity3d.services.core.network.model.RequestType, java.lang.Object, java.util.Map, java.util.Map, com.unity3d.services.core.network.model.BodyType, java.lang.String, java.lang.Integer, int, int, int, int, boolean, com.unity3d.ads.core.data.model.OperationType, java.io.File, int, int, kotlin.jvm.internal.h):void");
    }
}
