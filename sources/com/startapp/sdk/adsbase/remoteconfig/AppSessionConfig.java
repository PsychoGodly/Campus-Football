package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import com.startapp.m8;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class AppSessionConfig implements Serializable {
    private static final long serialVersionUID = 2463582211707601660L;
    @d9(name = "backgroundTimeout", parser = m8.class)
    private long timeoutMillis = 600000;

    public long a() {
        return this.timeoutMillis;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.timeoutMillis == ((AppSessionConfig) obj).timeoutMillis) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.timeoutMillis)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
