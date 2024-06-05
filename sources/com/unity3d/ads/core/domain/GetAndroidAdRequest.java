package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidAdRequest.kt */
public final class GetAndroidAdRequest implements GetAdRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final SessionRepository sessionRepository;
    private final WebviewConfigurationDataSource webViewConfigurationDataSource;

    public GetAndroidAdRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, SessionRepository sessionRepository2, DeviceInfoRepository deviceInfoRepository2, CampaignRepository campaignRepository2, WebviewConfigurationDataSource webviewConfigurationDataSource) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(sessionRepository2, "sessionRepository");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(campaignRepository2, "campaignRepository");
        m.e(webviewConfigurationDataSource, "webViewConfigurationDataSource");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.sessionRepository = sessionRepository2;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.campaignRepository = campaignRepository2;
        this.webViewConfigurationDataSource = webviewConfigurationDataSource;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00e8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x013e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x013f A[PHI: r1 
      PHI: (r1v2 java.lang.Object) = (r1v10 java.lang.Object), (r1v1 java.lang.Object) binds: [B:29:0x013c, B:11:0x0032] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.String r18, com.google.protobuf.i r19, vb.p r20, xd.d<? super vb.t3> r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.GetAndroidAdRequest$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r1
            com.unity3d.ads.core.domain.GetAndroidAdRequest$invoke$1 r2 = (com.unity3d.ads.core.domain.GetAndroidAdRequest$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.GetAndroidAdRequest$invoke$1 r2 = new com.unity3d.ads.core.domain.GetAndroidAdRequest$invoke$1
            r2.<init>(r0, r1)
        L_0x001c:
            java.lang.Object r1 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            java.lang.String r5 = "newBuilder()"
            r6 = 3
            r7 = 2
            r8 = 1
            r9 = 0
            if (r4 == 0) goto L_0x007d
            if (r4 == r8) goto L_0x0058
            if (r4 == r7) goto L_0x003f
            if (r4 != r6) goto L_0x0037
            sd.p.b(r1)
            goto L_0x013f
        L_0x0037:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x003f:
            java.lang.Object r4 = r2.L$4
            vb.l r4 = (vb.l) r4
            java.lang.Object r7 = r2.L$3
            vb.l r7 = (vb.l) r7
            java.lang.Object r8 = r2.L$2
            vb.l r8 = (vb.l) r8
            java.lang.Object r10 = r2.L$1
            vb.p r10 = (vb.p) r10
            java.lang.Object r11 = r2.L$0
            com.unity3d.ads.core.domain.GetAndroidAdRequest r11 = (com.unity3d.ads.core.domain.GetAndroidAdRequest) r11
            sd.p.b(r1)
            goto L_0x00ee
        L_0x0058:
            java.lang.Object r4 = r2.L$6
            vb.l r4 = (vb.l) r4
            java.lang.Object r10 = r2.L$5
            vb.l r10 = (vb.l) r10
            java.lang.Object r11 = r2.L$4
            vb.l r11 = (vb.l) r11
            java.lang.Object r12 = r2.L$3
            vb.p r12 = (vb.p) r12
            java.lang.Object r13 = r2.L$2
            com.google.protobuf.i r13 = (com.google.protobuf.i) r13
            java.lang.Object r14 = r2.L$1
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r15 = r2.L$0
            com.unity3d.ads.core.domain.GetAndroidAdRequest r15 = (com.unity3d.ads.core.domain.GetAndroidAdRequest) r15
            sd.p.b(r1)
            r16 = r13
            r13 = r11
            r11 = r16
            goto L_0x00b9
        L_0x007d:
            sd.p.b(r1)
            vb.l$a r1 = vb.l.f39006b
            vb.n$a r4 = vb.n.p0()
            kotlin.jvm.internal.m.d(r4, r5)
            vb.l r4 = r1.a(r4)
            com.unity3d.ads.core.data.repository.SessionRepository r1 = r0.sessionRepository
            vb.x2 r1 = r1.getSessionCounters()
            r4.i(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r0.deviceInfoRepository
            r2.L$0 = r0
            r10 = r18
            r2.L$1 = r10
            r11 = r19
            r2.L$2 = r11
            r12 = r20
            r2.L$3 = r12
            r2.L$4 = r4
            r2.L$5 = r4
            r2.L$6 = r4
            r2.label = r8
            java.lang.Object r1 = r1.staticDeviceInfo(r2)
            if (r1 != r3) goto L_0x00b5
            return r3
        L_0x00b5:
            r15 = r0
            r13 = r4
            r14 = r10
            r10 = r13
        L_0x00b9:
            vb.b3 r1 = (vb.b3) r1
            r4.j(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r15.deviceInfoRepository
            vb.a1 r1 = r1.getDynamicDeviceInfo()
            r10.e(r1)
            r10.f(r11)
            r10.g(r14)
            r10.h(r8)
            com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource r1 = r15.webViewConfigurationDataSource
            r2.L$0 = r15
            r2.L$1 = r12
            r2.L$2 = r13
            r2.L$3 = r10
            r2.L$4 = r10
            r2.L$5 = r9
            r2.L$6 = r9
            r2.label = r7
            java.lang.Object r1 = r1.get(r2)
            if (r1 != r3) goto L_0x00e9
            return r3
        L_0x00e9:
            r4 = r10
            r7 = r4
            r10 = r12
            r8 = r13
            r11 = r15
        L_0x00ee:
            g r1 = (defpackage.g) r1
            int r1 = r1.n0()
            r4.k(r1)
            com.unity3d.ads.core.data.repository.CampaignRepository r1 = r11.campaignRepository
            vb.b0 r1 = r1.getCampaignState()
            r7.d(r1)
            if (r10 != 0) goto L_0x0108
            vb.o r1 = vb.o.AD_REQUEST_TYPE_FULLSCREEN
            r7.b(r1)
            goto L_0x0110
        L_0x0108:
            vb.o r1 = vb.o.AD_REQUEST_TYPE_BANNER
            r7.b(r1)
            r7.c(r10)
        L_0x0110:
            vb.n r1 = r8.a()
            vb.o3 r4 = vb.o3.f39052a
            vb.p3$a r4 = vb.p3.f39058b
            vb.t3$b$a r7 = vb.t3.b.q0()
            kotlin.jvm.internal.m.d(r7, r5)
            vb.p3 r4 = r4.a(r7)
            r4.e(r1)
            vb.t3$b r1 = r4.a()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r4 = r11.getUniversalRequestForPayLoad
            r2.L$0 = r9
            r2.L$1 = r9
            r2.L$2 = r9
            r2.L$3 = r9
            r2.L$4 = r9
            r2.label = r6
            java.lang.Object r1 = r4.invoke(r1, r2)
            if (r1 != r3) goto L_0x013f
            return r3
        L_0x013f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidAdRequest.invoke(java.lang.String, com.google.protobuf.i, vb.p, xd.d):java.lang.Object");
    }
}
