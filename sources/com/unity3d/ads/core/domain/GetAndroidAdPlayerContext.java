package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidAdPlayerContext.kt */
public final class GetAndroidAdPlayerContext {
    public static final Companion Companion = new Companion((h) null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* compiled from: GetAndroidAdPlayerContext.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public GetAndroidAdPlayerContext(DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2) {
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(xd.d<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.core.domain.GetAndroidAdPlayerContext$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.unity3d.ads.core.domain.GetAndroidAdPlayerContext$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidAdPlayerContext$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidAdPlayerContext$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidAdPlayerContext$invoke$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidAdPlayerContext r0 = (com.unity3d.ads.core.domain.GetAndroidAdPlayerContext) r0
            sd.p.b(r8)
            goto L_0x0046
        L_0x002d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0035:
            sd.p.b(r8)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r8 = r7.deviceInfoRepository
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.staticDeviceInfo(r0)
            if (r8 != r1) goto L_0x0045
            return r1
        L_0x0045:
            r0 = r7
        L_0x0046:
            vb.b3 r8 = (vb.b3) r8
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r1 = r0.deviceInfoRepository
            vb.a1 r1 = r1.getDynamicDeviceInfo()
            r2 = 11
            sd.n[] r2 = new sd.n[r2]
            r4 = 0
            java.lang.String r5 = r8.C0()
            java.lang.String r6 = "bundleId"
            sd.n r5 = sd.s.a(r6, r5)
            r2[r4] = r5
            java.lang.String r4 = r8.D0()
            java.lang.String r5 = "bundleVersion"
            sd.n r4 = sd.s.a(r5, r4)
            r2[r3] = r4
            r3 = 2
            java.lang.String r4 = "webviewHash"
            java.lang.String r5 = "unknown"
            sd.n r4 = sd.s.a(r4, r5)
            r2[r3] = r4
            r3 = 3
            int r4 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r4)
            java.lang.String r5 = "sdkVersion"
            sd.n r4 = sd.s.a(r5, r4)
            r2[r3] = r4
            r3 = 4
            java.lang.String r4 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            java.lang.String r5 = "sdkVersionName"
            sd.n r4 = sd.s.a(r5, r4)
            r2[r3] = r4
            r3 = 5
            java.lang.String r4 = r8.H0()
            java.lang.String r5 = "osVersion"
            sd.n r4 = sd.s.a(r5, r4)
            r2[r3] = r4
            r3 = 6
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "systemLanguage"
            sd.n r4 = sd.s.a(r5, r4)
            r2[r3] = r4
            r3 = 7
            java.lang.String r8 = r8.F0()
            java.lang.String r4 = "deviceModel"
            sd.n r8 = sd.s.a(r4, r8)
            r2[r3] = r8
            r8 = 8
            boolean r3 = r1.w0()
            java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.b.a(r3)
            java.lang.String r4 = "limitAdTracking"
            sd.n r3 = sd.s.a(r4, r3)
            r2[r8] = r3
            r8 = 9
            vb.a1$a r1 = r1.u0()
            double r3 = r1.q0()
            java.lang.Double r1 = kotlin.coroutines.jvm.internal.b.b(r3)
            java.lang.String r3 = "maxVolume"
            sd.n r1 = sd.s.a(r3, r1)
            r2[r8] = r1
            r8 = 10
            com.unity3d.ads.core.data.repository.SessionRepository r0 = r0.sessionRepository
            java.lang.String r0 = r0.getGameId()
            java.lang.String r1 = "gameId"
            sd.n r0 = sd.s.a(r1, r0)
            r2[r8] = r0
            java.util.Map r8 = td.k0.j(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidAdPlayerContext.invoke(xd.d):java.lang.Object");
    }
}
