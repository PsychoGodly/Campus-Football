package la;

import com.onesignal.l3;
import com.onesignal.q3;
import com.onesignal.t2;
import com.onesignal.v1;
import kotlin.jvm.internal.m;

/* compiled from: OSOutcomeEventsFactory.kt */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final v1 f29211a;

    /* renamed from: b  reason: collision with root package name */
    private final l3 f29212b;

    /* renamed from: c  reason: collision with root package name */
    private final a f29213c;

    /* renamed from: d  reason: collision with root package name */
    private ma.c f29214d;

    public c(v1 v1Var, l3 l3Var, q3 q3Var, t2 t2Var) {
        m.e(v1Var, "logger");
        m.e(l3Var, "apiClient");
        this.f29211a = v1Var;
        this.f29212b = l3Var;
        m.b(q3Var);
        m.b(t2Var);
        this.f29213c = new a(v1Var, q3Var, t2Var);
    }

    private final d a() {
        if (this.f29213c.j()) {
            return new g(this.f29211a, this.f29213c, new h(this.f29212b));
        }
        return new e(this.f29211a, this.f29213c, new f(this.f29212b));
    }

    private final ma.c c() {
        if (!this.f29213c.j()) {
            ma.c cVar = this.f29214d;
            if (cVar instanceof e) {
                m.b(cVar);
                return cVar;
            }
        }
        if (this.f29213c.j()) {
            ma.c cVar2 = this.f29214d;
            if (cVar2 instanceof g) {
                m.b(cVar2);
                return cVar2;
            }
        }
        return a();
    }

    public final ma.c b() {
        return this.f29214d != null ? c() : a();
    }
}
