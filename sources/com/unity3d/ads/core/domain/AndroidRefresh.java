package com.unity3d.ads.core.domain;

import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;
import pe.k0;

/* compiled from: AndroidRefresh.kt */
public final class AndroidRefresh implements Refresh {
    private final k0 defaultDispatcher;
    /* access modifiers changed from: private */
    public final GatewayClient gatewayClient;
    /* access modifiers changed from: private */
    public final GetAdDataRefreshRequest getAdDataRefreshRequest;
    /* access modifiers changed from: private */
    public final GetRequestPolicy getRequestPolicy;

    public AndroidRefresh(k0 k0Var, GetAdDataRefreshRequest getAdDataRefreshRequest2, GetRequestPolicy getRequestPolicy2, GatewayClient gatewayClient2) {
        m.e(k0Var, "defaultDispatcher");
        m.e(getAdDataRefreshRequest2, "getAdDataRefreshRequest");
        m.e(getRequestPolicy2, "getRequestPolicy");
        m.e(gatewayClient2, "gatewayClient");
        this.defaultDispatcher = k0Var;
        this.getAdDataRefreshRequest = getAdDataRefreshRequest2;
        this.getRequestPolicy = getRequestPolicy2;
        this.gatewayClient = gatewayClient2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.google.protobuf.i r6, com.google.protobuf.i r7, xd.d<? super vb.e> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = (com.unity3d.ads.core.domain.AndroidRefresh$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$1 r0 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$1
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            sd.p.b(r8)
            goto L_0x0045
        L_0x0029:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0031:
            sd.p.b(r8)
            pe.k0 r8 = r5.defaultDispatcher
            com.unity3d.ads.core.domain.AndroidRefresh$invoke$2 r2 = new com.unity3d.ads.core.domain.AndroidRefresh$invoke$2
            r4 = 0
            r2.<init>(r5, r7, r6, r4)
            r0.label = r3
            java.lang.Object r8 = pe.i.g(r8, r2, r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            java.lang.String r6 = "override suspend fun inv…RefreshResponse\n        }"
            kotlin.jvm.internal.m.d(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidRefresh.invoke(com.google.protobuf.i, com.google.protobuf.i, xd.d):java.lang.Object");
    }
}
