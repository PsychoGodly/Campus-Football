package ve;

import fe.l;
import sd.o;
import sd.p;
import sd.w;
import ue.m;
import xd.d;

/* compiled from: Cancellable.kt */
public final class a {
    private static final void a(d<?> dVar, Throwable th) {
        o.a aVar = o.f38128b;
        dVar.resumeWith(o.b(p.a(th)));
        throw th;
    }

    public static final <R, T> void b(fe.p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, l<? super Throwable, w> lVar) {
        try {
            d b10 = c.b(c.a(pVar, r10, dVar));
            o.a aVar = o.f38128b;
            m.b(b10, o.b(w.f38141a), lVar);
        } catch (Throwable th) {
            a(dVar, th);
        }
    }

    public static final void c(d<? super w> dVar, d<?> dVar2) {
        try {
            d b10 = c.b(dVar);
            o.a aVar = o.f38128b;
            m.c(b10, o.b(w.f38141a), (l) null, 2, (Object) null);
        } catch (Throwable th) {
            a(dVar2, th);
        }
    }

    public static /* synthetic */ void d(fe.p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, dVar, lVar);
    }
}
