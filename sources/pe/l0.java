package pe;

import fe.p;
import xd.g;

/* compiled from: CoroutineExceptionHandler.kt */
public interface l0 extends g.b {
    public static final b A1 = b.f37350a;

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class a {
        public static <R> R a(l0 l0Var, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(l0Var, r10, pVar);
        }

        public static <E extends g.b> E b(l0 l0Var, g.c<E> cVar) {
            return g.b.a.b(l0Var, cVar);
        }

        public static g c(l0 l0Var, g.c<?> cVar) {
            return g.b.a.c(l0Var, cVar);
        }

        public static g d(l0 l0Var, g gVar) {
            return g.b.a.d(l0Var, gVar);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    public static final class b implements g.c<l0> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f37350a = new b();

        private b() {
        }
    }

    void handleException(g gVar, Throwable th);
}
