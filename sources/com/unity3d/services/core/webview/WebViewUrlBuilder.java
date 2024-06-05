package com.unity3d.services.core.webview;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class WebViewUrlBuilder {
    private final SDKMetricsSender _sdkMetricsSender = ((SDKMetricsSender) Utilities.getService(SDKMetricsSender.class));
    private final String _urlWithQueryString;

    public WebViewUrlBuilder(String str, Configuration configuration) {
        this._urlWithQueryString = str + ((("?platform=android" + buildQueryParam("origin", configuration.getWebViewUrl())) + buildQueryParam("version", configuration.getWebViewVersion())) + buildQueryParam("isNativeCollectingMetrics", String.valueOf(configuration.areMetricsEnabledForCurrentSession())));
    }

    private String buildQueryParam(String str, String str2) {
        if (str2 == null) {
            return MaxReward.DEFAULT_LABEL;
        }
        try {
            return MaxReward.DEFAULT_LABEL + "&" + str + "=" + URLEncoder.encode(str2, "UTF-8");
        } catch (UnsupportedEncodingException e10) {
            DeviceLog.exception(String.format("Unsupported charset when encoding %s", new Object[]{str}), e10);
            return MaxReward.DEFAULT_LABEL;
        }
    }

    public String getUrlWithQueryString() {
        return this._urlWithQueryString;
    }
}
