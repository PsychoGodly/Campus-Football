package se;

import pe.c2;
import re.a;
import te.p;
import xd.d;
import xd.g;

/* compiled from: Share.kt */
final class x<T> implements i0<T>, e, p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c2 f38372a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ i0<T> f38373b;

    public x(i0<? extends T> i0Var, c2 c2Var) {
        this.f38372a = c2Var;
        this.f38373b = i0Var;
    }

    public Object collect(f<? super T> fVar, d<?> dVar) {
        return this.f38373b.collect(fVar, dVar);
    }

    public e<T> d(g gVar, int i10, a aVar) {
        return k0.d(this, gVar, i10, aVar);
    }
}
