package c2;

import android.content.Context;
import d2.b;
import rd.a;

/* compiled from: CreationContextFactory_Factory */
public final class j implements b<i> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f5602a;

    /* renamed from: b  reason: collision with root package name */
    private final a<l2.a> f5603b;

    /* renamed from: c  reason: collision with root package name */
    private final a<l2.a> f5604c;

    public j(a<Context> aVar, a<l2.a> aVar2, a<l2.a> aVar3) {
        this.f5602a = aVar;
        this.f5603b = aVar2;
        this.f5604c = aVar3;
    }

    public static j a(a<Context> aVar, a<l2.a> aVar2, a<l2.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, l2.a aVar, l2.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    /* renamed from: b */
    public i get() {
        return c(this.f5602a.get(), this.f5603b.get(), this.f5604c.get());
    }
}
