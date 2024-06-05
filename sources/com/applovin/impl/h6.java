package com.applovin.impl;

import com.applovin.impl.ej;
import java.io.EOFException;
import java.io.IOException;

final class h6 implements gg {

    /* renamed from: a  reason: collision with root package name */
    private final fg f8232a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final long f8233b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final long f8234c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final dl f8235d;

    /* renamed from: e  reason: collision with root package name */
    private int f8236e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public long f8237f;

    /* renamed from: g  reason: collision with root package name */
    private long f8238g;

    /* renamed from: h  reason: collision with root package name */
    private long f8239h;

    /* renamed from: i  reason: collision with root package name */
    private long f8240i;

    /* renamed from: j  reason: collision with root package name */
    private long f8241j;

    /* renamed from: k  reason: collision with root package name */
    private long f8242k;

    /* renamed from: l  reason: collision with root package name */
    private long f8243l;

    private final class b implements ej {
        private b() {
        }

        public ej.a b(long j10) {
            return new ej.a(new gj(j10, yp.b((h6.this.f8233b + ((h6.this.f8235d.b(j10) * (h6.this.f8234c - h6.this.f8233b)) / h6.this.f8237f)) - 30000, h6.this.f8233b, h6.this.f8234c - 1)));
        }

        public boolean b() {
            return true;
        }

        public long d() {
            return h6.this.f8235d.a(h6.this.f8237f);
        }
    }

    public h6(dl dlVar, long j10, long j11, long j12, long j13, boolean z10) {
        a1.a(j10 >= 0 && j11 > j10);
        this.f8235d = dlVar;
        this.f8233b = j10;
        this.f8234c = j11;
        if (j12 == j11 - j10 || z10) {
            this.f8237f = j13;
            this.f8236e = 4;
        } else {
            this.f8236e = 0;
        }
        this.f8232a = new fg();
    }

    private void d(j8 j8Var) {
        while (true) {
            this.f8232a.a(j8Var);
            this.f8232a.a(j8Var, false);
            fg fgVar = this.f8232a;
            if (fgVar.f7778c > this.f8239h) {
                j8Var.b();
                return;
            }
            j8Var.a(fgVar.f7783h + fgVar.f7784i);
            this.f8240i = j8Var.f();
            this.f8242k = this.f8232a.f7778c;
        }
    }

    /* renamed from: b */
    public b a() {
        if (this.f8237f != 0) {
            return new b();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public long c(j8 j8Var) {
        this.f8232a.a();
        if (this.f8232a.a(j8Var)) {
            this.f8232a.a(j8Var, false);
            fg fgVar = this.f8232a;
            j8Var.a(fgVar.f7783h + fgVar.f7784i);
            long j10 = this.f8232a.f7778c;
            while (true) {
                fg fgVar2 = this.f8232a;
                if ((fgVar2.f7777b & 4) == 4 || !fgVar2.a(j8Var) || j8Var.f() >= this.f8234c || !this.f8232a.a(j8Var, true)) {
                    break;
                }
                fg fgVar3 = this.f8232a;
                if (!l8.a(j8Var, fgVar3.f7783h + fgVar3.f7784i)) {
                    break;
                }
                j10 = this.f8232a.f7778c;
            }
            return j10;
        }
        throw new EOFException();
    }

    private long b(j8 j8Var) {
        j8 j8Var2 = j8Var;
        if (this.f8240i == this.f8241j) {
            return -1;
        }
        long f10 = j8Var.f();
        if (!this.f8232a.a(j8Var2, this.f8241j)) {
            long j10 = this.f8240i;
            if (j10 != f10) {
                return j10;
            }
            throw new IOException("No ogg page can be found.");
        }
        this.f8232a.a(j8Var2, false);
        j8Var.b();
        long j11 = this.f8239h;
        fg fgVar = this.f8232a;
        long j12 = fgVar.f7778c;
        long j13 = j11 - j12;
        int i10 = fgVar.f7783h + fgVar.f7784i;
        if (0 <= j13 && j13 < 72000) {
            return -1;
        }
        int i11 = (j13 > 0 ? 1 : (j13 == 0 ? 0 : -1));
        if (i11 < 0) {
            this.f8241j = f10;
            this.f8243l = j12;
        } else {
            this.f8240i = j8Var.f() + ((long) i10);
            this.f8242k = this.f8232a.f7778c;
        }
        long j14 = this.f8241j;
        long j15 = this.f8240i;
        if (j14 - j15 < 100000) {
            this.f8241j = j15;
            return j15;
        }
        long j16 = ((long) i10) * (i11 <= 0 ? 2 : 1);
        long j17 = this.f8241j;
        long j18 = this.f8240i;
        return yp.b((j8Var.f() - j16) + ((j13 * (j17 - j18)) / (this.f8243l - this.f8242k)), j18, j17 - 1);
    }

    public long a(j8 j8Var) {
        int i10 = this.f8236e;
        if (i10 == 0) {
            long f10 = j8Var.f();
            this.f8238g = f10;
            this.f8236e = 1;
            long j10 = this.f8234c - 65307;
            if (j10 > f10) {
                return j10;
            }
        } else if (i10 != 1) {
            if (i10 == 2) {
                long b10 = b(j8Var);
                if (b10 != -1) {
                    return b10;
                }
                this.f8236e = 3;
            } else if (i10 != 3) {
                if (i10 == 4) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            d(j8Var);
            this.f8236e = 4;
            return -(this.f8242k + 2);
        }
        this.f8237f = c(j8Var);
        this.f8236e = 4;
        return this.f8238g;
    }

    public void a(long j10) {
        this.f8239h = yp.b(j10, 0, this.f8237f - 1);
        this.f8236e = 2;
        this.f8240i = this.f8233b;
        this.f8241j = this.f8234c;
        this.f8242k = 0;
        this.f8243l = this.f8237f;
    }
}
