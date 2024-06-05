package com.applovin.impl;

import com.applovin.impl.d9;
import com.applovin.impl.ep;
import com.applovin.impl.n;
import com.applovin.impl.ro;

public final class m implements o7 {

    /* renamed from: a  reason: collision with root package name */
    private final xg f9287a;

    /* renamed from: b  reason: collision with root package name */
    private final yg f9288b;

    /* renamed from: c  reason: collision with root package name */
    private final String f9289c;

    /* renamed from: d  reason: collision with root package name */
    private String f9290d;

    /* renamed from: e  reason: collision with root package name */
    private ro f9291e;

    /* renamed from: f  reason: collision with root package name */
    private int f9292f;

    /* renamed from: g  reason: collision with root package name */
    private int f9293g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f9294h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f9295i;

    /* renamed from: j  reason: collision with root package name */
    private long f9296j;

    /* renamed from: k  reason: collision with root package name */
    private d9 f9297k;

    /* renamed from: l  reason: collision with root package name */
    private int f9298l;

    /* renamed from: m  reason: collision with root package name */
    private long f9299m;

    public m() {
        this((String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.impl.yg r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f9294h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.w()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f9294h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.w()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f9294h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.f9295i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.m.b(com.applovin.impl.yg):boolean");
    }

    private void c() {
        this.f9287a.c(0);
        n.b a10 = n.a(this.f9287a);
        d9 d9Var = this.f9297k;
        if (d9Var == null || a10.f9872c != d9Var.f7166z || a10.f9871b != d9Var.A || !"audio/ac4".equals(d9Var.f7153m)) {
            d9 a11 = new d9.b().c(this.f9290d).f("audio/ac4").c(a10.f9872c).n(a10.f9871b).e(this.f9289c).a();
            this.f9297k = a11;
            this.f9291e.a(a11);
        }
        this.f9298l = a10.f9873d;
        this.f9296j = (((long) a10.f9874e) * 1000000) / ((long) this.f9297k.A);
    }

    public void a(yg ygVar) {
        a1.b((Object) this.f9291e);
        while (ygVar.a() > 0) {
            int i10 = this.f9292f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int min = Math.min(ygVar.a(), this.f9298l - this.f9293g);
                        this.f9291e.a(ygVar, min);
                        int i11 = this.f9293g + min;
                        this.f9293g = i11;
                        int i12 = this.f9298l;
                        if (i11 == i12) {
                            long j10 = this.f9299m;
                            if (j10 != -9223372036854775807L) {
                                this.f9291e.a(j10, 1, i12, 0, (ro.a) null);
                                this.f9299m += this.f9296j;
                            }
                            this.f9292f = 0;
                        }
                    }
                } else if (a(ygVar, this.f9288b.c(), 16)) {
                    c();
                    this.f9288b.f(0);
                    this.f9291e.a(this.f9288b, 16);
                    this.f9292f = 2;
                }
            } else if (b(ygVar)) {
                this.f9292f = 1;
                this.f9288b.c()[0] = -84;
                this.f9288b.c()[1] = (byte) (this.f9295i ? 65 : 64);
                this.f9293g = 2;
            }
        }
    }

    public void b() {
    }

    public m(String str) {
        xg xgVar = new xg(new byte[16]);
        this.f9287a = xgVar;
        this.f9288b = new yg(xgVar.f13324a);
        this.f9292f = 0;
        this.f9293g = 0;
        this.f9294h = false;
        this.f9295i = false;
        this.f9299m = -9223372036854775807L;
        this.f9289c = str;
    }

    private boolean a(yg ygVar, byte[] bArr, int i10) {
        int min = Math.min(ygVar.a(), i10 - this.f9293g);
        ygVar.a(bArr, this.f9293g, min);
        int i11 = this.f9293g + min;
        this.f9293g = i11;
        return i11 == i10;
    }

    public void a(k8 k8Var, ep.d dVar) {
        dVar.a();
        this.f9290d = dVar.b();
        this.f9291e = k8Var.a(dVar.c(), 1);
    }

    public void a(long j10, int i10) {
        if (j10 != -9223372036854775807L) {
            this.f9299m = j10;
        }
    }

    public void a() {
        this.f9292f = 0;
        this.f9293g = 0;
        this.f9294h = false;
        this.f9295i = false;
        this.f9299m = -9223372036854775807L;
    }
}
