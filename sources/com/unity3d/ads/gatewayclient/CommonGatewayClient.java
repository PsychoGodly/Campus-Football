package com.unity3d.ads.gatewayclient;

import com.google.protobuf.e0;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpResponse;
import ie.c;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import oe.i;
import sd.s;
import vb.b1;
import vb.d1;
import vb.u3;
import vb.w3;

/* compiled from: CommonGatewayClient.kt */
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final Companion Companion = new Companion((h) null);
    public static final String RETRY_ATTEMPT_HEADER = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClient httpClient;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGatewayClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CommonGatewayClient(HttpClient httpClient2, HandleGatewayUniversalResponse handleGatewayUniversalResponse2, SendDiagnosticEvent sendDiagnosticEvent2, SessionRepository sessionRepository2) {
        m.e(httpClient2, "httpClient");
        m.e(handleGatewayUniversalResponse2, "handleGatewayUniversalResponse");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(sessionRepository2, "sessionRepository");
        this.httpClient = httpClient2;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.sessionRepository = sessionRepository2;
    }

    private final long calculateDelayTime(RequestPolicy requestPolicy, int i10) {
        long calculateExponentialBackoff = calculateExponentialBackoff(requestPolicy.getRetryWaitBase(), i10);
        return calculateExponentialBackoff + calculateJitter(calculateExponentialBackoff, requestPolicy.getRetryJitterPct());
    }

    private final long calculateExponentialBackoff(int i10, int i11) {
        return ((long) i10) * ((long) Math.pow(2.0d, (double) i11));
    }

    private final long calculateJitter(long j10, float f10) {
        long j11 = (long) (((float) j10) * f10);
        return c.f33334a.f(-j11, j11 + 1);
    }

    private final w3 getUniversalResponse(HttpResponse httpResponse, OperationType operationType) {
        try {
            Object body = httpResponse.getBody();
            if (body instanceof byte[]) {
                w3 m02 = w3.m0((byte[]) body);
                m.d(m02, "parseFrom(responseBody)");
                return m02;
            } else if (body instanceof String) {
                byte[] bytes = ((String) body).getBytes(ne.c.f36517g);
                m.d(bytes, "this as java.lang.String).getBytes(charset)");
                w3 m03 = w3.m0(bytes);
                m.d(m03, "parseFrom(\n             …8859_1)\n                )");
                return m03;
            } else {
                throw new e0("Could not parse response from gateway service");
            }
        } catch (e0 e10) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e10.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", (Double) null, k0.j(s.a("operation", operationType.toString()), s.a("reason", "protobuf_parsing"), s.a("reason_debug", httpResponse.getBody().toString())), (Map) null, (AdObject) null, 26, (Object) null);
            u3.a aVar = u3.f39097b;
            w3.a l02 = w3.l0();
            m.d(l02, "newBuilder()");
            u3 a10 = aVar.a(l02);
            b1.a aVar2 = b1.f38926b;
            d1.a i02 = d1.i0();
            m.d(i02, "newBuilder()");
            b1 a11 = aVar2.a(i02);
            a11.b("ERROR: Could not parse response from gateway service");
            a10.b(a11.a());
            return a10.a();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException unityAdsNetworkException, int i10, OperationType operationType, i iVar) {
        if (operationType != OperationType.UNIVERSAL_EVENT) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), k0.l(s.a("operation", operationType.toString()), s.a("retries", String.valueOf(i10)), s.a("protocol", String.valueOf(unityAdsNetworkException.getProtocol())), s.a("network_client", String.valueOf(unityAdsNetworkException.getClient())), s.a("reason_code", String.valueOf(unityAdsNetworkException.getCode())), s.a("reason_debug", unityAdsNetworkException.getMessage())), (Map) null, (AdObject) null, 24, (Object) null);
        }
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int i10, OperationType operationType, i iVar) {
        if (operationType != OperationType.UNIVERSAL_EVENT) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(iVar)), k0.l(s.a("operation", operationType.toString()), s.a("retries", String.valueOf(i10)), s.a("protocol", httpResponse.getProtocol()), s.a("network_client", httpResponse.getClient()), s.a("reason_code", String.valueOf(httpResponse.getStatusCode()))), (Map) null, (AdObject) null, 24, (Object) null);
        }
    }

    private final boolean shouldRetry(int i10) {
        return 400 <= i10 && i10 < 600;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:15|(3:16|17|18)|(2:38|39)|40|41|42|43|53|(1:55)(3:63|(1:65)(5:66|67|(1:70)(0)|70|71)|65)|55|(2:57|(1:59)(2:60|72))(2:61|62)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:2|(13:4|6|(1:(1:(1:(5:11|67|(1:69)|70|71)(2:12|13))(2:14|73))(14:15|16|17|18|38|39|40|41|42|43|53|(1:55)(3:63|(1:65)(5:66|67|(1:70)(0)|70|71)|65)|55|(2:57|(1:59)(2:60|72))(2:61|62)))(3:21|(1:23)(1:24)|25)|26|(1:28)|29|30|31|32|33|34|(1:36)(11:37|38|39|40|41|42|43|53|(0)|55|(0)(0))|36))|5|6|(0)(0)|26|(0)|29|30|31|32|33|34|(0)|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x017b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0180, code lost:
        r1 = r0;
        r0 = r42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0184, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0186, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0187, code lost:
        r42 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0189, code lost:
        r1 = r0;
        r2 = r8;
        r0 = r42;
        r37 = r5;
        r5 = r3;
        r3 = r9;
        r8 = r37;
        r39 = r14;
        r14 = r4;
        r4 = r11;
        r11 = r12;
        r13 = r39;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01be  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0251  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object request(java.lang.String r42, vb.t3 r43, com.unity3d.ads.gatewayclient.RequestPolicy r44, com.unity3d.ads.core.data.model.OperationType r45, xd.d<? super vb.w3> r46) {
        /*
            r41 = this;
            r1 = r41
            r0 = r46
            boolean r2 = r0 instanceof com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r2 = (com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 r2 = new com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            java.lang.String r5 = "ms"
            java.lang.String r6 = " retries and duration: "
            java.lang.String r7 = "Gateway request failed after "
            r8 = 3
            r9 = 2
            r10 = 1
            if (r4 == 0) goto L_0x00af
            if (r4 == r10) goto L_0x0074
            if (r4 == r9) goto L_0x006b
            if (r4 != r8) goto L_0x0063
            long r11 = r2.J$0
            java.lang.Object r4 = r2.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.L$4
            kotlin.jvm.internal.x r13 = (kotlin.jvm.internal.x) r13
            java.lang.Object r14 = r2.L$3
            com.unity3d.ads.core.data.model.OperationType r14 = (com.unity3d.ads.core.data.model.OperationType) r14
            java.lang.Object r15 = r2.L$2
            com.unity3d.ads.gatewayclient.RequestPolicy r15 = (com.unity3d.ads.gatewayclient.RequestPolicy) r15
            java.lang.Object r8 = r2.L$1
            vb.t3 r8 = (vb.t3) r8
            java.lang.Object r9 = r2.L$0
            com.unity3d.ads.gatewayclient.CommonGatewayClient r9 = (com.unity3d.ads.gatewayclient.CommonGatewayClient) r9
            sd.p.b(r0)
            r0 = r2
            r10 = r5
            r2 = r8
            r1 = 3
            r5 = r3
            r8 = r6
            r3 = r15
            r15 = r7
            r37 = r11
            r11 = r4
            r4 = r14
            r14 = r13
            r12 = r37
            goto L_0x0240
        L_0x0063:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x006b:
            java.lang.Object r2 = r2.L$0
            vb.w3 r2 = (vb.w3) r2
            sd.p.b(r0)
            goto L_0x01dc
        L_0x0074:
            long r8 = r2.J$1
            long r11 = r2.J$0
            java.lang.Object r4 = r2.L$5
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r13 = r2.L$4
            kotlin.jvm.internal.x r13 = (kotlin.jvm.internal.x) r13
            java.lang.Object r14 = r2.L$3
            com.unity3d.ads.core.data.model.OperationType r14 = (com.unity3d.ads.core.data.model.OperationType) r14
            java.lang.Object r15 = r2.L$2
            com.unity3d.ads.gatewayclient.RequestPolicy r15 = (com.unity3d.ads.gatewayclient.RequestPolicy) r15
            java.lang.Object r10 = r2.L$1
            vb.t3 r10 = (vb.t3) r10
            r17 = r3
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.gatewayclient.CommonGatewayClient r3 = (com.unity3d.ads.gatewayclient.CommonGatewayClient) r3
            sd.p.b(r0)     // Catch:{ UnityAdsNetworkException -> 0x00a1 }
            r1 = r10
            r10 = r17
            r17 = r6
            r37 = r15
            r15 = r5
            r5 = r37
            goto L_0x0169
        L_0x00a1:
            r0 = move-exception
            r1 = r0
            r0 = r10
            r10 = r17
            r17 = r6
            r37 = r15
            r15 = r5
            r5 = r37
            goto L_0x019a
        L_0x00af:
            r17 = r3
            sd.p.b(r0)
            kotlin.jvm.internal.x r0 = new kotlin.jvm.internal.x
            r0.<init>()
            r3 = 0
            java.lang.String r8 = "https://gateway.unityads.unity3d.com/v1"
            r9 = r42
            boolean r8 = kotlin.jvm.internal.m.a(r9, r8)
            if (r8 != 0) goto L_0x00c7
            r8 = r9
            goto L_0x00cd
        L_0x00c7:
            com.unity3d.ads.core.data.repository.SessionRepository r8 = r1.sessionRepository
            java.lang.String r8 = r8.getGatewayUrl()
        L_0x00cd:
            r14 = r0
            r9 = r1
            r12 = r3
            r11 = r8
            r10 = r17
            r3 = r44
            r4 = r45
            r8 = r2
            r2 = r43
        L_0x00da:
            java.util.Map r0 = td.j0.c()
            java.lang.String r15 = "application/x-protobuf"
            java.util.List r15 = td.p.b(r15)
            java.lang.String r1 = "Content-Type"
            r0.put(r1, r15)
            int r1 = r14.f36053a
            if (r1 <= 0) goto L_0x00fa
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.util.List r1 = td.p.b(r1)
            java.lang.String r15 = "X-RETRY-ATTEMPT"
            r0.put(r15, r1)
        L_0x00fa:
            java.util.Map r22 = td.j0.b(r0)
            com.unity3d.services.core.network.model.HttpRequest r0 = new com.unity3d.services.core.network.model.HttpRequest
            r17 = r0
            r19 = 0
            com.unity3d.services.core.network.model.RequestType r20 = com.unity3d.services.core.network.model.RequestType.POST
            byte[] r21 = r2.i()
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            int r27 = r3.getConnectTimeout()
            int r28 = r3.getReadTimeout()
            int r29 = r3.getWriteTimeout()
            r30 = 0
            r31 = 1
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 119266(0x1d1e2, float:1.67127E-40)
            r36 = 0
            r18 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            oe.j r1 = oe.j.f36786a
            r15 = r5
            r17 = r6
            long r5 = r1.a()
            com.unity3d.services.core.network.core.HttpClient r1 = r9.httpClient     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$0 = r9     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$1 = r2     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$2 = r3     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$3 = r4     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$4 = r14     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.L$5 = r11     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.J$0 = r12     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r8.J$1 = r5     // Catch:{ UnityAdsNetworkException -> 0x0186 }
            r42 = r2
            r2 = 1
            r8.label = r2     // Catch:{ UnityAdsNetworkException -> 0x0184 }
            java.lang.Object r0 = r1.execute(r0, r8)     // Catch:{ UnityAdsNetworkException -> 0x0184 }
            if (r0 != r10) goto L_0x0159
            return r10
        L_0x0159:
            r1 = r42
            r2 = r8
            r37 = r5
            r5 = r3
            r3 = r9
            r8 = r37
            r39 = r14
            r14 = r4
            r4 = r11
            r11 = r12
            r13 = r39
        L_0x0169:
            com.unity3d.services.core.network.model.HttpResponse r0 = (com.unity3d.services.core.network.model.HttpResponse) r0     // Catch:{ UnityAdsNetworkException -> 0x017d }
            int r6 = r13.f36053a     // Catch:{ UnityAdsNetworkException -> 0x017d }
            r42 = r1
            oe.j$a r1 = oe.j.a.c(r8)     // Catch:{ UnityAdsNetworkException -> 0x017b }
            r3.sendNetworkSuccessDiagnosticEvent(r0, r6, r14, r1)     // Catch:{ UnityAdsNetworkException -> 0x017b }
            r1 = r42
            r9 = r3
            r3 = r10
            goto L_0x01ae
        L_0x017b:
            r0 = move-exception
            goto L_0x0180
        L_0x017d:
            r0 = move-exception
            r42 = r1
        L_0x0180:
            r1 = r0
            r0 = r42
            goto L_0x019a
        L_0x0184:
            r0 = move-exception
            goto L_0x0189
        L_0x0186:
            r0 = move-exception
            r42 = r2
        L_0x0189:
            r1 = r0
            r2 = r8
            r0 = r42
            r37 = r5
            r5 = r3
            r3 = r9
            r8 = r37
            r39 = r14
            r14 = r4
            r4 = r11
            r11 = r12
            r13 = r39
        L_0x019a:
            int r6 = r13.f36053a
            oe.j$a r8 = oe.j.a.c(r8)
            r3.sendNetworkErrorDiagnosticEvent(r1, r6, r14, r8)
            com.unity3d.services.core.network.model.HttpResponse r1 = com.unity3d.services.core.network.model.HttpResponseKt.toHttpResponse(r1)
            r9 = r3
            r3 = r10
            r37 = r1
            r1 = r0
            r0 = r37
        L_0x01ae:
            int r6 = r0.getStatusCode()
            boolean r6 = r9.shouldRetry(r6)
            if (r6 != 0) goto L_0x020a
            boolean r1 = com.unity3d.services.core.network.model.HttpResponseKt.isSuccessful(r0)
            if (r1 == 0) goto L_0x01dd
            vb.w3 r0 = r9.getUniversalResponse(r0, r14)
            com.unity3d.ads.core.domain.HandleGatewayUniversalResponse r1 = r9.handleGatewayUniversalResponse
            r2.L$0 = r0
            r4 = 0
            r2.L$1 = r4
            r2.L$2 = r4
            r2.L$3 = r4
            r2.L$4 = r4
            r2.L$5 = r4
            r6 = 2
            r2.label = r6
            java.lang.Object r1 = r1.invoke(r0, r2)
            if (r1 != r3) goto L_0x01db
            return r3
        L_0x01db:
            r2 = r0
        L_0x01dc:
            return r2
        L_0x01dd:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            int r2 = r13.f36053a
            r1.append(r2)
            r8 = r17
            r1.append(r8)
            r1.append(r11)
            r10 = r15
            r1.append(r10)
            java.lang.String r4 = r1.toString()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 126(0x7e, float:1.77E-43)
            r12 = 0
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            throw r0
        L_0x020a:
            r10 = r15
            r8 = r17
            r6 = 2
            int r0 = r13.f36053a
            r15 = r7
            long r6 = r9.calculateDelayTime(r5, r0)
            long r11 = r11 + r6
            r2.L$0 = r9
            r2.L$1 = r1
            r2.L$2 = r5
            r2.L$3 = r14
            r2.L$4 = r13
            r2.L$5 = r4
            r2.J$0 = r11
            r0 = r1
            r1 = 3
            r2.label = r1
            java.lang.Object r6 = pe.a1.a(r6, r2)
            if (r6 != r3) goto L_0x022f
            return r3
        L_0x022f:
            r37 = r2
            r2 = r0
            r0 = r37
            r38 = r5
            r5 = r3
            r3 = r38
            r39 = r11
            r11 = r4
            r4 = r14
            r14 = r13
            r12 = r39
        L_0x0240:
            int r6 = r14.f36053a
            r7 = 1
            int r6 = r6 + r7
            r14.f36053a = r6
            int r6 = r3.getMaxDuration()
            r42 = r2
            long r1 = (long) r6
            int r6 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x025f
            r1 = r41
            r2 = r42
            r6 = r8
            r7 = r15
            r8 = r0
            r37 = r10
            r10 = r5
            r5 = r37
            goto L_0x00da
        L_0x025f:
            com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException r0 = new com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = r15
            r1.append(r2)
            int r2 = r14.f36053a
            r1.append(r2)
            r1.append(r8)
            r1.append(r12)
            r1.append(r10)
            java.lang.String r17 = r1.toString()
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 126(0x7e, float:1.77E-43)
            r25 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.request(java.lang.String, vb.t3, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, xd.d):java.lang.Object");
    }
}
