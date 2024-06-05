package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* compiled from: Sta */
public class z6 extends f7 {

    /* renamed from: a  reason: collision with root package name */
    public final List<j3> f17592a;

    public z6(List<j3> list) {
        this.f17592a = list;
    }

    public boolean a(Object obj) {
        if (obj instanceof r3) {
            return this.f17592a.contains(((r3) obj).f16341j0.f15911a);
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z6.class != obj.getClass()) {
            return false;
        }
        return j9.a(this.f17592a, ((z6) obj).f17592a);
    }

    public int hashCode() {
        Object[] objArr = {this.f17592a};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
