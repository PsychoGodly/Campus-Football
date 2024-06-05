package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class AdvertisingIdResolverMetadata implements Serializable {
    private static final long serialVersionUID = -1692502027621350736L;
    private boolean enabled = true;
    private int ief = 0;
    private double iep = 0.0d;

    public int a() {
        return this.ief;
    }

    public double b() {
        return this.iep;
    }

    public boolean c() {
        return this.enabled;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvertisingIdResolverMetadata advertisingIdResolverMetadata = (AdvertisingIdResolverMetadata) obj;
        if (this.enabled == advertisingIdResolverMetadata.enabled && Double.compare(this.iep, advertisingIdResolverMetadata.iep) == 0 && this.ief == advertisingIdResolverMetadata.ief) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), Double.valueOf(this.iep), Integer.valueOf(this.ief)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
