package com.startapp.sdk.adsbase.utils;

import androidx.annotation.Keep;
import com.startapp.e9;

@Keep
/* compiled from: Sta */
public class UniversalIntParser implements e9<Integer> {
    private static final String LOG_TAG = "UniversalIntParser";

    public Integer parse(Class<Integer> cls, Object obj) {
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof Boolean) {
            return Integer.valueOf(Boolean.TRUE.equals(obj) ? 1 : 0);
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0;
    }
}
