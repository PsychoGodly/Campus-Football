package re;

import kotlin.jvm.internal.m;

/* compiled from: Channel.kt */
public final class h<T> {

    /* renamed from: b  reason: collision with root package name */
    public static final b f38005b = new b((kotlin.jvm.internal.h) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final c f38006c = new c();

    /* renamed from: a  reason: collision with root package name */
    private final Object f38007a;

    /* compiled from: Channel.kt */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f38008a;

        public a(Throwable th) {
            this.f38008a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && m.a(this.f38008a, ((a) obj).f38008a);
        }

        public int hashCode() {
            Throwable th = this.f38008a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        public String toString() {
            return "Closed(" + this.f38008a + ')';
        }
    }

    /* compiled from: Channel.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.h hVar) {
            this();
        }

        public final <E> Object a(Throwable th) {
            return h.c(new a(th));
        }

        public final <E> Object b() {
            return h.c(h.f38006c);
        }

        public final <E> Object c(E e10) {
            return h.c(e10);
        }
    }

    /* compiled from: Channel.kt */
    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ h(Object obj) {
        this.f38007a = obj;
    }

    public static final /* synthetic */ h b(Object obj) {
        return new h(obj);
    }

    public static <T> Object c(Object obj) {
        return obj;
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof h) && m.a(obj, ((h) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f38008a;
        }
        return null;
    }

    public static final T f(Object obj) {
        if (!(obj instanceof c)) {
            return obj;
        }
        return null;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f38007a, obj);
    }

    public int hashCode() {
        return g(this.f38007a);
    }

    public final /* synthetic */ Object k() {
        return this.f38007a;
    }

    public String toString() {
        return j(this.f38007a);
    }
}
