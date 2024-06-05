package com.applovin.impl;

import com.applovin.impl.uf;
import java.util.ArrayList;
import java.util.List;

public final class v1 {

    /* renamed from: a  reason: collision with root package name */
    public final List f12650a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12651b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12652c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12653d;

    /* renamed from: e  reason: collision with root package name */
    public final float f12654e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12655f;

    private v1(List list, int i10, int i11, int i12, float f10, String str) {
        this.f12650a = list;
        this.f12651b = i10;
        this.f12652c = i11;
        this.f12653d = i12;
        this.f12654e = f10;
        this.f12655f = str;
    }

    private static byte[] a(yg ygVar) {
        int C = ygVar.C();
        int d10 = ygVar.d();
        ygVar.g(C);
        return m3.a(ygVar.c(), d10, C);
    }

    public static v1 b(yg ygVar) {
        String str;
        float f10;
        int i10;
        try {
            ygVar.g(4);
            int w10 = (ygVar.w() & 3) + 1;
            if (w10 != 3) {
                ArrayList arrayList = new ArrayList();
                int w11 = ygVar.w() & 31;
                for (int i11 = 0; i11 < w11; i11++) {
                    arrayList.add(a(ygVar));
                }
                int w12 = ygVar.w();
                for (int i12 = 0; i12 < w12; i12++) {
                    arrayList.add(a(ygVar));
                }
                int i13 = -1;
                if (w11 > 0) {
                    uf.b c10 = uf.c((byte[]) arrayList.get(0), w10, ((byte[]) arrayList.get(0)).length);
                    int i14 = c10.f12572e;
                    int i15 = c10.f12573f;
                    float f11 = c10.f12574g;
                    str = m3.a(c10.f12568a, c10.f12569b, c10.f12570c);
                    i13 = i14;
                    i10 = i15;
                    f10 = f11;
                } else {
                    str = null;
                    i10 = -1;
                    f10 = 1.0f;
                }
                return new v1(arrayList, w10, i13, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ah.a("Error parsing AVC config", e10);
        }
    }
}
