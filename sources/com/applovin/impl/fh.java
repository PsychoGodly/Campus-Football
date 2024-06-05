package com.applovin.impl;

import com.applovin.impl.ep;

public final class fh implements ep {

    /* renamed from: a  reason: collision with root package name */
    private final o7 f7787a;

    /* renamed from: b  reason: collision with root package name */
    private final xg f7788b = new xg(new byte[10]);

    /* renamed from: c  reason: collision with root package name */
    private int f7789c = 0;

    /* renamed from: d  reason: collision with root package name */
    private int f7790d;

    /* renamed from: e  reason: collision with root package name */
    private io f7791e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f7792f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f7793g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f7794h;

    /* renamed from: i  reason: collision with root package name */
    private int f7795i;

    /* renamed from: j  reason: collision with root package name */
    private int f7796j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f7797k;

    /* renamed from: l  reason: collision with root package name */
    private long f7798l;

    public fh(o7 o7Var) {
        this.f7787a = o7Var;
    }

    private boolean b() {
        this.f7788b.c(0);
        int a10 = this.f7788b.a(24);
        if (a10 != 1) {
            kc.d("PesReader", "Unexpected start code prefix: " + a10);
            this.f7796j = -1;
            return false;
        }
        this.f7788b.d(8);
        int a11 = this.f7788b.a(16);
        this.f7788b.d(5);
        this.f7797k = this.f7788b.f();
        this.f7788b.d(2);
        this.f7792f = this.f7788b.f();
        this.f7793g = this.f7788b.f();
        this.f7788b.d(6);
        int a12 = this.f7788b.a(8);
        this.f7795i = a12;
        if (a11 == 0) {
            this.f7796j = -1;
        } else {
            int i10 = (a11 - 3) - a12;
            this.f7796j = i10;
            if (i10 < 0) {
                kc.d("PesReader", "Found negative packet payload size: " + this.f7796j);
                this.f7796j = -1;
            }
        }
        return true;
    }

    private void c() {
        this.f7788b.c(0);
        this.f7798l = -9223372036854775807L;
        if (this.f7792f) {
            this.f7788b.d(4);
            this.f7788b.d(1);
            this.f7788b.d(1);
            long a10 = (((long) this.f7788b.a(3)) << 30) | ((long) (this.f7788b.a(15) << 15)) | ((long) this.f7788b.a(15));
            this.f7788b.d(1);
            if (!this.f7794h && this.f7793g) {
                this.f7788b.d(4);
                this.f7788b.d(1);
                this.f7788b.d(1);
                this.f7788b.d(1);
                this.f7791e.b((((long) this.f7788b.a(3)) << 30) | ((long) (this.f7788b.a(15) << 15)) | ((long) this.f7788b.a(15)));
                this.f7794h = true;
            }
            this.f7798l = this.f7791e.b(a10);
        }
    }

    public final void a(yg ygVar, int i10) {
        a1.b((Object) this.f7791e);
        if ((i10 & 1) != 0) {
            int i11 = this.f7789c;
            if (!(i11 == 0 || i11 == 1)) {
                if (i11 == 2) {
                    kc.d("PesReader", "Unexpected start indicator reading extended header");
                } else if (i11 == 3) {
                    if (this.f7796j != -1) {
                        kc.d("PesReader", "Unexpected start indicator: expected " + this.f7796j + " more bytes");
                    }
                    this.f7787a.b();
                } else {
                    throw new IllegalStateException();
                }
            }
            a(1);
        }
        while (ygVar.a() > 0) {
            int i12 = this.f7789c;
            if (i12 != 0) {
                int i13 = 0;
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (a(ygVar, this.f7788b.f13324a, Math.min(10, this.f7795i)) && a(ygVar, (byte[]) null, this.f7795i)) {
                            c();
                            if (this.f7797k) {
                                i13 = 4;
                            }
                            i10 |= i13;
                            this.f7787a.a(this.f7798l, i10);
                            a(3);
                        }
                    } else if (i12 == 3) {
                        int a10 = ygVar.a();
                        int i14 = this.f7796j;
                        if (i14 != -1) {
                            i13 = a10 - i14;
                        }
                        if (i13 > 0) {
                            a10 -= i13;
                            ygVar.e(ygVar.d() + a10);
                        }
                        this.f7787a.a(ygVar);
                        int i15 = this.f7796j;
                        if (i15 != -1) {
                            int i16 = i15 - a10;
                            this.f7796j = i16;
                            if (i16 == 0) {
                                this.f7787a.b();
                                a(1);
                            }
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.f7788b.f13324a, 9)) {
                    if (b()) {
                        i13 = 2;
                    }
                    a(i13);
                }
            } else {
                ygVar.g(ygVar.a());
            }
        }
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f7790d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            ygVar.g(min);
        } else {
            ygVar.a(bArr, this.f7790d, min);
        }
        int i11 = this.f7790d + min;
        this.f7790d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }

    public void a(io ioVar, k8 k8Var, ep.d dVar) {
        this.f7791e = ioVar;
        this.f7787a.a(k8Var, dVar);
    }

    public final void a() {
        this.f7789c = 0;
        this.f7790d = 0;
        this.f7794h = false;
        this.f7787a.a();
    }

    private void a(int i10) {
        this.f7789c = i10;
        this.f7790d = 0;
    }
}
