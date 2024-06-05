package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.GetByteStringId;
import kotlin.jvm.internal.m;

/* compiled from: GetOperativeEventRequest.kt */
public final class GetOperativeEventRequest {
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateByteStringId;
    private final SessionRepository sessionRepository;

    public GetOperativeEventRequest(GetByteStringId getByteStringId, DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, CampaignRepository campaignRepository2) {
        m.e(getByteStringId, "generateByteStringId");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(campaignRepository2, "campaignRepository");
        this.generateByteStringId = getByteStringId;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.campaignRepository = campaignRepository2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(vb.j2 r6, com.google.protobuf.i r7, com.google.protobuf.i r8, com.google.protobuf.i r9, java.lang.String r10, xd.d<? super vb.i2> r11) {
        /*
            r5 = this;
            boolean r0 = r11 instanceof com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            if (r0 == 0) goto L_0x0013
            r0 = r11
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1 r0 = new com.unity3d.ads.core.domain.events.GetOperativeEventRequest$invoke$1
            r0.<init>(r5, r11)
        L_0x0018:
            java.lang.Object r11 = r0.result
            java.lang.Object r1 = yd.d.c()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 != r3) goto L_0x0039
            java.lang.Object r6 = r0.L$3
            vb.e2 r6 = (vb.e2) r6
            java.lang.Object r7 = r0.L$2
            vb.e2 r7 = (vb.e2) r7
            java.lang.Object r8 = r0.L$1
            vb.e2 r8 = (vb.e2) r8
            java.lang.Object r9 = r0.L$0
            com.unity3d.ads.core.domain.events.GetOperativeEventRequest r9 = (com.unity3d.ads.core.domain.events.GetOperativeEventRequest) r9
            sd.p.b(r11)
            goto L_0x008e
        L_0x0039:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0041:
            sd.p.b(r11)
            vb.e2$a r11 = vb.e2.f38937b
            vb.i2$a r2 = vb.i2.p0()
            java.lang.String r4 = "newBuilder()"
            kotlin.jvm.internal.m.d(r2, r4)
            vb.e2 r11 = r11.a(r2)
            com.unity3d.ads.core.domain.GetByteStringId r2 = r5.generateByteStringId
            com.google.protobuf.i r2 = r2.invoke()
            r11.e(r2)
            r11.f(r6)
            r11.g(r8)
            r11.k(r7)
            r11.b(r9)
            if (r10 == 0) goto L_0x006d
            r11.i(r10)
        L_0x006d:
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r5.deviceInfoRepository
            vb.a1 r6 = r6.getDynamicDeviceInfo()
            r11.d(r6)
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r6 = r5.deviceInfoRepository
            r0.L$0 = r5
            r0.L$1 = r11
            r0.L$2 = r11
            r0.L$3 = r11
            r0.label = r3
            java.lang.Object r6 = r6.staticDeviceInfo(r0)
            if (r6 != r1) goto L_0x0089
            return r1
        L_0x0089:
            r9 = r5
            r7 = r11
            r8 = r7
            r11 = r6
            r6 = r8
        L_0x008e:
            vb.b3 r11 = (vb.b3) r11
            r6.j(r11)
            com.unity3d.ads.core.data.repository.SessionRepository r6 = r9.sessionRepository
            vb.x2 r6 = r6.getSessionCounters()
            r7.h(r6)
            com.unity3d.ads.core.data.repository.CampaignRepository r6 = r9.campaignRepository
            vb.b0 r6 = r6.getCampaignState()
            r7.c(r6)
            vb.i2 r6 = r8.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.events.GetOperativeEventRequest.invoke(vb.j2, com.google.protobuf.i, com.google.protobuf.i, com.google.protobuf.i, java.lang.String, xd.d):java.lang.Object");
    }
}
