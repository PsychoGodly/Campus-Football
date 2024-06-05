package u3;

import a3.g;
import c3.e;
import c3.h;
import c3.h0;
import java.io.IOException;
import k4.a;
import k4.j0;
import n2.r1;
import s2.a0;
import s2.l;
import s2.m;
import s2.n;
import z2.f;

/* compiled from: BundledHlsMediaChunkExtractor */
public final class b implements j {

    /* renamed from: d  reason: collision with root package name */
    private static final a0 f22844d = new a0();

    /* renamed from: a  reason: collision with root package name */
    final l f22845a;

    /* renamed from: b  reason: collision with root package name */
    private final r1 f22846b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f22847c;

    public b(l lVar, r1 r1Var, j0 j0Var) {
        this.f22845a = lVar;
        this.f22846b = r1Var;
        this.f22847c = j0Var;
    }

    public boolean a(m mVar) throws IOException {
        return this.f22845a.g(mVar, f22844d) == 0;
    }

    public void b(n nVar) {
        this.f22845a.b(nVar);
    }

    public void c() {
        this.f22845a.c(0, 0);
    }

    public boolean d() {
        l lVar = this.f22845a;
        return (lVar instanceof h) || (lVar instanceof c3.b) || (lVar instanceof e) || (lVar instanceof f);
    }

    public boolean e() {
        l lVar = this.f22845a;
        return (lVar instanceof h0) || (lVar instanceof g);
    }

    public j f() {
        l lVar;
        a.f(!e());
        l lVar2 = this.f22845a;
        if (lVar2 instanceof t) {
            lVar = new t(this.f22846b.f20645c, this.f22847c);
        } else if (lVar2 instanceof h) {
            lVar = new h();
        } else if (lVar2 instanceof c3.b) {
            lVar = new c3.b();
        } else if (lVar2 instanceof e) {
            lVar = new e();
        } else if (lVar2 instanceof f) {
            lVar = new f();
        } else {
            throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f22845a.getClass().getSimpleName());
        }
        return new b(lVar, this.f22846b, this.f22847c);
    }
}
