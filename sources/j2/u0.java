package j2;

import android.content.Context;
import d2.b;
import rd.a;

/* compiled from: SchemaManager_Factory */
public final class u0 implements b<t0> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f19270a;

    /* renamed from: b  reason: collision with root package name */
    private final a<String> f19271b;

    /* renamed from: c  reason: collision with root package name */
    private final a<Integer> f19272c;

    public u0(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        this.f19270a = aVar;
        this.f19271b = aVar2;
        this.f19272c = aVar3;
    }

    public static u0 a(a<Context> aVar, a<String> aVar2, a<Integer> aVar3) {
        return new u0(aVar, aVar2, aVar3);
    }

    public static t0 c(Context context, String str, int i10) {
        return new t0(context, str, i10);
    }

    /* renamed from: b */
    public t0 get() {
        return c(this.f19270a.get(), this.f19271b.get(), this.f19272c.get().intValue());
    }
}
