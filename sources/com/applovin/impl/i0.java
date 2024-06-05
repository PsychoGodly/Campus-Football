package com.applovin.impl;

import com.applovin.impl.ab;
import com.applovin.impl.f8;
import com.applovin.impl.wd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class i0 extends e2 {

    /* renamed from: h  reason: collision with root package name */
    private final x1 f8382h;

    /* renamed from: i  reason: collision with root package name */
    private final long f8383i;

    /* renamed from: j  reason: collision with root package name */
    private final long f8384j;

    /* renamed from: k  reason: collision with root package name */
    private final long f8385k;

    /* renamed from: l  reason: collision with root package name */
    private final float f8386l;

    /* renamed from: m  reason: collision with root package name */
    private final float f8387m;

    /* renamed from: n  reason: collision with root package name */
    private final ab f8388n;

    /* renamed from: o  reason: collision with root package name */
    private final j3 f8389o;

    /* renamed from: p  reason: collision with root package name */
    private float f8390p;

    /* renamed from: q  reason: collision with root package name */
    private int f8391q;

    /* renamed from: r  reason: collision with root package name */
    private int f8392r;

    /* renamed from: s  reason: collision with root package name */
    private long f8393s;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f8394a;

        /* renamed from: b  reason: collision with root package name */
        public final long f8395b;

        public a(long j10, long j11) {
            this.f8394a = j10;
            this.f8395b = j11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f8394a == aVar.f8394a && this.f8395b == aVar.f8395b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f8394a) * 31) + ((int) this.f8395b);
        }
    }

    public static class b implements f8.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f8396a;

        /* renamed from: b  reason: collision with root package name */
        private final int f8397b;

        /* renamed from: c  reason: collision with root package name */
        private final int f8398c;

        /* renamed from: d  reason: collision with root package name */
        private final float f8399d;

        /* renamed from: e  reason: collision with root package name */
        private final float f8400e;

        /* renamed from: f  reason: collision with root package name */
        private final j3 f8401f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, j3.f8666a);
        }

        public final f8[] a(f8.a[] aVarArr, x1 x1Var, wd.a aVar, go goVar) {
            f8 f8Var;
            ab a10 = i0.b(aVarArr);
            f8[] f8VarArr = new f8[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                f8.a aVar2 = aVarArr[i10];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f7649b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            f8Var = new r8(aVar2.f7648a, iArr[0], aVar2.f7650c);
                        } else {
                            f8Var = a(aVar2.f7648a, iArr, aVar2.f7650c, x1Var, (ab) a10.get(i10));
                        }
                        f8VarArr[i10] = f8Var;
                    }
                }
            }
            return f8VarArr;
        }

        public b(int i10, int i11, int i12, float f10, float f11, j3 j3Var) {
            this.f8396a = i10;
            this.f8397b = i11;
            this.f8398c = i12;
            this.f8399d = f10;
            this.f8400e = f11;
            this.f8401f = j3Var;
        }

        /* access modifiers changed from: protected */
        public i0 a(po poVar, int[] iArr, int i10, x1 x1Var, ab abVar) {
            return new i0(poVar, iArr, i10, x1Var, (long) this.f8396a, (long) this.f8397b, (long) this.f8398c, this.f8399d, this.f8400e, abVar, this.f8401f);
        }
    }

    protected i0(po poVar, int[] iArr, int i10, x1 x1Var, long j10, long j11, long j12, float f10, float f11, List list, j3 j3Var) {
        super(poVar, iArr, i10);
        if (j12 < j10) {
            kc.d("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j12 = j10;
        }
        this.f8382h = x1Var;
        this.f8383i = j10 * 1000;
        this.f8384j = j11 * 1000;
        this.f8385k = j12 * 1000;
        this.f8386l = f10;
        this.f8387m = f11;
        this.f8388n = ab.a((Collection) list);
        this.f8389o = j3Var;
        this.f8390p = 1.0f;
        this.f8392r = 0;
        this.f8393s = -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    public static ab b(f8.a[] aVarArr) {
        ArrayList arrayList = new ArrayList();
        for (f8.a aVar : aVarArr) {
            if (aVar == null || aVar.f7649b.length <= 1) {
                arrayList.add((Object) null);
            } else {
                ab.a f10 = ab.f();
                f10.b(new a(0, 0));
                arrayList.add(f10);
            }
        }
        long[][] c10 = c(aVarArr);
        int[] iArr = new int[c10.length];
        long[] jArr = new long[c10.length];
        for (int i10 = 0; i10 < c10.length; i10++) {
            long[] jArr2 = c10[i10];
            jArr[i10] = jArr2.length == 0 ? 0 : jArr2[0];
        }
        a(arrayList, jArr);
        ab a10 = a(c10);
        for (int i11 = 0; i11 < a10.size(); i11++) {
            int intValue = ((Integer) a10.get(i11)).intValue();
            int i12 = iArr[intValue] + 1;
            iArr[intValue] = i12;
            jArr[intValue] = c10[intValue][i12];
            a(arrayList, jArr);
        }
        for (int i13 = 0; i13 < aVarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr[i13] = jArr[i13] * 2;
            }
        }
        a(arrayList, jArr);
        ab.a f11 = ab.f();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            ab.a aVar2 = (ab.a) arrayList.get(i14);
            f11.b(aVar2 == null ? ab.h() : aVar2.a());
        }
        return f11.a();
    }

    private static long[][] c(f8.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            f8.a aVar = aVarArr[i10];
            if (aVar == null) {
                jArr[i10] = new long[0];
            } else {
                jArr[i10] = new long[aVar.f7649b.length];
                int i11 = 0;
                while (true) {
                    int[] iArr = aVar.f7649b;
                    if (i11 >= iArr.length) {
                        break;
                    }
                    jArr[i10][i11] = (long) aVar.f7648a.a(iArr[i11]).f7149i;
                    i11++;
                }
                Arrays.sort(jArr[i10]);
            }
        }
        return jArr;
    }

    public void f() {
    }

    public int h() {
        return this.f8391q;
    }

    public void i() {
        this.f8393s = -9223372036854775807L;
    }

    private static void a(List list, long[] jArr) {
        long j10 = 0;
        for (long j11 : jArr) {
            j10 += j11;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            ab.a aVar = (ab.a) list.get(i10);
            if (aVar != null) {
                aVar.b(new a(j10, jArr[i10]));
            }
        }
    }

    public void a(float f10) {
        this.f8390p = f10;
    }

    private static ab a(long[][] jArr) {
        double d10;
        ac b10 = rf.a().a().b();
        for (int i10 = 0; i10 < jArr.length; i10++) {
            long[] jArr2 = jArr[i10];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i11 = 0;
                while (true) {
                    long[] jArr3 = jArr[i10];
                    double d11 = 0.0d;
                    if (i11 >= jArr3.length) {
                        break;
                    }
                    long j10 = jArr3[i11];
                    if (j10 != -1) {
                        d11 = Math.log((double) j10);
                    }
                    dArr[i11] = d11;
                    i11++;
                }
                int i12 = length - 1;
                double d12 = dArr[i12] - dArr[0];
                int i13 = 0;
                while (i13 < i12) {
                    double d13 = dArr[i13];
                    i13++;
                    double d14 = (d13 + dArr[i13]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    b10.put(Double.valueOf(d10), Integer.valueOf(i10));
                }
            }
        }
        return ab.a(b10.values());
    }
}
