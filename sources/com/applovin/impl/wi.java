package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.ro;
import com.applovin.impl.xi;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

class wi {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f13064a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13065b;

    /* renamed from: c  reason: collision with root package name */
    private final yg f13066c = new yg(32);

    /* renamed from: d  reason: collision with root package name */
    private a f13067d;

    /* renamed from: e  reason: collision with root package name */
    private a f13068e;

    /* renamed from: f  reason: collision with root package name */
    private a f13069f;

    /* renamed from: g  reason: collision with root package name */
    private long f13070g;

    public wi(n0 n0Var) {
        this.f13064a = n0Var;
        int c10 = n0Var.c();
        this.f13065b = c10;
        a aVar = new a(0, c10);
        this.f13067d = aVar;
        this.f13068e = aVar;
        this.f13069f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f13073c) {
            a aVar2 = this.f13069f;
            int i10 = (aVar2.f13073c ? 1 : 0) + (((int) (aVar2.f13071a - aVar.f13071a)) / this.f13065b);
            m0[] m0VarArr = new m0[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                m0VarArr[i11] = aVar.f13074d;
                aVar = aVar.a();
            }
            this.f13064a.a(m0VarArr);
        }
    }

    private int b(int i10) {
        a aVar = this.f13069f;
        if (!aVar.f13073c) {
            aVar.a(this.f13064a.b(), new a(this.f13069f.f13072b, this.f13065b));
        }
        return Math.min(i10, (int) (this.f13069f.f13072b - this.f13070g));
    }

    public void c() {
        this.f13068e = this.f13067d;
    }

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f13071a;

        /* renamed from: b  reason: collision with root package name */
        public final long f13072b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f13073c;

        /* renamed from: d  reason: collision with root package name */
        public m0 f13074d;

        /* renamed from: e  reason: collision with root package name */
        public a f13075e;

        public a(long j10, int i10) {
            this.f13071a = j10;
            this.f13072b = j10 + ((long) i10);
        }

        public a a() {
            this.f13074d = null;
            a aVar = this.f13075e;
            this.f13075e = null;
            return aVar;
        }

        public void a(m0 m0Var, a aVar) {
            this.f13074d = m0Var;
            this.f13075e = aVar;
            this.f13073c = true;
        }

        public int a(long j10) {
            return ((int) (j10 - this.f13071a)) + this.f13074d.f9301b;
        }
    }

    private static a b(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        if (n5Var.h()) {
            aVar = a(aVar, n5Var, bVar, ygVar);
        }
        if (n5Var.c()) {
            ygVar.d(4);
            a a10 = a(aVar, bVar.f13403b, ygVar.c(), 4);
            int A = ygVar.A();
            bVar.f13403b += 4;
            bVar.f13402a -= 4;
            n5Var.g(A);
            a a11 = a(a10, bVar.f13403b, n5Var.f9906c, A);
            bVar.f13403b += (long) A;
            int i10 = bVar.f13402a - A;
            bVar.f13402a = i10;
            n5Var.h(i10);
            return a(a11, bVar.f13403b, n5Var.f9909g, bVar.f13402a);
        }
        n5Var.g(bVar.f13402a);
        return a(aVar, bVar.f13403b, n5Var.f9906c, bVar.f13402a);
    }

    public void a(long j10) {
        a aVar;
        if (j10 != -1) {
            while (true) {
                aVar = this.f13067d;
                if (j10 < aVar.f13072b) {
                    break;
                }
                this.f13064a.a(aVar.f13074d);
                this.f13067d = this.f13067d.a();
            }
            if (this.f13068e.f13071a < aVar.f13071a) {
                this.f13068e = aVar;
            }
        }
    }

    private static a a(a aVar, long j10) {
        while (j10 >= aVar.f13072b) {
            aVar = aVar.f13075e;
        }
        return aVar;
    }

    public long a() {
        return this.f13070g;
    }

    public void a(n5 n5Var, xi.b bVar) {
        b(this.f13068e, n5Var, bVar, this.f13066c);
    }

    private void a(int i10) {
        long j10 = this.f13070g + ((long) i10);
        this.f13070g = j10;
        a aVar = this.f13069f;
        if (j10 == aVar.f13072b) {
            this.f13069f = aVar.f13075e;
        }
    }

    private static a a(a aVar, long j10, ByteBuffer byteBuffer, int i10) {
        a a10 = a(aVar, j10);
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a10.f13072b - j10));
            byteBuffer.put(a10.f13074d.f9300a, a10.a(j10), min);
            i10 -= min;
            j10 += (long) min;
            if (j10 == a10.f13072b) {
                a10 = a10.f13075e;
            }
        }
        return a10;
    }

    public void b(n5 n5Var, xi.b bVar) {
        this.f13068e = b(this.f13068e, n5Var, bVar, this.f13066c);
    }

    private static a a(a aVar, long j10, byte[] bArr, int i10) {
        a a10 = a(aVar, j10);
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (a10.f13072b - j10));
            System.arraycopy(a10.f13074d.f9300a, a10.a(j10), bArr, i10 - i11, min);
            i11 -= min;
            j10 += (long) min;
            if (j10 == a10.f13072b) {
                a10 = a10.f13075e;
            }
        }
        return a10;
    }

    public void b() {
        a(this.f13067d);
        a aVar = new a(0, this.f13065b);
        this.f13067d = aVar;
        this.f13068e = aVar;
        this.f13069f = aVar;
        this.f13070g = 0;
        this.f13064a.a();
    }

    private static a a(a aVar, n5 n5Var, xi.b bVar, yg ygVar) {
        int i10;
        xi.b bVar2 = bVar;
        yg ygVar2 = ygVar;
        long j10 = bVar2.f13403b;
        ygVar2.d(1);
        a a10 = a(aVar, j10, ygVar.c(), 1);
        long j11 = j10 + 1;
        byte b10 = ygVar.c()[0];
        boolean z10 = (b10 & 128) != 0;
        byte b11 = b10 & Ascii.DEL;
        y4 y4Var = n5Var.f9905b;
        byte[] bArr = y4Var.f13500a;
        if (bArr == null) {
            y4Var.f13500a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a a11 = a(a10, j11, y4Var.f13500a, (int) b11);
        long j12 = j11 + ((long) b11);
        if (z10) {
            ygVar2.d(2);
            a11 = a(a11, j12, ygVar.c(), 2);
            j12 += 2;
            i10 = ygVar.C();
        } else {
            i10 = 1;
        }
        int[] iArr = y4Var.f13503d;
        if (iArr == null || iArr.length < i10) {
            iArr = new int[i10];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = y4Var.f13504e;
        if (iArr3 == null || iArr3.length < i10) {
            iArr3 = new int[i10];
        }
        int[] iArr4 = iArr3;
        if (z10) {
            int i11 = i10 * 6;
            ygVar2.d(i11);
            a11 = a(a11, j12, ygVar.c(), i11);
            j12 += (long) i11;
            ygVar2.f(0);
            for (int i12 = 0; i12 < i10; i12++) {
                iArr2[i12] = ygVar.C();
                iArr4[i12] = ygVar.A();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = bVar2.f13402a - ((int) (j12 - bVar2.f13403b));
        }
        ro.a aVar2 = (ro.a) yp.a((Object) bVar2.f13404c);
        y4Var.a(i10, iArr2, iArr4, aVar2.f11218b, y4Var.f13500a, aVar2.f11217a, aVar2.f11219c, aVar2.f11220d);
        long j13 = bVar2.f13403b;
        int i13 = (int) (j12 - j13);
        bVar2.f13403b = j13 + ((long) i13);
        bVar2.f13402a -= i13;
        return a11;
    }

    public int a(e5 e5Var, int i10, boolean z10) {
        int b10 = b(i10);
        a aVar = this.f13069f;
        int a10 = e5Var.a(aVar.f13074d.f9300a, aVar.a(this.f13070g), b10);
        if (a10 != -1) {
            a(a10);
            return a10;
        } else if (z10) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void a(yg ygVar, int i10) {
        while (i10 > 0) {
            int b10 = b(i10);
            a aVar = this.f13069f;
            ygVar.a(aVar.f13074d.f9300a, aVar.a(this.f13070g), b10);
            i10 -= b10;
            a(b10);
        }
    }
}
