package com.applovin.impl;

import java.util.Arrays;

public final class p5 implements n0 {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10577a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10578b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f10579c;

    /* renamed from: d  reason: collision with root package name */
    private final m0[] f10580d;

    /* renamed from: e  reason: collision with root package name */
    private int f10581e;

    /* renamed from: f  reason: collision with root package name */
    private int f10582f;

    /* renamed from: g  reason: collision with root package name */
    private int f10583g;

    /* renamed from: h  reason: collision with root package name */
    private m0[] f10584h;

    public p5(boolean z10, int i10) {
        this(z10, i10, 0);
    }

    public synchronized void a(m0 m0Var) {
        m0[] m0VarArr = this.f10580d;
        m0VarArr[0] = m0Var;
        a(m0VarArr);
    }

    public synchronized m0 b() {
        m0 m0Var;
        this.f10582f++;
        int i10 = this.f10583g;
        if (i10 > 0) {
            m0[] m0VarArr = this.f10584h;
            int i11 = i10 - 1;
            this.f10583g = i11;
            m0Var = (m0) a1.a((Object) m0VarArr[i11]);
            this.f10584h[this.f10583g] = null;
        } else {
            m0Var = new m0(new byte[this.f10578b], 0);
        }
        return m0Var;
    }

    public int c() {
        return this.f10578b;
    }

    public synchronized int d() {
        return this.f10582f * this.f10578b;
    }

    public synchronized void e() {
        if (this.f10577a) {
            a(0);
        }
    }

    public p5(boolean z10, int i10, int i11) {
        a1.a(i10 > 0);
        a1.a(i11 >= 0);
        this.f10577a = z10;
        this.f10578b = i10;
        this.f10583g = i11;
        this.f10584h = new m0[(i11 + 100)];
        if (i11 > 0) {
            this.f10579c = new byte[(i11 * i10)];
            for (int i12 = 0; i12 < i11; i12++) {
                this.f10584h[i12] = new m0(this.f10579c, i12 * i10);
            }
        } else {
            this.f10579c = null;
        }
        this.f10580d = new m0[1];
    }

    public synchronized void a(m0[] m0VarArr) {
        int i10 = this.f10583g;
        int length = m0VarArr.length + i10;
        m0[] m0VarArr2 = this.f10584h;
        if (length >= m0VarArr2.length) {
            this.f10584h = (m0[]) Arrays.copyOf(m0VarArr2, Math.max(m0VarArr2.length * 2, i10 + m0VarArr.length));
        }
        for (m0 m0Var : m0VarArr) {
            m0[] m0VarArr3 = this.f10584h;
            int i11 = this.f10583g;
            this.f10583g = i11 + 1;
            m0VarArr3[i11] = m0Var;
        }
        this.f10582f -= m0VarArr.length;
        notifyAll();
    }

    public synchronized void a(int i10) {
        boolean z10 = i10 < this.f10581e;
        this.f10581e = i10;
        if (z10) {
            a();
        }
    }

    public synchronized void a() {
        int i10 = 0;
        int max = Math.max(0, yp.a(this.f10581e, this.f10578b) - this.f10582f);
        int i11 = this.f10583g;
        if (max < i11) {
            if (this.f10579c != null) {
                int i12 = i11 - 1;
                while (i10 <= i12) {
                    m0 m0Var = (m0) a1.a((Object) this.f10584h[i10]);
                    if (m0Var.f9300a == this.f10579c) {
                        i10++;
                    } else {
                        m0 m0Var2 = (m0) a1.a((Object) this.f10584h[i12]);
                        if (m0Var2.f9300a != this.f10579c) {
                            i12--;
                        } else {
                            m0[] m0VarArr = this.f10584h;
                            m0VarArr[i10] = m0Var2;
                            m0VarArr[i12] = m0Var;
                            i12--;
                            i10++;
                        }
                    }
                }
                max = Math.max(max, i10);
                if (max >= this.f10583g) {
                    return;
                }
            }
            Arrays.fill(this.f10584h, max, this.f10583g, (Object) null);
            this.f10583g = max;
        }
    }
}
