package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class w6 extends f7 {

    /* renamed from: a  reason: collision with root package name */
    public final int f17502a;

    public w6(int i10) {
        this.f17502a = i10;
    }

    public boolean a(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        int i10 = ((w0) obj).Z;
        if ((this.f17502a & i10) == i10) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w6.class == obj.getClass() && this.f17502a == ((w6) obj).f17502a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.f17502a)};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
