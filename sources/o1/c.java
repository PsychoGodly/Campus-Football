package o1;

import java.util.ArrayList;
import java.util.List;
import p1.d;
import r1.p;

/* compiled from: ConstraintController */
public abstract class c<T> implements n1.a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f20985a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private T f20986b;

    /* renamed from: c  reason: collision with root package name */
    private d<T> f20987c;

    /* renamed from: d  reason: collision with root package name */
    private a f20988d;

    /* compiled from: ConstraintController */
    public interface a {
        void a(List<String> list);

        void b(List<String> list);
    }

    c(d<T> dVar) {
        this.f20987c = dVar;
    }

    private void h(a aVar, T t10) {
        if (!this.f20985a.isEmpty() && aVar != null) {
            if (t10 == null || c(t10)) {
                aVar.b(this.f20985a);
            } else {
                aVar.a(this.f20985a);
            }
        }
    }

    public void a(T t10) {
        this.f20986b = t10;
        h(this.f20988d, t10);
    }

    /* access modifiers changed from: package-private */
    public abstract boolean b(p pVar);

    /* access modifiers changed from: package-private */
    public abstract boolean c(T t10);

    public boolean d(String str) {
        T t10 = this.f20986b;
        return t10 != null && c(t10) && this.f20985a.contains(str);
    }

    public void e(Iterable<p> iterable) {
        this.f20985a.clear();
        for (p next : iterable) {
            if (b(next)) {
                this.f20985a.add(next.f21926a);
            }
        }
        if (this.f20985a.isEmpty()) {
            this.f20987c.c(this);
        } else {
            this.f20987c.a(this);
        }
        h(this.f20988d, this.f20986b);
    }

    public void f() {
        if (!this.f20985a.isEmpty()) {
            this.f20985a.clear();
            this.f20987c.c(this);
        }
    }

    public void g(a aVar) {
        if (this.f20988d != aVar) {
            this.f20988d = aVar;
            h(aVar, this.f20986b);
        }
    }
}
