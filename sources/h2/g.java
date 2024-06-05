package h2;

import d2.b;
import d2.d;
import rd.a;

/* compiled from: SchedulingConfigModule_ConfigFactory */
public final class g implements b<i2.g> {

    /* renamed from: a  reason: collision with root package name */
    private final a<l2.a> f18729a;

    public g(a<l2.a> aVar) {
        this.f18729a = aVar;
    }

    public static i2.g a(l2.a aVar) {
        return (i2.g) d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(a<l2.a> aVar) {
        return new g(aVar);
    }

    /* renamed from: c */
    public i2.g get() {
        return a(this.f18729a.get());
    }
}
