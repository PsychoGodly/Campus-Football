package e2;

import n7.d;

/* compiled from: TimeWindow */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f17790c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f17791a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17792b;

    /* compiled from: TimeWindow */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f17793a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f17794b = 0;

        a() {
        }

        public f a() {
            return new f(this.f17793a, this.f17794b);
        }

        public a b(long j10) {
            this.f17794b = j10;
            return this;
        }

        public a c(long j10) {
            this.f17793a = j10;
            return this;
        }
    }

    f(long j10, long j11) {
        this.f17791a = j10;
        this.f17792b = j11;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 2)
    public long a() {
        return this.f17792b;
    }

    @d(tag = 1)
    public long b() {
        return this.f17791a;
    }
}
