package dd;

import dd.g;
import java.util.List;
import r6.o;

/* compiled from: ClientInterceptors */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object, Object> f32224a = new a();

    /* compiled from: ClientInterceptors */
    class a extends g<Object, Object> {
        a() {
        }

        public void a(String str, Throwable th) {
        }

        public void b() {
        }

        public void c(int i10) {
        }

        public void d(Object obj) {
        }

        public void e(g.a<Object> aVar, y0 y0Var) {
        }
    }

    /* compiled from: ClientInterceptors */
    private static class b extends d {

        /* renamed from: a  reason: collision with root package name */
        private final d f32225a;

        /* renamed from: b  reason: collision with root package name */
        private final h f32226b;

        /* synthetic */ b(d dVar, h hVar, i iVar) {
            this(dVar, hVar);
        }

        public String a() {
            return this.f32225a.a();
        }

        public <ReqT, RespT> g<ReqT, RespT> f(z0<ReqT, RespT> z0Var, c cVar) {
            return this.f32226b.a(z0Var, cVar, this.f32225a);
        }

        private b(d dVar, h hVar) {
            this.f32225a = dVar;
            this.f32226b = (h) o.p(hVar, "interceptor");
        }
    }

    public static d a(d dVar, List<? extends h> list) {
        o.p(dVar, "channel");
        for (h bVar : list) {
            dVar = new b(dVar, bVar, (i) null);
        }
        return dVar;
    }
}
