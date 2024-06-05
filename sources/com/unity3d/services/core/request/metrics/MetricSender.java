package com.unity3d.services.core.request.metrics;

import com.applovin.mediation.MaxReward;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.l0;
import pe.p0;
import pe.q0;
import pe.r0;
import xd.d;

/* compiled from: MetricSender.kt */
public class MetricSender extends MetricSenderBase implements IServiceComponent {
    /* access modifiers changed from: private */
    public final MetricCommonTags commonTags;
    private final ISDKDispatchers dispatchers;
    /* access modifiers changed from: private */
    public final HttpClient httpClient = ((HttpClient) getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(HttpClient.class)));
    private final String metricEndPoint;
    /* access modifiers changed from: private */
    public final String metricSampleRate;
    private final p0 scope;
    /* access modifiers changed from: private */
    public final String sessionToken;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetricSender(Configuration configuration, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        m.e(configuration, "configuration");
        m.e(initializationStatusReader, "initializationStatusReader");
        MetricCommonTags metricCommonTags = new MetricCommonTags();
        metricCommonTags.updateWithConfig(configuration);
        this.commonTags = metricCommonTags;
        this.metricSampleRate = String.valueOf(c.a(configuration.getMetricSampleRate()));
        this.sessionToken = configuration.getSessionToken();
        ISDKDispatchers iSDKDispatchers = (ISDKDispatchers) getServiceProvider().getRegistry().getService(MaxReward.DEFAULT_LABEL, a0.b(ISDKDispatchers.class));
        this.dispatchers = iSDKDispatchers;
        this.scope = q0.a(iSDKDispatchers.getIo());
        this.metricEndPoint = configuration.getMetricsUrl();
    }

    public String getMetricEndPoint() {
        return this.metricEndPoint;
    }

    public IServiceProvider getServiceProvider() {
        return IServiceComponent.DefaultImpls.getServiceProvider(this);
    }

    public void sendEvent(String str, String str2, Map<String, String> map) {
        m.e(str, "event");
        m.e(map, "tags");
        if (str.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being null or empty: " + str);
            return;
        }
        sendMetrics(p.b(new Metric(str, str2, map)));
    }

    public void sendMetric(Metric metric) {
        m.e(metric, "metric");
        sendMetrics(p.b(metric));
    }

    public void sendMetrics(List<Metric> list) {
        m.e(list, "metrics");
        if (list.isEmpty()) {
            DeviceLog.debug("Metrics event not send due to being empty");
            return;
        }
        String metricEndPoint2 = getMetricEndPoint();
        if (metricEndPoint2 == null || o.m(metricEndPoint2)) {
            DeviceLog.debug("Metrics: " + list + " was not sent to null or empty endpoint: " + getMetricEndPoint());
            return;
        }
        c2 unused = k.d(this.scope, new MetricSender$sendMetrics$$inlined$CoroutineExceptionHandler$1(l0.A1, list), (r0) null, new MetricSender$sendMetrics$1(this, list, (d<? super MetricSender$sendMetrics$1>) null), 2, (Object) null);
    }

    public final void shutdown() {
        this.commonTags.shutdown();
    }
}
