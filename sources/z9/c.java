package z9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import x9.o;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static c f31519c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<o> f31520a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<o> f31521b = new ArrayList<>();

    private c() {
    }

    public static c e() {
        return f31519c;
    }

    public Collection<o> a() {
        return Collections.unmodifiableCollection(this.f31521b);
    }

    public void b(o oVar) {
        this.f31520a.add(oVar);
    }

    public Collection<o> c() {
        return Collections.unmodifiableCollection(this.f31520a);
    }

    public void d(o oVar) {
        boolean g10 = g();
        this.f31520a.remove(oVar);
        this.f31521b.remove(oVar);
        if (g10 && !g()) {
            h.d().f();
        }
    }

    public void f(o oVar) {
        boolean g10 = g();
        this.f31521b.add(oVar);
        if (!g10) {
            h.d().e();
        }
    }

    public boolean g() {
        return this.f31521b.size() > 0;
    }
}
