package com.applovin.impl;

import android.graphics.Bitmap;
import com.applovin.impl.z4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

public final class gh extends bk {

    /* renamed from: o  reason: collision with root package name */
    private final yg f8019o = new yg();

    /* renamed from: p  reason: collision with root package name */
    private final yg f8020p = new yg();

    /* renamed from: q  reason: collision with root package name */
    private final a f8021q = new a();

    /* renamed from: r  reason: collision with root package name */
    private Inflater f8022r;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final yg f8023a = new yg();

        /* renamed from: b  reason: collision with root package name */
        private final int[] f8024b = new int[256];

        /* renamed from: c  reason: collision with root package name */
        private boolean f8025c;

        /* renamed from: d  reason: collision with root package name */
        private int f8026d;

        /* renamed from: e  reason: collision with root package name */
        private int f8027e;

        /* renamed from: f  reason: collision with root package name */
        private int f8028f;

        /* renamed from: g  reason: collision with root package name */
        private int f8029g;

        /* renamed from: h  reason: collision with root package name */
        private int f8030h;

        /* renamed from: i  reason: collision with root package name */
        private int f8031i;

        /* access modifiers changed from: private */
        public void b(yg ygVar, int i10) {
            if (i10 >= 19) {
                this.f8026d = ygVar.C();
                this.f8027e = ygVar.C();
                ygVar.g(11);
                this.f8028f = ygVar.C();
                this.f8029g = ygVar.C();
            }
        }

        /* access modifiers changed from: private */
        public void c(yg ygVar, int i10) {
            if (i10 % 5 == 2) {
                ygVar.g(2);
                Arrays.fill(this.f8024b, 0);
                int i11 = i10 / 5;
                for (int i12 = 0; i12 < i11; i12++) {
                    int w10 = ygVar.w();
                    int w11 = ygVar.w();
                    int w12 = ygVar.w();
                    int w13 = ygVar.w();
                    int w14 = ygVar.w();
                    double d10 = (double) w11;
                    double d11 = (double) (w12 - 128);
                    double d12 = (double) (w13 - 128);
                    this.f8024b[w10] = (yp.a((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (w14 << 24) | (yp.a((int) ((1.402d * d11) + d10), 0, 255) << 16) | yp.a((int) (d10 + (d12 * 1.772d)), 0, 255);
                }
                this.f8025c = true;
            }
        }

        public z4 a() {
            int i10;
            int i11;
            int i12;
            if (this.f8026d == 0 || this.f8027e == 0 || this.f8030h == 0 || this.f8031i == 0 || this.f8023a.e() == 0 || this.f8023a.d() != this.f8023a.e() || !this.f8025c) {
                return null;
            }
            this.f8023a.f(0);
            int i13 = this.f8030h * this.f8031i;
            int[] iArr = new int[i13];
            int i14 = 0;
            while (i14 < i13) {
                int w10 = this.f8023a.w();
                if (w10 != 0) {
                    i12 = i14 + 1;
                    iArr[i14] = this.f8024b[w10];
                } else {
                    int w11 = this.f8023a.w();
                    if (w11 != 0) {
                        if ((w11 & 64) == 0) {
                            i10 = w11 & 63;
                        } else {
                            i10 = ((w11 & 63) << 8) | this.f8023a.w();
                        }
                        if ((w11 & 128) == 0) {
                            i11 = 0;
                        } else {
                            i11 = this.f8024b[this.f8023a.w()];
                        }
                        i12 = i10 + i14;
                        Arrays.fill(iArr, i14, i12, i11);
                    }
                }
                i14 = i12;
            }
            return new z4.b().a(Bitmap.createBitmap(iArr, this.f8030h, this.f8031i, Bitmap.Config.ARGB_8888)).b(((float) this.f8028f) / ((float) this.f8026d)).b(0).a(((float) this.f8029g) / ((float) this.f8027e), 0).a(0).d(((float) this.f8030h) / ((float) this.f8026d)).a(((float) this.f8031i) / ((float) this.f8027e)).a();
        }

        public void b() {
            this.f8026d = 0;
            this.f8027e = 0;
            this.f8028f = 0;
            this.f8029g = 0;
            this.f8030h = 0;
            this.f8031i = 0;
            this.f8023a.d(0);
            this.f8025c = false;
        }

        /* access modifiers changed from: private */
        public void a(yg ygVar, int i10) {
            int z10;
            if (i10 >= 4) {
                ygVar.g(3);
                int i11 = i10 - 4;
                if ((ygVar.w() & 128) != 0) {
                    if (i11 >= 7 && (z10 = ygVar.z()) >= 4) {
                        this.f8030h = ygVar.C();
                        this.f8031i = ygVar.C();
                        this.f8023a.d(z10 - 4);
                        i11 = i10 - 11;
                    } else {
                        return;
                    }
                }
                int d10 = this.f8023a.d();
                int e10 = this.f8023a.e();
                if (d10 < e10 && i11 > 0) {
                    int min = Math.min(i11, e10 - d10);
                    ygVar.a(this.f8023a.c(), d10, min);
                    this.f8023a.f(d10 + min);
                }
            }
        }
    }

    public gh() {
        super("PgsDecoder");
    }

    /* access modifiers changed from: protected */
    public kl a(byte[] bArr, int i10, boolean z10) {
        this.f8019o.a(bArr, i10);
        a(this.f8019o);
        this.f8021q.b();
        ArrayList arrayList = new ArrayList();
        while (this.f8019o.a() >= 3) {
            z4 a10 = a(this.f8019o, this.f8021q);
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        return new hh(Collections.unmodifiableList(arrayList));
    }

    private void a(yg ygVar) {
        if (ygVar.a() > 0 && ygVar.g() == 120) {
            if (this.f8022r == null) {
                this.f8022r = new Inflater();
            }
            if (yp.a(ygVar, this.f8020p, this.f8022r)) {
                ygVar.a(this.f8020p.c(), this.f8020p.e());
            }
        }
    }

    private static z4 a(yg ygVar, a aVar) {
        int e10 = ygVar.e();
        int w10 = ygVar.w();
        int C = ygVar.C();
        int d10 = ygVar.d() + C;
        z4 z4Var = null;
        if (d10 > e10) {
            ygVar.f(e10);
            return null;
        }
        if (w10 != 128) {
            switch (w10) {
                case 20:
                    aVar.c(ygVar, C);
                    break;
                case 21:
                    aVar.a(ygVar, C);
                    break;
                case 22:
                    aVar.b(ygVar, C);
                    break;
            }
        } else {
            z4Var = aVar.a();
            aVar.b();
        }
        ygVar.f(d10);
        return z4Var;
    }
}
