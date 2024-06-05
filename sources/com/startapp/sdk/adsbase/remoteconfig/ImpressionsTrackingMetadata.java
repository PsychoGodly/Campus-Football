package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.g9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class ImpressionsTrackingMetadata implements Serializable {
    private static final long serialVersionUID = -8908841983322302421L;
    @d9(parser = g9.class)
    private double enabled = 0.0d;
    private int types = 3;

    public double a() {
        return this.enabled;
    }

    public int b() {
        return this.types;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ImpressionsTrackingMetadata impressionsTrackingMetadata = (ImpressionsTrackingMetadata) obj;
        if (Double.compare(this.enabled, impressionsTrackingMetadata.enabled) == 0 && this.types == impressionsTrackingMetadata.types) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Double.valueOf(this.enabled), Integer.valueOf(this.types)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
