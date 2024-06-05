package com.applovin.impl;

import java.util.Arrays;

public abstract class e2 implements f8 {

    /* renamed from: a  reason: collision with root package name */
    protected final po f7352a;

    /* renamed from: b  reason: collision with root package name */
    protected final int f7353b;

    /* renamed from: c  reason: collision with root package name */
    protected final int[] f7354c;

    /* renamed from: d  reason: collision with root package name */
    private final int f7355d;

    /* renamed from: e  reason: collision with root package name */
    private final d9[] f7356e;

    /* renamed from: f  reason: collision with root package name */
    private final long[] f7357f;

    /* renamed from: g  reason: collision with root package name */
    private int f7358g;

    public e2(po poVar, int[] iArr, int i10) {
        int i11 = 0;
        a1.b(iArr.length > 0);
        this.f7355d = i10;
        this.f7352a = (po) a1.a((Object) poVar);
        int length = iArr.length;
        this.f7353b = length;
        this.f7356e = new d9[length];
        for (int i12 = 0; i12 < iArr.length; i12++) {
            this.f7356e[i12] = poVar.a(iArr[i12]);
        }
        Arrays.sort(this.f7356e, hw.f8373a);
        this.f7354c = new int[this.f7353b];
        while (true) {
            int i13 = this.f7353b;
            if (i11 < i13) {
                this.f7354c[i11] = poVar.a(this.f7356e[i11]);
                i11++;
            } else {
                this.f7357f = new long[i13];
                return;
            }
        }
    }

    public final d9 a(int i10) {
        return this.f7356e[i10];
    }

    public void a(float f10) {
    }

    public /* synthetic */ void a(boolean z10) {
        xw.a(this, z10);
    }

    public final int b(int i10) {
        return this.f7354c[i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e2 e2Var = (e2) obj;
        if (this.f7352a != e2Var.f7352a || !Arrays.equals(this.f7354c, e2Var.f7354c)) {
            return false;
        }
        return true;
    }

    public void f() {
    }

    public final d9 g() {
        return this.f7356e[h()];
    }

    public int hashCode() {
        if (this.f7358g == 0) {
            this.f7358g = (System.identityHashCode(this.f7352a) * 31) + Arrays.hashCode(this.f7354c);
        }
        return this.f7358g;
    }

    public void i() {
    }

    public /* synthetic */ void j() {
        xw.b(this);
    }

    public /* synthetic */ void k() {
        xw.c(this);
    }

    public final po a() {
        return this.f7352a;
    }

    public final int b() {
        return this.f7354c.length;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int a(d9 d9Var, d9 d9Var2) {
        return d9Var2.f7149i - d9Var.f7149i;
    }
}
