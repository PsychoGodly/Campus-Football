package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidInitializationRequest.kt */
public final class GetAndroidInitializationRequest implements GetInitializationRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final SessionRepository sessionRepository;

    public GetAndroidInitializationRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, GetClientInfo getClientInfo2, SessionRepository sessionRepository2, DeviceInfoRepository deviceInfoRepository2, LegacyUserConsentRepository legacyUserConsentRepository2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(getClientInfo2, "getClientInfo");
        m.e(sessionRepository2, "sessionRepository");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(legacyUserConsentRepository2, "legacyUserConsentRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.getClientInfo = getClientInfo2;
        this.sessionRepository = sessionRepository2;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.legacyUserConsentRepository = legacyUserConsentRepository2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e7, code lost:
        r2.h((java.lang.String) r11);
        r11 = r9.deviceInfoRepository.getAnalyticsUserId();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00f2, code lost:
        if (r11 == null) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00f4, code lost:
        r7.b(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00f7, code lost:
        r7.l(r9.sessionRepository.getSessionId());
        r11 = vb.j1.f38983b;
        r2 = vb.m1.j0();
        kotlin.jvm.internal.m.d(r2, "newBuilder()");
        r11 = r11.a(r2);
        r11.b(r9.deviceInfoRepository.getAppName());
        r11.d(r9.deviceInfoRepository.getModel());
        r11.c(r9.deviceInfoRepository.getManufacturer());
        r11.e(r9.deviceInfoRepository.getOsVersion());
        r7.g(r11.a());
        r11 = r9.deviceInfoRepository;
        r0.L$0 = r9;
        r0.L$1 = r8;
        r0.L$2 = r7;
        r0.L$3 = null;
        r0.label = 2;
        r11 = r11.getAuidByteString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0149, code lost:
        if (r11 != r1) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x014b, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x014c, code lost:
        r2 = r7;
        r7 = r8;
        r8 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x014f, code lost:
        r11 = (com.google.protobuf.i) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0151, code lost:
        if (r11 == null) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0153, code lost:
        r2.c(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0156, code lost:
        r11 = r8.deviceInfoRepository;
        r0.L$0 = r8;
        r0.L$1 = r7;
        r0.L$2 = r2;
        r0.label = 3;
        r11 = r11.getAuidString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0165, code lost:
        if (r11 != r1) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0167, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0168, code lost:
        r11 = (java.lang.String) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x016a, code lost:
        if (r11 == null) goto L_0x0172;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0170, code lost:
        if (r11.length() != 0) goto L_0x0173;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0172, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0173, code lost:
        if (r3 != false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0175, code lost:
        r2.d(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0178, code lost:
        r11 = r8.sessionRepository;
        r0.L$0 = r8;
        r0.L$1 = r7;
        r0.L$2 = r2;
        r0.label = 4;
        r11 = r11.getPrivacy(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0187, code lost:
        if (r11 != r1) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0189, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x018a, code lost:
        r3 = r7;
        r5 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x018c, code lost:
        r11 = (com.google.protobuf.i) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0192, code lost:
        if (r11.isEmpty() != false) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0194, code lost:
        r2.k(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0197, code lost:
        r11 = r5.sessionRepository;
        r0.L$0 = r5;
        r0.L$1 = r3;
        r0.L$2 = r2;
        r0.label = 5;
        r11 = r11.getGatewayCache(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x01a6, code lost:
        if (r11 != r1) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x01a8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01a9, code lost:
        r11 = (com.google.protobuf.i) r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01af, code lost:
        if (r11.isEmpty() != false) goto L_0x01b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01b1, code lost:
        r2.e(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01b4, code lost:
        r11 = r5.legacyUserConsentRepository.getLegacyFlowUserConsent();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01ba, code lost:
        if (r11 == null) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01bc, code lost:
        r2.j(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bf, code lost:
        r11 = r3.a();
        r2 = vb.o3.f39052a;
        r2 = vb.p3.f39058b;
        r3 = vb.t3.b.q0();
        kotlin.jvm.internal.m.d(r3, "newBuilder()");
        r2 = r2.a(r3);
        r2.h(r11);
        r11 = r2.a();
        r2 = r5.getUniversalRequestForPayLoad;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 6;
        r11 = r2.invoke(r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01e8, code lost:
        if (r11 != r1) goto L_0x01eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ea, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01eb, code lost:
        return r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super vb.t3> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.GetAndroidInitializationRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidInitializationRequest$invoke$1
            r0.<init>(r10, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 0
            java.lang.String r4 = "newBuilder()"
            r5 = 1
            r6 = 0
            switch(r2) {
                case 0: goto L_0x008d;
                case 1: goto L_0x0079;
                case 2: goto L_0x0068;
                case 3: goto L_0x0057;
                case 4: goto L_0x0046;
                case 5: goto L_0x0035;
                case 6: goto L_0x0030;
                default: goto L_0x0028;
            }
        L_0x0028:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0030:
            sd.p.b(r11)
            goto L_0x01eb
        L_0x0035:
            java.lang.Object r2 = r0.L$2
            vb.k1 r2 = (vb.k1) r2
            java.lang.Object r3 = r0.L$1
            vb.k1 r3 = (vb.k1) r3
            java.lang.Object r5 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest r5 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest) r5
            sd.p.b(r11)
            goto L_0x01a9
        L_0x0046:
            java.lang.Object r2 = r0.L$2
            vb.k1 r2 = (vb.k1) r2
            java.lang.Object r3 = r0.L$1
            vb.k1 r3 = (vb.k1) r3
            java.lang.Object r5 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest r5 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest) r5
            sd.p.b(r11)
            goto L_0x018c
        L_0x0057:
            java.lang.Object r2 = r0.L$2
            vb.k1 r2 = (vb.k1) r2
            java.lang.Object r7 = r0.L$1
            vb.k1 r7 = (vb.k1) r7
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest r8 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest) r8
            sd.p.b(r11)
            goto L_0x0168
        L_0x0068:
            java.lang.Object r2 = r0.L$2
            vb.k1 r2 = (vb.k1) r2
            java.lang.Object r7 = r0.L$1
            vb.k1 r7 = (vb.k1) r7
            java.lang.Object r8 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest r8 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest) r8
            sd.p.b(r11)
            goto L_0x014f
        L_0x0079:
            java.lang.Object r2 = r0.L$3
            vb.k1 r2 = (vb.k1) r2
            java.lang.Object r7 = r0.L$2
            vb.k1 r7 = (vb.k1) r7
            java.lang.Object r8 = r0.L$1
            vb.k1 r8 = (vb.k1) r8
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationRequest r9 = (com.unity3d.ads.core.domain.GetAndroidInitializationRequest) r9
            sd.p.b(r11)
            goto L_0x00e7
        L_0x008d:
            sd.p.b(r11)
            vb.k1$a r11 = vb.k1.f38994b
            vb.n1$a r2 = vb.n1.q0()
            kotlin.jvm.internal.m.d(r2, r4)
            vb.k1 r2 = r11.a(r2)
            com.unity3d.services.core.device.StorageManager$StorageType r11 = com.unity3d.services.core.device.StorageManager.StorageType.PRIVATE
            com.unity3d.services.core.device.Storage r11 = com.unity3d.services.core.device.StorageManager.getStorage(r11)
            boolean r7 = r11.readStorage()
            if (r7 == 0) goto L_0x00c3
            java.lang.String r7 = "configuration.hasInitialized"
            java.lang.Object r11 = r11.get(r7)
            boolean r7 = r11 instanceof java.lang.Boolean
            if (r7 == 0) goto L_0x00b6
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            goto L_0x00b7
        L_0x00b6:
            r11 = r6
        L_0x00b7:
            if (r11 == 0) goto L_0x00be
            boolean r11 = r11.booleanValue()
            goto L_0x00bf
        L_0x00be:
            r11 = 0
        L_0x00bf:
            if (r11 == 0) goto L_0x00c3
            r11 = 1
            goto L_0x00c4
        L_0x00c3:
            r11 = 0
        L_0x00c4:
            r11 = r11 ^ r5
            r2.i(r11)
            com.unity3d.ads.core.domain.GetClientInfo r11 = r10.getClientInfo
            vb.e0 r11 = r11.invoke()
            r2.f(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r10.deviceInfoRepository
            r0.L$0 = r10
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r5
            java.lang.Object r11 = r11.getIdfi(r0)
            if (r11 != r1) goto L_0x00e4
            return r1
        L_0x00e4:
            r9 = r10
            r7 = r2
            r8 = r7
        L_0x00e7:
            java.lang.String r11 = (java.lang.String) r11
            r2.h(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r9.deviceInfoRepository
            java.lang.String r11 = r11.getAnalyticsUserId()
            if (r11 == 0) goto L_0x00f7
            r7.b(r11)
        L_0x00f7:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r9.sessionRepository
            com.google.protobuf.i r11 = r11.getSessionId()
            r7.l(r11)
            vb.j1$a r11 = vb.j1.f38983b
            vb.m1$a r2 = vb.m1.j0()
            kotlin.jvm.internal.m.d(r2, r4)
            vb.j1 r11 = r11.a(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r9.deviceInfoRepository
            java.lang.String r2 = r2.getAppName()
            r11.b(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r9.deviceInfoRepository
            java.lang.String r2 = r2.getModel()
            r11.d(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r9.deviceInfoRepository
            java.lang.String r2 = r2.getManufacturer()
            r11.c(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r9.deviceInfoRepository
            java.lang.String r2 = r2.getOsVersion()
            r11.e(r2)
            vb.m1 r11 = r11.a()
            r7.g(r11)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r9.deviceInfoRepository
            r0.L$0 = r9
            r0.L$1 = r8
            r0.L$2 = r7
            r0.L$3 = r6
            r2 = 2
            r0.label = r2
            java.lang.Object r11 = r11.getAuidByteString(r0)
            if (r11 != r1) goto L_0x014c
            return r1
        L_0x014c:
            r2 = r7
            r7 = r8
            r8 = r9
        L_0x014f:
            com.google.protobuf.i r11 = (com.google.protobuf.i) r11
            if (r11 == 0) goto L_0x0156
            r2.c(r11)
        L_0x0156:
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r11 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r2
            r9 = 3
            r0.label = r9
            java.lang.Object r11 = r11.getAuidString(r0)
            if (r11 != r1) goto L_0x0168
            return r1
        L_0x0168:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0172
            int r9 = r11.length()
            if (r9 != 0) goto L_0x0173
        L_0x0172:
            r3 = 1
        L_0x0173:
            if (r3 != 0) goto L_0x0178
            r2.d(r11)
        L_0x0178:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r8.sessionRepository
            r0.L$0 = r8
            r0.L$1 = r7
            r0.L$2 = r2
            r3 = 4
            r0.label = r3
            java.lang.Object r11 = r11.getPrivacy(r0)
            if (r11 != r1) goto L_0x018a
            return r1
        L_0x018a:
            r3 = r7
            r5 = r8
        L_0x018c:
            com.google.protobuf.i r11 = (com.google.protobuf.i) r11
            boolean r7 = r11.isEmpty()
            if (r7 != 0) goto L_0x0197
            r2.k(r11)
        L_0x0197:
            com.unity3d.ads.core.data.repository.SessionRepository r11 = r5.sessionRepository
            r0.L$0 = r5
            r0.L$1 = r3
            r0.L$2 = r2
            r7 = 5
            r0.label = r7
            java.lang.Object r11 = r11.getGatewayCache(r0)
            if (r11 != r1) goto L_0x01a9
            return r1
        L_0x01a9:
            com.google.protobuf.i r11 = (com.google.protobuf.i) r11
            boolean r7 = r11.isEmpty()
            if (r7 != 0) goto L_0x01b4
            r2.e(r11)
        L_0x01b4:
            com.unity3d.ads.core.data.repository.LegacyUserConsentRepository r11 = r5.legacyUserConsentRepository
            java.lang.String r11 = r11.getLegacyFlowUserConsent()
            if (r11 == 0) goto L_0x01bf
            r2.j(r11)
        L_0x01bf:
            vb.n1 r11 = r3.a()
            vb.o3 r2 = vb.o3.f39052a
            vb.p3$a r2 = vb.p3.f39058b
            vb.t3$b$a r3 = vb.t3.b.q0()
            kotlin.jvm.internal.m.d(r3, r4)
            vb.p3 r2 = r2.a(r3)
            r2.h(r11)
            vb.t3$b r11 = r2.a()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r5.getUniversalRequestForPayLoad
            r0.L$0 = r6
            r0.L$1 = r6
            r0.L$2 = r6
            r3 = 6
            r0.label = r3
            java.lang.Object r11 = r2.invoke(r11, r0)
            if (r11 != r1) goto L_0x01eb
            return r1
        L_0x01eb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidInitializationRequest.invoke(xd.d):java.lang.Object");
    }
}
