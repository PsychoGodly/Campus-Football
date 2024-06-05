package r6;

import com.applovin.mediation.MaxReward;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;

/* compiled from: MoreObjects */
public final class i {

    /* compiled from: MoreObjects */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final String f29808a;

        /* renamed from: b  reason: collision with root package name */
        private final C0330b f29809b;

        /* renamed from: c  reason: collision with root package name */
        private C0330b f29810c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29811d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f29812e;

        /* compiled from: MoreObjects */
        private static final class a extends C0330b {
            private a() {
                super();
            }
        }

        /* renamed from: r6.i$b$b  reason: collision with other inner class name */
        /* compiled from: MoreObjects */
        private static class C0330b {

            /* renamed from: a  reason: collision with root package name */
            String f29813a;

            /* renamed from: b  reason: collision with root package name */
            Object f29814b;

            /* renamed from: c  reason: collision with root package name */
            C0330b f29815c;

            private C0330b() {
            }
        }

        private C0330b f() {
            C0330b bVar = new C0330b();
            this.f29810c.f29815c = bVar;
            this.f29810c = bVar;
            return bVar;
        }

        private b g(Object obj) {
            f().f29814b = obj;
            return this;
        }

        private b h(String str, Object obj) {
            C0330b f10 = f();
            f10.f29814b = obj;
            f10.f29813a = (String) o.o(str);
            return this;
        }

        private a i() {
            a aVar = new a();
            this.f29810c.f29815c = aVar;
            this.f29810c = aVar;
            return aVar;
        }

        private b j(String str, Object obj) {
            a i10 = i();
            i10.f29814b = obj;
            i10.f29813a = (String) o.o(str);
            return this;
        }

        private static boolean l(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof l) {
                    return !((l) obj).c();
                }
                if (!obj.getClass().isArray() || Array.getLength(obj) != 0) {
                    return false;
                }
                return true;
            }
        }

        public b a(String str, double d10) {
            return j(str, String.valueOf(d10));
        }

        public b b(String str, int i10) {
            return j(str, String.valueOf(i10));
        }

        public b c(String str, long j10) {
            return j(str, String.valueOf(j10));
        }

        public b d(String str, Object obj) {
            return h(str, obj);
        }

        public b e(String str, boolean z10) {
            return j(str, String.valueOf(z10));
        }

        public b k(Object obj) {
            return g(obj);
        }

        public b m() {
            this.f29811d = true;
            return this;
        }

        public String toString() {
            boolean z10 = this.f29811d;
            boolean z11 = this.f29812e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f29808a);
            sb2.append('{');
            String str = MaxReward.DEFAULT_LABEL;
            for (C0330b bVar = this.f29809b.f29815c; bVar != null; bVar = bVar.f29815c) {
                Object obj = bVar.f29814b;
                if (!(bVar instanceof a)) {
                    if (obj == null) {
                        if (z10) {
                        }
                    } else if (z11 && l(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = bVar.f29813a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append('=');
                }
                if (obj == null || !obj.getClass().isArray()) {
                    sb2.append(obj);
                } else {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append(deepToString, 1, deepToString.length() - 1);
                }
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }

        private b(String str) {
            C0330b bVar = new C0330b();
            this.f29809b = bVar;
            this.f29810c = bVar;
            this.f29811d = false;
            this.f29812e = false;
            this.f29808a = (String) o.o(str);
        }
    }

    public static <T> T a(T t10, T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    public static b b(Class<?> cls) {
        return new b(cls.getSimpleName());
    }

    public static b c(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
