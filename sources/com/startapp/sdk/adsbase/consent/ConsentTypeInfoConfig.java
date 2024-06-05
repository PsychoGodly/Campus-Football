package com.startapp.sdk.adsbase.consent;

import android.app.Activity;
import com.startapp.j9;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public final class ConsentTypeInfoConfig implements Serializable {
    private static final long serialVersionUID = -2671083367770989563L;
    private Integer falseClick;
    private Integer impression;
    private Integer trueClick;

    public Integer a() {
        return this.falseClick;
    }

    public Integer b() {
        return this.impression;
    }

    public Integer c() {
        return this.trueClick;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ConsentTypeInfoConfig.class != obj.getClass()) {
            return false;
        }
        ConsentTypeInfoConfig consentTypeInfoConfig = (ConsentTypeInfoConfig) obj;
        if (!j9.a(this.impression, consentTypeInfoConfig.impression) || !j9.a(this.trueClick, consentTypeInfoConfig.trueClick) || !j9.a(this.falseClick, consentTypeInfoConfig.falseClick)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.impression, this.trueClick, this.falseClick};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
