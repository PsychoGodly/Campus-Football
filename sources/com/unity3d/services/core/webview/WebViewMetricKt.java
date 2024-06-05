package com.unity3d.services.core.webview;

import com.unity3d.services.core.request.metrics.Metric;
import java.util.Map;
import kotlin.jvm.internal.h;

/* compiled from: WebViewMetric.kt */
public final class WebViewMetricKt {
    public static final Metric webMessageListenerDisabledMetric() {
        return new Metric("web_message_listener_disabled", (Object) null, (Map) null, 6, (h) null);
    }

    public static final Metric webMessageListenerEnabledMetric() {
        return new Metric("web_message_listener_enabled", (Object) null, (Map) null, 6, (h) null);
    }

    public static final Metric webMessageListenerSupportedMetric() {
        return new Metric("web_message_listener_supported", (Object) null, (Map) null, 6, (h) null);
    }

    public static final Metric webMessageListenerUnsupportedMetric() {
        return new Metric("web_message_listener_unsupported", (Object) null, (Map) null, 6, (h) null);
    }
}
