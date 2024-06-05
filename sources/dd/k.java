package dd;

import r6.i;
import r6.o;

/* compiled from: ClientStreamTracer */
public abstract class k extends m1 {

    /* compiled from: ClientStreamTracer */
    public static abstract class a {
        public k a(b bVar, y0 y0Var) {
            throw new UnsupportedOperationException("Not implemented");
        }
    }

    /* compiled from: ClientStreamTracer */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final c f32277a;

        /* renamed from: b  reason: collision with root package name */
        private final int f32278b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f32279c;

        /* compiled from: ClientStreamTracer */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private c f32280a = c.f32144k;

            /* renamed from: b  reason: collision with root package name */
            private int f32281b;

            /* renamed from: c  reason: collision with root package name */
            private boolean f32282c;

            a() {
            }

            public b a() {
                return new b(this.f32280a, this.f32281b, this.f32282c);
            }

            public a b(c cVar) {
                this.f32280a = (c) o.p(cVar, "callOptions cannot be null");
                return this;
            }

            public a c(boolean z10) {
                this.f32282c = z10;
                return this;
            }

            public a d(int i10) {
                this.f32281b = i10;
                return this;
            }
        }

        b(c cVar, int i10, boolean z10) {
            this.f32277a = (c) o.p(cVar, "callOptions");
            this.f32278b = i10;
            this.f32279c = z10;
        }

        public static a a() {
            return new a();
        }

        public String toString() {
            return i.c(this).d("callOptions", this.f32277a).b("previousAttempts", this.f32278b).e("isTransparentRetry", this.f32279c).toString();
        }
    }

    public void j() {
    }

    public void k(y0 y0Var) {
    }

    public void l() {
    }

    public void m(a aVar, y0 y0Var) {
    }
}
