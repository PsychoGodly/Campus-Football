package com.applovin.impl;

import com.applovin.mediation.MaxReward;
import java.util.ArrayDeque;

final class y5 implements n7 {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f13514a = new byte[8];

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque f13515b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final aq f13516c = new aq();

    /* renamed from: d  reason: collision with root package name */
    private m7 f13517d;

    /* renamed from: e  reason: collision with root package name */
    private int f13518e;

    /* renamed from: f  reason: collision with root package name */
    private int f13519f;

    /* renamed from: g  reason: collision with root package name */
    private long f13520g;

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f13521a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final long f13522b;

        private b(int i10, long j10) {
            this.f13521a = i10;
            this.f13522b = j10;
        }
    }

    private long b(j8 j8Var) {
        j8Var.b();
        while (true) {
            j8Var.c(this.f13514a, 0, 4);
            int a10 = aq.a(this.f13514a[0]);
            if (a10 != -1 && a10 <= 4) {
                int a11 = (int) aq.a(this.f13514a, a10, false);
                if (this.f13517d.c(a11)) {
                    j8Var.a(a10);
                    return (long) a11;
                }
            }
            j8Var.a(1);
        }
    }

    private static String c(j8 j8Var, int i10) {
        if (i10 == 0) {
            return MaxReward.DEFAULT_LABEL;
        }
        byte[] bArr = new byte[i10];
        j8Var.d(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public void a(m7 m7Var) {
        this.f13517d = m7Var;
    }

    public void reset() {
        this.f13518e = 0;
        this.f13515b.clear();
        this.f13516c.b();
    }

    public boolean a(j8 j8Var) {
        a1.b((Object) this.f13517d);
        while (true) {
            b bVar = (b) this.f13515b.peek();
            if (bVar == null || j8Var.f() < bVar.f13522b) {
                if (this.f13518e == 0) {
                    long a10 = this.f13516c.a(j8Var, true, false, 4);
                    if (a10 == -2) {
                        a10 = b(j8Var);
                    }
                    if (a10 == -1) {
                        return false;
                    }
                    this.f13519f = (int) a10;
                    this.f13518e = 1;
                }
                if (this.f13518e == 1) {
                    this.f13520g = this.f13516c.a(j8Var, false, true, 8);
                    this.f13518e = 2;
                }
                int b10 = this.f13517d.b(this.f13519f);
                if (b10 == 0) {
                    j8Var.a((int) this.f13520g);
                    this.f13518e = 0;
                } else if (b10 == 1) {
                    long f10 = j8Var.f();
                    this.f13515b.push(new b(this.f13519f, this.f13520g + f10));
                    this.f13517d.a(this.f13519f, f10, this.f13520g);
                    this.f13518e = 0;
                    return true;
                } else if (b10 == 2) {
                    long j10 = this.f13520g;
                    if (j10 <= 8) {
                        this.f13517d.a(this.f13519f, b(j8Var, (int) j10));
                        this.f13518e = 0;
                        return true;
                    }
                    throw ah.a("Invalid integer size: " + this.f13520g, (Throwable) null);
                } else if (b10 == 3) {
                    long j11 = this.f13520g;
                    if (j11 <= 2147483647L) {
                        this.f13517d.a(this.f13519f, c(j8Var, (int) j11));
                        this.f13518e = 0;
                        return true;
                    }
                    throw ah.a("String element size: " + this.f13520g, (Throwable) null);
                } else if (b10 == 4) {
                    this.f13517d.a(this.f13519f, (int) this.f13520g, j8Var);
                    this.f13518e = 0;
                    return true;
                } else if (b10 == 5) {
                    long j12 = this.f13520g;
                    if (j12 == 4 || j12 == 8) {
                        this.f13517d.a(this.f13519f, a(j8Var, (int) j12));
                        this.f13518e = 0;
                        return true;
                    }
                    throw ah.a("Invalid float size: " + this.f13520g, (Throwable) null);
                } else {
                    throw ah.a("Invalid element type " + b10, (Throwable) null);
                }
            } else {
                this.f13517d.a(((b) this.f13515b.pop()).f13521a);
                return true;
            }
        }
    }

    private long b(j8 j8Var, int i10) {
        j8Var.d(this.f13514a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f13514a[i11] & 255));
        }
        return j10;
    }

    private double a(j8 j8Var, int i10) {
        long b10 = b(j8Var, i10);
        if (i10 == 4) {
            return (double) Float.intBitsToFloat((int) b10);
        }
        return Double.longBitsToDouble(b10);
    }
}
