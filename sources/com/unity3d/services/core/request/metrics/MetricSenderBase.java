package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.properties.InitializationStatusReader;
import com.unity3d.services.core.properties.SdkProperties;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import kotlin.jvm.internal.m;
import sd.s;

/* compiled from: MetricSenderBase.kt */
public abstract class MetricSenderBase implements SDKMetricsSender {
    private final InitializationStatusReader _initStatusReader;

    public MetricSenderBase(InitializationStatusReader initializationStatusReader) {
        m.e(initializationStatusReader, "_initStatusReader");
        this._initStatusReader = initializationStatusReader;
    }

    public void sendEvent(String str) {
        SDKMetricsSender.DefaultImpls.sendEvent(this, str);
    }

    public void sendMetricWithInitState(Metric metric) {
        m.e(metric, "metric");
        Metric metric2 = metric;
        sendMetric(Metric.copy$default(metric2, (String) null, (Object) null, k0.n(metric.getTags(), j0.e(s.a("state", this._initStatusReader.getInitializationStateString(SdkProperties.getCurrentInitializationState())))), 3, (Object) null));
    }
}
