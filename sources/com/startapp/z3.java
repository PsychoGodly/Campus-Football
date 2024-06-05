package com.startapp;

import android.app.Activity;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: Sta */
public class z3 implements e9<int[]> {
    public Object parse(Class cls, Object obj) {
        int[] iArr;
        int i10;
        int i11 = 0;
        if (obj instanceof Number) {
            return new int[]{((Number) obj).intValue()};
        }
        if (obj instanceof String) {
            Map<Activity, Integer> map = j9.f15982a;
            String[] split = ((String) obj).split(",");
            int length = split.length;
            iArr = new int[length];
            while (i11 < length) {
                try {
                    iArr[i11] = Integer.parseInt(split[i11].trim());
                    i11++;
                } catch (NumberFormatException unused) {
                }
            }
        } else {
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = new JSONArray();
                int length2 = jSONArray.length();
                iArr = new int[length2];
                for (int i12 = 0; i12 < length2; i12++) {
                    Object opt = jSONArray.opt(i12);
                    if (opt instanceof Number) {
                        iArr[i12] = ((Number) opt).intValue();
                    } else if (opt instanceof String) {
                        String str = (String) opt;
                        Map<Activity, Integer> map2 = j9.f15982a;
                        if (str != null) {
                            try {
                                i10 = Integer.parseInt(str);
                            } catch (NumberFormatException unused2) {
                            }
                            iArr[i12] = i10;
                        }
                        i10 = 0;
                        iArr[i12] = i10;
                    }
                }
            }
            return null;
        }
        return iArr;
    }
}
