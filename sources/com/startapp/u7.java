package com.startapp;

import android.app.Activity;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Sta */
public class u7 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<a, String> f17374a = new ConcurrentHashMap();

    /* compiled from: Sta */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final AdPreferences.Placement f17375a;

        /* renamed from: b  reason: collision with root package name */
        public final int f17376b;

        public a(AdPreferences.Placement placement, int i10) {
            this.f17375a = placement;
            this.f17376b = i10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f17376b == aVar.f17376b && this.f17375a == aVar.f17375a) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            Object[] objArr = {this.f17375a, Integer.valueOf(this.f17376b)};
            Map<Activity, Integer> map = j9.f15982a;
            return Arrays.deepHashCode(objArr);
        }
    }
}
