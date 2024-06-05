package n1;

import android.content.Context;
import androidx.work.p;
import java.util.ArrayList;
import java.util.List;
import o1.b;
import o1.c;
import o1.e;
import o1.f;
import o1.g;
import o1.h;
import t1.a;

/* compiled from: WorkConstraintsTracker */
public class d implements c.a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f20122d = p.f("WorkConstraintsTracker");

    /* renamed from: a  reason: collision with root package name */
    private final c f20123a;

    /* renamed from: b  reason: collision with root package name */
    private final c<?>[] f20124b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f20125c = new Object();

    public d(Context context, a aVar, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.f20123a = cVar;
        this.f20124b = new c[]{new o1.a(applicationContext, aVar), new b(applicationContext, aVar), new h(applicationContext, aVar), new o1.d(applicationContext, aVar), new g(applicationContext, aVar), new f(applicationContext, aVar), new e(applicationContext, aVar)};
    }

    public void a(List<String> list) {
        synchronized (this.f20125c) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (c(next)) {
                    p.c().a(f20122d, String.format("Constraints met for %s", new Object[]{next}), new Throwable[0]);
                    arrayList.add(next);
                }
            }
            c cVar = this.f20123a;
            if (cVar != null) {
                cVar.f(arrayList);
            }
        }
    }

    public void b(List<String> list) {
        synchronized (this.f20125c) {
            c cVar = this.f20123a;
            if (cVar != null) {
                cVar.b(list);
            }
        }
    }

    public boolean c(String str) {
        synchronized (this.f20125c) {
            for (c<?> cVar : this.f20124b) {
                if (cVar.d(str)) {
                    p.c().a(f20122d, String.format("Work %s constrained by %s", new Object[]{str, cVar.getClass().getSimpleName()}), new Throwable[0]);
                    return false;
                }
            }
            return true;
        }
    }

    public void d(Iterable<r1.p> iterable) {
        synchronized (this.f20125c) {
            for (c<?> g10 : this.f20124b) {
                g10.g((c.a) null);
            }
            for (c<?> e10 : this.f20124b) {
                e10.e(iterable);
            }
            for (c<?> g11 : this.f20124b) {
                g11.g(this);
            }
        }
    }

    public void e() {
        synchronized (this.f20125c) {
            for (c<?> f10 : this.f20124b) {
                f10.f();
            }
        }
    }
}
