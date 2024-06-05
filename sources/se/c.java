package se;

import fe.p;
import kotlin.jvm.internal.h;
import re.a;
import re.r;
import sd.w;
import te.e;
import xd.d;
import xd.g;

/* compiled from: Builders.kt */
class c<T> extends e<T> {

    /* renamed from: d  reason: collision with root package name */
    private final p<r<? super T>, d<? super w>, Object> f38174d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(p pVar, g gVar, int i10, a aVar, int i11, h hVar) {
        this(pVar, (i11 & 2) != 0 ? xd.h.f39347a : gVar, (i11 & 4) != 0 ? -2 : i10, (i11 & 8) != 0 ? a.SUSPEND : aVar);
    }

    static /* synthetic */ <T> Object n(c<T> cVar, r<? super T> rVar, d<? super w> dVar) {
        Object invoke = cVar.f38174d.invoke(rVar, dVar);
        return invoke == d.c() ? invoke : w.f38141a;
    }

    /* access modifiers changed from: protected */
    public Object h(r<? super T> rVar, d<? super w> dVar) {
        return n(this, rVar, dVar);
    }

    /* access modifiers changed from: protected */
    public e<T> i(g gVar, int i10, a aVar) {
        return new c(this.f38174d, gVar, i10, aVar);
    }

    public String toString() {
        return "block[" + this.f38174d + "] -> " + super.toString();
    }

    public c(p<? super r<? super T>, ? super d<? super w>, ? extends Object> pVar, g gVar, int i10, a aVar) {
        super(gVar, i10, aVar);
        this.f38174d = pVar;
    }
}
