package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.CommonWebViewBridge;
import com.unity3d.ads.adplayer.WebViewBridge;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import pe.g1;
import pe.k0;
import pe.p0;

/* compiled from: GetCommonWebViewBridgeUseCase.kt */
public final class GetCommonWebViewBridgeUseCase implements GetWebViewBridgeUseCase {
    private final k0 dispatcher;

    public GetCommonWebViewBridgeUseCase() {
        this((k0) null, 1, (h) null);
    }

    public GetCommonWebViewBridgeUseCase(k0 k0Var) {
        m.e(k0Var, "dispatcher");
        this.dispatcher = k0Var;
    }

    public WebViewBridge invoke(AndroidWebViewContainer androidWebViewContainer, p0 p0Var) {
        m.e(androidWebViewContainer, "webViewContainer");
        m.e(p0Var, "adPlayerScope");
        return new CommonWebViewBridge(this.dispatcher, androidWebViewContainer, p0Var);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCommonWebViewBridgeUseCase(k0 k0Var, int i10, h hVar) {
        this((i10 & 1) != 0 ? g1.a() : k0Var);
    }
}
