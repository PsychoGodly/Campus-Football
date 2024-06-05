package i2;

import d2.b;
import j2.d;
import java.util.concurrent.Executor;
import rd.a;

/* compiled from: WorkInitializer_Factory */
public final class x implements b<w> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Executor> f18915a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f18916b;

    /* renamed from: c  reason: collision with root package name */
    private final a<y> f18917c;

    /* renamed from: d  reason: collision with root package name */
    private final a<k2.b> f18918d;

    public x(a<Executor> aVar, a<d> aVar2, a<y> aVar3, a<k2.b> aVar4) {
        this.f18915a = aVar;
        this.f18916b = aVar2;
        this.f18917c = aVar3;
        this.f18918d = aVar4;
    }

    public static x a(a<Executor> aVar, a<d> aVar2, a<y> aVar3, a<k2.b> aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static w c(Executor executor, d dVar, y yVar, k2.b bVar) {
        return new w(executor, dVar, yVar, bVar);
    }

    /* renamed from: b */
    public w get() {
        return c(this.f18915a.get(), this.f18916b.get(), this.f18917c.get(), this.f18918d.get());
    }
}
