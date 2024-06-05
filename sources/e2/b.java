package e2;

import n7.d;

/* compiled from: GlobalMetrics */
public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static final b f17763b = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final e f17764a;

    /* compiled from: GlobalMetrics */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private e f17765a = null;

        a() {
        }

        public b a() {
            return new b(this.f17765a);
        }

        public a b(e eVar) {
            this.f17765a = eVar;
            return this;
        }
    }

    b(e eVar) {
        this.f17764a = eVar;
    }

    public static a b() {
        return new a();
    }

    @d(tag = 1)
    public e a() {
        return this.f17764a;
    }
}
