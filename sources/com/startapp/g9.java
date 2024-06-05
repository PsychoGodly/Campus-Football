package com.startapp;

/* compiled from: Sta */
public class g9 implements e9<Double> {
    public Object parse(Class cls, Object obj) {
        if (obj instanceof Number) {
            return Double.valueOf(((Number) obj).doubleValue());
        }
        double d10 = 0.0d;
        if (obj instanceof Boolean) {
            if (Boolean.TRUE.equals(obj)) {
                d10 = 1.0d;
            }
            return Double.valueOf(d10);
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (Throwable unused) {
            }
        }
        return Double.valueOf(0.0d);
    }
}
