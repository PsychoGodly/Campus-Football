package com.applovin.impl;

import java.util.Collections;
import java.util.List;

public final class ka {

    /* renamed from: a  reason: collision with root package name */
    public final List f8935a;

    /* renamed from: b  reason: collision with root package name */
    public final int f8936b;

    /* renamed from: c  reason: collision with root package name */
    public final String f8937c;

    private ka(List list, int i10, String str) {
        this.f8935a = list;
        this.f8936b = i10;
        this.f8937c = str;
    }

    public static ka a(yg ygVar) {
        List list;
        yg ygVar2 = ygVar;
        try {
            ygVar2.g(21);
            int w10 = ygVar.w() & 3;
            int w11 = ygVar.w();
            int d10 = ygVar.d();
            int i10 = 0;
            for (int i11 = 0; i11 < w11; i11++) {
                ygVar2.g(1);
                int C = ygVar.C();
                for (int i12 = 0; i12 < C; i12++) {
                    int C2 = ygVar.C();
                    i10 += C2 + 4;
                    ygVar2.g(C2);
                }
            }
            ygVar2.f(d10);
            byte[] bArr = new byte[i10];
            String str = null;
            int i13 = 0;
            for (int i14 = 0; i14 < w11; i14++) {
                int w12 = ygVar.w() & 127;
                int C3 = ygVar.C();
                for (int i15 = 0; i15 < C3; i15++) {
                    int C4 = ygVar.C();
                    byte[] bArr2 = uf.f12561a;
                    System.arraycopy(bArr2, 0, bArr, i13, bArr2.length);
                    int length = i13 + bArr2.length;
                    System.arraycopy(ygVar.c(), ygVar.d(), bArr, length, C4);
                    if (w12 == 33 && i15 == 0) {
                        str = m3.a(new zg(bArr, length, length + C4));
                    }
                    i13 = length + C4;
                    ygVar2.g(C4);
                }
            }
            if (i10 == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new ka(list, w10 + 1, str);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw ah.a("Error parsing HEVC config", e10);
        }
    }
}
