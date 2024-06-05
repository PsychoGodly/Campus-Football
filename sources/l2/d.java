package l2;

import d2.b;

/* compiled from: TimeModule_UptimeClockFactory */
public final class d implements b<a> {

    /* compiled from: TimeModule_UptimeClockFactory */
    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final d f19876a = new d();
    }

    public static d a() {
        return a.f19876a;
    }

    public static a c() {
        return (a) d2.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    /* renamed from: b */
    public a get() {
        return c();
    }
}
