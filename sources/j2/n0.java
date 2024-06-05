package j2;

import d2.b;
import rd.a;

/* compiled from: SQLiteEventStore_Factory */
public final class n0 implements b<m0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<l2.a> f19255a;

    /* renamed from: b  reason: collision with root package name */
    private final a<l2.a> f19256b;

    /* renamed from: c  reason: collision with root package name */
    private final a<e> f19257c;

    /* renamed from: d  reason: collision with root package name */
    private final a<t0> f19258d;

    /* renamed from: e  reason: collision with root package name */
    private final a<String> f19259e;

    public n0(a<l2.a> aVar, a<l2.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        this.f19255a = aVar;
        this.f19256b = aVar2;
        this.f19257c = aVar3;
        this.f19258d = aVar4;
        this.f19259e = aVar5;
    }

    public static n0 a(a<l2.a> aVar, a<l2.a> aVar2, a<e> aVar3, a<t0> aVar4, a<String> aVar5) {
        return new n0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static m0 c(l2.a aVar, l2.a aVar2, Object obj, Object obj2, a<String> aVar3) {
        return new m0(aVar, aVar2, (e) obj, (t0) obj2, aVar3);
    }

    /* renamed from: b */
    public m0 get() {
        return c(this.f19255a.get(), this.f19256b.get(), this.f19257c.get(), this.f19258d.get(), this.f19259e);
    }
}
