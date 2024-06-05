package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class AdDebuggerMetadata implements Serializable {
    private static final long serialVersionUID = 2490385963596560324L;
    @d9(type = LinkedHashSet.class)
    private Set<String> devices;
    @d9(name = "sendInfoEvents")
    private boolean infoEvents;
    private boolean testAds;

    public Set<String> a() {
        return this.devices;
    }

    public boolean b() {
        return this.infoEvents;
    }

    public boolean c() {
        return this.testAds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdDebuggerMetadata adDebuggerMetadata = (AdDebuggerMetadata) obj;
        if (this.testAds == adDebuggerMetadata.testAds && this.infoEvents == adDebuggerMetadata.infoEvents && j9.a(this.devices, adDebuggerMetadata.devices)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {this.devices, Boolean.valueOf(this.testAds), Boolean.valueOf(this.infoEvents)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
