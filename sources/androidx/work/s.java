package androidx.work;

/* compiled from: Operation */
public interface s {

    /* renamed from: a  reason: collision with root package name */
    public static final b.c f5341a = new b.c();

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0096b f5342b = new b.C0096b();

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            private final Throwable f5343a;

            public a(Throwable th) {
                this.f5343a = th;
            }

            public Throwable a() {
                return this.f5343a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.f5343a.getMessage()});
            }
        }

        /* renamed from: androidx.work.s$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0096b extends b {
            public String toString() {
                return "IN_PROGRESS";
            }

            private C0096b() {
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public String toString() {
                return "SUCCESS";
            }

            private c() {
            }
        }

        b() {
        }
    }
}
