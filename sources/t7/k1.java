package t7;

import g7.e;
import java.util.Collections;
import java.util.Iterator;
import u7.l;

/* compiled from: ReferenceSet */
public class k1 {

    /* renamed from: a  reason: collision with root package name */
    private e<e> f30476a = new e<>(Collections.emptyList(), e.f30387c);

    /* renamed from: b  reason: collision with root package name */
    private e<e> f30477b = new e<>(Collections.emptyList(), e.f30388d);

    private void e(e eVar) {
        this.f30476a = this.f30476a.g(eVar);
        this.f30477b = this.f30477b.g(eVar);
    }

    public void a(l lVar, int i10) {
        e eVar = new e(lVar, i10);
        this.f30476a = this.f30476a.e(eVar);
        this.f30477b = this.f30477b.e(eVar);
    }

    public void b(e<l> eVar, int i10) {
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            a(it.next(), i10);
        }
    }

    public boolean c(l lVar) {
        Iterator<e> f10 = this.f30476a.f(new e(lVar, 0));
        if (!f10.hasNext()) {
            return false;
        }
        return f10.next().d().equals(lVar);
    }

    public e<l> d(int i10) {
        Iterator<e> f10 = this.f30477b.f(new e(l.d(), i10));
        e<l> e10 = l.e();
        while (f10.hasNext()) {
            e next = f10.next();
            if (next.c() != i10) {
                break;
            }
            e10 = e10.e(next.d());
        }
        return e10;
    }

    public void f(l lVar, int i10) {
        e(new e(lVar, i10));
    }

    public void g(e<l> eVar, int i10) {
        Iterator<l> it = eVar.iterator();
        while (it.hasNext()) {
            f(it.next(), i10);
        }
    }

    public e<l> h(int i10) {
        Iterator<e> f10 = this.f30477b.f(new e(l.d(), i10));
        e<l> e10 = l.e();
        while (f10.hasNext()) {
            e next = f10.next();
            if (next.c() != i10) {
                break;
            }
            e10 = e10.e(next.d());
            e(next);
        }
        return e10;
    }
}
