package j2;

import d2.b;
import d2.d;

/* compiled from: EventStoreModule_StoreConfigFactory */
public final class j implements b<e> {

    /* compiled from: EventStoreModule_StoreConfigFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final j f19246a = new j();
    }

    public static j a() {
        return a.f19246a;
    }

    public static e c() {
        return (e) d.c(f.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public e get() {
        return c();
    }
}
