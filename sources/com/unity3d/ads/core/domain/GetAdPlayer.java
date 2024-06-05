package com.unity3d.ads.core.domain;

import com.google.protobuf.i;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.AndroidWebViewContainer;
import com.unity3d.ads.adplayer.WebViewBridge;

/* compiled from: GetAdPlayer.kt */
public interface GetAdPlayer {
    AdPlayer invoke(WebViewBridge webViewBridge, AndroidWebViewContainer androidWebViewContainer, i iVar);
}
