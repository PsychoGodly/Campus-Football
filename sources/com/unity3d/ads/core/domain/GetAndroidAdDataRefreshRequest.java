package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidAdDataRefreshRequest.kt */
public final class GetAndroidAdDataRefreshRequest implements GetAdDataRefreshRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;

    public GetAndroidAdDataRefreshRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, SessionRepository sessionRepository2, DeviceInfoRepository deviceInfoRepository2, CampaignRepository campaignRepository2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(sessionRepository2, "sessionRepository");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(campaignRepository2, "campaignRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.sessionRepository = sessionRepository2;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.campaignRepository = campaignRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00de A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00df A[PHI: r11 
      PHI: (r11v2 java.lang.Object) = (r11v7 java.lang.Object), (r11v1 java.lang.Object) binds: [B:22:0x00dc, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.google.protobuf.i r9, com.google.protobuf.i r10, xd.d<? super vb.t3> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest$invoke$1
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            sd.p.b(r11)
            goto L_0x00df
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0037:
            java.lang.Object r9 = r0.L$5
            vb.a r9 = (vb.a) r9
            java.lang.Object r10 = r0.L$4
            vb.a r10 = (vb.a) r10
            java.lang.Object r2 = r0.L$3
            vb.a r2 = (vb.a) r2
            java.lang.Object r5 = r0.L$2
            com.google.protobuf.i r5 = (com.google.protobuf.i) r5
            java.lang.Object r6 = r0.L$1
            com.google.protobuf.i r6 = (com.google.protobuf.i) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest r7 = (com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest) r7
            sd.p.b(r11)
            goto L_0x008a
        L_0x0053:
            sd.p.b(r11)
            vb.a$a r11 = vb.a.f38922b
            vb.c$a r2 = vb.c.l0()
            kotlin.jvm.internal.m.d(r2, r3)
            vb.a r11 = r11.a(r2)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r8.sessionRepository
            vb.x2 r2 = r2.getSessionCounters()
            r11.f(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r9
            r0.L$2 = r10
            r0.L$3 = r11
            r0.L$4 = r11
            r0.L$5 = r11
            r0.label = r5
            java.lang.Object r2 = r2.staticDeviceInfo(r0)
            if (r2 != r1) goto L_0x0083
            return r1
        L_0x0083:
            r7 = r8
            r6 = r9
            r5 = r10
            r9 = r11
            r10 = r9
            r11 = r2
            r2 = r10
        L_0x008a:
            vb.b3 r11 = (vb.b3) r11
            r9.g(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r7.deviceInfoRepository
            vb.a1 r9 = r9.getDynamicDeviceInfo()
            r10.d(r9)
            r10.e(r6)
            com.unity3d.ads.core.data.repository.CampaignRepository r9 = r7.campaignRepository
            vb.b0 r9 = r9.getCampaignState()
            r10.c(r9)
            boolean r9 = r5.isEmpty()
            if (r9 != 0) goto L_0x00ad
            r10.b(r5)
        L_0x00ad:
            vb.c r9 = r2.a()
            vb.o3 r10 = vb.o3.f39052a
            vb.p3$a r10 = vb.p3.f39058b
            vb.t3$b$a r11 = vb.t3.b.q0()
            kotlin.jvm.internal.m.d(r11, r3)
            vb.p3 r10 = r10.a(r11)
            r10.c(r9)
            vb.t3$b r9 = r10.a()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r10 = r7.getUniversalRequestForPayLoad
            r11 = 0
            r0.L$0 = r11
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.L$4 = r11
            r0.L$5 = r11
            r0.label = r4
            java.lang.Object r11 = r10.invoke(r9, r0)
            if (r11 != r1) goto L_0x00df
            return r1
        L_0x00df:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest.invoke(com.google.protobuf.i, com.google.protobuf.i, xd.d):java.lang.Object");
    }
}
