package b2;

import d2.b;
import h2.e;
import i2.s;
import i2.w;
import rd.a;

/* compiled from: TransportRuntime_Factory */
public final class v implements b<t> {

    /* renamed from: a  reason: collision with root package name */
    private final a<l2.a> f5452a;

    /* renamed from: b  reason: collision with root package name */
    private final a<l2.a> f5453b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f5454c;

    /* renamed from: d  reason: collision with root package name */
    private final a<s> f5455d;

    /* renamed from: e  reason: collision with root package name */
    private final a<w> f5456e;

    public v(a<l2.a> aVar, a<l2.a> aVar2, a<e> aVar3, a<s> aVar4, a<w> aVar5) {
        this.f5452a = aVar;
        this.f5453b = aVar2;
        this.f5454c = aVar3;
        this.f5455d = aVar4;
        this.f5456e = aVar5;
    }

    public static v a(a<l2.a> aVar, a<l2.a> aVar2, a<e> aVar3, a<s> aVar4, a<w> aVar5) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static t c(l2.a aVar, l2.a aVar2, e eVar, s sVar, w wVar) {
        return new t(aVar, aVar2, eVar, sVar, wVar);
    }

    /* renamed from: b */
    public t get() {
        return c(this.f5452a.get(), this.f5453b.get(), this.f5454c.get(), this.f5455d.get(), this.f5456e.get());
    }
}
