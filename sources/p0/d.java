package p0;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: CreationExtras.kt */
public final class d extends a {
    public d() {
        this((a) null, 1, (h) null);
    }

    public d(a aVar) {
        m.e(aVar, "initialExtras");
        b().putAll(aVar.b());
    }

    public <T> T a(a.b<T> bVar) {
        m.e(bVar, "key");
        return b().get(bVar);
    }

    public final <T> void c(a.b<T> bVar, T t10) {
        m.e(bVar, "key");
        b().put(bVar, t10);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(a aVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.C0220a.f21097b : aVar);
    }
}
