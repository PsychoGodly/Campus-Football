package pe;

import kotlin.jvm.internal.m;
import sd.o;
import sd.p;
import sd.w;
import ue.l;
import ue.p0;
import xd.d;
import xd.g;

/* compiled from: DispatchedTask.kt */
public final class e1 {
    public static final <T> void a(d1<? super T> d1Var, int i10) {
        boolean z10 = true;
        if (t0.a()) {
            if (!(i10 != -1)) {
                throw new AssertionError();
            }
        }
        d<? super T> c10 = d1Var.c();
        if (i10 != 4) {
            z10 = false;
        }
        if (z10 || !(c10 instanceof l) || b(i10) != b(d1Var.f37289c)) {
            d(d1Var, c10, z10);
            return;
        }
        k0 k0Var = ((l) c10).f38814d;
        g context = c10.getContext();
        if (k0Var.Z0(context)) {
            k0Var.X0(context, d1Var);
        } else {
            e(d1Var);
        }
    }

    public static final boolean b(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean c(int i10) {
        return i10 == 2;
    }

    public static final <T> void d(d1<? super T> d1Var, d<? super T> dVar, boolean z10) {
        Object obj;
        Object g10 = d1Var.g();
        Throwable d10 = d1Var.d(g10);
        if (d10 != null) {
            o.a aVar = o.f38128b;
            obj = p.a(d10);
        } else {
            o.a aVar2 = o.f38128b;
            obj = d1Var.e(g10);
        }
        Object b10 = o.b(obj);
        if (z10) {
            m.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            l lVar = (l) dVar;
            d<T> dVar2 = lVar.f38815f;
            Object obj2 = lVar.f38817h;
            g context = dVar2.getContext();
            Object c10 = p0.c(context, obj2);
            i3<?> g11 = c10 != p0.f38831a ? j0.g(dVar2, context, c10) : null;
            try {
                lVar.f38815f.resumeWith(b10);
                w wVar = w.f38141a;
            } finally {
                if (g11 == null || g11.U0()) {
                    p0.a(context, c10);
                }
            }
        } else {
            dVar.resumeWith(b10);
        }
    }

    private static final void e(d1<?> d1Var) {
        m1 b10 = b3.f37276a.b();
        if (b10.i1()) {
            b10.e1(d1Var);
            return;
        }
        b10.g1(true);
        try {
            d(d1Var, d1Var.c(), true);
            do {
            } while (b10.l1());
        } catch (Throwable th) {
            b10.b1(true);
            throw th;
        }
        b10.b1(true);
    }
}
