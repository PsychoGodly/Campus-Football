package h2;

import android.content.Context;
import d2.b;
import i2.g;
import i2.y;
import j2.d;
import rd.a;

/* compiled from: SchedulingModule_WorkSchedulerFactory */
public final class i implements b<y> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f18730a;

    /* renamed from: b  reason: collision with root package name */
    private final a<d> f18731b;

    /* renamed from: c  reason: collision with root package name */
    private final a<g> f18732c;

    /* renamed from: d  reason: collision with root package name */
    private final a<l2.a> f18733d;

    public i(a<Context> aVar, a<d> aVar2, a<g> aVar3, a<l2.a> aVar4) {
        this.f18730a = aVar;
        this.f18731b = aVar2;
        this.f18732c = aVar3;
        this.f18733d = aVar4;
    }

    public static i a(a<Context> aVar, a<d> aVar2, a<g> aVar3, a<l2.a> aVar4) {
        return new i(aVar, aVar2, aVar3, aVar4);
    }

    public static y c(Context context, d dVar, g gVar, l2.a aVar) {
        return (y) d2.d.c(h.a(context, dVar, gVar, aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public y get() {
        return c(this.f18730a.get(), this.f18731b.get(), this.f18732c.get(), this.f18733d.get());
    }
}
