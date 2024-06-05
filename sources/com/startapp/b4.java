package com.startapp;

import android.app.Activity;
import java.util.Map;

/* compiled from: Sta */
public class b4 implements e9<int[][]> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return new int[][]{new int[]{((Number) obj).intValue(), Integer.MAX_VALUE}};
        }
        if (obj instanceof String) {
            String str = (String) obj;
            Map<Activity, Integer> map = j9.f15982a;
            if (str != null) {
                try {
                    return j9.f(str);
                } catch (NumberFormatException unused) {
                }
            }
        }
        return null;
    }
}
