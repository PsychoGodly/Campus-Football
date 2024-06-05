package com.applovin.impl;

import android.os.Handler;
import com.applovin.impl.wd;
import com.applovin.impl.xd;
import com.applovin.impl.y6;
import java.io.IOException;
import java.util.HashMap;

public abstract class z3 extends b2 {

    /* renamed from: g  reason: collision with root package name */
    private final HashMap f13739g = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private Handler f13740h;

    /* renamed from: i  reason: collision with root package name */
    private yo f13741i;

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final wd f13746a;

        /* renamed from: b  reason: collision with root package name */
        public final wd.b f13747b;

        /* renamed from: c  reason: collision with root package name */
        public final a f13748c;

        public b(wd wdVar, wd.b bVar, a aVar) {
            this.f13746a = wdVar;
            this.f13747b = bVar;
            this.f13748c = aVar;
        }
    }

    protected z3() {
    }

    /* access modifiers changed from: protected */
    public int a(Object obj, int i10) {
        return i10;
    }

    /* access modifiers changed from: protected */
    public long a(Object obj, long j10) {
        return j10;
    }

    /* access modifiers changed from: protected */
    public abstract wd.a a(Object obj, wd.a aVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void a(Object obj, wd wdVar, go goVar);

    /* access modifiers changed from: protected */
    public void e() {
        for (b bVar : this.f13739g.values()) {
            bVar.f13746a.a(bVar.f13747b);
        }
    }

    /* access modifiers changed from: protected */
    public void f() {
        for (b bVar : this.f13739g.values()) {
            bVar.f13746a.b(bVar.f13747b);
        }
    }

    /* access modifiers changed from: protected */
    public void h() {
        for (b bVar : this.f13739g.values()) {
            bVar.f13746a.c(bVar.f13747b);
            bVar.f13746a.a((xd) bVar.f13748c);
            bVar.f13746a.a((y6) bVar.f13748c);
        }
        this.f13739g.clear();
    }

    private final class a implements xd, y6 {

        /* renamed from: a  reason: collision with root package name */
        private final Object f13742a;

        /* renamed from: b  reason: collision with root package name */
        private xd.a f13743b;

        /* renamed from: c  reason: collision with root package name */
        private y6.a f13744c;

        public a(Object obj) {
            this.f13743b = z3.this.b((wd.a) null);
            this.f13744c = z3.this.a((wd.a) null);
            this.f13742a = obj;
        }

        private pd a(pd pdVar) {
            long a10 = z3.this.a(this.f13742a, pdVar.f10627f);
            long a11 = z3.this.a(this.f13742a, pdVar.f10628g);
            if (a10 == pdVar.f10627f && a11 == pdVar.f10628g) {
                return pdVar;
            }
            return new pd(pdVar.f10622a, pdVar.f10623b, pdVar.f10624c, pdVar.f10625d, pdVar.f10626e, a10, a11);
        }

        private boolean f(int i10, wd.a aVar) {
            wd.a aVar2;
            if (aVar != null) {
                aVar2 = z3.this.a(this.f13742a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int a10 = z3.this.a(this.f13742a, i10);
            xd.a aVar3 = this.f13743b;
            if (aVar3.f13316a != a10 || !yp.a((Object) aVar3.f13317b, (Object) aVar2)) {
                this.f13743b = z3.this.a(a10, aVar2, 0);
            }
            y6.a aVar4 = this.f13744c;
            if (aVar4.f13525a == a10 && yp.a((Object) aVar4.f13526b, (Object) aVar2)) {
                return true;
            }
            this.f13744c = z3.this.a(a10, aVar2);
            return true;
        }

        public void b(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f13744c.d();
            }
        }

        public void c(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f13744c.c();
            }
        }

        public void d(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f13744c.a();
            }
        }

        public /* synthetic */ void e(int i10, wd.a aVar) {
            k80.a(this, i10, aVar);
        }

        public void b(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f13743b.c(icVar, a(pdVar));
            }
        }

        public void c(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f13743b.b(icVar, a(pdVar));
            }
        }

        public void a(int i10, wd.a aVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f13743b.a(a(pdVar));
            }
        }

        public void a(int i10, wd.a aVar) {
            if (f(i10, aVar)) {
                this.f13744c.b();
            }
        }

        public void a(int i10, wd.a aVar, int i11) {
            if (f(i10, aVar)) {
                this.f13744c.a(i11);
            }
        }

        public void a(int i10, wd.a aVar, Exception exc) {
            if (f(i10, aVar)) {
                this.f13744c.a(exc);
            }
        }

        public void a(int i10, wd.a aVar, ic icVar, pd pdVar) {
            if (f(i10, aVar)) {
                this.f13743b.a(icVar, a(pdVar));
            }
        }

        public void a(int i10, wd.a aVar, ic icVar, pd pdVar, IOException iOException, boolean z10) {
            if (f(i10, aVar)) {
                this.f13743b.a(icVar, a(pdVar), iOException, z10);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Object obj, wd wdVar) {
        a1.a(!this.f13739g.containsKey(obj));
        w80 w80 = new w80(this, obj);
        a aVar = new a(obj);
        this.f13739g.put(obj, new b(wdVar, w80, aVar));
        wdVar.a((Handler) a1.a((Object) this.f13740h), (xd) aVar);
        wdVar.a((Handler) a1.a((Object) this.f13740h), (y6) aVar);
        wdVar.a((wd.b) w80, this.f13741i);
        if (!g()) {
            wdVar.a((wd.b) w80);
        }
    }

    /* access modifiers changed from: protected */
    public void a(yo yoVar) {
        this.f13741i = yoVar;
        this.f13740h = yp.a();
    }
}
