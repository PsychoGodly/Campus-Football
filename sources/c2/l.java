package c2;

import android.content.Context;
import d2.b;
import rd.a;

/* compiled from: MetadataBackendRegistry_Factory */
public final class l implements b<k> {

    /* renamed from: a  reason: collision with root package name */
    private final a<Context> f5610a;

    /* renamed from: b  reason: collision with root package name */
    private final a<i> f5611b;

    public l(a<Context> aVar, a<i> aVar2) {
        this.f5610a = aVar;
        this.f5611b = aVar2;
    }

    public static l a(a<Context> aVar, a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    /* renamed from: b */
    public k get() {
        return c(this.f5610a.get(), this.f5611b.get());
    }
}
