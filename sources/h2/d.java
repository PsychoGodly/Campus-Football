package h2;

import c2.e;
import d2.b;
import i2.y;
import java.util.concurrent.Executor;
import rd.a;

/* compiled from: DefaultScheduler_Factory */
public final class d implements b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f18724a;

    /* renamed from: b  reason: collision with root package name */
    private final a<e> f18725b;

    /* renamed from: c  reason: collision with root package name */
    private final a<y> f18726c;

    /* renamed from: d  reason: collision with root package name */
    private final a<j2.d> f18727d;

    /* renamed from: e  reason: collision with root package name */
    private final a<k2.b> f18728e;

    public d(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j2.d> aVar4, a<k2.b> aVar5) {
        this.f18724a = aVar;
        this.f18725b = aVar2;
        this.f18726c = aVar3;
        this.f18727d = aVar4;
        this.f18728e = aVar5;
    }

    public static d a(a<Executor> aVar, a<e> aVar2, a<y> aVar3, a<j2.d> aVar4, a<k2.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, e eVar, y yVar, j2.d dVar, k2.b bVar) {
        return new c(executor, eVar, yVar, dVar, bVar);
    }

    /* renamed from: b */
    public c get() {
        return c(this.f18724a.get(), this.f18725b.get(), this.f18726c.get(), this.f18727d.get(), this.f18728e.get());
    }
}
