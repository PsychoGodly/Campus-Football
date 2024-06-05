package e2;

import n7.d;

/* compiled from: StorageMetrics */
public final class e {

    /* renamed from: c  reason: collision with root package name */
    private static final e f17785c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f17786a;

    /* renamed from: b  reason: collision with root package name */
    private final long f17787b;

    /* compiled from: StorageMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f17788a = 0;

        /* renamed from: b  reason: collision with root package name */
        private long f17789b = 0;

        a() {
        }

        public e a() {
            return new e(this.f17788a, this.f17789b);
        }

        public a b(long j10) {
            this.f17788a = j10;
            return this;
        }

        public a c(long j10) {
            this.f17789b = j10;
            return this;
        }
    }

    e(long j10, long j11) {
        this.f17786a = j10;
        this.f17787b = j11;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 1)
    public long a() {
        return this.f17786a;
    }

    @d(tag = 2)
    public long b() {
        return this.f17787b;
    }
}
