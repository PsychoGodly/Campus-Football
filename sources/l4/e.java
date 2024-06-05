package l4;

import java.util.Arrays;

/* compiled from: FixedFrameRateEstimator */
final class e {

    /* renamed from: a  reason: collision with root package name */
    private a f19913a = new a();

    /* renamed from: b  reason: collision with root package name */
    private a f19914b = new a();

    /* renamed from: c  reason: collision with root package name */
    private boolean f19915c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f19916d;

    /* renamed from: e  reason: collision with root package name */
    private long f19917e = -9223372036854775807L;

    /* renamed from: f  reason: collision with root package name */
    private int f19918f;

    /* compiled from: FixedFrameRateEstimator */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f19919a;

        /* renamed from: b  reason: collision with root package name */
        private long f19920b;

        /* renamed from: c  reason: collision with root package name */
        private long f19921c;

        /* renamed from: d  reason: collision with root package name */
        private long f19922d;

        /* renamed from: e  reason: collision with root package name */
        private long f19923e;

        /* renamed from: f  reason: collision with root package name */
        private long f19924f;

        /* renamed from: g  reason: collision with root package name */
        private final boolean[] f19925g = new boolean[15];

        /* renamed from: h  reason: collision with root package name */
        private int f19926h;

        private static int c(long j10) {
            return (int) (j10 % 15);
        }

        public long a() {
            long j10 = this.f19923e;
            if (j10 == 0) {
                return 0;
            }
            return this.f19924f / j10;
        }

        public long b() {
            return this.f19924f;
        }

        public boolean d() {
            long j10 = this.f19922d;
            if (j10 == 0) {
                return false;
            }
            return this.f19925g[c(j10 - 1)];
        }

        public boolean e() {
            return this.f19922d > 15 && this.f19926h == 0;
        }

        public void f(long j10) {
            long j11 = this.f19922d;
            if (j11 == 0) {
                this.f19919a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f19919a;
                this.f19920b = j12;
                this.f19924f = j12;
                this.f19923e = 1;
            } else {
                long j13 = j10 - this.f19921c;
                int c10 = c(j11);
                if (Math.abs(j13 - this.f19920b) <= 1000000) {
                    this.f19923e++;
                    this.f19924f += j13;
                    boolean[] zArr = this.f19925g;
                    if (zArr[c10]) {
                        zArr[c10] = false;
                        this.f19926h--;
                    }
                } else {
                    boolean[] zArr2 = this.f19925g;
                    if (!zArr2[c10]) {
                        zArr2[c10] = true;
                        this.f19926h++;
                    }
                }
            }
            this.f19922d++;
            this.f19921c = j10;
        }

        public void g() {
            this.f19922d = 0;
            this.f19923e = 0;
            this.f19924f = 0;
            this.f19926h = 0;
            Arrays.fill(this.f19925g, false);
        }
    }

    public long a() {
        if (e()) {
            return this.f19913a.a();
        }
        return -9223372036854775807L;
    }

    public float b() {
        if (e()) {
            return (float) (1.0E9d / ((double) this.f19913a.a()));
        }
        return -1.0f;
    }

    public int c() {
        return this.f19918f;
    }

    public long d() {
        if (e()) {
            return this.f19913a.b();
        }
        return -9223372036854775807L;
    }

    public boolean e() {
        return this.f19913a.e();
    }

    public void f(long j10) {
        this.f19913a.f(j10);
        int i10 = 0;
        if (this.f19913a.e() && !this.f19916d) {
            this.f19915c = false;
        } else if (this.f19917e != -9223372036854775807L) {
            if (!this.f19915c || this.f19914b.d()) {
                this.f19914b.g();
                this.f19914b.f(this.f19917e);
            }
            this.f19915c = true;
            this.f19914b.f(j10);
        }
        if (this.f19915c && this.f19914b.e()) {
            a aVar = this.f19913a;
            this.f19913a = this.f19914b;
            this.f19914b = aVar;
            this.f19915c = false;
            this.f19916d = false;
        }
        this.f19917e = j10;
        if (!this.f19913a.e()) {
            i10 = this.f19918f + 1;
        }
        this.f19918f = i10;
    }

    public void g() {
        this.f19913a.g();
        this.f19914b.g();
        this.f19915c = false;
        this.f19917e = -9223372036854775807L;
        this.f19918f = 0;
    }
}
