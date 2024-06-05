package i4;

import j4.f;
import n2.c4;
import n2.q;
import n2.r3;
import p2.e;
import p3.x;
import p3.z0;

/* compiled from: TrackSelector */
public abstract class b0 {

    /* renamed from: a  reason: collision with root package name */
    private a f18954a;

    /* renamed from: b  reason: collision with root package name */
    private f f18955b;

    /* compiled from: TrackSelector */
    public interface a {
        void b();
    }

    /* access modifiers changed from: protected */
    public final f a() {
        return (f) k4.a.h(this.f18955b);
    }

    public void b(a aVar, f fVar) {
        this.f18954a = aVar;
        this.f18955b = fVar;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        a aVar = this.f18954a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public boolean d() {
        return false;
    }

    public abstract void e(Object obj);

    public void f() {
        this.f18954a = null;
        this.f18955b = null;
    }

    public abstract c0 g(r3[] r3VarArr, z0 z0Var, x.b bVar, c4 c4Var) throws q;

    public void h(e eVar) {
    }
}
