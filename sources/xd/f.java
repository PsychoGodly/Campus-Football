package xd;

import fe.p;
import kotlin.jvm.internal.m;
import sd.o;
import sd.w;

/* compiled from: Continuation.kt */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar) {
        m.e(pVar, "<this>");
        m.e(dVar, "completion");
        d b10 = c.b(c.a(pVar, r10, dVar));
        o.a aVar = o.f38128b;
        b10.resumeWith(o.b(w.f38141a));
    }
}
