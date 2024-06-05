package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* compiled from: Sta */
public class s5 {

    /* renamed from: a  reason: collision with root package name */
    public String f16391a;

    /* renamed from: b  reason: collision with root package name */
    public String f16392b;

    /* renamed from: c  reason: collision with root package name */
    public Set<String> f16393c;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s5.class != obj.getClass()) {
            return false;
        }
        return this.f16391a.equals(((s5) obj).f16391a);
    }

    public int hashCode() {
        Object[] objArr = {this.f16391a};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        StringBuilder a10 = p0.a("NameValueObject [name=");
        a10.append(this.f16391a);
        a10.append(", value=");
        a10.append(this.f16392b);
        a10.append(", valueSet=");
        a10.append(this.f16393c);
        a10.append("]");
        return a10.toString();
    }
}
