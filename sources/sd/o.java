package sd;

import java.io.Serializable;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: Result.kt */
public final class o<T> implements Serializable {

    /* renamed from: b  reason: collision with root package name */
    public static final a f38128b = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final Object f38129a;

    /* compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* compiled from: Result.kt */
    public static final class b implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f38130a;

        public b(Throwable th) {
            m.e(th, "exception");
            this.f38130a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && m.a(this.f38130a, ((b) obj).f38130a);
        }

        public int hashCode() {
            return this.f38130a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f38130a + ')';
        }
    }

    private /* synthetic */ o(Object obj) {
        this.f38129a = obj;
    }

    public static final /* synthetic */ o a(Object obj) {
        return new o(obj);
    }

    public static <T> Object b(Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof o) && m.a(obj, ((o) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f38130a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f38129a, obj);
    }

    public int hashCode() {
        return e(this.f38129a);
    }

    public final /* synthetic */ Object i() {
        return this.f38129a;
    }

    public String toString() {
        return h(this.f38129a);
    }
}
