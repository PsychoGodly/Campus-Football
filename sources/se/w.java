package se;

import pe.c2;
import re.a;
import te.p;
import xd.d;
import xd.g;

/* compiled from: Share.kt */
final class w<T> implements z<T>, e, p<T> {

    /* renamed from: a  reason: collision with root package name */
    private final c2 f38370a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ z<T> f38371b;

    public w(z<? extends T> zVar, c2 c2Var) {
        this.f38370a = c2Var;
        this.f38371b = zVar;
    }

    public Object collect(f<? super T> fVar, d<?> dVar) {
        return this.f38371b.collect(fVar, dVar);
    }

    public e<T> d(g gVar, int i10, a aVar) {
        return b0.e(this, gVar, i10, aVar);
    }
}
