package k1;

import androidx.lifecycle.w;
import androidx.work.s;

/* compiled from: OperationImpl */
public class c implements s {

    /* renamed from: c  reason: collision with root package name */
    private final w<s.b> f19548c = new w<>();

    /* renamed from: d  reason: collision with root package name */
    private final androidx.work.impl.utils.futures.c<s.b.c> f19549d = androidx.work.impl.utils.futures.c.t();

    public c() {
        a(s.f5342b);
    }

    public void a(s.b bVar) {
        this.f19548c.h(bVar);
        if (bVar instanceof s.b.c) {
            this.f19549d.p((s.b.c) bVar);
        } else if (bVar instanceof s.b.a) {
            this.f19549d.q(((s.b.a) bVar).a());
        }
    }
}
