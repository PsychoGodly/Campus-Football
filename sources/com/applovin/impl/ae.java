package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.tj;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ae {

    /* renamed from: a  reason: collision with root package name */
    private final List f6504a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap f6505b = new IdentityHashMap();

    /* renamed from: c  reason: collision with root package name */
    private final Map f6506c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final d f6507d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final xd.a f6508e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final y6.a f6509f;

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f6510g;

    /* renamed from: h  reason: collision with root package name */
    private final Set f6511h;

    /* renamed from: i  reason: collision with root package name */
    private tj f6512i = new tj.a(0);

    /* renamed from: j  reason: collision with root package name */
    private boolean f6513j;

    /* renamed from: k  reason: collision with root package name */
    private yo f6514k;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final wd f6519a;

        /* renamed from: b  reason: collision with root package name */
        public final wd.b f6520b;

        /* renamed from: c  reason: collision with root package name */
        public final a f6521c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f6519a = wdVar;
            this.f6520b = bVar;
            this.f6521c = aVar;
        }
    }

    static final class c implements zd {

        /* renamed from: a  reason: collision with root package name */
        public final sc f6522a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f6523b = new Object();

        /* renamed from: c  reason: collision with root package name */
        public final List f6524c = new ArrayList();

        /* renamed from: d  reason: collision with root package name */
        public int f6525d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f6526e;

        public c(wd wdVar, boolean z10) {
            this.f6522a = new sc(wdVar, z10);
        }

        public Object a() {
            return this.f6523b;
        }

        public go b() {
            return this.f6522a.i();
        }

        public void a(int i10) {
            this.f6525d = i10;
            this.f6526e = false;
            this.f6524c.clear();
        }
    }

    public interface d {
        void a();
    }

    public ae(d dVar, r0 r0Var, Handler handler) {
        this.f6507d = dVar;
        xd.a aVar = new xd.a();
        this.f6508e = aVar;
        y6.a aVar2 = new y6.a();
        this.f6509f = aVar2;
        this.f6510g = new HashMap();
        this.f6511h = new HashSet();
        if (r0Var != null) {
            aVar.a(handler, (xd) r0Var);
            aVar2.a(handler, (y6) r0Var);
        }
    }

    public int c() {
        return this.f6504a.size();
    }

    public boolean d() {
        return this.f6513j;
    }

    public void e() {
        for (b bVar : this.f6510g.values()) {
            try {
                bVar.f6519a.c(bVar.f6520b);
            } catch (RuntimeException e10) {
                kc.a("MediaSourceList", "Failed to release child source.", e10);
            }
            bVar.f6519a.a((xd) bVar.f6521c);
            bVar.f6519a.a((y6) bVar.f6521c);
        }
        this.f6510g.clear();
        this.f6511h.clear();
        this.f6513j = false;
    }

    private final class a implements xd, y6 {

        /* renamed from: a  reason: collision with root package name */
        private final c f6515a;

        /* renamed from: b  reason: collision with root package name */
        private xd.a f6516b;

        /* renamed from: c  reason: collision with root package name */
        private y6.a f6517c;

        public a(c cVar) {
            this.f6516b = ae.this.f6508e;
            this.f6517c = ae.this.f6509f;
            this.f6515a = cVar;
        }

        private boolean f(int i10, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = ae.b(this.f6515a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a10 = ae.b(this.f6515a, i10);
            xd.a aVar3 = this.f6516b;
            if (aVar3.f13316a != a10 || !yp.a((Object) aVar3.f13317b, (Object) aVar2)) {
                this.f6516b = ae.this.f6508e.a(a10, aVar2, 0);
            }
            y6.a aVar4 = this.f6517c;
            if (aVar4.f13525a == a10 && yp.a((Object) aVar4.f13526b, (Object) aVar2)) {
                return true;
            }
            this.f6517c = ae.this.f6509f.a(a10, aVar2);
            return true;
        }

        public void a(int i10, wd.a aVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f6516b.a(pdVar);
            }
        }

        public void b(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f6517c.d();
            }
        }

        public void c(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f6517c.c();
            }
        }

        public void d(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f6517c.a();
            }
        }

        public /* synthetic */ void e(int i10, wd.a aVar) {
            k80.a(this, i10, aVar);
        }

        public void a(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f6517c.b();
            }
        }

        public void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f6516b.c(icVar, pdVar);
            }
        }

        public void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f6516b.b(icVar, pdVar);
            }
        }

        public void a(int i10, wd.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f6517c.a(i11);
            }
        }

        public void a(int i10, wd.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f6517c.a(exc);
            }
        }

        public void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f6516b.a(icVar, pdVar);
            }
        }

        public void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f6516b.a(icVar, pdVar, iOException, z10);
            }
        }
    }

    private void b() {
        Iterator it = this.f6511h.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.f6524c.isEmpty()) {
                a(cVar);
                it.remove();
            }
        }
    }

    private void c(c cVar) {
        if (cVar.f6526e && cVar.f6524c.isEmpty()) {
            b bVar = (b) a1.a((Object) (b) this.f6510g.remove(cVar));
            bVar.f6519a.c(bVar.f6520b);
            bVar.f6519a.a((xd) bVar.f6521c);
            bVar.f6519a.a((y6) bVar.f6521c);
            this.f6511h.remove(cVar);
        }
    }

    private void d(c cVar) {
        sc scVar = cVar.f6522a;
        gt gtVar = new gt(this);
        a aVar = new a(cVar);
        this.f6510g.put(cVar, new b(scVar, gtVar, aVar));
        scVar.a(yp.b(), (xd) aVar);
        scVar.a(yp.b(), (y6) aVar);
        scVar.a((wd.b) gtVar, this.f6514k);
    }

    public go a(int i10, List list, tj tjVar) {
        if (!list.isEmpty()) {
            this.f6512i = tjVar;
            for (int i11 = i10; i11 < list.size() + i10; i11++) {
                c cVar = (c) list.get(i11 - i10);
                if (i11 > 0) {
                    c cVar2 = (c) this.f6504a.get(i11 - 1);
                    cVar.a(cVar2.f6525d + cVar2.f6522a.i().b());
                } else {
                    cVar.a(0);
                }
                a(i11, cVar.f6522a.i().b());
                this.f6504a.add(i11, cVar);
                this.f6506c.put(cVar.f6523b, cVar);
                if (this.f6513j) {
                    d(cVar);
                    if (this.f6505b.isEmpty()) {
                        this.f6511h.add(cVar);
                    } else {
                        a(cVar);
                    }
                }
            }
        }
        return a();
    }

    private void b(c cVar) {
        this.f6511h.add(cVar);
        b bVar = (b) this.f6510g.get(cVar);
        if (bVar != null) {
            bVar.f6519a.b(bVar.f6520b);
        }
    }

    /* access modifiers changed from: private */
    public static wd.a b(c cVar, wd.a aVar) {
        for (int i10 = 0; i10 < cVar.f6524c.size(); i10++) {
            if (((wd.a) cVar.f6524c.get(i10)).f12397d == aVar.f12397d) {
                return aVar.b(a(cVar, aVar.f12394a));
            }
        }
        return null;
    }

    private static Object b(Object obj) {
        return b.d(obj);
    }

    /* access modifiers changed from: private */
    public static int b(c cVar, int i10) {
        return i10 + cVar.f6525d;
    }

    private void b(int i10, int i11) {
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            c cVar = (c) this.f6504a.remove(i12);
            this.f6506c.remove(cVar.f6523b);
            a(i12, -cVar.f6522a.i().b());
            cVar.f6526e = true;
            if (this.f6513j) {
                c(cVar);
            }
        }
    }

    private void a(int i10, int i11) {
        while (i10 < this.f6504a.size()) {
            ((c) this.f6504a.get(i10)).f6525d += i11;
            i10++;
        }
    }

    public rd a(wd.a aVar, n0 n0Var, long j10) {
        Object b10 = b(aVar.f12394a);
        wd.a b11 = aVar.b(a(aVar.f12394a));
        c cVar = (c) a1.a((Object) (c) this.f6506c.get(b10));
        b(cVar);
        cVar.f6524c.add(b11);
        rc b12 = cVar.f6522a.a(b11, n0Var, j10);
        this.f6505b.put(b12, cVar);
        b();
        return b12;
    }

    public go a() {
        if (this.f6504a.isEmpty()) {
            return go.f8049a;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f6504a.size(); i11++) {
            c cVar = (c) this.f6504a.get(i11);
            cVar.f6525d = i10;
            i10 += cVar.f6522a.i().b();
        }
        return new ph(this.f6504a, this.f6512i);
    }

    private void a(c cVar) {
        b bVar = (b) this.f6510g.get(cVar);
        if (bVar != null) {
            bVar.f6519a.a(bVar.f6520b);
        }
    }

    private static Object a(Object obj) {
        return b.c(obj);
    }

    private static Object a(c cVar, Object obj) {
        return b.a(cVar.f6523b, obj);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(wd wdVar, go goVar) {
        this.f6507d.a();
    }

    public void a(yo yoVar) {
        a1.b(!this.f6513j);
        this.f6514k = yoVar;
        for (int i10 = 0; i10 < this.f6504a.size(); i10++) {
            c cVar = (c) this.f6504a.get(i10);
            d(cVar);
            this.f6511h.add(cVar);
        }
        this.f6513j = true;
    }

    public void a(rd rdVar) {
        c cVar = (c) a1.a((Object) (c) this.f6505b.remove(rdVar));
        cVar.f6522a.a(rdVar);
        cVar.f6524c.remove(((rc) rdVar).f11170a);
        if (!this.f6505b.isEmpty()) {
            b();
        }
        c(cVar);
    }

    public go a(int i10, int i11, tj tjVar) {
        a1.a(i10 >= 0 && i10 <= i11 && i11 <= c());
        this.f6512i = tjVar;
        b(i10, i11);
        return a();
    }

    public go a(List list, tj tjVar) {
        b(0, this.f6504a.size());
        return a(this.f6504a.size(), list, tjVar);
    }

    public go a(tj tjVar) {
        int c10 = c();
        if (tjVar.a() != c10) {
            tjVar = tjVar.d().b(0, c10);
        }
        this.f6512i = tjVar;
        return a();
    }
}
