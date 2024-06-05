package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: Sta */
public class AnalyticsConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final String f17061a = "https://infoevent.startappservice.com/tracking/infoEvent";
    private static final long serialVersionUID = 4112204971825088167L;
    @d9(complex = true)
    private AdCallbacksConfig adCallbacks = new AdCallbacksConfig();
    @d9(type = ArrayList.class)
    private List<String> admHeaders = Collections.singletonList("Server-Timing");
    private double admPrb = 0.0d;
    @d9(type = HashMap.class, value = AnalyticsCategoryConfig.class)
    private Map<String, AnalyticsCategoryConfig> categories;
    public boolean dns = false;
    private int fuIef;
    public String hostPeriodic;
    public String hostSecured;
    private String noNetworkTimeout;
    private int retryNum = 3;
    private int retryTime = 10;
    @d9(complex = true)
    private ComponentInfoEventConfig scheduledImpressionInfoEvents;
    private boolean sendHopsOnFirstSucceededSmartRedirect = false;
    private boolean sendViewabilityInfo = false;
    private float succeededSmartRedirectInfoProbability = 0.01f;

    public AnalyticsConfig() {
        String str = f17061a;
        this.hostSecured = str;
        this.hostPeriodic = str;
    }

    public AdCallbacksConfig a() {
        return this.adCallbacks;
    }

    public List<String> b() {
        return this.admHeaders;
    }

    public double c() {
        return this.admPrb;
    }

    public Map<String, AnalyticsCategoryConfig> d() {
        return this.categories;
    }

    public int e() {
        return this.fuIef;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnalyticsConfig analyticsConfig = (AnalyticsConfig) obj;
        if (this.dns == analyticsConfig.dns && this.retryNum == analyticsConfig.retryNum && this.retryTime == analyticsConfig.retryTime && Float.compare(this.succeededSmartRedirectInfoProbability, analyticsConfig.succeededSmartRedirectInfoProbability) == 0 && this.sendHopsOnFirstSucceededSmartRedirect == analyticsConfig.sendHopsOnFirstSucceededSmartRedirect && this.sendViewabilityInfo == analyticsConfig.sendViewabilityInfo && Double.compare(this.admPrb, analyticsConfig.admPrb) == 0 && this.fuIef == analyticsConfig.fuIef && j9.a(this.hostSecured, analyticsConfig.hostSecured) && j9.a(this.hostPeriodic, analyticsConfig.hostPeriodic) && j9.a(this.noNetworkTimeout, analyticsConfig.noNetworkTimeout) && j9.a(this.categories, analyticsConfig.categories) && j9.a(this.adCallbacks, analyticsConfig.adCallbacks) && j9.a(this.admHeaders, analyticsConfig.admHeaders) && j9.a(this.scheduledImpressionInfoEvents, analyticsConfig.scheduledImpressionInfoEvents)) {
            return true;
        }
        return false;
    }

    public String f() {
        return this.noNetworkTimeout;
    }

    public int g() {
        return this.retryNum;
    }

    public long h() {
        return TimeUnit.SECONDS.toMillis((long) this.retryTime);
    }

    public int hashCode() {
        Object[] objArr = {this.hostSecured, this.hostPeriodic, Boolean.valueOf(this.dns), Integer.valueOf(this.retryNum), Integer.valueOf(this.retryTime), Float.valueOf(this.succeededSmartRedirectInfoProbability), Boolean.valueOf(this.sendHopsOnFirstSucceededSmartRedirect), this.noNetworkTimeout, this.categories, this.adCallbacks, Boolean.valueOf(this.sendViewabilityInfo), Double.valueOf(this.admPrb), this.admHeaders, Integer.valueOf(this.fuIef), this.scheduledImpressionInfoEvents};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public ComponentInfoEventConfig i() {
        return this.scheduledImpressionInfoEvents;
    }

    public float j() {
        return this.succeededSmartRedirectInfoProbability;
    }

    public boolean k() {
        return this.sendHopsOnFirstSucceededSmartRedirect;
    }

    public boolean l() {
        return this.sendViewabilityInfo;
    }
}
