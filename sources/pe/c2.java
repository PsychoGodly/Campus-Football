package pe;

import fe.l;
import fe.p;
import java.util.concurrent.CancellationException;
import me.d;
import sd.w;
import xd.g;

/* compiled from: Job.kt */
public interface c2 extends g.b {
    public static final b B1 = b.f37282a;

    /* compiled from: Job.kt */
    public static final class a {
        public static /* synthetic */ void a(c2 c2Var, CancellationException cancellationException, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    cancellationException = null;
                }
                c2Var.i(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(c2 c2Var, R r10, p<? super R, ? super g.b, ? extends R> pVar) {
            return g.b.a.a(c2Var, r10, pVar);
        }

        public static <E extends g.b> E c(c2 c2Var, g.c<E> cVar) {
            return g.b.a.b(c2Var, cVar);
        }

        public static /* synthetic */ i1 d(c2 c2Var, boolean z10, boolean z11, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    z10 = false;
                }
                if ((i10 & 2) != 0) {
                    z11 = true;
                }
                return c2Var.R(z10, z11, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(c2 c2Var, g.c<?> cVar) {
            return g.b.a.c(c2Var, cVar);
        }

        public static g f(c2 c2Var, g gVar) {
            return g.b.a.d(c2Var, gVar);
        }
    }

    /* compiled from: Job.kt */
    public static final class b implements g.c<c2> {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ b f37282a = new b();

        private b() {
        }
    }

    d<c2> A();

    CancellationException L();

    i1 R(boolean z10, boolean z11, l<? super Throwable, w> lVar);

    c2 getParent();

    boolean h();

    u h0(w wVar);

    void i(CancellationException cancellationException);

    boolean isActive();

    boolean isCancelled();

    boolean start();

    i1 u(l<? super Throwable, w> lVar);

    Object y0(xd.d<? super w> dVar);
}
