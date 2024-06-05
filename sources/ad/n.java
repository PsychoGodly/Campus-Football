package ad;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Map;
import lc.r;

/* compiled from: Messages */
public class n {

    /* compiled from: Messages */
    public interface a {
        i a(c cVar);

        void b(g gVar);

        void c(h hVar);

        h d(i iVar);

        void e(j jVar);

        void f(i iVar);

        void g(e eVar);

        void h(i iVar);

        void i(i iVar);

        void initialize();

        void j(f fVar);
    }

    /* compiled from: Messages */
    private static class b extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final b f31546d = new b();

        private b() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return c.a((ArrayList) f(byteBuffer));
                case -127:
                    return e.a((ArrayList) f(byteBuffer));
                case -126:
                    return f.a((ArrayList) f(byteBuffer));
                case -125:
                    return g.a((ArrayList) f(byteBuffer));
                case -124:
                    return h.a((ArrayList) f(byteBuffer));
                case -123:
                    return i.a((ArrayList) f(byteBuffer));
                case -122:
                    return j.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof c) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((c) obj).l());
            } else if (obj instanceof e) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((e) obj).f());
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((f) obj).d());
            } else if (obj instanceof g) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((g) obj).f());
            } else if (obj instanceof h) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((h) obj).f());
            } else if (obj instanceof i) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((i) obj).d());
            } else if (obj instanceof j) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((j) obj).f());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: Messages */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private String f31547a;

        /* renamed from: b  reason: collision with root package name */
        private String f31548b;

        /* renamed from: c  reason: collision with root package name */
        private String f31549c;

        /* renamed from: d  reason: collision with root package name */
        private String f31550d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, String> f31551e;

        c() {
        }

        static c a(ArrayList<Object> arrayList) {
            c cVar = new c();
            cVar.g((String) arrayList.get(0));
            cVar.k((String) arrayList.get(1));
            cVar.j((String) arrayList.get(2));
            cVar.h((String) arrayList.get(3));
            cVar.i((Map) arrayList.get(4));
            return cVar;
        }

        public String b() {
            return this.f31547a;
        }

        public String c() {
            return this.f31550d;
        }

        public Map<String, String> d() {
            return this.f31551e;
        }

        public String e() {
            return this.f31549c;
        }

        public String f() {
            return this.f31548b;
        }

        public void g(String str) {
            this.f31547a = str;
        }

        public void h(String str) {
            this.f31550d = str;
        }

        public void i(Map<String, String> map) {
            if (map != null) {
                this.f31551e = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"httpHeaders\" is null.");
        }

        public void j(String str) {
            this.f31549c = str;
        }

        public void k(String str) {
            this.f31548b = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> l() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f31547a);
            arrayList.add(this.f31548b);
            arrayList.add(this.f31549c);
            arrayList.add(this.f31550d);
            arrayList.add(this.f31551e);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static class d extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f31552a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f31553b;
    }

    /* compiled from: Messages */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private Long f31554a;

        /* renamed from: b  reason: collision with root package name */
        private Boolean f31555b;

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            Long l10;
            e eVar = new e();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            eVar.e(l10);
            eVar.d((Boolean) arrayList.get(1));
            return eVar;
        }

        public Boolean b() {
            return this.f31555b;
        }

        public Long c() {
            return this.f31554a;
        }

        public void d(Boolean bool) {
            if (bool != null) {
                this.f31555b = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isLooping\" is null.");
        }

        public void e(Long l10) {
            if (l10 != null) {
                this.f31554a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f31554a);
            arrayList.add(this.f31555b);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f31556a;

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            f fVar = new f();
            fVar.c((Boolean) arrayList.get(0));
            return fVar;
        }

        public Boolean b() {
            return this.f31556a;
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f31556a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"mixWithOthers\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f31556a);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static final class g {

        /* renamed from: a  reason: collision with root package name */
        private Long f31557a;

        /* renamed from: b  reason: collision with root package name */
        private Double f31558b;

        g() {
        }

        static g a(ArrayList<Object> arrayList) {
            Long l10;
            g gVar = new g();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            gVar.e(l10);
            gVar.d((Double) arrayList.get(1));
            return gVar;
        }

        public Double b() {
            return this.f31558b;
        }

        public Long c() {
            return this.f31557a;
        }

        public void d(Double d10) {
            if (d10 != null) {
                this.f31558b = d10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"speed\" is null.");
        }

        public void e(Long l10) {
            if (l10 != null) {
                this.f31557a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f31557a);
            arrayList.add(this.f31558b);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        private Long f31559a;

        /* renamed from: b  reason: collision with root package name */
        private Long f31560b;

        /* compiled from: Messages */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f31561a;

            /* renamed from: b  reason: collision with root package name */
            private Long f31562b;

            public h a() {
                h hVar = new h();
                hVar.e(this.f31561a);
                hVar.d(this.f31562b);
                return hVar;
            }

            public a b(Long l10) {
                this.f31562b = l10;
                return this;
            }

            public a c(Long l10) {
                this.f31561a = l10;
                return this;
            }
        }

        h() {
        }

        static h a(ArrayList<Object> arrayList) {
            Long l10;
            h hVar = new h();
            Object obj = arrayList.get(0);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            hVar.e(l10);
            Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            hVar.d(l11);
            return hVar;
        }

        public Long b() {
            return this.f31560b;
        }

        public Long c() {
            return this.f31559a;
        }

        public void d(Long l10) {
            if (l10 != null) {
                this.f31560b = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"position\" is null.");
        }

        public void e(Long l10) {
            if (l10 != null) {
                this.f31559a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f31559a);
            arrayList.add(this.f31560b);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        private Long f31563a;

        /* compiled from: Messages */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f31564a;

            public i a() {
                i iVar = new i();
                iVar.c(this.f31564a);
                return iVar;
            }

            public a b(Long l10) {
                this.f31564a = l10;
                return this;
            }
        }

        i() {
        }

        static i a(ArrayList<Object> arrayList) {
            Long l10;
            i iVar = new i();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            iVar.c(l10);
            return iVar;
        }

        public Long b() {
            return this.f31563a;
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f31563a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f31563a);
            return arrayList;
        }
    }

    /* compiled from: Messages */
    public static final class j {

        /* renamed from: a  reason: collision with root package name */
        private Long f31565a;

        /* renamed from: b  reason: collision with root package name */
        private Double f31566b;

        j() {
        }

        static j a(ArrayList<Object> arrayList) {
            Long l10;
            j jVar = new j();
            Object obj = arrayList.get(0);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            jVar.d(l10);
            jVar.e((Double) arrayList.get(1));
            return jVar;
        }

        public Long b() {
            return this.f31565a;
        }

        public Double c() {
            return this.f31566b;
        }

        public void d(Long l10) {
            if (l10 != null) {
                this.f31565a = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"textureId\" is null.");
        }

        public void e(Double d10) {
            if (d10 != null) {
                this.f31566b = d10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"volume\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f31565a);
            arrayList.add(this.f31566b);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f31552a);
            arrayList.add(dVar.getMessage());
            arrayList.add(dVar.f31553b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
