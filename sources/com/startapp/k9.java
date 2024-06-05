package com.startapp;

/* compiled from: Sta */
public class k9 {
    public static double a(double d10, double d11, double d12) {
        return 1.0d / (Math.exp((d11 - d10) * d12) + 1.0d);
    }

    public static double a(double d10, double d11, double d12, double d13) {
        return (a(d10, d11, d12) - d13) / (1.0d - d13);
    }
}
