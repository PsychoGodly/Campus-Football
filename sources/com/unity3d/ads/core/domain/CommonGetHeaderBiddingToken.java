package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import vb.m2;
import wb.c;
import wb.e;

/* compiled from: CommonGetHeaderBiddingToken.kt */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion((h) null);
    public static final String HB_TOKEN_VERSION = "2";
    private final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetByteStringId generateId;
    private final GetClientInfo getClientInfo;
    private final GetSharedDataTimestamps getTimestamps;
    private final SessionRepository sessionRepository;

    /* compiled from: CommonGetHeaderBiddingToken.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public CommonGetHeaderBiddingToken(GetByteStringId getByteStringId, GetClientInfo getClientInfo2, GetSharedDataTimestamps getSharedDataTimestamps, DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, CampaignRepository campaignRepository2) {
        m.e(getByteStringId, "generateId");
        m.e(getClientInfo2, "getClientInfo");
        m.e(getSharedDataTimestamps, "getTimestamps");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(campaignRepository2, "campaignRepository");
        this.generateId = getByteStringId;
        this.getClientInfo = getClientInfo2;
        this.getTimestamps = getSharedDataTimestamps;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.campaignRepository = campaignRepository2;
    }

    public String invoke() {
        c.a aVar = c.f39191b;
        e.a p02 = e.p0();
        m.d(p02, "newBuilder()");
        c a10 = aVar.a(p02);
        a10.j(this.generateId.invoke());
        a10.k(this.sessionRepository.getHeaderBiddingTokenCounter());
        a10.g(this.sessionRepository.getSessionToken());
        a10.c(this.getClientInfo.invoke());
        a10.i(this.getTimestamps.invoke());
        a10.f(this.sessionRepository.getSessionCounters());
        a10.h(this.deviceInfoRepository.cachedStaticDeviceInfo());
        a10.d(this.deviceInfoRepository.getDynamicDeviceInfo());
        m2 piiData = this.deviceInfoRepository.getPiiData();
        if (!piiData.h0().isEmpty() || !piiData.i0().isEmpty()) {
            a10.e(piiData);
        }
        a10.b(this.campaignRepository.getCampaignState());
        i e10 = a10.a().e();
        m.d(e10, "rawToken.toByteString()");
        String base64 = ProtobufExtensionsKt.toBase64(e10);
        return "2:" + base64;
    }
}
