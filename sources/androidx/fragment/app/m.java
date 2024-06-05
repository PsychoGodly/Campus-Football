package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.n;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: FragmentLifecycleCallbacksDispatcher */
class m {

    /* renamed from: a  reason: collision with root package name */
    private final CopyOnWriteArrayList<a> f3630a = new CopyOnWriteArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final n f3631b;

    /* compiled from: FragmentLifecycleCallbacksDispatcher */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final n.l f3632a;

        /* renamed from: b  reason: collision with root package name */
        final boolean f3633b;

        a(n.l lVar, boolean z10) {
            this.f3632a = lVar;
            this.f3633b = z10;
        }
    }

    m(n nVar) {
        this.f3631b = nVar;
    }

    /* access modifiers changed from: package-private */
    public void a(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().a(fragment, bundle, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.a(this.f3631b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(Fragment fragment, boolean z10) {
        Context f10 = this.f3631b.t0().f();
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().b(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.b(this.f3631b, fragment, f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().c(fragment, bundle, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.c(this.f3631b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().d(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.d(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().e(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.e(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().f(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.f(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void g(Fragment fragment, boolean z10) {
        Context f10 = this.f3631b.t0().f();
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().g(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.g(this.f3631b, fragment, f10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void h(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().h(fragment, bundle, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.h(this.f3631b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void i(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().i(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.i(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void j(Fragment fragment, Bundle bundle, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().j(fragment, bundle, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.j(this.f3631b, fragment, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void k(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().k(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.k(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().l(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.l(this.f3631b, fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void m(Fragment fragment, View view, Bundle bundle, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().m(fragment, view, bundle, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.m(this.f3631b, fragment, view, bundle);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void n(Fragment fragment, boolean z10) {
        Fragment w02 = this.f3631b.w0();
        if (w02 != null) {
            w02.C().v0().n(fragment, true);
        }
        Iterator<a> it = this.f3630a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (!z10 || next.f3633b) {
                next.f3632a.n(this.f3631b, fragment);
            }
        }
    }

    public void o(n.l lVar, boolean z10) {
        this.f3630a.add(new a(lVar, z10));
    }

    public void p(n.l lVar) {
        synchronized (this.f3630a) {
            int i10 = 0;
            int size = this.f3630a.size();
            while (true) {
                if (i10 >= size) {
                    break;
                } else if (this.f3630a.get(i10).f3632a == lVar) {
                    this.f3630a.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
        }
    }
}
