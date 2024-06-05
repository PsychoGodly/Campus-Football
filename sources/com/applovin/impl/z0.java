package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public final class z0 extends ak {
    /* access modifiers changed from: protected */
    public we a(ze zeVar, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return a(new xg(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }

    private static we a(xg xgVar) {
        xgVar.d(12);
        int d10 = (xgVar.d() + xgVar.a(12)) - 4;
        xgVar.d(44);
        xgVar.e(xgVar.a(12));
        xgVar.d(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String str = null;
            if (xgVar.d() >= d10) {
                break;
            }
            xgVar.d(48);
            int a10 = xgVar.a(8);
            xgVar.d(4);
            int d11 = xgVar.d() + xgVar.a(12);
            String str2 = null;
            while (xgVar.d() < d11) {
                int a11 = xgVar.a(8);
                int a12 = xgVar.a(8);
                int d12 = xgVar.d() + a12;
                if (a11 == 2) {
                    int a13 = xgVar.a(16);
                    xgVar.d(8);
                    if (a13 != 3) {
                    }
                    while (xgVar.d() < d12) {
                        str = xgVar.a(xgVar.a(8), Charsets.US_ASCII);
                        int a14 = xgVar.a(8);
                        for (int i10 = 0; i10 < a14; i10++) {
                            xgVar.e(xgVar.a(8));
                        }
                    }
                } else if (a11 == 21) {
                    str2 = xgVar.a(a12, Charsets.US_ASCII);
                }
                xgVar.c(d12 * 8);
            }
            xgVar.c(d11 * 8);
            if (!(str == null || str2 == null)) {
                arrayList.add(new y0(a10, str + str2));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new we((List) arrayList);
    }
}
