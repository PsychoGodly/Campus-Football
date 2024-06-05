package com.applovin.impl;

import android.os.SystemClock;
import com.applovin.impl.od;

public final class c6 implements fc {

    /* renamed from: a  reason: collision with root package name */
    private final float f6842a;

    /* renamed from: b  reason: collision with root package name */
    private final float f6843b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6844c;

    /* renamed from: d  reason: collision with root package name */
    private final float f6845d;

    /* renamed from: e  reason: collision with root package name */
    private final long f6846e;

    /* renamed from: f  reason: collision with root package name */
    private final long f6847f;

    /* renamed from: g  reason: collision with root package name */
    private final float f6848g;

    /* renamed from: h  reason: collision with root package name */
    private long f6849h;

    /* renamed from: i  reason: collision with root package name */
    private long f6850i;

    /* renamed from: j  reason: collision with root package name */
    private long f6851j;

    /* renamed from: k  reason: collision with root package name */
    private long f6852k;

    /* renamed from: l  reason: collision with root package name */
    private long f6853l;

    /* renamed from: m  reason: collision with root package name */
    private long f6854m;

    /* renamed from: n  reason: collision with root package name */
    private float f6855n;

    /* renamed from: o  reason: collision with root package name */
    private float f6856o;

    /* renamed from: p  reason: collision with root package name */
    private float f6857p;

    /* renamed from: q  reason: collision with root package name */
    private long f6858q;

    /* renamed from: r  reason: collision with root package name */
    private long f6859r;

    /* renamed from: s  reason: collision with root package name */
    private long f6860s;

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f6861a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f6862b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f6863c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f6864d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f6865e = r2.a(20);

        /* renamed from: f  reason: collision with root package name */
        private long f6866f = r2.a(500);

        /* renamed from: g  reason: collision with root package name */
        private float f6867g = 0.999f;

        public c6 a() {
            return new c6(this.f6861a, this.f6862b, this.f6863c, this.f6864d, this.f6865e, this.f6866f, this.f6867g);
        }
    }

    private c6(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f6842a = f10;
        this.f6843b = f11;
        this.f6844c = j10;
        this.f6845d = f12;
        this.f6846e = j11;
        this.f6847f = j12;
        this.f6848g = f13;
        this.f6849h = -9223372036854775807L;
        this.f6850i = -9223372036854775807L;
        this.f6852k = -9223372036854775807L;
        this.f6853l = -9223372036854775807L;
        this.f6856o = f10;
        this.f6855n = f11;
        this.f6857p = 1.0f;
        this.f6858q = -9223372036854775807L;
        this.f6851j = -9223372036854775807L;
        this.f6854m = -9223372036854775807L;
        this.f6859r = -9223372036854775807L;
        this.f6860s = -9223372036854775807L;
    }

    private static long a(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void b(long j10) {
        long j11 = this.f6859r + (this.f6860s * 3);
        if (this.f6854m > j11) {
            float a10 = (float) r2.a(this.f6844c);
            long j12 = ((long) ((this.f6857p - 1.0f) * a10)) + ((long) ((this.f6855n - 1.0f) * a10));
            this.f6854m = nc.a(j11, this.f6851j, this.f6854m - j12);
            return;
        }
        long b10 = yp.b(j10 - ((long) (Math.max(0.0f, this.f6857p - 1.0f) / this.f6845d)), this.f6854m, j11);
        this.f6854m = b10;
        long j13 = this.f6853l;
        if (j13 != -9223372036854775807L && b10 > j13) {
            this.f6854m = j13;
        }
    }

    private void c() {
        long j10 = this.f6849h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f6850i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f6852k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f6853l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f6851j != j10) {
            this.f6851j = j10;
            this.f6854m = j10;
            this.f6859r = -9223372036854775807L;
            this.f6860s = -9223372036854775807L;
            this.f6858q = -9223372036854775807L;
        }
    }

    public float a(long j10, long j11) {
        if (this.f6849h == -9223372036854775807L) {
            return 1.0f;
        }
        b(j10, j11);
        if (this.f6858q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f6858q < this.f6844c) {
            return this.f6857p;
        }
        this.f6858q = SystemClock.elapsedRealtime();
        b(j10);
        long j12 = j10 - this.f6854m;
        if (Math.abs(j12) < this.f6846e) {
            this.f6857p = 1.0f;
        } else {
            this.f6857p = yp.a((this.f6845d * ((float) j12)) + 1.0f, this.f6856o, this.f6855n);
        }
        return this.f6857p;
    }

    public long b() {
        return this.f6854m;
    }

    private void b(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f6859r;
        if (j13 == -9223372036854775807L) {
            this.f6859r = j12;
            this.f6860s = 0;
            return;
        }
        long max = Math.max(j12, a(j13, j12, this.f6848g));
        this.f6859r = max;
        this.f6860s = a(this.f6860s, Math.abs(j12 - max), this.f6848g);
    }

    public void a() {
        long j10 = this.f6854m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f6847f;
            this.f6854m = j11;
            long j12 = this.f6853l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f6854m = j12;
            }
            this.f6858q = -9223372036854775807L;
        }
    }

    public void a(od.f fVar) {
        this.f6849h = r2.a(fVar.f10148a);
        this.f6852k = r2.a(fVar.f10149b);
        this.f6853l = r2.a(fVar.f10150c);
        float f10 = fVar.f10151d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f6842a;
        }
        this.f6856o = f10;
        float f11 = fVar.f10152f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f6843b;
        }
        this.f6855n = f11;
        c();
    }

    public void a(long j10) {
        this.f6850i = j10;
        c();
    }
}
