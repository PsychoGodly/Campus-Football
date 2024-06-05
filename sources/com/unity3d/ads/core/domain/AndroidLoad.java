package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.i;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.gatewayclient.GatewayClient;
import kotlin.jvm.internal.m;
import pe.k0;
import vb.p;
import wb.b;
import xd.d;

/* compiled from: AndroidLoad.kt */
public final class AndroidLoad implements Load {
    /* access modifiers changed from: private */
    public final AdRepository adRepository;
    private final k0 defaultDispatcher;
    /* access modifiers changed from: private */
    public final GatewayClient gatewayClient;
    /* access modifiers changed from: private */
    public final GetAdPlayerConfigRequest getAdPlayerConfigRequest;
    /* access modifiers changed from: private */
    public final GetAdRequest getAdRequest;
    /* access modifiers changed from: private */
    public final GetRequestPolicy getRequestPolicy;
    /* access modifiers changed from: private */
    public final HandleGatewayAdResponse handleGatewayAdResponse;
    /* access modifiers changed from: private */
    public final SessionRepository sessionRepository;

    public AndroidLoad(k0 k0Var, GetAdRequest getAdRequest2, GetAdPlayerConfigRequest getAdPlayerConfigRequest2, GetRequestPolicy getRequestPolicy2, HandleGatewayAdResponse handleGatewayAdResponse2, SessionRepository sessionRepository2, GatewayClient gatewayClient2, AdRepository adRepository2) {
        m.e(k0Var, "defaultDispatcher");
        m.e(getAdRequest2, "getAdRequest");
        m.e(getAdPlayerConfigRequest2, "getAdPlayerConfigRequest");
        m.e(getRequestPolicy2, "getRequestPolicy");
        m.e(handleGatewayAdResponse2, "handleGatewayAdResponse");
        m.e(sessionRepository2, "sessionRepository");
        m.e(gatewayClient2, "gatewayClient");
        m.e(adRepository2, "adRepository");
        this.defaultDispatcher = k0Var;
        this.getAdRequest = getAdRequest2;
        this.getAdPlayerConfigRequest = getAdPlayerConfigRequest2;
        this.getRequestPolicy = getRequestPolicy2;
        this.handleGatewayAdResponse = handleGatewayAdResponse2;
        this.sessionRepository = sessionRepository2;
        this.gatewayClient = gatewayClient2;
        this.adRepository = adRepository2;
    }

    /* access modifiers changed from: private */
    public final void incrementLoadRequestAdmCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestAdmCount();
        } else {
            this.sessionRepository.incrementLoadRequestAdmCount();
        }
    }

    /* access modifiers changed from: private */
    public final void incrementLoadRequestCount(boolean z10) {
        if (z10) {
            this.sessionRepository.incrementBannerLoadRequestCount();
        } else {
            this.sessionRepository.incrementLoadRequestCount();
        }
    }

    public Object invoke(Context context, String str, i iVar, b bVar, p pVar, UnityAdsLoadOptions unityAdsLoadOptions, d<? super LoadResult> dVar) {
        return pe.i.g(this.defaultDispatcher, new AndroidLoad$invoke$2(this, pVar, bVar, str, iVar, unityAdsLoadOptions, context, (d<? super AndroidLoad$invoke$2>) null), dVar);
    }
}
