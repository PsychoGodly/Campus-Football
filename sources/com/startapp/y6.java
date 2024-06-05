package com.startapp;

import android.app.Activity;
import java.util.Arrays;
import java.util.Map;

/* compiled from: Sta */
public class y6 extends f7 {

    /* renamed from: a  reason: collision with root package name */
    public final j3 f17564a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17565b;

    public y6(j3 j3Var, String str) {
        this.f17564a = j3Var;
        this.f17565b = str;
    }

    public boolean a(Object obj) {
        if (!(obj instanceof r3)) {
            return false;
        }
        j3 j3Var = this.f17564a;
        i3 i3Var = ((r3) obj).f16341j0;
        if (j3Var != i3Var.f15911a) {
            return false;
        }
        String str = this.f17565b;
        if (str == null || str.equals(i3Var.f15914d)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y6.class != obj.getClass()) {
            return false;
        }
        y6 y6Var = (y6) obj;
        if (!j9.a(this.f17564a, y6Var.f17564a) || !j9.a(this.f17565b, y6Var.f17565b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f17564a, this.f17565b};
        Map<Activity, Integer> map = j9.f15982a;
        return Arrays.deepHashCode(objArr);
    }
}
