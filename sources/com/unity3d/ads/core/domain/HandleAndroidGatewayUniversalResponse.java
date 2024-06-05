package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: HandleAndroidGatewayUniversalResponse.kt */
public final class HandleAndroidGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public HandleAndroidGatewayUniversalResponse(SessionRepository sessionRepository2, DeviceInfoRepository deviceInfoRepository2) {
        m.e(sessionRepository2, "sessionRepository");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        this.sessionRepository = sessionRepository2;
        this.deviceInfoRepository = deviceInfoRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(vb.w3 r9, xd.d<? super sd.w> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse$invoke$1 r0 = (com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse$invoke$1 r0 = new com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse$invoke$1
            r0.<init>(r8, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0051
            if (r2 == r5) goto L_0x0045
            if (r2 == r4) goto L_0x0038
            if (r2 != r3) goto L_0x0030
            sd.p.b(r10)
            goto L_0x0112
        L_0x0030:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0038:
            java.lang.Object r9 = r0.L$1
            vb.t1 r9 = (vb.t1) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse r2 = (com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse) r2
            sd.p.b(r10)
            goto L_0x00f3
        L_0x0045:
            java.lang.Object r9 = r0.L$1
            vb.t1 r9 = (vb.t1) r9
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse r2 = (com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse) r2
            sd.p.b(r10)
            goto L_0x00c1
        L_0x0051:
            sd.p.b(r10)
            boolean r10 = r9.j0()
            if (r10 != 0) goto L_0x0118
            boolean r10 = r9.k0()
            if (r10 == 0) goto L_0x0115
            vb.t1 r9 = r9.h0()
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r10 = r8.deviceInfoRepository
            se.v r10 = r10.getAllowedPii()
        L_0x006a:
            java.lang.Object r2 = r10.getValue()
            r6 = r2
            vb.v r6 = (vb.v) r6
            vb.v r6 = r9.f0()
            java.lang.String r7 = "mutableData.allowedPii"
            kotlin.jvm.internal.m.d(r6, r7)
            boolean r2 = r10.a(r2, r6)
            if (r2 == 0) goto L_0x006a
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r8.sessionRepository
            com.google.protobuf.i r2 = r9.h0()
            java.lang.String r6 = "mutableData.currentState"
            kotlin.jvm.internal.m.d(r2, r6)
            r10.setGatewayState(r2)
            boolean r10 = r9.r0()
            if (r10 == 0) goto L_0x00a2
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r8.sessionRepository
            com.google.protobuf.i r2 = r9.m0()
            java.lang.String r6 = "mutableData.sessionToken"
            kotlin.jvm.internal.m.d(r2, r6)
            r10.setSessionToken(r2)
        L_0x00a2:
            boolean r10 = r9.o0()
            if (r10 == 0) goto L_0x00c0
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r8.sessionRepository
            com.google.protobuf.i r2 = r9.j0()
            java.lang.String r6 = "mutableData.privacy"
            kotlin.jvm.internal.m.d(r2, r6)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.setPrivacy(r2, r0)
            if (r10 != r1) goto L_0x00c0
            return r1
        L_0x00c0:
            r2 = r8
        L_0x00c1:
            boolean r10 = r9.q0()
            if (r10 == 0) goto L_0x00d5
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r2.sessionRepository
            vb.x2 r5 = r9.l0()
            java.lang.String r6 = "mutableData.sessionCounters"
            kotlin.jvm.internal.m.d(r5, r6)
            r10.setSessionCounters(r5)
        L_0x00d5:
            boolean r10 = r9.n0()
            if (r10 == 0) goto L_0x00f3
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r2.sessionRepository
            com.google.protobuf.i r5 = r9.g0()
            java.lang.String r6 = "mutableData.cache"
            kotlin.jvm.internal.m.d(r5, r6)
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.setGatewayCache(r5, r0)
            if (r10 != r1) goto L_0x00f3
            return r1
        L_0x00f3:
            boolean r10 = r9.p0()
            if (r10 == 0) goto L_0x0115
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r2.sessionRepository
            com.google.protobuf.i r9 = r9.k0()
            java.lang.String r2 = "mutableData.privacyFsm"
            kotlin.jvm.internal.m.d(r9, r2)
            r2 = 0
            r0.L$0 = r2
            r0.L$1 = r2
            r0.label = r3
            java.lang.Object r9 = r10.setPrivacyFsm(r9, r0)
            if (r9 != r1) goto L_0x0112
            return r1
        L_0x0112:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x0115:
            sd.w r9 = sd.w.f38141a
            return r9
        L_0x0118:
            com.unity3d.ads.core.data.repository.SessionRepository r10 = r8.sessionRepository
            r0 = 0
            r10.setShouldInitialize(r0)
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            vb.d1 r9 = r9.g0()
            java.lang.String r9 = r9.h0()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleAndroidGatewayUniversalResponse.invoke(vb.w3, xd.d):java.lang.Object");
    }
}
