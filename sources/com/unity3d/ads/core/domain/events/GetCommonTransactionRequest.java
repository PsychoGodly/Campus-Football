package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import kotlin.jvm.internal.m;

/* compiled from: GetCommonTransactionRequest.kt */
public final class GetCommonTransactionRequest implements GetTransactionRequest {
    private final DeviceInfoRepository deviceInfoRepository;

    public GetCommonTransactionRequest(DeviceInfoRepository deviceInfoRepository2) {
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        this.deviceInfoRepository = deviceInfoRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.util.List<vb.l3> r6, xd.d<? super vb.m3> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.events.GetCommonTransactionRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r7
            com.unity3d.ads.core.domain.events.GetCommonTransactionRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetCommonTransactionRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.events.GetCommonTransactionRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetCommonTransactionRequest$invoke$1
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0045
            if (r2 != r3) goto L_0x003d
            java.lang.Object r6 = r0.L$4
            vb.i3 r6 = (vb.i3) r6
            java.lang.Object r1 = r0.L$3
            vb.i3 r1 = (vb.i3) r1
            java.lang.Object r2 = r0.L$2
            vb.i3 r2 = (vb.i3) r2
            java.lang.Object r3 = r0.L$1
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.domain.events.GetCommonTransactionRequest r0 = (com.unity3d.ads.core.domain.events.GetCommonTransactionRequest) r0
            sd.p.b(r7)
            goto L_0x0072
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            sd.p.b(r7)
            vb.i3$a r7 = vb.i3.f38979b
            vb.m3$a r2 = vb.m3.m0()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.m.d(r2, r4)
            vb.i3 r7 = r7.a(r2)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r2 = r5.deviceInfoRepository
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.L$3 = r7
            r0.L$4 = r7
            r0.label = r3
            java.lang.Object r0 = r2.staticDeviceInfo(r0)
            if (r0 != r1) goto L_0x006c
            return r1
        L_0x006c:
            r3 = r6
            r6 = r7
            r1 = r6
            r2 = r1
            r7 = r0
            r0 = r5
        L_0x0072:
            vb.b3 r7 = (vb.b3) r7
            r6.f(r7)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r0.deviceInfoRepository
            vb.a1 r6 = r6.getDynamicDeviceInfo()
            r1.e(r6)
            vb.k3 r6 = vb.k3.STORE_TYPE_GOOGLE_PLAY
            r1.d(r6)
            s8.b r6 = r1.c()
            r1.b(r6, r3)
            vb.m3 r6 = r2.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetCommonTransactionRequest.invoke(java.util.List, xd.d):java.lang.Object");
    }
}
