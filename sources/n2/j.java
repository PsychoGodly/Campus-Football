package n2;

import android.os.SystemClock;
import k4.n0;
import n2.z1;
import v6.g;

/* compiled from: DefaultLivePlaybackSpeedControl */
public final class j implements w1 {

    /* renamed from: a  reason: collision with root package name */
    private final float f20458a;

    /* renamed from: b  reason: collision with root package name */
    private final float f20459b;

    /* renamed from: c  reason: collision with root package name */
    private final long f20460c;

    /* renamed from: d  reason: collision with root package name */
    private final float f20461d;

    /* renamed from: e  reason: collision with root package name */
    private final long f20462e;

    /* renamed from: f  reason: collision with root package name */
    private final long f20463f;

    /* renamed from: g  reason: collision with root package name */
    private final float f20464g;

    /* renamed from: h  reason: collision with root package name */
    private long f20465h;

    /* renamed from: i  reason: collision with root package name */
    private long f20466i;

    /* renamed from: j  reason: collision with root package name */
    private long f20467j;

    /* renamed from: k  reason: collision with root package name */
    private long f20468k;

    /* renamed from: l  reason: collision with root package name */
    private long f20469l;

    /* renamed from: m  reason: collision with root package name */
    private long f20470m;

    /* renamed from: n  reason: collision with root package name */
    private float f20471n;

    /* renamed from: o  reason: collision with root package name */
    private float f20472o;

    /* renamed from: p  reason: collision with root package name */
    private float f20473p;

    /* renamed from: q  reason: collision with root package name */
    private long f20474q;

    /* renamed from: r  reason: collision with root package name */
    private long f20475r;

    /* renamed from: s  reason: collision with root package name */
    private long f20476s;

    /* compiled from: DefaultLivePlaybackSpeedControl */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f20477a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f20478b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f20479c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f20480d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f20481e = n0.C0(20);

        /* renamed from: f  reason: collision with root package name */
        private long f20482f = n0.C0(500);

        /* renamed from: g  reason: collision with root package name */
        private float f20483g = 0.999f;

        public j a() {
            return new j(this.f20477a, this.f20478b, this.f20479c, this.f20480d, this.f20481e, this.f20482f, this.f20483g);
        }

        public b b(float f10) {
            k4.a.a(f10 >= 1.0f);
            this.f20478b = f10;
            return this;
        }

        public b c(float f10) {
            k4.a.a(0.0f < f10 && f10 <= 1.0f);
            this.f20477a = f10;
            return this;
        }

        public b d(long j10) {
            k4.a.a(j10 > 0);
            this.f20481e = n0.C0(j10);
            return this;
        }

        public b e(float f10) {
            k4.a.a(f10 >= 0.0f && f10 < 1.0f);
            this.f20483g = f10;
            return this;
        }

        public b f(long j10) {
            k4.a.a(j10 > 0);
            this.f20479c = j10;
            return this;
        }

        public b g(float f10) {
            k4.a.a(f10 > 0.0f);
            this.f20480d = f10 / 1000000.0f;
            return this;
        }

        public b h(long j10) {
            k4.a.a(j10 >= 0);
            this.f20482f = n0.C0(j10);
            return this;
        }
    }

    private void f(long j10) {
        long j11 = this.f20475r + (this.f20476s * 3);
        if (this.f20470m > j11) {
            float C0 = (float) n0.C0(this.f20460c);
            this.f20470m = g.c(j11, this.f20467j, this.f20470m - (((long) ((this.f20473p - 1.0f) * C0)) + ((long) ((this.f20471n - 1.0f) * C0))));
            return;
        }
        long r10 = n0.r(j10 - ((long) (Math.max(0.0f, this.f20473p - 1.0f) / this.f20461d)), this.f20470m, j11);
        this.f20470m = r10;
        long j12 = this.f20469l;
        if (j12 != -9223372036854775807L && r10 > j12) {
            this.f20470m = j12;
        }
    }

    private void g() {
        long j10 = this.f20465h;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f20466i;
            if (j11 != -9223372036854775807L) {
                j10 = j11;
            }
            long j12 = this.f20468k;
            if (j12 != -9223372036854775807L && j10 < j12) {
                j10 = j12;
            }
            long j13 = this.f20469l;
            if (j13 != -9223372036854775807L && j10 > j13) {
                j10 = j13;
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f20467j != j10) {
            this.f20467j = j10;
            this.f20470m = j10;
            this.f20475r = -9223372036854775807L;
            this.f20476s = -9223372036854775807L;
            this.f20474q = -9223372036854775807L;
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((((float) j10) * f10) + ((1.0f - f10) * ((float) j11)));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f20475r;
        if (j13 == -9223372036854775807L) {
            this.f20475r = j12;
            this.f20476s = 0;
            return;
        }
        long max = Math.max(j12, h(j13, j12, this.f20464g));
        this.f20475r = max;
        this.f20476s = h(this.f20476s, Math.abs(j12 - max), this.f20464g);
    }

    public void a(z1.g gVar) {
        this.f20465h = n0.C0(gVar.f20849a);
        this.f20468k = n0.C0(gVar.f20850b);
        this.f20469l = n0.C0(gVar.f20851c);
        float f10 = gVar.f20852d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f20458a;
        }
        this.f20472o = f10;
        float f11 = gVar.f20853f;
        if (f11 == -3.4028235E38f) {
            f11 = this.f20459b;
        }
        this.f20471n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f20465h = -9223372036854775807L;
        }
        g();
    }

    public float b(long j10, long j11) {
        if (this.f20465h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f20474q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f20474q < this.f20460c) {
            return this.f20473p;
        }
        this.f20474q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f20470m;
        if (Math.abs(j12) < this.f20462e) {
            this.f20473p = 1.0f;
        } else {
            this.f20473p = n0.p((this.f20461d * ((float) j12)) + 1.0f, this.f20472o, this.f20471n);
        }
        return this.f20473p;
    }

    public long c() {
        return this.f20470m;
    }

    public void d() {
        long j10 = this.f20470m;
        if (j10 != -9223372036854775807L) {
            long j11 = j10 + this.f20463f;
            this.f20470m = j11;
            long j12 = this.f20469l;
            if (j12 != -9223372036854775807L && j11 > j12) {
                this.f20470m = j12;
            }
            this.f20474q = -9223372036854775807L;
        }
    }

    public void e(long j10) {
        this.f20466i = j10;
        g();
    }

    private j(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f20458a = f10;
        this.f20459b = f11;
        this.f20460c = j10;
        this.f20461d = f12;
        this.f20462e = j11;
        this.f20463f = j12;
        this.f20464g = f13;
        this.f20465h = -9223372036854775807L;
        this.f20466i = -9223372036854775807L;
        this.f20468k = -9223372036854775807L;
        this.f20469l = -9223372036854775807L;
        this.f20472o = f10;
        this.f20471n = f11;
        this.f20473p = 1.0f;
        this.f20474q = -9223372036854775807L;
        this.f20467j = -9223372036854775807L;
        this.f20470m = -9223372036854775807L;
        this.f20475r = -9223372036854775807L;
        this.f20476s = -9223372036854775807L;
    }
}
