package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetAndroidInitializationCompletedRequest.kt */
public final class GetAndroidInitializationCompletedRequest implements GetInitializationCompletedRequest {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetUniversalRequestForPayLoad getUniversalRequestForPayLoad;

    public GetAndroidInitializationCompletedRequest(GetUniversalRequestForPayLoad getUniversalRequestForPayLoad2, DeviceInfoRepository deviceInfoRepository2) {
        m.e(getUniversalRequestForPayLoad2, "getUniversalRequestForPayLoad");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        this.getUniversalRequestForPayLoad = getUniversalRequestForPayLoad2;
        this.deviceInfoRepository = deviceInfoRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ad A[PHI: r9 
      PHI: (r9v2 java.lang.Object) = (r9v9 java.lang.Object), (r9v1 java.lang.Object) binds: [B:19:0x00aa, B:10:0x002a] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(xd.d<? super vb.t3> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest$invoke$1
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            java.lang.String r3 = "newBuilder()"
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x0037
            if (r2 != r4) goto L_0x002f
            sd.p.b(r9)
            goto L_0x00ad
        L_0x002f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0037:
            java.lang.Object r2 = r0.L$3
            vb.g1 r2 = (vb.g1) r2
            java.lang.Object r5 = r0.L$2
            vb.g1 r5 = (vb.g1) r5
            java.lang.Object r6 = r0.L$1
            vb.g1 r6 = (vb.g1) r6
            java.lang.Object r7 = r0.L$0
            com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest r7 = (com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest) r7
            sd.p.b(r9)
            goto L_0x0071
        L_0x004b:
            sd.p.b(r9)
            vb.g1$a r9 = vb.g1.f38963b
            vb.i1$a r2 = vb.i1.h0()
            kotlin.jvm.internal.m.d(r2, r3)
            vb.g1 r2 = r9.a(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r8.deviceInfoRepository
            r0.L$0 = r8
            r0.L$1 = r2
            r0.L$2 = r2
            r0.L$3 = r2
            r0.label = r5
            java.lang.Object r9 = r9.staticDeviceInfo(r0)
            if (r9 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r7 = r8
            r5 = r2
            r6 = r5
        L_0x0071:
            vb.b3 r9 = (vb.b3) r9
            r2.c(r9)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r9 = r7.deviceInfoRepository
            vb.a1 r9 = r9.getDynamicDeviceInfo()
            r5.b(r9)
            vb.i1 r9 = r6.a()
            vb.o3 r2 = vb.o3.f39052a
            vb.p3$a r2 = vb.p3.f39058b
            vb.t3$b$a r5 = vb.t3.b.q0()
            kotlin.jvm.internal.m.d(r5, r3)
            vb.p3 r2 = r2.a(r5)
            r2.g(r9)
            vb.t3$b r9 = r2.a()
            com.unity3d.ads.core.domain.GetUniversalRequestForPayLoad r2 = r7.getUniversalRequestForPayLoad
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.L$2 = r3
            r0.L$3 = r3
            r0.label = r4
            java.lang.Object r9 = r2.invoke(r9, r0)
            if (r9 != r1) goto L_0x00ad
            return r1
        L_0x00ad:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest.invoke(xd.d):java.lang.Object");
    }
}
