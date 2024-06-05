package r7;

import com.google.firebase.firestore.z;
import dd.j1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import r7.e1;
import y7.g0;

/* compiled from: EventManager */
public final class o implements e1.c {

    /* renamed from: a  reason: collision with root package name */
    private final e1 f29957a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<a1, b> f29958b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<com.google.firebase.firestore.o<Void>> f29959c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    private y0 f29960d = y0.UNKNOWN;

    /* compiled from: EventManager */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f29961a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f29962b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f29963c;
    }

    /* compiled from: EventManager */
    private static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<b1> f29964a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public x1 f29965b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f29966c;

        b() {
        }
    }

    public o(e1 e1Var) {
        this.f29957a = e1Var;
        this.f29958b = new HashMap();
        e1Var.x(this);
    }

    private void f() {
        for (com.google.firebase.firestore.o<Void> a10 : this.f29959c) {
            a10.a(null, (z) null);
        }
    }

    public void a(y0 y0Var) {
        this.f29960d = y0Var;
        boolean z10 = false;
        for (b a10 : this.f29958b.values()) {
            for (b1 c10 : a10.f29964a) {
                if (c10.c(y0Var)) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            f();
        }
    }

    public void b(a1 a1Var, j1 j1Var) {
        b bVar = this.f29958b.get(a1Var);
        if (bVar != null) {
            for (b1 b10 : bVar.f29964a) {
                b10.b(g0.t(j1Var));
            }
        }
        this.f29958b.remove(a1Var);
    }

    public void c(List<x1> list) {
        boolean z10 = false;
        for (x1 next : list) {
            b bVar = this.f29958b.get(next.h());
            if (bVar != null) {
                for (b1 d10 : bVar.f29964a) {
                    if (d10.d(next)) {
                        z10 = true;
                    }
                }
                x1 unused = bVar.f29965b = next;
            }
        }
        if (z10) {
            f();
        }
    }

    public int d(b1 b1Var) {
        a1 a10 = b1Var.a();
        b bVar = this.f29958b.get(a10);
        boolean z10 = bVar == null;
        if (z10) {
            bVar = new b();
            this.f29958b.put(a10, bVar);
        }
        bVar.f29964a.add(b1Var);
        y7.b.d(true ^ b1Var.c(this.f29960d), "onOnlineStateChanged() shouldn't raise an event for brand-new listeners.", new Object[0]);
        if (bVar.f29965b != null && b1Var.d(bVar.f29965b)) {
            f();
        }
        if (z10) {
            int unused = bVar.f29966c = this.f29957a.n(a10);
        }
        return bVar.f29966c;
    }

    public void e(com.google.firebase.firestore.o<Void> oVar) {
        this.f29959c.add(oVar);
        oVar.a(null, (z) null);
    }

    public void g(b1 b1Var) {
        boolean z10;
        a1 a10 = b1Var.a();
        b bVar = this.f29958b.get(a10);
        if (bVar != null) {
            bVar.f29964a.remove(b1Var);
            z10 = bVar.f29964a.isEmpty();
        } else {
            z10 = false;
        }
        if (z10) {
            this.f29958b.remove(a10);
            this.f29957a.y(a10);
        }
    }

    public void h(com.google.firebase.firestore.o<Void> oVar) {
        this.f29959c.remove(oVar);
    }
}
