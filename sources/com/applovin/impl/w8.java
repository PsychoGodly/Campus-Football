package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.impl.dl;
import com.applovin.impl.y8;
import java.util.Arrays;

final class w8 extends dl {

    /* renamed from: n  reason: collision with root package name */
    private y8 f13021n;

    /* renamed from: o  reason: collision with root package name */
    private a f13022o;

    w8() {
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int b(yg ygVar) {
        int i10 = (ygVar.c()[2] & 255) >> 4;
        if (i10 == 6 || i10 == 7) {
            ygVar.g(4);
            ygVar.D();
        }
        int b10 = u8.b(ygVar, i10);
        ygVar.f(0);
        return b10;
    }

    public static boolean c(yg ygVar) {
        return ygVar.a() >= 5 && ygVar.w() == 127 && ygVar.y() == 1179402563;
    }

    private static final class a implements gg {

        /* renamed from: a  reason: collision with root package name */
        private y8 f13023a;

        /* renamed from: b  reason: collision with root package name */
        private y8.a f13024b;

        /* renamed from: c  reason: collision with root package name */
        private long f13025c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f13026d = -1;

        public a(y8 y8Var, y8.a aVar) {
            this.f13023a = y8Var;
            this.f13024b = aVar;
        }

        public ej a() {
            a1.b(this.f13025c != -1);
            return new x8(this.f13023a, this.f13025c);
        }

        public void b(long j10) {
            this.f13025c = j10;
        }

        public long a(j8 j8Var) {
            long j10 = this.f13026d;
            if (j10 < 0) {
                return -1;
            }
            long j11 = -(j10 + 2);
            this.f13026d = -1;
            return j11;
        }

        public void a(long j10) {
            long[] jArr = this.f13024b.f13551a;
            this.f13026d = jArr[yp.b(jArr, j10, true, true)];
        }
    }

    /* access modifiers changed from: protected */
    public long a(yg ygVar) {
        if (!a(ygVar.c())) {
            return -1;
        }
        return (long) b(ygVar);
    }

    /* access modifiers changed from: protected */
    public boolean a(yg ygVar, long j10, dl.b bVar) {
        byte[] c10 = ygVar.c();
        y8 y8Var = this.f13021n;
        if (y8Var == null) {
            y8 y8Var2 = new y8(c10, 17);
            this.f13021n = y8Var2;
            bVar.f7284a = y8Var2.a(Arrays.copyOfRange(c10, 9, ygVar.e()), (we) null);
            return true;
        } else if ((c10[0] & Ascii.DEL) == 3) {
            y8.a a10 = v8.a(ygVar);
            y8 a11 = y8Var.a(a10);
            this.f13021n = a11;
            this.f13022o = new a(a11, a10);
            return true;
        } else if (!a(c10)) {
            return true;
        } else {
            a aVar = this.f13022o;
            if (aVar != null) {
                aVar.b(j10);
                bVar.f7285b = this.f13022o;
            }
            a1.a((Object) bVar.f7284a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public void a(boolean z10) {
        super.a(z10);
        if (z10) {
            this.f13021n = null;
            this.f13022o = null;
        }
    }
}
