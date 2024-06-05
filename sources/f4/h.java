package f4;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import k4.n0;
import y3.b;

/* compiled from: TtmlSubtitle */
final class h implements y3.h {

    /* renamed from: a  reason: collision with root package name */
    private final d f18067a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f18068b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f18069c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f18070d;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, String> f18071f;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f18067a = dVar;
        this.f18070d = map2;
        this.f18071f = map3;
        this.f18069c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f18068b = dVar.j();
    }

    public int a(long j10) {
        int e10 = n0.e(this.f18068b, j10, false, false);
        if (e10 < this.f18068b.length) {
            return e10;
        }
        return -1;
    }

    public long c(int i10) {
        return this.f18068b[i10];
    }

    public List<b> d(long j10) {
        return this.f18067a.h(j10, this.f18069c, this.f18070d, this.f18071f);
    }

    public int e() {
        return this.f18068b.length;
    }
}
