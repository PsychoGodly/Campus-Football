package com.applovin.impl;

import com.applovin.impl.ep;
import com.applovin.impl.ro;

public final class c7 implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final yg f6869a = new yg(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f6870b;

    /* renamed from: c  reason: collision with root package name */
    private String f6871c;

    /* renamed from: d  reason: collision with root package name */
    private ro f6872d;

    /* renamed from: e  reason: collision with root package name */
    private int f6873e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f6874f;

    /* renamed from: g  reason: collision with root package name */
    private int f6875g;

    /* renamed from: h  reason: collision with root package name */
    private long f6876h;

    /* renamed from: i  reason: collision with root package name */
    private d9 f6877i;

    /* renamed from: j  reason: collision with root package name */
    private int f6878j;

    /* renamed from: k  reason: collision with root package name */
    private long f6879k = -9223372036854775807L;

    public c7(String str) {
        this.f6870b = str;
    }

    private boolean b(yg ygVar) {
        while (ygVar.a() > 0) {
            int i10 = this.f6875g << 8;
            this.f6875g = i10;
            int w10 = i10 | ygVar.w();
            this.f6875g = w10;
            if (d7.a(w10)) {
                byte[] c10 = this.f6869a.c();
                int i11 = this.f6875g;
                c10[0] = (byte) ((i11 >> 24) & 255);
                c10[1] = (byte) ((i11 >> 16) & 255);
                c10[2] = (byte) ((i11 >> 8) & 255);
                c10[3] = (byte) (i11 & 255);
                this.f6874f = 4;
                this.f6875g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] c10 = this.f6869a.c();
        if (this.f6877i == null) {
            d9 a10 = d7.a(c10, this.f6871c, this.f6870b, (w6) null);
            this.f6877i = a10;
            this.f6872d.a(a10);
        }
        this.f6878j = d7.a(c10);
        this.f6876h = (long) ((int) ((((long) d7.d(c10)) * 1000000) / ((long) this.f6877i.A)));
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f6872d);
        while (ygVar.a() > 0) {
            int i10 = this.f6873e;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f6878j - this.f6874f);
                        this.f6872d.a(ygVar, min);
                        int i11 = this.f6874f + min;
                        this.f6874f = i11;
                        int i12 = this.f6878j;
                        if (i11 == i12) {
                            long j10 = this.f6879k;
                            if (j10 != -9223372036854775807L) {
                                this.f6872d.a(j10, 1, i12, 0, (ro.a) null);
                                this.f6879k += this.f6876h;
                            }
                            this.f6873e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(ygVar, this.f6869a.c(), 18)) {
                    c();
                    this.f6869a.f(0);
                    this.f6872d.a(this.f6869a, 18);
                    this.f6873e = 2;
                }
            } else if (b(ygVar)) {
                this.f6873e = 1;
            }
        }
    }

    public void b() {
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f6874f);
        ygVar.a(bArr, this.f6874f, min);
        int i11 = this.f6874f + min;
        this.f6874f = i11;
        return i11 == i10;
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f6871c = dVar.b();
        this.f6872d = k8Var.a(dVar.c(), 1);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f6879k = j10;
        }
    }

    public void a() {
        this.f6873e = 0;
        this.f6874f = 0;
        this.f6875g = 0;
        this.f6879k = -9223372036854775807L;
    }
}
