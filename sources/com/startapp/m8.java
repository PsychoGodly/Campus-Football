package com.startapp;

/* compiled from: Sta */
public class m8 implements e9<Long> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return Long.valueOf(((Number) obj).longValue());
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(j9.e((String) obj));
            } catch (Throwable unused) {
            }
        }
        return 0L;
    }
}
