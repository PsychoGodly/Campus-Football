package dd;

import dd.b;
import java.util.concurrent.Executor;
import r6.o;

/* compiled from: CompositeCallCredentials */
public final class m extends b {

    /* renamed from: a  reason: collision with root package name */
    private final b f32290a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final b f32291b;

    /* compiled from: CompositeCallCredentials */
    private static final class a extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.a f32292a;

        /* renamed from: b  reason: collision with root package name */
        private final y0 f32293b;

        public a(b.a aVar, y0 y0Var) {
            this.f32292a = aVar;
            this.f32293b = y0Var;
        }

        public void a(y0 y0Var) {
            o.p(y0Var, "headers");
            y0 y0Var2 = new y0();
            y0Var2.m(this.f32293b);
            y0Var2.m(y0Var);
            this.f32292a.a(y0Var2);
        }

        public void b(j1 j1Var) {
            this.f32292a.b(j1Var);
        }
    }

    /* compiled from: CompositeCallCredentials */
    private final class b extends b.a {

        /* renamed from: a  reason: collision with root package name */
        private final b.C0362b f32294a;

        /* renamed from: b  reason: collision with root package name */
        private final Executor f32295b;

        /* renamed from: c  reason: collision with root package name */
        private final b.a f32296c;

        /* renamed from: d  reason: collision with root package name */
        private final r f32297d;

        public b(b.C0362b bVar, Executor executor, b.a aVar, r rVar) {
            this.f32294a = bVar;
            this.f32295b = executor;
            this.f32296c = (b.a) o.p(aVar, "delegate");
            this.f32297d = (r) o.p(rVar, "context");
        }

        public void a(y0 y0Var) {
            o.p(y0Var, "headers");
            r b10 = this.f32297d.b();
            try {
                m.this.f32291b.a(this.f32294a, this.f32295b, new a(this.f32296c, y0Var));
            } finally {
                this.f32297d.f(b10);
            }
        }

        public void b(j1 j1Var) {
            this.f32296c.b(j1Var);
        }
    }

    public m(b bVar, b bVar2) {
        this.f32290a = (b) o.p(bVar, "creds1");
        this.f32291b = (b) o.p(bVar2, "creds2");
    }

    public void a(b.C0362b bVar, Executor executor, b.a aVar) {
        this.f32290a.a(bVar, executor, new b(bVar, executor, aVar, r.e()));
    }
}
