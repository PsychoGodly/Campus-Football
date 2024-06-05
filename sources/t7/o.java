package t7;

import java.util.ArrayList;
import java.util.List;
import n8.a;
import o8.a;
import p8.a0;
import p8.e0;
import p8.k;
import p8.p;
import r7.a1;
import r7.f1;
import u7.i;
import u7.q;
import u7.r;
import u7.s;
import u7.t;
import u7.w;
import v7.f;
import v7.g;
import w7.a;
import w7.b;
import w7.c;
import w7.d;
import w7.e;
import x7.n0;

/* compiled from: LocalSerializer */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final n0 f30488a;

    /* compiled from: LocalSerializer */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f30489a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f30490b;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        static {
            /*
                w7.c$c[] r0 = w7.c.C0349c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30490b = r0
                r1 = 1
                w7.c$c r2 = w7.c.C0349c.DOCUMENTS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f30490b     // Catch:{ NoSuchFieldError -> 0x001d }
                w7.c$c r3 = w7.c.C0349c.QUERY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                w7.a$c[] r2 = w7.a.c.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f30489a = r2
                w7.a$c r3 = w7.a.c.DOCUMENT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f30489a     // Catch:{ NoSuchFieldError -> 0x0038 }
                w7.a$c r2 = w7.a.c.NO_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f30489a     // Catch:{ NoSuchFieldError -> 0x0043 }
                w7.a$c r1 = w7.a.c.UNKNOWN_DOCUMENT     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: t7.o.a.<clinit>():void");
        }
    }

    public o(n0 n0Var) {
        this.f30488a = n0Var;
    }

    private s b(k kVar, boolean z10) {
        s n10 = s.n(this.f30488a.l(kVar.l0()), this.f30488a.y(kVar.m0()), t.g(kVar.j0()));
        return z10 ? n10.r() : n10;
    }

    private s g(b bVar, boolean z10) {
        s p10 = s.p(this.f30488a.l(bVar.i0()), this.f30488a.y(bVar.j0()));
        return z10 ? p10.r() : p10;
    }

    private s i(d dVar) {
        return s.q(this.f30488a.l(dVar.i0()), this.f30488a.y(dVar.j0()));
    }

    private k k(i iVar) {
        k.b p02 = k.p0();
        p02.G(this.f30488a.L(iVar.getKey()));
        p02.F(iVar.getData().k());
        p02.H(this.f30488a.W(iVar.getVersion().c()));
        return (k) p02.build();
    }

    private b p(i iVar) {
        b.C0348b k02 = b.k0();
        k02.F(this.f30488a.L(iVar.getKey()));
        k02.G(this.f30488a.W(iVar.getVersion().c()));
        return (b) k02.build();
    }

    private d r(i iVar) {
        d.b k02 = d.k0();
        k02.F(this.f30488a.L(iVar.getKey()));
        k02.G(this.f30488a.W(iVar.getVersion().c()));
        return (d) k02.build();
    }

    public q7.i a(o8.a aVar) {
        a1.a aVar2;
        if (aVar.i0().equals(a.c.FIRST)) {
            aVar2 = a1.a.LIMIT_TO_FIRST;
        } else {
            aVar2 = a1.a.LIMIT_TO_LAST;
        }
        return new q7.i(this.f30488a.t(aVar.j0(), aVar.k0()), aVar2);
    }

    public List<q.c> c(n8.a aVar) {
        q.c.a aVar2;
        ArrayList arrayList = new ArrayList();
        for (a.c next : aVar.j0()) {
            r p10 = r.p(next.i0());
            if (next.k0().equals(a.c.d.ARRAY_CONFIG)) {
                aVar2 = q.c.a.CONTAINS;
            } else if (next.j0().equals(a.c.C0316c.ASCENDING)) {
                aVar2 = q.c.a.ASCENDING;
            } else {
                aVar2 = q.c.a.DESCENDING;
            }
            arrayList.add(q.c.c(p10, aVar2));
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public s d(w7.a aVar) {
        int i10 = a.f30489a[aVar.k0().ordinal()];
        if (i10 == 1) {
            return b(aVar.j0(), aVar.l0());
        }
        if (i10 == 2) {
            return g(aVar.m0(), aVar.l0());
        }
        if (i10 == 3) {
            return i(aVar.n0());
        }
        throw y7.b.a("Unknown MaybeDocument %s", aVar);
    }

    public f e(e0 e0Var) {
        return this.f30488a.o(e0Var);
    }

    /* access modifiers changed from: package-private */
    public g f(e eVar) {
        int p02 = eVar.p0();
        y6.q w10 = this.f30488a.w(eVar.q0());
        int o02 = eVar.o0();
        ArrayList arrayList = new ArrayList(o02);
        for (int i10 = 0; i10 < o02; i10++) {
            arrayList.add(this.f30488a.o(eVar.n0(i10)));
        }
        ArrayList arrayList2 = new ArrayList(eVar.s0());
        int i11 = 0;
        while (i11 < eVar.s0()) {
            e0 r02 = eVar.r0(i11);
            int i12 = i11 + 1;
            if (i12 < eVar.s0() && eVar.r0(i12).w0()) {
                y7.b.d(eVar.r0(i11).x0(), "TransformMutation should be preceded by a patch or set mutation", new Object[0]);
                e0.b A0 = e0.A0(r02);
                for (p.c F : eVar.r0(i12).q0().g0()) {
                    A0.F(F);
                }
                arrayList2.add(this.f30488a.o((e0) A0.build()));
                i11 = i12;
            } else {
                arrayList2.add(this.f30488a.o(r02));
            }
            i11++;
        }
        return new g(p02, w10, arrayList, arrayList2);
    }

    /* access modifiers changed from: package-private */
    public i4 h(c cVar) {
        f1 f1Var;
        int u02 = cVar.u0();
        w y10 = this.f30488a.y(cVar.t0());
        w y11 = this.f30488a.y(cVar.p0());
        com.google.protobuf.i s02 = cVar.s0();
        long q02 = cVar.q0();
        int i10 = a.f30490b[cVar.v0().ordinal()];
        if (i10 == 1) {
            f1Var = this.f30488a.e(cVar.o0());
        } else if (i10 == 2) {
            f1Var = this.f30488a.u(cVar.r0());
        } else {
            throw y7.b.a("Unknown targetType %d", cVar.v0());
        }
        return new i4(f1Var, u02, q02, h1.LISTEN, y10, y11, s02, (Integer) null);
    }

    public o8.a j(q7.i iVar) {
        a.c cVar;
        a0.d S = this.f30488a.S(iVar.b());
        a.b l02 = o8.a.l0();
        if (iVar.a().equals(a1.a.LIMIT_TO_FIRST)) {
            cVar = a.c.FIRST;
        } else {
            cVar = a.c.LAST;
        }
        l02.F(cVar);
        l02.G(S.i0());
        l02.H(S.j0());
        return (o8.a) l02.build();
    }

    public n8.a l(List<q.c> list) {
        a.b k02 = n8.a.k0();
        k02.G(a.d.COLLECTION_GROUP);
        for (q.c next : list) {
            a.c.b l02 = a.c.l0();
            l02.G(next.d().d());
            if (next.e() == q.c.a.CONTAINS) {
                l02.F(a.c.C0314a.CONTAINS);
            } else if (next.e() == q.c.a.ASCENDING) {
                l02.H(a.c.C0316c.ASCENDING);
            } else {
                l02.H(a.c.C0316c.DESCENDING);
            }
            k02.F(l02);
        }
        return (n8.a) k02.build();
    }

    /* access modifiers changed from: package-private */
    public w7.a m(i iVar) {
        a.b o02 = w7.a.o0();
        if (iVar.g()) {
            o02.H(p(iVar));
        } else if (iVar.b()) {
            o02.F(k(iVar));
        } else if (iVar.i()) {
            o02.I(r(iVar));
        } else {
            throw y7.b.a("Cannot encode invalid document %s", iVar);
        }
        o02.G(iVar.c());
        return (w7.a) o02.build();
    }

    public e0 n(f fVar) {
        return this.f30488a.O(fVar);
    }

    /* access modifiers changed from: package-private */
    public e o(g gVar) {
        e.b t02 = e.t0();
        t02.H(gVar.e());
        t02.I(this.f30488a.W(gVar.g()));
        for (f O : gVar.d()) {
            t02.F(this.f30488a.O(O));
        }
        for (f O2 : gVar.h()) {
            t02.G(this.f30488a.O(O2));
        }
        return (e) t02.build();
    }

    /* access modifiers changed from: package-private */
    public c q(i4 i4Var) {
        h1 h1Var = h1.LISTEN;
        y7.b.d(h1Var.equals(i4Var.c()), "Only queries with purpose %s may be stored, got %s", h1Var, i4Var.c());
        c.b w02 = c.w0();
        w02.M(i4Var.h()).I(i4Var.e()).H(this.f30488a.Y(i4Var.b())).L(this.f30488a.Y(i4Var.f())).K(i4Var.d());
        f1 g10 = i4Var.g();
        if (g10.s()) {
            w02.G(this.f30488a.F(g10));
        } else {
            w02.J(this.f30488a.S(g10));
        }
        return (c) w02.build();
    }
}
