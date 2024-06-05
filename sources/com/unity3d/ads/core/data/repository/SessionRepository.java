package com.unity3d.ads.core.data.repository;

import com.google.protobuf.i;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import sd.w;
import se.e;
import se.z;
import vb.x2;
import vb.y1;
import vb.z1;
import xd.d;

/* compiled from: SessionRepository.kt */
public interface SessionRepository {
    y1 getFeatureFlags();

    String getGameId();

    Object getGatewayCache(d<? super i> dVar);

    i getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationState getInitializationState();

    z1 getNativeConfiguration();

    e<InitializationState> getObserveInitializationState();

    z<SessionChange> getOnChange();

    Object getPrivacy(d<? super i> dVar);

    Object getPrivacyFsm(d<? super i> dVar);

    x2 getSessionCounters();

    i getSessionId();

    i getSessionToken();

    boolean getShouldInitialize();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    boolean isDiagnosticsEnabled();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(d<? super w> dVar);

    void setGameId(String str);

    Object setGatewayCache(i iVar, d<? super w> dVar);

    void setGatewayState(i iVar);

    void setGatewayUrl(String str);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(z1 z1Var);

    Object setPrivacy(i iVar, d<? super w> dVar);

    Object setPrivacyFsm(i iVar, d<? super w> dVar);

    void setSessionCounters(x2 x2Var);

    void setSessionToken(i iVar);

    void setShouldInitialize(boolean z10);
}
