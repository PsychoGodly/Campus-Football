package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;

/* compiled from: UniversalRequestEventSender.kt */
public final class UniversalRequestEventSender {
    private final GatewayClient gatewayClient;
    private final HandleGatewayEventResponse handleGatewayEventResponse;

    public UniversalRequestEventSender(GatewayClient gatewayClient2, HandleGatewayEventResponse handleGatewayEventResponse2) {
        m.e(gatewayClient2, "gatewayClient");
        m.e(handleGatewayEventResponse2, "handleGatewayEventResponse");
        this.gatewayClient = gatewayClient2;
        this.handleGatewayEventResponse = handleGatewayEventResponse2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(vb.t3 r12, com.unity3d.ads.gatewayclient.RequestPolicy r13, xd.d<? super sd.w> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r14
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1 r0 = new com.unity3d.ads.core.domain.events.UniversalRequestEventSender$invoke$1
            r0.<init>(r11, r14)
        L_0x0018:
            java.lang.Object r14 = r0.result
            java.lang.Object r9 = yd.d.c()
            int r1 = r0.label
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L_0x003c
            if (r1 == r2) goto L_0x0034
            if (r1 != r10) goto L_0x002c
            sd.p.b(r14)
            goto L_0x0066
        L_0x002c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0034:
            java.lang.Object r12 = r0.L$0
            com.unity3d.ads.core.domain.events.UniversalRequestEventSender r12 = (com.unity3d.ads.core.domain.events.UniversalRequestEventSender) r12
            sd.p.b(r14)
            goto L_0x0056
        L_0x003c:
            sd.p.b(r14)
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r11.gatewayClient
            r14 = 0
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.UNIVERSAL_EVENT
            r7 = 1
            r8 = 0
            r0.L$0 = r11
            r0.label = r2
            r2 = r14
            r3 = r12
            r4 = r13
            r6 = r0
            java.lang.Object r14 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r9) goto L_0x0055
            return r9
        L_0x0055:
            r12 = r11
        L_0x0056:
            vb.w3 r14 = (vb.w3) r14
            com.unity3d.ads.core.domain.events.HandleGatewayEventResponse r12 = r12.handleGatewayEventResponse
            r13 = 0
            r0.L$0 = r13
            r0.label = r10
            java.lang.Object r12 = r12.invoke(r14, r0)
            if (r12 != r9) goto L_0x0066
            return r9
        L_0x0066:
            sd.w r12 = sd.w.f38141a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.UniversalRequestEventSender.invoke(vb.t3, com.unity3d.ads.gatewayclient.RequestPolicy, xd.d):java.lang.Object");
    }
}
