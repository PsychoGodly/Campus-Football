package pe;

import fe.p;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.z;
import xd.d;
import xd.e;
import xd.g;
import xd.h;

/* compiled from: CoroutineContext.kt */
public final class j0 {

    /* compiled from: CoroutineContext.kt */
    static final class a extends n implements p<g, g.b, g> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f37321a = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            if (bVar instanceof h0) {
                return gVar.plus(((h0) bVar).e0());
            }
            return gVar.plus(bVar);
        }
    }

    /* compiled from: CoroutineContext.kt */
    static final class b extends n implements p<g, g.b, g> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ z<g> f37322a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f37323b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(z<g> zVar, boolean z10) {
            super(2);
            this.f37322a = zVar;
            this.f37323b = z10;
        }

        /* renamed from: a */
        public final g invoke(g gVar, g.b bVar) {
            if (!(bVar instanceof h0)) {
                return gVar.plus(bVar);
            }
            g.b bVar2 = ((g) this.f37322a.f36055a).get(bVar.getKey());
            if (bVar2 == null) {
                h0 h0Var = (h0) bVar;
                if (this.f37323b) {
                    h0Var = h0Var.e0();
                }
                return gVar.plus(h0Var);
            }
            z<g> zVar = this.f37322a;
            zVar.f36055a = ((g) zVar.f36055a).minusKey(bVar.getKey());
            return gVar.plus(((h0) bVar).Z(bVar2));
        }
    }

    /* compiled from: CoroutineContext.kt */
    static final class c extends n implements p<Boolean, g.b, Boolean> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f37324a = new c();

        c() {
            super(2);
        }

        public final Boolean a(boolean z10, g.b bVar) {
            return Boolean.valueOf(z10 || (bVar instanceof h0));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Boolean) obj).booleanValue(), (g.b) obj2);
        }
    }

    private static final g a(g gVar, g gVar2, boolean z10) {
        boolean c10 = c(gVar);
        boolean c11 = c(gVar2);
        if (!c10 && !c11) {
            return gVar.plus(gVar2);
        }
        z zVar = new z();
        zVar.f36055a = gVar2;
        h hVar = h.f39347a;
        g gVar3 = (g) gVar.fold(hVar, new b(zVar, z10));
        if (c11) {
            zVar.f36055a = ((g) zVar.f36055a).fold(hVar, a.f37321a);
        }
        return gVar3.plus((g) zVar.f36055a);
    }

    public static final String b(g gVar) {
        n0 n0Var;
        String str;
        if (!t0.c() || (n0Var = (n0) gVar.get(n0.f37365b)) == null) {
            return null;
        }
        o0 o0Var = (o0) gVar.get(o0.f37377b);
        if (o0Var == null || (str = o0Var.X0()) == null) {
            str = "coroutine";
        }
        return str + '#' + n0Var.X0();
    }

    private static final boolean c(g gVar) {
        return ((Boolean) gVar.fold(Boolean.FALSE, c.f37324a)).booleanValue();
    }

    public static final g d(p0 p0Var, g gVar) {
        g a10 = a(p0Var.getCoroutineContext(), gVar, true);
        g plus = t0.c() ? a10.plus(new n0(t0.b().incrementAndGet())) : a10;
        return (a10 == g1.a() || a10.get(e.E1) != null) ? plus : plus.plus(g1.a());
    }

    public static final g e(g gVar, g gVar2) {
        if (!c(gVar2)) {
            return gVar.plus(gVar2);
        }
        return a(gVar, gVar2, false);
    }

    public static final i3<?> f(kotlin.coroutines.jvm.internal.e eVar) {
        while (!(eVar instanceof c1) && (eVar = eVar.getCallerFrame()) != null) {
            if (eVar instanceof i3) {
                return (i3) eVar;
            }
        }
        return null;
    }

    public static final i3<?> g(d<?> dVar, g gVar, Object obj) {
        if (!(dVar instanceof kotlin.coroutines.jvm.internal.e)) {
            return null;
        }
        if (!(gVar.get(j3.f37327a) != null)) {
            return null;
        }
        i3<?> f10 = f((kotlin.coroutines.jvm.internal.e) dVar);
        if (f10 != null) {
            f10.V0(gVar, obj);
        }
        return f10;
    }
}
