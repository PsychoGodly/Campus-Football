package com.unity3d.services.core.request.metrics;

import android.text.TextUtils;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.InitializationStatusReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.m;

/* compiled from: MetricSenderWithBatch.kt */
public final class MetricSenderWithBatch extends MetricSenderBase {
    private SDKMetricsSender _original;
    private final LinkedBlockingQueue<Metric> _queue = new LinkedBlockingQueue<>();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MetricSenderWithBatch(SDKMetricsSender sDKMetricsSender, InitializationStatusReader initializationStatusReader) {
        super(initializationStatusReader);
        m.e(sDKMetricsSender, "_original");
        m.e(initializationStatusReader, "initializationStatusReader");
        this._original = sDKMetricsSender;
    }

    public String getMetricEndPoint() {
        return this._original.getMetricEndPoint();
    }

    public void sendEvent(String str, String str2, Map<String, String> map) {
        m.e(str, "event");
        m.e(map, "tags");
        if (str.length() == 0) {
            DeviceLog.debug("Metric event not sent due to being empty: " + str);
            return;
        }
        sendMetrics(p.b(new Metric(str, str2, map)));
    }

    public void sendMetric(Metric metric) {
        m.e(metric, "metric");
        sendMetrics(p.b(metric));
    }

    public synchronized void sendMetrics(List<Metric> list) {
        m.e(list, "metrics");
        this._queue.addAll(list);
        if (!TextUtils.isEmpty(this._original.getMetricEndPoint()) && this._queue.size() > 0) {
            ArrayList arrayList = new ArrayList();
            this._queue.drainTo(arrayList);
            this._original.sendMetrics(arrayList);
        }
    }

    public final void sendQueueIfNeeded() {
        sendMetrics(q.d());
    }

    public final void updateOriginal(SDKMetricsSender sDKMetricsSender) {
        m.e(sDKMetricsSender, "metrics");
        this._original = sDKMetricsSender;
    }
}
