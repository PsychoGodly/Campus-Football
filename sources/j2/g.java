package j2;

import d2.b;
import d2.d;

/* compiled from: EventStoreModule_DbNameFactory */
public final class g implements b<String> {

    /* compiled from: EventStoreModule_DbNameFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final g f19243a = new g();
    }

    public static g a() {
        return a.f19243a;
    }

    public static String b() {
        return (String) d.c(f.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: c */
    public String get() {
        return b();
    }
}
