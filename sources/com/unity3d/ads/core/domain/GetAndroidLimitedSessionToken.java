package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.MediationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidLimitedSessionToken.kt */
public final class GetAndroidLimitedSessionToken implements GetLimitedSessionToken {
    private final DeviceInfoRepository deviceInfoRepository;
    private final MediationRepository mediationRepository;
    private final SessionRepository sessionRepository;

    public GetAndroidLimitedSessionToken(DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, MediationRepository mediationRepository2) {
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(mediationRepository2, "mediationRepository");
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.mediationRepository = mediationRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00d0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x011a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x011b  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super vb.s3> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken$invoke$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L_0x0088
            if (r2 == r6) goto L_0x0074
            if (r2 == r5) goto L_0x0060
            if (r2 == r4) goto L_0x004b
            if (r2 != r3) goto L_0x0043
            java.lang.Object r1 = r0.L$3
            vb.r1 r1 = (vb.r1) r1
            java.lang.Object r2 = r0.L$2
            vb.r1 r2 = (vb.r1) r2
            java.lang.Object r3 = r0.L$1
            vb.r1 r3 = (vb.r1) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken r0 = (com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken) r0
            sd.p.b(r11)
            goto L_0x011f
        L_0x0043:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x004b:
            java.lang.Object r2 = r0.L$3
            vb.r1 r2 = (vb.r1) r2
            java.lang.Object r4 = r0.L$2
            vb.r1 r4 = (vb.r1) r4
            java.lang.Object r5 = r0.L$1
            vb.r1 r5 = (vb.r1) r5
            java.lang.Object r6 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken r6 = (com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken) r6
            sd.p.b(r11)
            goto L_0x00fa
        L_0x0060:
            java.lang.Object r2 = r0.L$3
            vb.r1 r2 = (vb.r1) r2
            java.lang.Object r5 = r0.L$2
            vb.r1 r5 = (vb.r1) r5
            java.lang.Object r6 = r0.L$1
            vb.r1 r6 = (vb.r1) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken r7 = (com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken) r7
            sd.p.b(r11)
            goto L_0x00d5
        L_0x0074:
            java.lang.Object r2 = r0.L$3
            vb.r1 r2 = (vb.r1) r2
            java.lang.Object r6 = r0.L$2
            vb.r1 r6 = (vb.r1) r6
            java.lang.Object r7 = r0.L$1
            vb.r1 r7 = (vb.r1) r7
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken r8 = (com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken) r8
            sd.p.b(r11)
            goto L_0x00b0
        L_0x0088:
            sd.p.b(r11)
            vb.r1$a r11 = vb.r1.f39074b
            vb.s3$a r2 = vb.s3.r0()
            java.lang.String r7 = "newBuilder()"
            kotlin.jvm.internal.m.d(r2, r7)
            vb.r1 r2 = r11.a(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r10.deviceInfoRepository
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r6
            java.lang.Object r11 = r11.staticDeviceInfo(r0)
            if (r11 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            r8 = r10
            r6 = r2
            r7 = r6
        L_0x00b0:
            vb.b3 r11 = (vb.b3) r11
            java.lang.String r11 = r11.E0()
            java.lang.String r9 = "deviceInfoRepository.staticDeviceInfo().deviceMake"
            kotlin.jvm.internal.m.d(r11, r9)
            r2.d(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r5
            java.lang.Object r11 = r11.staticDeviceInfo(r0)
            if (r11 != r1) goto L_0x00d1
            return r1
        L_0x00d1:
            r2 = r6
            r5 = r2
            r6 = r7
            r7 = r8
        L_0x00d5:
            vb.b3 r11 = (vb.b3) r11
            java.lang.String r11 = r11.F0()
            java.lang.String r8 = "deviceInfoRepository.sta…cDeviceInfo().deviceModel"
            kotlin.jvm.internal.m.d(r11, r8)
            r2.e(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r7.deviceInfoRepository
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r5
            r0.L$3 = r5
            r0.label = r4
            java.lang.Object r11 = r11.staticDeviceInfo(r0)
            if (r11 != r1) goto L_0x00f6
            return r1
        L_0x00f6:
            r2 = r5
            r4 = r2
            r5 = r6
            r6 = r7
        L_0x00fa:
            vb.b3 r11 = (vb.b3) r11
            java.lang.String r11 = r11.H0()
            java.lang.String r7 = "deviceInfoRepository.staticDeviceInfo().osVersion"
            kotlin.jvm.internal.m.d(r11, r7)
            r2.j(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r6.deviceInfoRepository
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r4
            r0.label = r3
            java.lang.Object r11 = r11.getIdfi(r0)
            if (r11 != r1) goto L_0x011b
            return r1
        L_0x011b:
            r1 = r4
            r2 = r1
            r3 = r5
            r0 = r6
        L_0x011f:
            java.lang.String r11 = (java.lang.String) r11
            r1.g(r11)
            r11 = 41200(0xa0f0, float:5.7733E-41)
            r2.l(r11)
            java.lang.String r11 = "4.12.0"
            r2.m(r11)
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r0.sessionRepository
            java.lang.String r11 = r11.getGameId()
            r2.f(r11)
            vb.g0 r11 = vb.g0.PLATFORM_ANDROID
            r2.k(r11)
            com.unity3d.ads.core.data.repository.MediationRepository r11 = r0.mediationRepository
            fe.a r11 = r11.getMediationProvider()
            java.lang.Object r11 = r11.invoke()
            vb.f0 r11 = (vb.f0) r11
            r2.h(r11)
            com.unity3d.ads.core.data.repository.MediationRepository r11 = r0.mediationRepository
            java.lang.String r11 = r11.getName()
            if (r11 == 0) goto L_0x015f
            vb.f0 r1 = r2.b()
            vb.f0 r4 = vb.f0.MEDIATION_PROVIDER_CUSTOM
            if (r1 != r4) goto L_0x015f
            r2.c(r11)
        L_0x015f:
            com.unity3d.ads.core.data.repository.MediationRepository r11 = r0.mediationRepository
            java.lang.String r11 = r11.getVersion()
            if (r11 == 0) goto L_0x016a
            r2.i(r11)
        L_0x016a:
            vb.s3 r11 = r3.a()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken.invoke(xd.d):java.lang.Object");
    }
}
