package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;

/* compiled from: SendPrivacyUpdateRequest.kt */
public final class SendPrivacyUpdateRequest {
    private final GatewayClient gatewayClient;
    private final GetPrivacyUpdateRequest getPrivacyUpdateRequest;
    private final GetRequestPolicy getRequestPolicy;

    public SendPrivacyUpdateRequest(GetPrivacyUpdateRequest getPrivacyUpdateRequest2, GetRequestPolicy getRequestPolicy2, GatewayClient gatewayClient2) {
        m.e(getPrivacyUpdateRequest2, "getPrivacyUpdateRequest");
        m.e(getRequestPolicy2, "getRequestPolicy");
        m.e(gatewayClient2, "gatewayClient");
        this.getPrivacyUpdateRequest = getPrivacyUpdateRequest2;
        this.getRequestPolicy = getRequestPolicy2;
        this.gatewayClient = gatewayClient2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(int r10, com.google.protobuf.i r11, xd.d<? super vb.r2> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r12
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.SendPrivacyUpdateRequest$invoke$1
            r0.<init>(r9, r12)
        L_0x0018:
            r6 = r0
            java.lang.Object r12 = r6.result
            java.lang.Object r0 = yd.d.c()
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r3) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            sd.p.b(r12)
            goto L_0x006b
        L_0x002d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0035:
            java.lang.Object r10 = r6.L$0
            com.unity3d.ads.core.domain.SendPrivacyUpdateRequest r10 = (com.unity3d.ads.core.domain.SendPrivacyUpdateRequest) r10
            sd.p.b(r12)
            goto L_0x004e
        L_0x003d:
            sd.p.b(r12)
            com.unity3d.ads.core.domain.GetPrivacyUpdateRequest r12 = r9.getPrivacyUpdateRequest
            r6.L$0 = r9
            r6.label = r3
            java.lang.Object r12 = r12.invoke(r10, r11, r6)
            if (r12 != r0) goto L_0x004d
            return r0
        L_0x004d:
            r10 = r9
        L_0x004e:
            r3 = r12
            vb.t3 r3 = (vb.t3) r3
            com.unity3d.ads.core.domain.GetRequestPolicy r11 = r10.getRequestPolicy
            com.unity3d.ads.gatewayclient.RequestPolicy r4 = r11.invoke()
            com.unity3d.ads.gatewayclient.GatewayClient r1 = r10.gatewayClient
            r10 = 0
            com.unity3d.ads.core.data.model.OperationType r5 = com.unity3d.ads.core.data.model.OperationType.PRIVACY_UPDATE
            r7 = 1
            r8 = 0
            r11 = 0
            r6.L$0 = r11
            r6.label = r2
            r2 = r10
            java.lang.Object r12 = com.unity3d.ads.gatewayclient.GatewayClient.DefaultImpls.request$default(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L_0x006b
            return r0
        L_0x006b:
            vb.w3 r12 = (vb.w3) r12
            vb.w3$b r10 = r12.i0()
            vb.r2 r10 = r10.k0()
            java.lang.String r11 = "response.payload.privacyUpdateResponse"
            kotlin.jvm.internal.m.d(r10, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.SendPrivacyUpdateRequest.invoke(int, com.google.protobuf.i, xd.d):java.lang.Object");
    }
}
