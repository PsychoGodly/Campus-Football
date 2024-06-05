package pe;

import sd.o;
import sd.p;
import sd.w;

/* compiled from: JobSupport.kt */
final class u2<T> extends j2 {

    /* renamed from: f  reason: collision with root package name */
    private final p<T> f37404f;

    public u2(p<? super T> pVar) {
        this.f37404f = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        q((Throwable) obj);
        return w.f38141a;
    }

    public void q(Throwable th) {
        Object Y = r().Y();
        if (t0.a() && !(!(Y instanceof x1))) {
            throw new AssertionError();
        } else if (Y instanceof c0) {
            p<T> pVar = this.f37404f;
            o.a aVar = o.f38128b;
            pVar.resumeWith(o.b(p.a(((c0) Y).f37280a)));
        } else {
            p<T> pVar2 = this.f37404f;
            o.a aVar2 = o.f38128b;
            pVar2.resumeWith(o.b(l2.h(Y)));
        }
    }
}
