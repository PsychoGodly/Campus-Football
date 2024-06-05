package com.unity3d.services.core.configuration;

import java.util.Map;
import org.json.JSONObject;

public interface IExperiments {
    JSONObject getCurrentSessionExperiments();

    Map<String, String> getExperimentTags();

    JSONObject getExperimentsAsJson();

    JSONObject getNextSessionExperiments();

    String getScarBiddingManager();

    boolean isBoldSdkNextSessionEnabled();

    boolean isCaptureHDRCapabilitiesEnabled();

    boolean isJetpackLifecycle();

    boolean isNativeLoadTimeoutDisabled();

    boolean isNativeShowTimeoutDisabled();

    boolean isOkHttpEnabled();

    boolean isPCCheckEnabled();

    boolean isScarBannerHbEnabled();

    boolean isScarInitEnabled();

    boolean isWebAssetAdCaching();

    boolean isWebGestureNotRequired();

    boolean isWebMessageEnabled();

    boolean isWebViewAsyncDownloadEnabled();

    boolean shouldNativeTokenAwaitPrivacy();
}
