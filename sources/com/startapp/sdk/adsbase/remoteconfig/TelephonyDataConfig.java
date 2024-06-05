package com.startapp.sdk.adsbase.remoteconfig;

import android.app.Activity;
import com.startapp.d9;
import com.startapp.j3;
import com.startapp.j9;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class TelephonyDataConfig implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public static final TelephonyDataConfig f17106a = new TelephonyDataConfig();
    private static final long serialVersionUID = -7175662234963204913L;
    @d9(type = ArrayList.class)
    private List<String> categories = Collections.singletonList(j3.f15957j.a());
    private boolean enabled = true;
    private String param;

    public List<String> a() {
        return this.categories;
    }

    public String b() {
        return this.param;
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
        TelephonyDataConfig telephonyDataConfig = (TelephonyDataConfig) obj;
        if (this.enabled != telephonyDataConfig.enabled || !j9.a(this.categories, telephonyDataConfig.categories) || !j9.a(this.param, telephonyDataConfig.param)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {Boolean.valueOf(this.enabled), this.categories, this.param};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
