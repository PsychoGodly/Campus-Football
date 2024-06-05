package b2;

import android.content.Context;
import h2.e;
import i2.s;
import i2.w;
import java.util.Collections;
import java.util.Set;
import l2.a;
import z1.b;
import z1.g;
import z1.h;

/* compiled from: TransportRuntime */
public class t implements s {

    /* renamed from: e  reason: collision with root package name */
    private static volatile u f5447e;

    /* renamed from: a  reason: collision with root package name */
    private final a f5448a;

    /* renamed from: b  reason: collision with root package name */
    private final a f5449b;

    /* renamed from: c  reason: collision with root package name */
    private final e f5450c;

    /* renamed from: d  reason: collision with root package name */
    private final s f5451d;

    t(a aVar, a aVar2, e eVar, s sVar, w wVar) {
        this.f5448a = aVar;
        this.f5449b = aVar2;
        this.f5450c = eVar;
        this.f5451d = sVar;
        wVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f5448a.a()).k(this.f5449b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f5447e;
        if (uVar != null) {
            return uVar.i();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set<b> d(f fVar) {
        if (fVar instanceof g) {
            return Collections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(b.b("proto"));
    }

    public static void f(Context context) {
        if (f5447e == null) {
            synchronized (t.class) {
                if (f5447e == null) {
                    f5447e = e.j().a(context).build();
                }
            }
        }
    }

    public void a(n nVar, h hVar) {
        this.f5450c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public s e() {
        return this.f5451d;
    }

    public g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.getName()).c(fVar.l()).a(), this);
    }
}
