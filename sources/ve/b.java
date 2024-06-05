package ve;

import fe.p;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.c0;
import pe.e3;
import pe.l2;
import pe.t0;
import sd.o;
import ue.h0;
import ue.k0;
import ue.p0;
import xd.d;
import xd.g;

/* compiled from: Undispatched.kt */
public final class b {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        g context;
        Object c10;
        d<? super T> a10 = h.a(dVar);
        try {
            context = dVar.getContext();
            c10 = p0.c(context, (Object) null);
            Object invoke = ((p) c0.b(pVar, 2)).invoke(r10, a10);
            p0.a(context, c10);
            if (invoke != d.c()) {
                o.a aVar = o.f38128b;
                a10.resumeWith(o.b(invoke));
            }
        } catch (Throwable th) {
            o.a aVar2 = o.f38128b;
            a10.resumeWith(o.b(sd.p.a(th)));
        }
    }

    public static final <T, R> Object b(h0<? super T> h0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = ((p) c0.b(pVar, 2)).invoke(r10, h0Var);
        } catch (Throwable th) {
            obj = new pe.c0(th, false, 2, (kotlin.jvm.internal.h) null);
        }
        if (obj == d.c()) {
            return d.c();
        }
        Object m02 = h0Var.m0(obj);
        if (m02 == l2.f37353b) {
            return d.c();
        }
        if (!(m02 instanceof pe.c0)) {
            return l2.h(m02);
        }
        Throwable th2 = ((pe.c0) m02).f37280a;
        d<T> dVar = h0Var.f38806d;
        if (t0.d() && (dVar instanceof e)) {
            th2 = k0.i(th2, (e) dVar);
        }
        throw th2;
    }

    public static final <T, R> Object c(h0<? super T> h0Var, R r10, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        Object obj;
        boolean z10 = false;
        try {
            obj = ((p) c0.b(pVar, 2)).invoke(r10, h0Var);
        } catch (Throwable th) {
            obj = new pe.c0(th, false, 2, (kotlin.jvm.internal.h) null);
        }
        if (obj == d.c()) {
            return d.c();
        }
        Object m02 = h0Var.m0(obj);
        if (m02 == l2.f37353b) {
            return d.c();
        }
        if (m02 instanceof pe.c0) {
            Throwable th2 = ((pe.c0) m02).f37280a;
            if (!(th2 instanceof e3) || ((e3) th2).f37299a != h0Var) {
                z10 = true;
            }
            if (z10) {
                d<T> dVar = h0Var.f38806d;
                if (t0.d() && (dVar instanceof e)) {
                    th2 = k0.i(th2, (e) dVar);
                }
                throw th2;
            } else if (obj instanceof pe.c0) {
                Throwable th3 = ((pe.c0) obj).f37280a;
                d<T> dVar2 = h0Var.f38806d;
                if (t0.d() && (dVar2 instanceof e)) {
                    th3 = k0.i(th3, (e) dVar2);
                }
                throw th3;
            }
        } else {
            obj = l2.h(m02);
        }
        return obj;
    }
}
