package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayerScope;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.CampaignRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import kotlin.jvm.internal.m;

/* compiled from: HandleGatewayAndroidAdResponse.kt */
public final class HandleGatewayAndroidAdResponse implements HandleGatewayAdResponse {
    private final AdPlayerScope adPlayerScope;
    private final AdRepository adRepository;
    /* access modifiers changed from: private */
    public final CampaignRepository campaignRepository;
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetAdPlayer getAdPlayer;
    private final HandleInvocationsFromAdViewer getHandleInvocationsFromAdViewer;
    private final GetLatestWebViewConfiguration getLatestWebViewConfiguration;
    private final GetOperativeEventApi getOperativeEventApi;
    private final GetWebViewBridgeUseCase getWebViewBridge;
    private final AndroidGetWebViewContainerUseCase getWebViewContainerUseCase;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public HandleGatewayAndroidAdResponse(AdRepository adRepository2, AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, GetWebViewBridgeUseCase getWebViewBridgeUseCase, DeviceInfoRepository deviceInfoRepository2, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, CampaignRepository campaignRepository2, SendDiagnosticEvent sendDiagnosticEvent2, GetOperativeEventApi getOperativeEventApi2, GetLatestWebViewConfiguration getLatestWebViewConfiguration2, AdPlayerScope adPlayerScope2, GetAdPlayer getAdPlayer2) {
        m.e(adRepository2, "adRepository");
        m.e(androidGetWebViewContainerUseCase, "getWebViewContainerUseCase");
        m.e(getWebViewBridgeUseCase, "getWebViewBridge");
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(handleInvocationsFromAdViewer, "getHandleInvocationsFromAdViewer");
        m.e(campaignRepository2, "campaignRepository");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(getOperativeEventApi2, "getOperativeEventApi");
        m.e(getLatestWebViewConfiguration2, "getLatestWebViewConfiguration");
        m.e(adPlayerScope2, "adPlayerScope");
        m.e(getAdPlayer2, "getAdPlayer");
        this.adRepository = adRepository2;
        this.getWebViewContainerUseCase = androidGetWebViewContainerUseCase;
        this.getWebViewBridge = getWebViewBridgeUseCase;
        this.deviceInfoRepository = deviceInfoRepository2;
        this.getHandleInvocationsFromAdViewer = handleInvocationsFromAdViewer;
        this.campaignRepository = campaignRepository2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.getOperativeEventApi = getOperativeEventApi2;
        this.getLatestWebViewConfiguration = getLatestWebViewConfiguration2;
        this.adPlayerScope = adPlayerScope2;
        this.getAdPlayer = getAdPlayer2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0027  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object cleanup(java.lang.Throwable r15, com.google.protobuf.i r16, vb.s r17, com.unity3d.ads.adplayer.AdPlayer r18, xd.d<? super sd.w> r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r19
            boolean r2 = r1 instanceof com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1
            if (r2 == 0) goto L_0x0016
            r2 = r1
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1 r2 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0016
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001b
        L_0x0016:
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1 r2 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$cleanup$1
            r2.<init>(r14, r1)
        L_0x001b:
            java.lang.Object r1 = r2.result
            java.lang.Object r12 = yd.d.c()
            int r3 = r2.label
            r13 = 2
            r4 = 1
            if (r3 == 0) goto L_0x0041
            if (r3 == r4) goto L_0x0038
            if (r3 != r13) goto L_0x0030
            sd.p.b(r1)
            goto L_0x00ac
        L_0x0030:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0038:
            java.lang.Object r3 = r2.L$0
            com.unity3d.ads.adplayer.AdPlayer r3 = (com.unity3d.ads.adplayer.AdPlayer) r3
            sd.p.b(r1)
            r1 = r3
            goto L_0x009e
        L_0x0041:
            sd.p.b(r1)
            vb.d2$a r1 = vb.d2.f38934b
            vb.g2$a r3 = vb.g2.h0()
            java.lang.String r5 = "newBuilder()"
            kotlin.jvm.internal.m.d(r3, r5)
            vb.d2 r1 = r1.a(r3)
            vb.h2 r3 = vb.h2.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED
            r1.b(r3)
            java.lang.Throwable r3 = r15.getCause()
            if (r3 == 0) goto L_0x0064
            java.lang.String r3 = r3.getMessage()
            if (r3 != 0) goto L_0x006c
        L_0x0064:
            java.lang.String r3 = r15.getMessage()
            if (r3 != 0) goto L_0x006c
            java.lang.String r3 = ""
        L_0x006c:
            r1.c(r3)
            vb.g2 r1 = r1.a()
            com.unity3d.ads.core.domain.events.GetOperativeEventApi r3 = r0.getOperativeEventApi
            vb.j2 r5 = vb.j2.OPERATIVE_EVENT_TYPE_LOAD_ERROR
            com.google.protobuf.i r6 = r17.s0()
            java.lang.String r7 = "response.trackingToken"
            kotlin.jvm.internal.m.d(r6, r7)
            com.google.protobuf.i r7 = r1.e()
            java.lang.String r1 = "operativeEventErrorData.toByteString()"
            kotlin.jvm.internal.m.d(r7, r1)
            r8 = 0
            r10 = 16
            r11 = 0
            r1 = r18
            r2.L$0 = r1
            r2.label = r4
            r4 = r5
            r5 = r16
            r9 = r2
            java.lang.Object r3 = com.unity3d.ads.core.domain.events.GetOperativeEventApi.invoke$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r3 != r12) goto L_0x009e
            return r12
        L_0x009e:
            if (r1 == 0) goto L_0x00af
            r3 = 0
            r2.L$0 = r3
            r2.label = r13
            java.lang.Object r1 = r1.destroy(r2)
            if (r1 != r12) goto L_0x00ac
            return r12
        L_0x00ac:
            sd.w r1 = sd.w.f38141a
            return r1
        L_0x00af:
            sd.w r1 = sd.w.f38141a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.cleanup(java.lang.Throwable, com.google.protobuf.i, vb.s, com.unity3d.ads.adplayer.AdPlayer, xd.d):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Throwable] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:?, code lost:
        se.g.u((se.e) r0, r5.f36055a.getScope());
        r0 = r5.f36055a.getOnLoadEvent();
        r2.L$0 = r9;
        r2.L$1 = r8;
        r2.L$2 = r12;
        r2.L$3 = r5;
        r2.L$4 = r4;
        r2.label = 4;
        r0 = se.g.B(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0352, code lost:
        if (r0 != r3) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0354, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0355, code lost:
        r0 = (com.unity3d.ads.adplayer.model.LoadEvent) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0359, code lost:
        if ((r0 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error) == false) goto L_0x03ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x035b, code lost:
        r1 = pe.q2.f37387a;
        r35 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5(r9, r0, r8, r12, r5, (xd.d<? super com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5>) null);
        r2.L$0 = r9;
        r2.L$1 = r8;
        r2.L$2 = r12;
        r2.L$3 = r5;
        r2.L$4 = r0;
        r2.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0382, code lost:
        if (pe.i.g(r1, r35, r2) != r3) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0384, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0385, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03aa, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.services.UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, (java.lang.Throwable) null, "adviewer", ((com.unity3d.ads.adplayer.model.LoadEvent.Error) r4).getMessage(), 4, (kotlin.jvm.internal.h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03ab, code lost:
        r9.campaignRepository.setLoadTimestamp(r8);
        r0 = r9.adRepository;
        r2.L$0 = r9;
        r2.L$1 = r8;
        r2.L$2 = r12;
        r2.L$3 = r5;
        r2.L$4 = r4;
        r2.label = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x03c3, code lost:
        if (r0.addAd(r8, r4, r2) != r3) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x03c5, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x03cb, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Success(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x03cc, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x03cf, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x03e6, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, (java.lang.Throwable) null, "invalid_url", r6, 4, (kotlin.jvm.internal.h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x03e7, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03e8, code lost:
        r5 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        r0 = (com.unity3d.ads.core.data.model.WebViewConfiguration) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ad, code lost:
        if (r0.getEntryPoint().length() != 0) goto L_0x01b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01af, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b1, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b2, code lost:
        if (r6 == false) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c9, code lost:
        return new com.unity3d.ads.core.data.model.LoadResult.Failure(com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR, com.unity3d.ads.core.data.model.LoadResult.MSG_COMMUNICATION_FAILURE, (java.lang.Throwable) null, "no_webview_entry_point", (java.lang.String) null, 20, (kotlin.jvm.internal.h) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ca, code lost:
        r6 = com.unity3d.services.core.properties.SdkProperties.getConfigUrl();
        kotlin.jvm.internal.m.d(r6, "it");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01db, code lost:
        if (ne.o.k(r6, ".html", false, 2, (java.lang.Object) null) == false) goto L_0x01de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01de, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01df, code lost:
        if (r6 != null) goto L_0x01e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e1, code lost:
        r6 = r0.getEntryPoint();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r0 = new java.net.URI(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0 = ne.p.y0(r6, "?", (java.lang.String) null, 2, (java.lang.Object) null) + (com.unity3d.services.UnityAdsConstants.DefaultUrls.AD_PLAYER_QUERY_PARAMS + r0.getQuery());
        r1 = android.util.Base64.encodeToString(r12.r0().J(), 2);
        r6 = r13.getWebViewContainerUseCase;
        r14 = r13.adPlayerScope;
        r2.L$0 = r13;
        r2.L$1 = r10;
        r2.L$2 = r11;
        r2.L$3 = r12;
        r2.L$4 = r9;
        r2.L$5 = r8;
        r2.L$6 = r4;
        r2.L$7 = r0;
        r2.L$8 = r1;
        r2.Z$0 = r15;
        r2.label = 2;
        r5 = r6.invoke(r14, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x023e, code lost:
        if (r5 != r3) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0240, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0241, code lost:
        r24 = r8;
        r6 = r9;
        r22 = r10;
        r9 = r13;
        r8 = r1;
        r1 = r0;
        r0 = r5;
        r5 = r4;
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:?, code lost:
        r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0;
        r10 = r9.getWebViewBridge.invoke(r0, r9.adPlayerScope);
        r5.f36055a = r9.getAdPlayer.invoke(r10, r0, r11);
        se.g.u(se.g.x(r9.deviceInfoRepository.getAllowedPii(), new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2(r5, (xd.d<? super com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2>) null)), r5.f36055a.getScope());
        se.g.u(se.g.x(r5.f36055a.getUpdateCampaignState(), new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3(r9, r11, r6, (xd.d<? super com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3>) null)), r5.f36055a.getScope());
        r13 = r12.s0();
        r20 = r5.f36055a;
        kotlin.jvm.internal.m.d(r13, com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02a7, code lost:
        if (r4 == false) goto L_0x02ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02a9, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x02ab, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ac, code lost:
        r16 = new com.unity3d.ads.core.data.model.AdObject(r11, r6, r13, r20, (java.lang.String) null, r22, kotlin.coroutines.jvm.internal.b.a(r4), r24, 16, (kotlin.jvm.internal.h) null);
        com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9.sendDiagnosticEvent, "native_load_started_ad_viewer", (java.lang.Double) null, (java.util.Map) null, (java.util.Map) null, r16, 14, (java.lang.Object) null);
        r4 = r9.getHandleInvocationsFromAdViewer;
        r6 = r10.getOnInvocation();
        r10 = r12.n0();
        kotlin.jvm.internal.m.d(r10, "response.adData");
        r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r10);
        r13 = r12.o0();
        kotlin.jvm.internal.m.d(r13, "response.adDataRefreshToken");
        r13 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r13);
        kotlin.jvm.internal.m.d(r8, "base64ImpressionConfiguration");
        r15 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4(r0, r1, (xd.d<? super com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4>) null);
        r2.L$0 = r9;
        r2.L$1 = r11;
        r2.L$2 = r12;
        r2.L$3 = r5;
        r2.L$4 = r16;
        r2.L$5 = null;
        r2.L$6 = null;
        r2.L$7 = null;
        r2.L$8 = null;
        r2.label = 3;
        r0 = r4.invoke(r6, r10, r13, r8, r16, r15, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0327, code lost:
        if (r0 != r3) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0329, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x032a, code lost:
        r8 = r11;
        r4 = r16;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:118:0x03d1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0428 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0429  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(com.unity3d.ads.UnityAdsLoadOptions r35, com.google.protobuf.i r36, vb.s r37, android.content.Context r38, java.lang.String r39, vb.r0 r40, boolean r41, xd.d<? super com.unity3d.ads.core.data.model.LoadResult> r42) {
        /*
            r34 = this;
            r1 = r34
            r0 = r42
            boolean r2 = r0 instanceof com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1
            if (r2 == 0) goto L_0x0017
            r2 = r0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1 r2 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x0017
            int r3 = r3 - r4
            r2.label = r3
            goto L_0x001c
        L_0x0017:
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1 r2 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$1
            r2.<init>(r1, r0)
        L_0x001c:
            java.lang.Object r0 = r2.result
            java.lang.Object r3 = yd.d.c()
            int r4 = r2.label
            r5 = 1
            r7 = 0
            switch(r4) {
                case 0: goto L_0x0113;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00a7;
                case 3: goto L_0x0088;
                case 4: goto L_0x006e;
                case 5: goto L_0x0054;
                case 6: goto L_0x003a;
                case 7: goto L_0x0031;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0031:
            java.lang.Object r2 = r2.L$0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
            sd.p.b(r0)
            goto L_0x042a
        L_0x003a:
            java.lang.Object r4 = r2.L$4
            com.unity3d.ads.core.data.model.AdObject r4 = (com.unity3d.ads.core.data.model.AdObject) r4
            java.lang.Object r5 = r2.L$3
            kotlin.jvm.internal.z r5 = (kotlin.jvm.internal.z) r5
            java.lang.Object r6 = r2.L$2
            vb.s r6 = (vb.s) r6
            java.lang.Object r8 = r2.L$1
            com.google.protobuf.i r8 = (com.google.protobuf.i) r8
            java.lang.Object r9 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r9 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r9
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x00a2 }
            r12 = r6
            goto L_0x03c6
        L_0x0054:
            java.lang.Object r4 = r2.L$4
            com.unity3d.ads.adplayer.model.LoadEvent r4 = (com.unity3d.ads.adplayer.model.LoadEvent) r4
            java.lang.Object r5 = r2.L$3
            kotlin.jvm.internal.z r5 = (kotlin.jvm.internal.z) r5
            java.lang.Object r6 = r2.L$2
            vb.s r6 = (vb.s) r6
            java.lang.Object r8 = r2.L$1
            com.google.protobuf.i r8 = (com.google.protobuf.i) r8
            java.lang.Object r9 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r9 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r9
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x00a2 }
            r12 = r6
            goto L_0x0386
        L_0x006e:
            java.lang.Object r4 = r2.L$4
            com.unity3d.ads.core.data.model.AdObject r4 = (com.unity3d.ads.core.data.model.AdObject) r4
            java.lang.Object r5 = r2.L$3
            kotlin.jvm.internal.z r5 = (kotlin.jvm.internal.z) r5
            java.lang.Object r6 = r2.L$2
            vb.s r6 = (vb.s) r6
            java.lang.Object r8 = r2.L$1
            com.google.protobuf.i r8 = (com.google.protobuf.i) r8
            java.lang.Object r9 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r9 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r9
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x00a2 }
            r12 = r6
            goto L_0x0355
        L_0x0088:
            java.lang.Object r4 = r2.L$4
            com.unity3d.ads.core.data.model.AdObject r4 = (com.unity3d.ads.core.data.model.AdObject) r4
            java.lang.Object r5 = r2.L$3
            kotlin.jvm.internal.z r5 = (kotlin.jvm.internal.z) r5
            java.lang.Object r6 = r2.L$2
            vb.s r6 = (vb.s) r6
            java.lang.Object r8 = r2.L$1
            com.google.protobuf.i r8 = (com.google.protobuf.i) r8
            java.lang.Object r9 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r9 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r9
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x00a2 }
            r12 = r6
            goto L_0x032c
        L_0x00a2:
            r0 = move-exception
            r12 = r6
        L_0x00a4:
            r11 = r8
            goto L_0x03f7
        L_0x00a7:
            boolean r4 = r2.Z$0
            java.lang.Object r8 = r2.L$8
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.L$7
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$6
            kotlin.jvm.internal.z r10 = (kotlin.jvm.internal.z) r10
            java.lang.Object r11 = r2.L$5
            vb.r0 r11 = (vb.r0) r11
            java.lang.Object r12 = r2.L$4
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r13 = r2.L$3
            vb.s r13 = (vb.s) r13
            java.lang.Object r14 = r2.L$2
            com.google.protobuf.i r14 = (com.google.protobuf.i) r14
            java.lang.Object r15 = r2.L$1
            com.unity3d.ads.UnityAdsLoadOptions r15 = (com.unity3d.ads.UnityAdsLoadOptions) r15
            java.lang.Object r6 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r6 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r6
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x00dc }
            r1 = r9
            r5 = r10
            r24 = r11
            r11 = r14
            r22 = r15
            r9 = r6
            r6 = r12
            r12 = r13
            goto L_0x024c
        L_0x00dc:
            r0 = move-exception
            r9 = r6
            r5 = r10
            r12 = r13
            r11 = r14
            goto L_0x03f7
        L_0x00e3:
            boolean r4 = r2.Z$0
            java.lang.Object r6 = r2.L$6
            kotlin.jvm.internal.z r6 = (kotlin.jvm.internal.z) r6
            java.lang.Object r8 = r2.L$5
            vb.r0 r8 = (vb.r0) r8
            java.lang.Object r9 = r2.L$4
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r2.L$3
            vb.s r10 = (vb.s) r10
            java.lang.Object r11 = r2.L$2
            com.google.protobuf.i r11 = (com.google.protobuf.i) r11
            java.lang.Object r12 = r2.L$1
            com.unity3d.ads.UnityAdsLoadOptions r12 = (com.unity3d.ads.UnityAdsLoadOptions) r12
            java.lang.Object r13 = r2.L$0
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse r13 = (com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse) r13
            sd.p.b(r0)     // Catch:{ CancellationException -> 0x010d }
            r15 = r4
            r4 = r6
            r33 = r12
            r12 = r10
            r10 = r33
            goto L_0x01a3
        L_0x010d:
            r0 = move-exception
            r5 = r6
            r12 = r10
        L_0x0110:
            r9 = r13
            goto L_0x03f7
        L_0x0113:
            sd.p.b(r0)
            kotlin.jvm.internal.z r4 = new kotlin.jvm.internal.z
            r4.<init>()
            boolean r0 = r37.u0()     // Catch:{ CancellationException -> 0x03ef }
            if (r0 == 0) goto L_0x0141
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ CancellationException -> 0x0139 }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r9 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ CancellationException -> 0x0139 }
            java.lang.String r10 = "[UnityAds] Internal communication failure"
            r11 = 0
            java.lang.String r12 = "gateway"
            vb.d1 r5 = r37.q0()     // Catch:{ CancellationException -> 0x0139 }
            java.lang.String r13 = r5.h0()     // Catch:{ CancellationException -> 0x0139 }
            r14 = 4
            r15 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ CancellationException -> 0x0139 }
            return r0
        L_0x0139:
            r0 = move-exception
            r11 = r36
            r12 = r37
            r9 = r1
            goto L_0x03f6
        L_0x0141:
            com.google.protobuf.i r0 = r37.n0()     // Catch:{ CancellationException -> 0x03ef }
            boolean r0 = r0.isEmpty()     // Catch:{ CancellationException -> 0x03ef }
            if (r0 == 0) goto L_0x015d
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ CancellationException -> 0x0139 }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r9 = com.unity3d.ads.UnityAds.UnityAdsLoadError.NO_FILL     // Catch:{ CancellationException -> 0x0139 }
            java.lang.String r10 = "[UnityAds] No fill"
            r11 = 0
            java.lang.String r12 = "no_fill"
            r13 = 0
            r14 = 20
            r15 = 0
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ CancellationException -> 0x0139 }
            return r0
        L_0x015d:
            com.unity3d.ads.core.domain.GetLatestWebViewConfiguration r0 = r1.getLatestWebViewConfiguration     // Catch:{ CancellationException -> 0x03ef }
            vb.y3 r6 = r37.t0()     // Catch:{ CancellationException -> 0x03ef }
            java.lang.String r6 = r6.h0()     // Catch:{ CancellationException -> 0x03ef }
            vb.y3 r8 = r37.t0()     // Catch:{ CancellationException -> 0x03ef }
            int r8 = r8.i0()     // Catch:{ CancellationException -> 0x03ef }
            java.lang.Integer r8 = kotlin.coroutines.jvm.internal.b.c(r8)     // Catch:{ CancellationException -> 0x03ef }
            vb.y3 r9 = r37.t0()     // Catch:{ CancellationException -> 0x03ef }
            java.util.List r9 = r9.f0()     // Catch:{ CancellationException -> 0x03ef }
            r2.L$0 = r1     // Catch:{ CancellationException -> 0x03ef }
            r10 = r35
            r2.L$1 = r10     // Catch:{ CancellationException -> 0x03ef }
            r11 = r36
            r2.L$2 = r11     // Catch:{ CancellationException -> 0x03ed }
            r12 = r37
            r2.L$3 = r12     // Catch:{ CancellationException -> 0x03eb }
            r13 = r39
            r2.L$4 = r13     // Catch:{ CancellationException -> 0x03eb }
            r14 = r40
            r2.L$5 = r14     // Catch:{ CancellationException -> 0x03eb }
            r2.L$6 = r4     // Catch:{ CancellationException -> 0x03eb }
            r15 = r41
            r2.Z$0 = r15     // Catch:{ CancellationException -> 0x03eb }
            r2.label = r5     // Catch:{ CancellationException -> 0x03eb }
            java.lang.Object r0 = r0.invoke(r6, r8, r9, r2)     // Catch:{ CancellationException -> 0x03eb }
            if (r0 != r3) goto L_0x01a0
            return r3
        L_0x01a0:
            r9 = r13
            r8 = r14
            r13 = r1
        L_0x01a3:
            com.unity3d.ads.core.data.model.WebViewConfiguration r0 = (com.unity3d.ads.core.data.model.WebViewConfiguration) r0     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r6 = r0.getEntryPoint()     // Catch:{ CancellationException -> 0x03e7 }
            int r6 = r6.length()     // Catch:{ CancellationException -> 0x03e7 }
            if (r6 != 0) goto L_0x01b1
            r6 = 1
            goto L_0x01b2
        L_0x01b1:
            r6 = 0
        L_0x01b2:
            if (r6 == 0) goto L_0x01ca
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ CancellationException -> 0x03e7 }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r17 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r18 = "[UnityAds] Internal communication failure"
            r19 = 0
            java.lang.String r20 = "no_webview_entry_point"
            r21 = 0
            r22 = 20
            r23 = 0
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ CancellationException -> 0x03e7 }
            return r0
        L_0x01ca:
            java.lang.String r6 = com.unity3d.services.core.properties.SdkProperties.getConfigUrl()     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r14 = "it"
            kotlin.jvm.internal.m.d(r6, r14)     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r14 = ".html"
            r5 = 2
            r1 = 0
            boolean r14 = ne.o.k(r6, r14, r1, r5, r7)     // Catch:{ CancellationException -> 0x03e7 }
            if (r14 == 0) goto L_0x01de
            goto L_0x01df
        L_0x01de:
            r6 = r7
        L_0x01df:
            if (r6 != 0) goto L_0x01e5
            java.lang.String r6 = r0.getEntryPoint()     // Catch:{ CancellationException -> 0x03e7 }
        L_0x01e5:
            java.net.URI r0 = new java.net.URI     // Catch:{ all -> 0x03d1 }
            r0.<init>(r6)     // Catch:{ all -> 0x03d1 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x03e7 }
            r14.<init>()     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r1 = "?platform=android&"
            r14.append(r1)     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r0 = r0.getQuery()     // Catch:{ CancellationException -> 0x03e7 }
            r14.append(r0)     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r0 = r14.toString()     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ CancellationException -> 0x03e7 }
            r1.<init>()     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r14 = "?"
            java.lang.String r6 = ne.p.y0(r6, r14, r7, r5, r7)     // Catch:{ CancellationException -> 0x03e7 }
            r1.append(r6)     // Catch:{ CancellationException -> 0x03e7 }
            r1.append(r0)     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r0 = r1.toString()     // Catch:{ CancellationException -> 0x03e7 }
            com.google.protobuf.i r1 = r12.r0()     // Catch:{ CancellationException -> 0x03e7 }
            byte[] r1 = r1.J()     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r5)     // Catch:{ CancellationException -> 0x03e7 }
            com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase r6 = r13.getWebViewContainerUseCase     // Catch:{ CancellationException -> 0x03e7 }
            com.unity3d.ads.adplayer.AdPlayerScope r14 = r13.adPlayerScope     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$0 = r13     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$1 = r10     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$2 = r11     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$3 = r12     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$4 = r9     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$5 = r8     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$6 = r4     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$7 = r0     // Catch:{ CancellationException -> 0x03e7 }
            r2.L$8 = r1     // Catch:{ CancellationException -> 0x03e7 }
            r2.Z$0 = r15     // Catch:{ CancellationException -> 0x03e7 }
            r2.label = r5     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.Object r5 = r6.invoke(r14, r2)     // Catch:{ CancellationException -> 0x03e7 }
            if (r5 != r3) goto L_0x0241
            return r3
        L_0x0241:
            r24 = r8
            r6 = r9
            r22 = r10
            r9 = r13
            r8 = r1
            r1 = r0
            r0 = r5
            r5 = r4
            r4 = r15
        L_0x024c:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r0 = (com.unity3d.ads.adplayer.AndroidWebViewContainer) r0     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.GetWebViewBridgeUseCase r10 = r9.getWebViewBridge     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.AdPlayerScope r13 = r9.adPlayerScope     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.WebViewBridge r10 = r10.invoke(r0, r13)     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.GetAdPlayer r13 = r9.getAdPlayer     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.AdPlayer r13 = r13.invoke(r10, r0, r11)     // Catch:{ CancellationException -> 0x03cf }
            r5.f36055a = r13     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.data.repository.DeviceInfoRepository r13 = r9.deviceInfoRepository     // Catch:{ CancellationException -> 0x03cf }
            se.v r13 = r13.getAllowedPii()     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2 r14 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$2     // Catch:{ CancellationException -> 0x03cf }
            r14.<init>(r5, r7)     // Catch:{ CancellationException -> 0x03cf }
            se.e r13 = se.g.x(r13, r14)     // Catch:{ CancellationException -> 0x03cf }
            T r14 = r5.f36055a     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.AdPlayer r14 = (com.unity3d.ads.adplayer.AdPlayer) r14     // Catch:{ CancellationException -> 0x03cf }
            pe.p0 r14 = r14.getScope()     // Catch:{ CancellationException -> 0x03cf }
            se.g.u(r13, r14)     // Catch:{ CancellationException -> 0x03cf }
            T r13 = r5.f36055a     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.AdPlayer r13 = (com.unity3d.ads.adplayer.AdPlayer) r13     // Catch:{ CancellationException -> 0x03cf }
            se.e r13 = r13.getUpdateCampaignState()     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3 r14 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$3     // Catch:{ CancellationException -> 0x03cf }
            r14.<init>(r9, r11, r6, r7)     // Catch:{ CancellationException -> 0x03cf }
            se.e r13 = se.g.x(r13, r14)     // Catch:{ CancellationException -> 0x03cf }
            T r14 = r5.f36055a     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.adplayer.AdPlayer r14 = (com.unity3d.ads.adplayer.AdPlayer) r14     // Catch:{ CancellationException -> 0x03cf }
            pe.p0 r14 = r14.getScope()     // Catch:{ CancellationException -> 0x03cf }
            se.g.u(r13, r14)     // Catch:{ CancellationException -> 0x03cf }
            com.google.protobuf.i r13 = r12.s0()     // Catch:{ CancellationException -> 0x03cf }
            T r14 = r5.f36055a     // Catch:{ CancellationException -> 0x03cf }
            r20 = r14
            com.unity3d.ads.adplayer.AdPlayer r20 = (com.unity3d.ads.adplayer.AdPlayer) r20     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.data.model.AdObject r14 = new com.unity3d.ads.core.data.model.AdObject     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r15 = "trackingToken"
            kotlin.jvm.internal.m.d(r13, r15)     // Catch:{ CancellationException -> 0x03cf }
            r21 = 0
            if (r4 == 0) goto L_0x02ab
            r4 = 1
            goto L_0x02ac
        L_0x02ab:
            r4 = 0
        L_0x02ac:
            java.lang.Boolean r23 = kotlin.coroutines.jvm.internal.b.a(r4)     // Catch:{ CancellationException -> 0x03cf }
            r25 = 16
            r26 = 0
            r16 = r14
            r17 = r11
            r18 = r6
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.SendDiagnosticEvent r4 = r9.sendDiagnosticEvent     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r26 = "native_load_started_ad_viewer"
            r27 = 0
            r28 = 0
            r29 = 0
            r31 = 14
            r32 = 0
            r25 = r4
            r30 = r14
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r25, r26, r27, r28, r29, r30, r31, r32)     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer r4 = r9.getHandleInvocationsFromAdViewer     // Catch:{ CancellationException -> 0x03cf }
            se.z r6 = r10.getOnInvocation()     // Catch:{ CancellationException -> 0x03cf }
            com.google.protobuf.i r10 = r12.n0()     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r13 = "response.adData"
            kotlin.jvm.internal.m.d(r10, r13)     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r10 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r10)     // Catch:{ CancellationException -> 0x03cf }
            com.google.protobuf.i r13 = r12.o0()     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r15 = "response.adDataRefreshToken"
            kotlin.jvm.internal.m.d(r13, r15)     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r13 = com.unity3d.ads.core.extensions.ProtobufExtensionsKt.toBase64(r13)     // Catch:{ CancellationException -> 0x03cf }
            java.lang.String r15 = "base64ImpressionConfiguration"
            kotlin.jvm.internal.m.d(r8, r15)     // Catch:{ CancellationException -> 0x03cf }
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4 r15 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$4     // Catch:{ CancellationException -> 0x03cf }
            r15.<init>(r0, r1, r7)     // Catch:{ CancellationException -> 0x03cf }
            r2.L$0 = r9     // Catch:{ CancellationException -> 0x03cf }
            r2.L$1 = r11     // Catch:{ CancellationException -> 0x03cf }
            r2.L$2 = r12     // Catch:{ CancellationException -> 0x03cf }
            r2.L$3 = r5     // Catch:{ CancellationException -> 0x03cf }
            r2.L$4 = r14     // Catch:{ CancellationException -> 0x03cf }
            r2.L$5 = r7     // Catch:{ CancellationException -> 0x03cf }
            r2.L$6 = r7     // Catch:{ CancellationException -> 0x03cf }
            r2.L$7 = r7     // Catch:{ CancellationException -> 0x03cf }
            r2.L$8 = r7     // Catch:{ CancellationException -> 0x03cf }
            r0 = 3
            r2.label = r0     // Catch:{ CancellationException -> 0x03cf }
            r35 = r4
            r36 = r6
            r37 = r10
            r38 = r13
            r39 = r8
            r40 = r14
            r41 = r15
            r42 = r2
            java.lang.Object r0 = r35.invoke(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ CancellationException -> 0x03cf }
            if (r0 != r3) goto L_0x032a
            return r3
        L_0x032a:
            r8 = r11
            r4 = r14
        L_0x032c:
            se.e r0 = (se.e) r0     // Catch:{ CancellationException -> 0x03cc }
            T r1 = r5.f36055a     // Catch:{ CancellationException -> 0x03cc }
            com.unity3d.ads.adplayer.AdPlayer r1 = (com.unity3d.ads.adplayer.AdPlayer) r1     // Catch:{ CancellationException -> 0x03cc }
            pe.p0 r1 = r1.getScope()     // Catch:{ CancellationException -> 0x03cc }
            se.g.u(r0, r1)     // Catch:{ CancellationException -> 0x03cc }
            T r0 = r5.f36055a     // Catch:{ CancellationException -> 0x03cc }
            com.unity3d.ads.adplayer.AdPlayer r0 = (com.unity3d.ads.adplayer.AdPlayer) r0     // Catch:{ CancellationException -> 0x03cc }
            se.e r0 = r0.getOnLoadEvent()     // Catch:{ CancellationException -> 0x03cc }
            r2.L$0 = r9     // Catch:{ CancellationException -> 0x03cc }
            r2.L$1 = r8     // Catch:{ CancellationException -> 0x03cc }
            r2.L$2 = r12     // Catch:{ CancellationException -> 0x03cc }
            r2.L$3 = r5     // Catch:{ CancellationException -> 0x03cc }
            r2.L$4 = r4     // Catch:{ CancellationException -> 0x03cc }
            r1 = 4
            r2.label = r1     // Catch:{ CancellationException -> 0x03cc }
            java.lang.Object r0 = se.g.B(r0, r2)     // Catch:{ CancellationException -> 0x03cc }
            if (r0 != r3) goto L_0x0355
            return r3
        L_0x0355:
            com.unity3d.ads.adplayer.model.LoadEvent r0 = (com.unity3d.ads.adplayer.model.LoadEvent) r0     // Catch:{ CancellationException -> 0x03cc }
            boolean r1 = r0 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error     // Catch:{ CancellationException -> 0x03cc }
            if (r1 == 0) goto L_0x03ab
            pe.q2 r1 = pe.q2.f37387a     // Catch:{ CancellationException -> 0x03cc }
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5 r4 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$5     // Catch:{ CancellationException -> 0x03cc }
            r6 = 0
            r35 = r4
            r36 = r9
            r37 = r0
            r38 = r8
            r39 = r12
            r40 = r5
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)     // Catch:{ CancellationException -> 0x03cc }
            r2.L$0 = r9     // Catch:{ CancellationException -> 0x03cc }
            r2.L$1 = r8     // Catch:{ CancellationException -> 0x03cc }
            r2.L$2 = r12     // Catch:{ CancellationException -> 0x03cc }
            r2.L$3 = r5     // Catch:{ CancellationException -> 0x03cc }
            r2.L$4 = r0     // Catch:{ CancellationException -> 0x03cc }
            r6 = 5
            r2.label = r6     // Catch:{ CancellationException -> 0x03cc }
            java.lang.Object r1 = pe.i.g(r1, r4, r2)     // Catch:{ CancellationException -> 0x03cc }
            if (r1 != r3) goto L_0x0385
            return r3
        L_0x0385:
            r4 = r0
        L_0x0386:
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ CancellationException -> 0x03cc }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r1 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ CancellationException -> 0x03cc }
            java.lang.String r6 = "Internal error"
            r10 = 0
            java.lang.String r11 = "adviewer"
            com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r4     // Catch:{ CancellationException -> 0x03cc }
            java.lang.String r4 = r4.getMessage()     // Catch:{ CancellationException -> 0x03cc }
            r13 = 4
            r14 = 0
            r35 = r0
            r36 = r1
            r37 = r6
            r38 = r10
            r39 = r11
            r40 = r4
            r41 = r13
            r42 = r14
            r35.<init>(r36, r37, r38, r39, r40, r41, r42)     // Catch:{ CancellationException -> 0x03cc }
            return r0
        L_0x03ab:
            com.unity3d.ads.core.data.repository.CampaignRepository r0 = r9.campaignRepository     // Catch:{ CancellationException -> 0x03cc }
            r0.setLoadTimestamp(r8)     // Catch:{ CancellationException -> 0x03cc }
            com.unity3d.ads.core.data.repository.AdRepository r0 = r9.adRepository     // Catch:{ CancellationException -> 0x03cc }
            r2.L$0 = r9     // Catch:{ CancellationException -> 0x03cc }
            r2.L$1 = r8     // Catch:{ CancellationException -> 0x03cc }
            r2.L$2 = r12     // Catch:{ CancellationException -> 0x03cc }
            r2.L$3 = r5     // Catch:{ CancellationException -> 0x03cc }
            r2.L$4 = r4     // Catch:{ CancellationException -> 0x03cc }
            r1 = 6
            r2.label = r1     // Catch:{ CancellationException -> 0x03cc }
            java.lang.Object r0 = r0.addAd(r8, r4, r2)     // Catch:{ CancellationException -> 0x03cc }
            if (r0 != r3) goto L_0x03c6
            return r3
        L_0x03c6:
            com.unity3d.ads.core.data.model.LoadResult$Success r0 = new com.unity3d.ads.core.data.model.LoadResult$Success     // Catch:{ CancellationException -> 0x03cc }
            r0.<init>(r4)     // Catch:{ CancellationException -> 0x03cc }
            return r0
        L_0x03cc:
            r0 = move-exception
            goto L_0x00a4
        L_0x03cf:
            r0 = move-exception
            goto L_0x03f7
        L_0x03d1:
            com.unity3d.ads.core.data.model.LoadResult$Failure r0 = new com.unity3d.ads.core.data.model.LoadResult$Failure     // Catch:{ CancellationException -> 0x03e7 }
            com.unity3d.ads.UnityAds$UnityAdsLoadError r17 = com.unity3d.ads.UnityAds.UnityAdsLoadError.INTERNAL_ERROR     // Catch:{ CancellationException -> 0x03e7 }
            java.lang.String r18 = "[UnityAds] Internal communication failure"
            r19 = 0
            java.lang.String r20 = "invalid_url"
            r22 = 4
            r23 = 0
            r16 = r0
            r21 = r6
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ CancellationException -> 0x03e7 }
            return r0
        L_0x03e7:
            r0 = move-exception
            r5 = r4
            goto L_0x0110
        L_0x03eb:
            r0 = move-exception
            goto L_0x03f4
        L_0x03ed:
            r0 = move-exception
            goto L_0x03f2
        L_0x03ef:
            r0 = move-exception
            r11 = r36
        L_0x03f2:
            r12 = r37
        L_0x03f4:
            r9 = r34
        L_0x03f6:
            r5 = r4
        L_0x03f7:
            pe.q2 r1 = pe.q2.f37387a
            com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$6 r4 = new com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse$invoke$6
            r6 = 0
            r35 = r4
            r36 = r9
            r37 = r0
            r38 = r11
            r39 = r12
            r40 = r5
            r41 = r6
            r35.<init>(r36, r37, r38, r39, r40, r41)
            r2.L$0 = r0
            r2.L$1 = r7
            r2.L$2 = r7
            r2.L$3 = r7
            r2.L$4 = r7
            r2.L$5 = r7
            r2.L$6 = r7
            r2.L$7 = r7
            r2.L$8 = r7
            r5 = 7
            r2.label = r5
            java.lang.Object r1 = pe.i.g(r1, r4, r2)
            if (r1 != r3) goto L_0x0429
            return r3
        L_0x0429:
            r2 = r0
        L_0x042a:
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L_0x0431
            goto L_0x0432
        L_0x0431:
            r2 = r0
        L_0x0432:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.HandleGatewayAndroidAdResponse.invoke(com.unity3d.ads.UnityAdsLoadOptions, com.google.protobuf.i, vb.s, android.content.Context, java.lang.String, vb.r0, boolean, xd.d):java.lang.Object");
    }
}
