package com.startapp.sdk.adsbase.crashreport;

import android.app.Activity;
import com.startapp.j9;
import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ANRRemoteConfig implements Serializable {
    private static final long serialVersionUID = -5572648856211286333L;
    private long checkInterval = UnityAdsConstants.Timeout.GET_TOKEN_TIMEOUT_MS;
    private boolean collectBlockedOnly = true;
    private boolean enableForegroundCheck = true;
    private boolean enableLoggerExtraCheck;
    private boolean enabled = false;
    private boolean ignorePredefinedStacktraceElements = true;
    private boolean shrinkStacktrace = true;
    private long sleepInterval = 2000;

    public boolean a() {
        return this.collectBlockedOnly;
    }

    public long b() {
        return this.checkInterval;
    }

    public long c() {
        return this.sleepInterval;
    }

    public boolean d() {
        return this.ignorePredefinedStacktraceElements;
    }

    public boolean e() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ANRRemoteConfig aNRRemoteConfig = (ANRRemoteConfig) obj;
        if (this.enabled == aNRRemoteConfig.enabled && this.shrinkStacktrace == aNRRemoteConfig.shrinkStacktrace && this.collectBlockedOnly == aNRRemoteConfig.collectBlockedOnly && this.ignorePredefinedStacktraceElements == aNRRemoteConfig.ignorePredefinedStacktraceElements && this.enableLoggerExtraCheck == aNRRemoteConfig.enableLoggerExtraCheck && this.enableForegroundCheck == aNRRemoteConfig.enableForegroundCheck && this.checkInterval == aNRRemoteConfig.checkInterval && this.sleepInterval == aNRRemoteConfig.sleepInterval) {
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.enableForegroundCheck;
    }

    public boolean g() {
        return this.enableLoggerExtraCheck;
    }

    public boolean h() {
        return this.shrinkStacktrace;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Boolean.valueOf(this.shrinkStacktrace), Boolean.valueOf(this.collectBlockedOnly), Boolean.valueOf(this.ignorePredefinedStacktraceElements), Boolean.valueOf(this.enableLoggerExtraCheck), Boolean.valueOf(this.enableForegroundCheck), Long.valueOf(this.checkInterval), Long.valueOf(this.sleepInterval)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
