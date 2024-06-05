package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeveloperConsentRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidUniversalRequestSharedData.kt */
public final class GetAndroidUniversalRequestSharedData implements GetUniversalRequestSharedData {
    private final DeveloperConsentRepository developerConsentRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetLimitedSessionToken getLimitedSessionToken;
    private final GetSharedDataTimestamps getSharedDataTimestamps;
    private final SessionRepository sessionRepository;

    public GetAndroidUniversalRequestSharedData(GetSharedDataTimestamps getSharedDataTimestamps2, SessionRepository sessionRepository2, DeviceInfoRepository deviceInfoRepository2, GetLimitedSessionToken getLimitedSessionToken2, DeveloperConsentRepository developerConsentRepository2) {
        m.e(getSharedDataTimestamps2, "getSharedDataTimestamps");
        m.e(sessionRepository2, "sessionRepository");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(getLimitedSessionToken2, "getLimitedSessionToken");
        m.e(developerConsentRepository2, "developerConsentRepository");
        this.getSharedDataTimestamps = getSharedDataTimestamps2;
        this.sessionRepository = sessionRepository2;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.getLimitedSessionToken = getLimitedSessionToken2;
        this.developerConsentRepository = developerConsentRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super vb.t3.c> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r6
            com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData$invoke$1
            r0.<init>(r5, r6)
        L_0x0018:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r1 = r0.L$3
            vb.q3 r1 = (vb.q3) r1
            java.lang.Object r2 = r0.L$2
            vb.q3 r2 = (vb.q3) r2
            java.lang.Object r3 = r0.L$1
            vb.q3 r3 = (vb.q3) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData r0 = (com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData) r0
            sd.p.b(r6)
            goto L_0x007f
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0041:
            sd.p.b(r6)
            vb.o3 r6 = vb.o3.f39052a
            vb.q3$a r6 = vb.q3.f39064b
            vb.t3$c$a r2 = vb.t3.c.p0()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.m.d(r2, r4)
            vb.q3 r6 = r6.a(r2)
            com.unity3d.ads.core.data.repository.SessionRepository r2 = r5.sessionRepository
            com.google.protobuf.i r2 = r2.getSessionToken()
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto L_0x0067
            r6.g(r2)
            r0 = r5
            r3 = r6
            goto L_0x0085
        L_0x0067:
            com.unity3d.ads.core.domain.GetLimitedSessionToken r2 = r5.getLimitedSessionToken
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r6
            r0.L$3 = r6
            r0.label = r3
            java.lang.Object r0 = r2.invoke(r0)
            if (r0 != r1) goto L_0x007a
            return r1
        L_0x007a:
            r1 = r6
            r2 = r1
            r3 = r2
            r6 = r0
            r0 = r5
        L_0x007f:
            vb.s3 r6 = (vb.s3) r6
            r1.d(r6)
            r6 = r2
        L_0x0085:
            com.unity3d.ads.core.domain.GetSharedDataTimestamps r1 = r0.getSharedDataTimestamps
            vb.g3 r1 = r1.invoke()
            r6.h(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getInitializationTimeEpoch()
            com.google.protobuf.t1 r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.f(r1)
            long r1 = com.unity3d.services.core.properties.SdkProperties.getAppInitializationTimeSinceEpoch()
            com.google.protobuf.t1 r1 = com.unity3d.ads.core.extensions.TimestampExtensionsKt.fromMillis(r1)
            r6.b(r1)
            com.unity3d.ads.core.data.repository.DeveloperConsentRepository r1 = r0.developerConsentRepository
            vb.k0 r1 = r1.getDeveloperConsent()
            r6.c(r1)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r0 = r0.deviceInfoRepository
            vb.m2 r0 = r0.getPiiData()
            com.google.protobuf.i r1 = r0.h0()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00c7
            com.google.protobuf.i r1 = r0.i0()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x00ca
        L_0x00c7:
            r6.e(r0)
        L_0x00ca:
            vb.t3$c r6 = r3.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData.invoke(xd.d):java.lang.Object");
    }
}
