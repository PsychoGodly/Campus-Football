package ef;

import bf.b0;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: RouteDatabase */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<b0> f32549a = new LinkedHashSet();

    public synchronized void a(b0 b0Var) {
        this.f32549a.remove(b0Var);
    }

    public synchronized void b(b0 b0Var) {
        this.f32549a.add(b0Var);
    }

    public synchronized boolean c(b0 b0Var) {
        return this.f32549a.contains(b0Var);
    }
}
