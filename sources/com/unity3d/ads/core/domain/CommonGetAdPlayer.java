package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.ads.adplayer.WebViewBridge;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.banners.BannerViewCache;
import kotlin.jvm.internal.m;
import pe.k0;
import pe.p0;

/* compiled from: CommonGetAdPlayer.kt */
public final class CommonGetAdPlayer implements GetAdPlayer {
    private final p0 adPlayerScope;
    private final k0 defaultDispatcher;
    private final DeviceInfoRepository deviceInfoRepository;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    public CommonGetAdPlayer(DeviceInfoRepository deviceInfoRepository2, SessionRepository sessionRepository2, ExecuteAdViewerRequest executeAdViewerRequest2, SendDiagnosticEvent sendDiagnosticEvent2, k0 k0Var, p0 p0Var, OpenMeasurementRepository openMeasurementRepository2) {
        m.e(deviceInfoRepository2, "deviceInfoRepository");
        m.e(sessionRepository2, "sessionRepository");
        m.e(executeAdViewerRequest2, "executeAdViewerRequest");
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        m.e(k0Var, "defaultDispatcher");
        m.e(p0Var, "adPlayerScope");
        m.e(openMeasurementRepository2, "openMeasurementRepository");
        this.deviceInfoRepository = deviceInfoRepository2;
        this.sessionRepository = sessionRepository2;
        this.executeAdViewerRequest = executeAdViewerRequest2;
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
        this.defaultDispatcher = k0Var;
        this.adPlayerScope = p0Var;
        this.openMeasurementRepository = openMeasurementRepository2;
    }

    public AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, i iVar) {
        m.e(webViewBridge, "webviewBridge");
        m.e(androidWebViewContainer, "webviewContainer");
        m.e(iVar, "opportunityId");
        WebViewAdPlayer webViewAdPlayer = new WebViewAdPlayer(webViewBridge, this.deviceInfoRepository, this.sessionRepository, this.executeAdViewerRequest, this.defaultDispatcher, this.sendDiagnosticEvent, androidWebViewContainer, this.adPlayerScope);
        if (BannerViewCache.getInstance().getBannerView(ProtobufExtensionsKt.toUUID(iVar).toString()) != null) {
            return new AndroidEmbeddableWebViewAdPlayer(webViewAdPlayer, ProtobufExtensionsKt.toISO8859String(iVar), androidWebViewContainer, this.openMeasurementRepository);
        }
        return new AndroidFullscreenWebViewAdPlayer(webViewAdPlayer, ProtobufExtensionsKt.toISO8859String(iVar), androidWebViewContainer, this.deviceInfoRepository, this.sessionRepository, this.openMeasurementRepository);
    }
}
