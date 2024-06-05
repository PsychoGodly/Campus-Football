package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuHostHelper */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f3195a;

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f3196b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Map<m, a> f3197c = new HashMap();

    /* compiled from: MenuHostHelper */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final i f3198a;

        /* renamed from: b  reason: collision with root package name */
        private m f3199b;

        a(i iVar, m mVar) {
            this.f3198a = iVar;
            this.f3199b = mVar;
            iVar.a(mVar);
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f3198a.d(this.f3199b);
            this.f3199b = null;
        }
    }

    public k(Runnable runnable) {
        this.f3195a = runnable;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void f(m mVar, p pVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            l(mVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(i.b bVar, m mVar, p pVar, i.a aVar) {
        if (aVar == i.a.e(bVar)) {
            c(mVar);
        } else if (aVar == i.a.ON_DESTROY) {
            l(mVar);
        } else if (aVar == i.a.c(bVar)) {
            this.f3196b.remove(mVar);
            this.f3195a.run();
        }
    }

    public void c(m mVar) {
        this.f3196b.add(mVar);
        this.f3195a.run();
    }

    public void d(m mVar, p pVar) {
        c(mVar);
        i lifecycle = pVar.getLifecycle();
        a remove = this.f3197c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f3197c.put(mVar, new a(lifecycle, new i(this, mVar)));
    }

    public void e(m mVar, p pVar, i.b bVar) {
        i lifecycle = pVar.getLifecycle();
        a remove = this.f3197c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f3197c.put(mVar, new a(lifecycle, new j(this, bVar, mVar)));
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator<m> it = this.f3196b.iterator();
        while (it.hasNext()) {
            it.next().c(menu, menuInflater);
        }
    }

    public void i(Menu menu) {
        Iterator<m> it = this.f3196b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator<m> it = this.f3196b.iterator();
        while (it.hasNext()) {
            if (it.next().a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void k(Menu menu) {
        Iterator<m> it = this.f3196b.iterator();
        while (it.hasNext()) {
            it.next().d(menu);
        }
    }

    public void l(m mVar) {
        this.f3196b.remove(mVar);
        a remove = this.f3197c.remove(mVar);
        if (remove != null) {
            remove.a();
        }
        this.f3195a.run();
    }
}
