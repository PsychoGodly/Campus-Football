package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;

/* compiled from: TriggerAndroidInitializationCompletedRequest.kt */
public final class TriggerAndroidInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public TriggerAndroidInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest2, GetRequestPolicy getRequestPolicy2, GatewayClient gatewayClient2, SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(getInitializationCompletedRequest2, "getInitializationCompletedRequest");
        m.e(getRequestPolicy2, "getRequestPolicy");
        m.e(gatewayClient2, "gatewayClient");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest2;
        this.getRequestPolicy = getRequestPolicy2;
        this.gatewayClient = gatewayClient2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00bf A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00cc A[Catch:{ Exception -> 0x0112 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0031  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super sd.w> r27) {
        /*
            r26 = this;
            r1 = r26
            r0 = r27
            boolean r2 = r0 instanceof com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest$invoke$1 r2 = (com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest$invoke$1 r2 = new com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            r8 = r2
            java.lang.Object r0 = r8.result
            java.lang.Object r2 = yd.d.c()
            int r3 = r8.label
            java.lang.String r11 = "reason_debug"
            java.lang.String r12 = "reason"
            java.lang.String r13 = "operation"
            r14 = 0
            r15 = 3
            r10 = 2
            r9 = 1
            if (r3 == 0) goto L_0x0062
            if (r3 == r9) goto L_0x004e
            if (r3 != r10) goto L_0x0046
            long r2 = r8.J$0
            java.lang.Object r4 = r8.L$0
            com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest r4 = (com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest) r4
            sd.p.b(r0)     // Catch:{ Exception -> 0x0044 }
            r16 = 1
            r17 = 2
            goto L_0x00c4
        L_0x0044:
            r0 = move-exception
            goto L_0x005c
        L_0x0046:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x004e:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest r5 = (com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest) r5
            sd.p.b(r0)     // Catch:{ Exception -> 0x0059 }
        L_0x0057:
            r6 = r3
            goto L_0x0091
        L_0x0059:
            r0 = move-exception
            r2 = r3
            r4 = r5
        L_0x005c:
            r16 = 1
            r17 = 2
            goto L_0x012b
        L_0x0062:
            sd.p.b(r0)
            oe.j r0 = oe.j.f36786a
            long r3 = r0.a()
            com.unity3d.ads.core.domain.SendDiagnosticEvent r0 = r1.sendDiagnosticEvent
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 30
            r23 = 0
            java.lang.String r17 = "native_initialization_completed_started"
            r16 = r0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r16, r17, r18, r19, r20, r21, r22, r23)
            com.unity3d.ads.core.domain.GetInitializationCompletedRequest r0 = r1.getInitializationCompletedRequest     // Catch:{ Exception -> 0x0124 }
            r8.L$0 = r1     // Catch:{ Exception -> 0x0124 }
            r8.J$0 = r3     // Catch:{ Exception -> 0x0124 }
            r8.label = r9     // Catch:{ Exception -> 0x0124 }
            java.lang.Object r0 = r0.invoke(r8)     // Catch:{ Exception -> 0x0124 }
            if (r0 != r2) goto L_0x008f
            return r2
        L_0x008f:
            r5 = r1
            goto L_0x0057
        L_0x0091:
            vb.t3 r0 = (vb.t3) r0     // Catch:{ Exception -> 0x0116 }
            com.unity3d.ads.core.domain.GetRequestPolicy r3 = r5.getRequestPolicy     // Catch:{ Exception -> 0x0116 }
            com.unity3d.ads.gatewayclient.RequestPolicy r16 = r3.invoke()     // Catch:{ Exception -> 0x0116 }
            com.unity3d.ads.gatewayclient.GatewayClient r3 = r5.gatewayClient     // Catch:{ Exception -> 0x0116 }
            r4 = 0
            com.unity3d.ads.core.data.model.OperationType r17 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED     // Catch:{ Exception -> 0x0116 }
            r18 = 1
            r19 = 0
            r8.L$0 = r5     // Catch:{ Exception -> 0x0116 }
            r8.J$0 = r6     // Catch:{ Exception -> 0x0116 }
            r8.label = r10     // Catch:{ Exception -> 0x0116 }
            r20 = r5
            r5 = r0
            r21 = r6
            r6 = r16
            r7 = r17
            r16 = 1
            r9 = r18
            r17 = 2
            r10 = r19
            java.lang.Object r0 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0114 }
            if (r0 != r2) goto L_0x00c0
            return r2
        L_0x00c0:
            r4 = r20
            r2 = r21
        L_0x00c4:
            vb.w3 r0 = (vb.w3) r0     // Catch:{ Exception -> 0x0112 }
            boolean r5 = r0.j0()     // Catch:{ Exception -> 0x0112 }
            if (r5 == 0) goto L_0x0170
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r4.sendDiagnosticEvent     // Catch:{ Exception -> 0x0112 }
            java.lang.String r19 = "native_initialize_completed_task_failure_time"
            oe.j$a r6 = oe.j.a.c(r2)     // Catch:{ Exception -> 0x0112 }
            double r6 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r6)     // Catch:{ Exception -> 0x0112 }
            java.lang.Double r20 = kotlin.coroutines.jvm.internal.b.b(r6)     // Catch:{ Exception -> 0x0112 }
            sd.n[] r6 = new sd.n[r15]     // Catch:{ Exception -> 0x0112 }
            com.unity3d.ads.core.data.model.OperationType r7 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED     // Catch:{ Exception -> 0x0112 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x0112 }
            sd.n r7 = sd.s.a(r13, r7)     // Catch:{ Exception -> 0x0112 }
            r6[r14] = r7     // Catch:{ Exception -> 0x0112 }
            java.lang.String r7 = "gateway"
            sd.n r7 = sd.s.a(r12, r7)     // Catch:{ Exception -> 0x0112 }
            r6[r16] = r7     // Catch:{ Exception -> 0x0112 }
            vb.d1 r0 = r0.g0()     // Catch:{ Exception -> 0x0112 }
            java.lang.String r0 = r0.h0()     // Catch:{ Exception -> 0x0112 }
            sd.n r0 = sd.s.a(r11, r0)     // Catch:{ Exception -> 0x0112 }
            r6[r17] = r0     // Catch:{ Exception -> 0x0112 }
            java.util.Map r21 = td.k0.j(r6)     // Catch:{ Exception -> 0x0112 }
            r22 = 0
            r23 = 0
            r24 = 24
            r25 = 0
            r18 = r5
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r18, r19, r20, r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x0112 }
            goto L_0x0170
        L_0x0112:
            r0 = move-exception
            goto L_0x012b
        L_0x0114:
            r0 = move-exception
            goto L_0x011f
        L_0x0116:
            r0 = move-exception
            r20 = r5
            r21 = r6
            r16 = 1
            r17 = 2
        L_0x011f:
            r4 = r20
            r2 = r21
            goto L_0x012b
        L_0x0124:
            r0 = move-exception
            r16 = 1
            r17 = 2
            r2 = r3
            r4 = r1
        L_0x012b:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r4.sendDiagnosticEvent
            oe.j$a r6 = oe.j.a.c(r2)
            double r6 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r6)
            java.lang.Double r20 = kotlin.coroutines.jvm.internal.b.b(r6)
            sd.n[] r6 = new sd.n[r15]
            com.unity3d.ads.core.data.model.OperationType r7 = com.unity3d.ads.core.data.model.OperationType.INITIALIZATION_COMPLETED
            java.lang.String r7 = r7.toString()
            sd.n r7 = sd.s.a(r13, r7)
            r6[r14] = r7
            java.lang.String r7 = "uncaught_exception"
            sd.n r7 = sd.s.a(r12, r7)
            r6[r16] = r7
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L_0x0157
            java.lang.String r0 = "unknown"
        L_0x0157:
            sd.n r0 = sd.s.a(r11, r0)
            r6[r17] = r0
            java.util.Map r21 = td.k0.j(r6)
            r22 = 0
            r23 = 0
            r24 = 24
            r25 = 0
            java.lang.String r19 = "native_initialize_completed_task_failure_time"
            r18 = r5
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r18, r19, r20, r21, r22, r23, r24, r25)
        L_0x0170:
            com.unity3d.ads.core.domain.SendDiagnosticEvent r5 = r4.sendDiagnosticEvent
            oe.j$a r0 = oe.j.a.c(r2)
            double r2 = com.unity3d.ads.core.extensions.TimeExtensionsKt.elapsedMillis(r0)
            java.lang.Double r7 = kotlin.coroutines.jvm.internal.b.b(r2)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 28
            r12 = 0
            java.lang.String r6 = "native_initialize_completed_task_success_time"
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r5, r6, r7, r8, r9, r10, r11, r12)
            sd.w r0 = sd.w.f38141a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest.invoke(xd.d):java.lang.Object");
    }
}
