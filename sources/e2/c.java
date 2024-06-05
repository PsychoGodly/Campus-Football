package e2;

import n7.d;

/* compiled from: LogEventDropped */
public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static final c f17766c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final long f17767a;

    /* renamed from: b  reason: collision with root package name */
    private final b f17768b;

    /* compiled from: LogEventDropped */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private long f17769a = 0;

        /* renamed from: b  reason: collision with root package name */
        private b f17770b = b.REASON_UNKNOWN;

        a() {
        }

        public c a() {
            return new c(this.f17769a, this.f17770b);
        }

        public a b(long j10) {
            this.f17769a = j10;
            return this;
        }

        public a c(b bVar) {
            this.f17770b = bVar;
            return this;
        }
    }

    /* compiled from: LogEventDropped */
    public enum b implements n7.c {
        REASON_UNKNOWN(0),
        MESSAGE_TOO_OLD(1),
        CACHE_FULL(2),
        PAYLOAD_TOO_BIG(3),
        MAX_RETRIES_REACHED(4),
        INVALID_PAYLOD(5),
        SERVER_ERROR(6);
        

        /* renamed from: a  reason: collision with root package name */
        private final int f17779a;

        private b(int i10) {
            this.f17779a = i10;
        }

        public int I() {
            return this.f17779a;
        }
    }

    c(long j10, b bVar) {
        this.f17767a = j10;
        this.f17768b = bVar;
    }

    public static a c() {
        return new a();
    }

    @d(tag = 1)
    public long a() {
        return this.f17767a;
    }

    @d(tag = 3)
    public b b() {
        return this.f17768b;
    }
}
