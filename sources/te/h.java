package te;

import re.a;
import sd.w;
import se.e;
import se.f;
import xd.d;
import xd.g;

/* compiled from: ChannelFlow.kt */
public final class h<T> extends g<T, T> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(e eVar, g gVar, int i10, a aVar, int i11, kotlin.jvm.internal.h hVar) {
        this(eVar, (i11 & 2) != 0 ? xd.h.f39347a : gVar, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? a.SUSPEND : aVar);
    }

    /* access modifiers changed from: protected */
    public e<T> i(g gVar, int i10, a aVar) {
        return new h(this.f38659d, gVar, i10, aVar);
    }

    public e<T> j() {
        return this.f38659d;
    }

    /* access modifiers changed from: protected */
    public Object q(f<? super T> fVar, d<? super w> dVar) {
        Object collect = this.f38659d.collect(fVar, dVar);
        return collect == d.c() ? collect : w.f38141a;
    }

    public h(e<? extends T> eVar, g gVar, int i10, a aVar) {
        super(eVar, gVar, i10, aVar);
    }
}
