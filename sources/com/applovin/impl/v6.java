package com.applovin.impl;

public final class v6 {

    /* renamed from: a  reason: collision with root package name */
    public final int f12709a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12710b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12711c;

    private v6(int i10, int i11, String str) {
        this.f12709a = i10;
        this.f12710b = i11;
        this.f12711c = str;
    }

    public static v6 a(yg ygVar) {
        String str;
        ygVar.g(2);
        int w10 = ygVar.w();
        int i10 = w10 >> 1;
        int w11 = ((ygVar.w() >> 3) & 31) | ((w10 & 1) << 5);
        if (i10 == 4 || i10 == 5 || i10 == 7) {
            str = "dvhe";
        } else if (i10 == 8) {
            str = "hev1";
        } else if (i10 != 9) {
            return null;
        } else {
            str = "avc3";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String str2 = ".0";
        sb2.append(str2);
        sb2.append(i10);
        if (w11 >= 10) {
            str2 = ".";
        }
        sb2.append(str2);
        sb2.append(w11);
        return new v6(i10, w11, sb2.toString());
    }
}
