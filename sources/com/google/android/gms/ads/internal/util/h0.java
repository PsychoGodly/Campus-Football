package com.google.android.gms.ads.internal.util;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class h0 {

    /* renamed from: a  reason: collision with root package name */
    private final String[] f14805a;

    /* renamed from: b  reason: collision with root package name */
    private final double[] f14806b;

    /* renamed from: c  reason: collision with root package name */
    private final double[] f14807c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f14808d;

    /* renamed from: e  reason: collision with root package name */
    private int f14809e = 0;

    /* synthetic */ h0(f0 f0Var, g0 g0Var) {
        int size = f0Var.f14796b.size();
        this.f14805a = (String[]) f0Var.f14795a.toArray(new String[size]);
        this.f14806b = c(f0Var.f14796b);
        this.f14807c = c(f0Var.f14797c);
        this.f14808d = new int[size];
    }

    private static final double[] c(List list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i10 = 0; i10 < size; i10++) {
            dArr[i10] = ((Double) list.get(i10)).doubleValue();
        }
        return dArr;
    }

    public final List a() {
        ArrayList arrayList = new ArrayList(this.f14805a.length);
        int i10 = 0;
        while (true) {
            String[] strArr = this.f14805a;
            if (i10 >= strArr.length) {
                return arrayList;
            }
            String str = strArr[i10];
            double d10 = this.f14807c[i10];
            double d11 = this.f14806b[i10];
            int i11 = this.f14808d[i10];
            arrayList.add(new e0(str, d10, d11, ((double) i11) / ((double) this.f14809e), i11));
            i10++;
        }
    }

    public final void b(double d10) {
        this.f14809e++;
        int i10 = 0;
        while (true) {
            double[] dArr = this.f14807c;
            if (i10 < dArr.length) {
                double d11 = dArr[i10];
                if (d11 <= d10 && d10 < this.f14806b[i10]) {
                    int[] iArr = this.f14808d;
                    iArr[i10] = iArr[i10] + 1;
                }
                if (d10 >= d11) {
                    i10++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
