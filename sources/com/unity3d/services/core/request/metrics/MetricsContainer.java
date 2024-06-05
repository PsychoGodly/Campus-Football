package com.unity3d.services.core.request.metrics;

import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.Session;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: MetricsContainer.kt */
public final class MetricsContainer {
    public static final Companion Companion = new Companion((h) null);
    private static final String METRICS_CONTAINER = "m";
    private static final String METRICS_CONTAINER_TAGS = "t";
    private static final String METRIC_CONTAINER_API_LEVEL = "apil";
    private static final String METRIC_CONTAINER_DEVICE_MAKE = "deviceMake";
    private static final String METRIC_CONTAINER_DEVICE_MODEL = "deviceModel";
    private static final String METRIC_CONTAINER_DEVICE_NAME = "deviceName";
    private static final String METRIC_CONTAINER_GAME_ID = "gameId";
    private static final String METRIC_CONTAINER_SAMPLE_RATE = "msr";
    private static final String METRIC_CONTAINER_SESSION_TOKEN = "sTkn";
    private static final String METRIC_CONTAINER_SHARED_SESSION_ID = "shSid";
    private final String apiLevel = String.valueOf(Device.getApiLevel());
    private final MetricCommonTags commonTags;
    private final String deviceManufacturer = Device.getManufacturer();
    private final String deviceModel = Device.getModel();
    private final String deviceName = Device.getDevice();
    private final String gameId = ClientProperties.getGameId();
    private final String metricSampleRate;
    private final List<Metric> metrics;
    private final String sTkn;
    private final String shSid = Session.Default.getId();

    /* compiled from: MetricsContainer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(h hVar) {
            this();
        }
    }

    public MetricsContainer(String str, MetricCommonTags metricCommonTags, List<Metric> list, String str2) {
        m.e(str, "metricSampleRate");
        m.e(metricCommonTags, "commonTags");
        m.e(list, "metrics");
        this.metricSampleRate = str;
        this.commonTags = metricCommonTags;
        this.metrics = list;
        this.sTkn = str2;
    }

    public final Map<String, Object> toMap() {
        List<Metric> list = this.metrics;
        ArrayList arrayList = new ArrayList(r.j(list, 10));
        for (Metric map : list) {
            arrayList.add(map.toMap());
        }
        Map c10 = j0.c();
        c10.put(METRIC_CONTAINER_SAMPLE_RATE, this.metricSampleRate);
        c10.put(METRICS_CONTAINER, arrayList);
        c10.put(METRICS_CONTAINER_TAGS, this.commonTags.toMap());
        c10.put(METRIC_CONTAINER_SHARED_SESSION_ID, this.shSid);
        c10.put(METRIC_CONTAINER_API_LEVEL, this.apiLevel);
        String str = this.sTkn;
        if (str != null) {
            c10.put(METRIC_CONTAINER_SESSION_TOKEN, str);
        }
        String str2 = this.deviceModel;
        if (str2 != null) {
            m.d(str2, METRIC_CONTAINER_DEVICE_MODEL);
            c10.put(METRIC_CONTAINER_DEVICE_MODEL, str2);
        }
        String str3 = this.deviceName;
        if (str3 != null) {
            m.d(str3, METRIC_CONTAINER_DEVICE_NAME);
            c10.put(METRIC_CONTAINER_DEVICE_NAME, str3);
        }
        String str4 = this.deviceManufacturer;
        if (str4 != null) {
            m.d(str4, "deviceManufacturer");
            c10.put(METRIC_CONTAINER_DEVICE_MAKE, str4);
        }
        String str5 = this.gameId;
        if (str5 != null) {
            m.d(str5, "gameId");
            c10.put("gameId", str5);
        }
        return j0.b(c10);
    }
}
