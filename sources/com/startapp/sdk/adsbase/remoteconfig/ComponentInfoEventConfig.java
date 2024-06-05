package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ComponentInfoEventConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final ComponentInfoEventConfig f17062a = new ComponentInfoEventConfig();
    private static final long serialVersionUID = -5359772055016698271L;
    private double chance = 0.0d;
    private long flags = 0;

    public boolean a(long j10) {
        return (this.flags & j10) == j10 && j9.a(this.chance);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ComponentInfoEventConfig.class != obj.getClass()) {
            return false;
        }
        ComponentInfoEventConfig componentInfoEventConfig = (ComponentInfoEventConfig) obj;
        if (this.flags == componentInfoEventConfig.flags && Double.compare(this.chance, componentInfoEventConfig.chance) == 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Long.valueOf(this.flags), Double.valueOf(this.chance)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
