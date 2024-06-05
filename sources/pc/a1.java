package pc;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: GeneratedAndroidFirebaseAuth */
public class a1 {

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public enum a {
        UNKNOWN(0),
        PASSWORD_RESET(1),
        VERIFY_EMAIL(2),
        RECOVER_EMAIL(3),
        EMAIL_SIGN_IN(4),
        VERIFY_AND_CHANGE_EMAIL(5),
        REVERT_SECOND_FACTOR_ADDITION(6);
        

        /* renamed from: a  reason: collision with root package name */
        final int f36902a;

        private a(int i10) {
            this.f36902a = i10;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class a0 {

        /* renamed from: a  reason: collision with root package name */
        private b0 f36903a;

        /* renamed from: b  reason: collision with root package name */
        private r f36904b;

        /* renamed from: c  reason: collision with root package name */
        private s f36905c;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private b0 f36906a;

            /* renamed from: b  reason: collision with root package name */
            private r f36907b;

            /* renamed from: c  reason: collision with root package name */
            private s f36908c;

            public a0 a() {
                a0 a0Var = new a0();
                a0Var.d(this.f36906a);
                a0Var.b(this.f36907b);
                a0Var.c(this.f36908c);
                return a0Var;
            }

            public a b(r rVar) {
                this.f36907b = rVar;
                return this;
            }

            public a c(s sVar) {
                this.f36908c = sVar;
                return this;
            }

            public a d(b0 b0Var) {
                this.f36906a = b0Var;
                return this;
            }
        }

        static a0 a(ArrayList<Object> arrayList) {
            b0 b0Var;
            r rVar;
            a0 a0Var = new a0();
            Object obj = arrayList.get(0);
            s sVar = null;
            if (obj == null) {
                b0Var = null;
            } else {
                b0Var = b0.a((ArrayList) obj);
            }
            a0Var.d(b0Var);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                rVar = null;
            } else {
                rVar = r.a((ArrayList) obj2);
            }
            a0Var.b(rVar);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                sVar = s.a((ArrayList) obj3);
            }
            a0Var.c(sVar);
            return a0Var;
        }

        public void b(r rVar) {
            this.f36904b = rVar;
        }

        public void c(s sVar) {
            this.f36905c = sVar;
        }

        public void d(b0 b0Var) {
            this.f36903a = b0Var;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> e() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            b0 b0Var = this.f36903a;
            ArrayList<Object> arrayList2 = null;
            arrayList.add(b0Var == null ? null : b0Var.d());
            r rVar = this.f36904b;
            arrayList.add(rVar == null ? null : rVar.g());
            s sVar = this.f36905c;
            if (sVar != null) {
                arrayList2 = sVar.f();
            }
            arrayList.add(arrayList2);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private String f36909a;

        /* renamed from: b  reason: collision with root package name */
        private String f36910b;

        b() {
        }

        static b a(ArrayList<Object> arrayList) {
            b bVar = new b();
            bVar.d((String) arrayList.get(0));
            bVar.e((String) arrayList.get(1));
            return bVar;
        }

        public String b() {
            return this.f36909a;
        }

        public String c() {
            return this.f36910b;
        }

        public void d(String str) {
            if (str != null) {
                this.f36909a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appName\" is null.");
        }

        public void e(String str) {
            this.f36910b = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f36909a);
            arrayList.add(this.f36910b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class b0 {

        /* renamed from: a  reason: collision with root package name */
        private c0 f36911a;

        /* renamed from: b  reason: collision with root package name */
        private List<Map<Object, Object>> f36912b;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private c0 f36913a;

            /* renamed from: b  reason: collision with root package name */
            private List<Map<Object, Object>> f36914b;

            public b0 a() {
                b0 b0Var = new b0();
                b0Var.c(this.f36913a);
                b0Var.b(this.f36914b);
                return b0Var;
            }

            public a b(List<Map<Object, Object>> list) {
                this.f36914b = list;
                return this;
            }

            public a c(c0 c0Var) {
                this.f36913a = c0Var;
                return this;
            }
        }

        b0() {
        }

        static b0 a(ArrayList<Object> arrayList) {
            c0 c0Var;
            b0 b0Var = new b0();
            Object obj = arrayList.get(0);
            if (obj == null) {
                c0Var = null;
            } else {
                c0Var = c0.a((ArrayList) obj);
            }
            b0Var.c(c0Var);
            b0Var.b((List) arrayList.get(1));
            return b0Var;
        }

        public void b(List<Map<Object, Object>> list) {
            if (list != null) {
                this.f36912b = list;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerData\" is null.");
        }

        public void c(c0 c0Var) {
            if (c0Var != null) {
                this.f36911a = c0Var;
                return;
            }
            throw new IllegalStateException("Nonnull field \"userInfo\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            c0 c0Var = this.f36911a;
            arrayList.add(c0Var == null ? null : c0Var.n());
            arrayList.add(this.f36912b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface c {
        void a(b bVar, String str, String str2, f0<a0> f0Var);

        void b(b bVar, String str, q qVar, f0<Void> f0Var);

        void c(b bVar, String str, f0<Void> f0Var);

        void d(b bVar, t tVar, f0<Void> f0Var);

        void e(b bVar, String str, f0<Void> f0Var);

        void f(b bVar, String str, Long l10, f0<Void> f0Var);

        void g(b bVar, String str, f0<a0> f0Var);

        void h(b bVar, String str, f0<String> f0Var);

        void i(b bVar, f0<String> f0Var);

        void j(b bVar, f0<Void> f0Var);

        void k(b bVar, String str, q qVar, f0<Void> f0Var);

        void l(b bVar, String str, f0<o> f0Var);

        void m(b bVar, String str, f0<List<String>> f0Var);

        void n(b bVar, String str, String str2, f0<Void> f0Var);

        void o(b bVar, String str, String str2, f0<a0> f0Var);

        void p(b bVar, e0 e0Var, f0<String> f0Var);

        void q(b bVar, String str, String str2, f0<a0> f0Var);

        void r(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void s(b bVar, f0<String> f0Var);

        void t(b bVar, y yVar, f0<a0> f0Var);

        void u(b bVar, f0<a0> f0Var);

        void v(b bVar, String str, f0<String> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class c0 {

        /* renamed from: a  reason: collision with root package name */
        private String f36915a;

        /* renamed from: b  reason: collision with root package name */
        private String f36916b;

        /* renamed from: c  reason: collision with root package name */
        private String f36917c;

        /* renamed from: d  reason: collision with root package name */
        private String f36918d;

        /* renamed from: e  reason: collision with root package name */
        private String f36919e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f36920f;

        /* renamed from: g  reason: collision with root package name */
        private Boolean f36921g;

        /* renamed from: h  reason: collision with root package name */
        private String f36922h;

        /* renamed from: i  reason: collision with root package name */
        private String f36923i;

        /* renamed from: j  reason: collision with root package name */
        private String f36924j;

        /* renamed from: k  reason: collision with root package name */
        private Long f36925k;

        /* renamed from: l  reason: collision with root package name */
        private Long f36926l;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f36927a;

            /* renamed from: b  reason: collision with root package name */
            private String f36928b;

            /* renamed from: c  reason: collision with root package name */
            private String f36929c;

            /* renamed from: d  reason: collision with root package name */
            private String f36930d;

            /* renamed from: e  reason: collision with root package name */
            private String f36931e;

            /* renamed from: f  reason: collision with root package name */
            private Boolean f36932f;

            /* renamed from: g  reason: collision with root package name */
            private Boolean f36933g;

            /* renamed from: h  reason: collision with root package name */
            private String f36934h;

            /* renamed from: i  reason: collision with root package name */
            private String f36935i;

            /* renamed from: j  reason: collision with root package name */
            private String f36936j;

            /* renamed from: k  reason: collision with root package name */
            private Long f36937k;

            /* renamed from: l  reason: collision with root package name */
            private Long f36938l;

            public c0 a() {
                c0 c0Var = new c0();
                c0Var.m(this.f36927a);
                c0Var.d(this.f36928b);
                c0Var.c(this.f36929c);
                c0Var.i(this.f36930d);
                c0Var.h(this.f36931e);
                c0Var.e(this.f36932f);
                c0Var.f(this.f36933g);
                c0Var.j(this.f36934h);
                c0Var.l(this.f36935i);
                c0Var.k(this.f36936j);
                c0Var.b(this.f36937k);
                c0Var.g(this.f36938l);
                return c0Var;
            }

            public a b(Long l10) {
                this.f36937k = l10;
                return this;
            }

            public a c(String str) {
                this.f36929c = str;
                return this;
            }

            public a d(String str) {
                this.f36928b = str;
                return this;
            }

            public a e(Boolean bool) {
                this.f36932f = bool;
                return this;
            }

            public a f(Boolean bool) {
                this.f36933g = bool;
                return this;
            }

            public a g(Long l10) {
                this.f36938l = l10;
                return this;
            }

            public a h(String str) {
                this.f36931e = str;
                return this;
            }

            public a i(String str) {
                this.f36930d = str;
                return this;
            }

            public a j(String str) {
                this.f36935i = str;
                return this;
            }

            public a k(String str) {
                this.f36927a = str;
                return this;
            }
        }

        c0() {
        }

        static c0 a(ArrayList<Object> arrayList) {
            Long l10;
            long j10;
            long j11;
            c0 c0Var = new c0();
            c0Var.m((String) arrayList.get(0));
            c0Var.d((String) arrayList.get(1));
            c0Var.c((String) arrayList.get(2));
            c0Var.i((String) arrayList.get(3));
            c0Var.h((String) arrayList.get(4));
            c0Var.e((Boolean) arrayList.get(5));
            c0Var.f((Boolean) arrayList.get(6));
            c0Var.j((String) arrayList.get(7));
            c0Var.l((String) arrayList.get(8));
            c0Var.k((String) arrayList.get(9));
            Object obj = arrayList.get(10);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                if (obj instanceof Integer) {
                    j11 = (long) ((Integer) obj).intValue();
                } else {
                    j11 = ((Long) obj).longValue();
                }
                l10 = Long.valueOf(j11);
            }
            c0Var.b(l10);
            Object obj2 = arrayList.get(11);
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    j10 = (long) ((Integer) obj2).intValue();
                } else {
                    j10 = ((Long) obj2).longValue();
                }
                l11 = Long.valueOf(j10);
            }
            c0Var.g(l11);
            return c0Var;
        }

        public void b(Long l10) {
            this.f36925k = l10;
        }

        public void c(String str) {
            this.f36917c = str;
        }

        public void d(String str) {
            this.f36916b = str;
        }

        public void e(Boolean bool) {
            if (bool != null) {
                this.f36920f = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isAnonymous\" is null.");
        }

        public void f(Boolean bool) {
            if (bool != null) {
                this.f36921g = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isEmailVerified\" is null.");
        }

        public void g(Long l10) {
            this.f36926l = l10;
        }

        public void h(String str) {
            this.f36919e = str;
        }

        public void i(String str) {
            this.f36918d = str;
        }

        public void j(String str) {
            this.f36922h = str;
        }

        public void k(String str) {
            this.f36924j = str;
        }

        public void l(String str) {
            this.f36923i = str;
        }

        public void m(String str) {
            if (str != null) {
                this.f36915a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> n() {
            ArrayList<Object> arrayList = new ArrayList<>(12);
            arrayList.add(this.f36915a);
            arrayList.add(this.f36916b);
            arrayList.add(this.f36917c);
            arrayList.add(this.f36918d);
            arrayList.add(this.f36919e);
            arrayList.add(this.f36920f);
            arrayList.add(this.f36921g);
            arrayList.add(this.f36922h);
            arrayList.add(this.f36923i);
            arrayList.add(this.f36924j);
            arrayList.add(this.f36925k);
            arrayList.add(this.f36926l);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class d extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final d f36939d = new d();

        private d() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return a0.a((ArrayList) f(byteBuffer));
                case -114:
                    return b0.a((ArrayList) f(byteBuffer));
                case -113:
                    return c0.a((ArrayList) f(byteBuffer));
                case -112:
                    return d0.a((ArrayList) f(byteBuffer));
                case -111:
                    return e0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).f());
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((o) obj).d());
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((p) obj).d());
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((q) obj).p());
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((r) obj).g());
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((s) obj).f());
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((t) obj).k());
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((u) obj).i());
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((v) obj).g());
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((w) obj).c());
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((x) obj).f());
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((y) obj).h());
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                p(byteArrayOutputStream, ((z) obj).g());
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(141);
                p(byteArrayOutputStream, ((a0) obj).e());
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(142);
                p(byteArrayOutputStream, ((b0) obj).d());
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(143);
                p(byteArrayOutputStream, ((c0) obj).n());
            } else if (obj instanceof d0) {
                byteArrayOutputStream.write(144);
                p(byteArrayOutputStream, ((d0) obj).j());
            } else if (obj instanceof e0) {
                byteArrayOutputStream.write(145);
                p(byteArrayOutputStream, ((e0) obj).n());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class d0 {

        /* renamed from: a  reason: collision with root package name */
        private String f36940a;

        /* renamed from: b  reason: collision with root package name */
        private String f36941b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f36942c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f36943d;

        d0() {
        }

        static d0 a(ArrayList<Object> arrayList) {
            d0 d0Var = new d0();
            d0Var.f((String) arrayList.get(0));
            d0Var.h((String) arrayList.get(1));
            d0Var.g((Boolean) arrayList.get(2));
            d0Var.i((Boolean) arrayList.get(3));
            return d0Var;
        }

        public String b() {
            return this.f36940a;
        }

        public Boolean c() {
            return this.f36942c;
        }

        public String d() {
            return this.f36941b;
        }

        public Boolean e() {
            return this.f36943d;
        }

        public void f(String str) {
            this.f36940a = str;
        }

        public void g(Boolean bool) {
            if (bool != null) {
                this.f36942c = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
        }

        public void h(String str) {
            this.f36941b = str;
        }

        public void i(Boolean bool) {
            if (bool != null) {
                this.f36943d = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> j() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f36940a);
            arrayList.add(this.f36941b);
            arrayList.add(this.f36942c);
            arrayList.add(this.f36943d);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface e {
        void a(b bVar, String str, f0<a0> f0Var);

        void b(b bVar, y yVar, f0<a0> f0Var);

        void c(b bVar, y yVar, f0<a0> f0Var);

        void d(b bVar, q qVar, f0<Void> f0Var);

        void e(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void f(b bVar, f0<b0> f0Var);

        void g(b bVar, Map<String, Object> map, f0<a0> f0Var);

        void h(b bVar, String str, f0<b0> f0Var);

        void i(b bVar, String str, f0<b0> f0Var);

        void j(b bVar, d0 d0Var, f0<b0> f0Var);

        void k(b bVar, f0<Void> f0Var);

        void l(b bVar, String str, q qVar, f0<Void> f0Var);

        void m(b bVar, Map<String, Object> map, f0<b0> f0Var);

        void n(b bVar, Boolean bool, f0<u> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class e0 {

        /* renamed from: a  reason: collision with root package name */
        private String f36944a;

        /* renamed from: b  reason: collision with root package name */
        private Long f36945b;

        /* renamed from: c  reason: collision with root package name */
        private Long f36946c;

        /* renamed from: d  reason: collision with root package name */
        private String f36947d;

        /* renamed from: e  reason: collision with root package name */
        private String f36948e;

        /* renamed from: f  reason: collision with root package name */
        private String f36949f;

        e0() {
        }

        static e0 a(ArrayList<Object> arrayList) {
            Long l10;
            long j10;
            e0 e0Var = new e0();
            e0Var.l((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l11 = null;
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            e0Var.m(l10);
            Object obj2 = arrayList.get(2);
            if (obj2 != null) {
                if (obj2 instanceof Integer) {
                    j10 = (long) ((Integer) obj2).intValue();
                } else {
                    j10 = ((Long) obj2).longValue();
                }
                l11 = Long.valueOf(j10);
            }
            e0Var.i(l11);
            e0Var.h((String) arrayList.get(3));
            e0Var.j((String) arrayList.get(4));
            e0Var.k((String) arrayList.get(5));
            return e0Var;
        }

        public String b() {
            return this.f36947d;
        }

        public Long c() {
            return this.f36946c;
        }

        public String d() {
            return this.f36948e;
        }

        public String e() {
            return this.f36949f;
        }

        public String f() {
            return this.f36944a;
        }

        public Long g() {
            return this.f36945b;
        }

        public void h(String str) {
            this.f36947d = str;
        }

        public void i(Long l10) {
            this.f36946c = l10;
        }

        public void j(String str) {
            this.f36948e = str;
        }

        public void k(String str) {
            this.f36949f = str;
        }

        public void l(String str) {
            this.f36944a = str;
        }

        public void m(Long l10) {
            if (l10 != null) {
                this.f36945b = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"timeout\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> n() {
            ArrayList<Object> arrayList = new ArrayList<>(6);
            arrayList.add(this.f36944a);
            arrayList.add(this.f36945b);
            arrayList.add(this.f36946c);
            arrayList.add(this.f36947d);
            arrayList.add(this.f36948e);
            arrayList.add(this.f36949f);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class f extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final f f36950d = new f();

        private f() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return o.a((ArrayList) f(byteBuffer));
                case -126:
                    return p.a((ArrayList) f(byteBuffer));
                case -125:
                    return q.a((ArrayList) f(byteBuffer));
                case -124:
                    return r.a((ArrayList) f(byteBuffer));
                case -123:
                    return s.a((ArrayList) f(byteBuffer));
                case -122:
                    return t.a((ArrayList) f(byteBuffer));
                case -121:
                    return u.a((ArrayList) f(byteBuffer));
                case -120:
                    return v.a((ArrayList) f(byteBuffer));
                case -119:
                    return w.a((ArrayList) f(byteBuffer));
                case -118:
                    return x.a((ArrayList) f(byteBuffer));
                case -117:
                    return y.a((ArrayList) f(byteBuffer));
                case -116:
                    return z.a((ArrayList) f(byteBuffer));
                case -115:
                    return a0.a((ArrayList) f(byteBuffer));
                case -114:
                    return b0.a((ArrayList) f(byteBuffer));
                case -113:
                    return c0.a((ArrayList) f(byteBuffer));
                case -112:
                    return d0.a((ArrayList) f(byteBuffer));
                case -111:
                    return e0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).f());
            } else if (obj instanceof o) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((o) obj).d());
            } else if (obj instanceof p) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((p) obj).d());
            } else if (obj instanceof q) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((q) obj).p());
            } else if (obj instanceof r) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((r) obj).g());
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((s) obj).f());
            } else if (obj instanceof t) {
                byteArrayOutputStream.write(134);
                p(byteArrayOutputStream, ((t) obj).k());
            } else if (obj instanceof u) {
                byteArrayOutputStream.write(135);
                p(byteArrayOutputStream, ((u) obj).i());
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(136);
                p(byteArrayOutputStream, ((v) obj).g());
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(137);
                p(byteArrayOutputStream, ((w) obj).c());
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(138);
                p(byteArrayOutputStream, ((x) obj).f());
            } else if (obj instanceof y) {
                byteArrayOutputStream.write(139);
                p(byteArrayOutputStream, ((y) obj).h());
            } else if (obj instanceof z) {
                byteArrayOutputStream.write(140);
                p(byteArrayOutputStream, ((z) obj).g());
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(141);
                p(byteArrayOutputStream, ((a0) obj).e());
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(142);
                p(byteArrayOutputStream, ((b0) obj).d());
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(143);
                p(byteArrayOutputStream, ((c0) obj).n());
            } else if (obj instanceof d0) {
                byteArrayOutputStream.write(144);
                p(byteArrayOutputStream, ((d0) obj).j());
            } else if (obj instanceof e0) {
                byteArrayOutputStream.write(145);
                p(byteArrayOutputStream, ((e0) obj).n());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface f0<T> {
        void a(Throwable th);

        void success(T t10);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static class g extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f36951a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f36952b;

        public g(String str, String str2, Object obj) {
            super(str2);
            this.f36951a = str;
            this.f36952b = obj;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface h {
        void e(String str, x xVar, String str2, f0<a0> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class i extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final i f36953d = new i();

        private i() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return r.a((ArrayList) f(byteBuffer));
                case -127:
                    return s.a((ArrayList) f(byteBuffer));
                case -126:
                    return x.a((ArrayList) f(byteBuffer));
                case -125:
                    return a0.a((ArrayList) f(byteBuffer));
                case -124:
                    return b0.a((ArrayList) f(byteBuffer));
                case -123:
                    return c0.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof r) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((r) obj).g());
            } else if (obj instanceof s) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((s) obj).f());
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((x) obj).f());
            } else if (obj instanceof a0) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((a0) obj).e());
            } else if (obj instanceof b0) {
                byteArrayOutputStream.write(132);
                p(byteArrayOutputStream, ((b0) obj).d());
            } else if (obj instanceof c0) {
                byteArrayOutputStream.write(133);
                p(byteArrayOutputStream, ((c0) obj).n());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface j {
        void a(String str, String str2, f0<String> f0Var);

        void b(String str, f0<z> f0Var);

        void c(String str, String str2, f0<String> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class k extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final k f36954d = new k();

        private k() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 != Byte.MIN_VALUE) {
                return super.g(b10, byteBuffer);
            }
            return z.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof z) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((z) obj).g());
                return;
            }
            super.p(byteArrayOutputStream, obj);
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface l {
        void a(String str, String str2, f0<Void> f0Var);

        void b(String str, String str2, String str3, f0<String> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public interface m {
        void a(b bVar, x xVar, String str, f0<Void> f0Var);

        void b(b bVar, String str, String str2, f0<Void> f0Var);

        void c(b bVar, f0<w> f0Var);

        void d(b bVar, String str, f0<Void> f0Var);

        void f(b bVar, f0<List<v>> f0Var);
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    private static class n extends lc.r {

        /* renamed from: d  reason: collision with root package name */
        public static final n f36955d = new n();

        private n() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            switch (b10) {
                case Byte.MIN_VALUE:
                    return b.a((ArrayList) f(byteBuffer));
                case -127:
                    return v.a((ArrayList) f(byteBuffer));
                case -126:
                    return w.a((ArrayList) f(byteBuffer));
                case -125:
                    return x.a((ArrayList) f(byteBuffer));
                default:
                    return super.g(b10, byteBuffer);
            }
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof b) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((b) obj).f());
            } else if (obj instanceof v) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((v) obj).g());
            } else if (obj instanceof w) {
                byteArrayOutputStream.write(130);
                p(byteArrayOutputStream, ((w) obj).c());
            } else if (obj instanceof x) {
                byteArrayOutputStream.write(131);
                p(byteArrayOutputStream, ((x) obj).f());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class o {

        /* renamed from: a  reason: collision with root package name */
        private a f36956a;

        /* renamed from: b  reason: collision with root package name */
        private p f36957b;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private a f36958a;

            /* renamed from: b  reason: collision with root package name */
            private p f36959b;

            public o a() {
                o oVar = new o();
                oVar.c(this.f36958a);
                oVar.b(this.f36959b);
                return oVar;
            }

            public a b(p pVar) {
                this.f36959b = pVar;
                return this;
            }

            public a c(a aVar) {
                this.f36958a = aVar;
                return this;
            }
        }

        o() {
        }

        static o a(ArrayList<Object> arrayList) {
            p pVar;
            o oVar = new o();
            oVar.c(a.values()[((Integer) arrayList.get(0)).intValue()]);
            Object obj = arrayList.get(1);
            if (obj == null) {
                pVar = null;
            } else {
                pVar = p.a((ArrayList) obj);
            }
            oVar.b(pVar);
            return oVar;
        }

        public void b(p pVar) {
            if (pVar != null) {
                this.f36957b = pVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"data\" is null.");
        }

        public void c(a aVar) {
            if (aVar != null) {
                this.f36956a = aVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"operation\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            a aVar = this.f36956a;
            ArrayList<Object> arrayList2 = null;
            arrayList.add(aVar == null ? null : Integer.valueOf(aVar.f36902a));
            p pVar = this.f36957b;
            if (pVar != null) {
                arrayList2 = pVar.d();
            }
            arrayList.add(arrayList2);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class p {

        /* renamed from: a  reason: collision with root package name */
        private String f36960a;

        /* renamed from: b  reason: collision with root package name */
        private String f36961b;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f36962a;

            /* renamed from: b  reason: collision with root package name */
            private String f36963b;

            public p a() {
                p pVar = new p();
                pVar.b(this.f36962a);
                pVar.c(this.f36963b);
                return pVar;
            }

            public a b(String str) {
                this.f36962a = str;
                return this;
            }

            public a c(String str) {
                this.f36963b = str;
                return this;
            }
        }

        static p a(ArrayList<Object> arrayList) {
            p pVar = new p();
            pVar.b((String) arrayList.get(0));
            pVar.c((String) arrayList.get(1));
            return pVar;
        }

        public void b(String str) {
            this.f36960a = str;
        }

        public void c(String str) {
            this.f36961b = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> d() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f36960a);
            arrayList.add(this.f36961b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class q {

        /* renamed from: a  reason: collision with root package name */
        private String f36964a;

        /* renamed from: b  reason: collision with root package name */
        private String f36965b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f36966c;

        /* renamed from: d  reason: collision with root package name */
        private String f36967d;

        /* renamed from: e  reason: collision with root package name */
        private String f36968e;

        /* renamed from: f  reason: collision with root package name */
        private Boolean f36969f;

        /* renamed from: g  reason: collision with root package name */
        private String f36970g;

        q() {
        }

        static q a(ArrayList<Object> arrayList) {
            q qVar = new q();
            qVar.o((String) arrayList.get(0));
            qVar.l((String) arrayList.get(1));
            qVar.m((Boolean) arrayList.get(2));
            qVar.n((String) arrayList.get(3));
            qVar.k((String) arrayList.get(4));
            qVar.i((Boolean) arrayList.get(5));
            qVar.j((String) arrayList.get(6));
            return qVar;
        }

        public Boolean b() {
            return this.f36969f;
        }

        public String c() {
            return this.f36970g;
        }

        public String d() {
            return this.f36968e;
        }

        public String e() {
            return this.f36965b;
        }

        public Boolean f() {
            return this.f36966c;
        }

        public String g() {
            return this.f36967d;
        }

        public String h() {
            return this.f36964a;
        }

        public void i(Boolean bool) {
            if (bool != null) {
                this.f36969f = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"androidInstallApp\" is null.");
        }

        public void j(String str) {
            this.f36970g = str;
        }

        public void k(String str) {
            this.f36968e = str;
        }

        public void l(String str) {
            this.f36965b = str;
        }

        public void m(Boolean bool) {
            if (bool != null) {
                this.f36966c = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"handleCodeInApp\" is null.");
        }

        public void n(String str) {
            this.f36967d = str;
        }

        public void o(String str) {
            if (str != null) {
                this.f36964a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"url\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> p() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.f36964a);
            arrayList.add(this.f36965b);
            arrayList.add(this.f36966c);
            arrayList.add(this.f36967d);
            arrayList.add(this.f36968e);
            arrayList.add(this.f36969f);
            arrayList.add(this.f36970g);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class r {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f36971a;

        /* renamed from: b  reason: collision with root package name */
        private String f36972b;

        /* renamed from: c  reason: collision with root package name */
        private String f36973c;

        /* renamed from: d  reason: collision with root package name */
        private String f36974d;

        /* renamed from: e  reason: collision with root package name */
        private Map<String, Object> f36975e;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Boolean f36976a;

            /* renamed from: b  reason: collision with root package name */
            private String f36977b;

            /* renamed from: c  reason: collision with root package name */
            private String f36978c;

            /* renamed from: d  reason: collision with root package name */
            private String f36979d;

            /* renamed from: e  reason: collision with root package name */
            private Map<String, Object> f36980e;

            public r a() {
                r rVar = new r();
                rVar.c(this.f36976a);
                rVar.e(this.f36977b);
                rVar.f(this.f36978c);
                rVar.b(this.f36979d);
                rVar.d(this.f36980e);
                return rVar;
            }

            public a b(Boolean bool) {
                this.f36976a = bool;
                return this;
            }

            public a c(Map<String, Object> map) {
                this.f36980e = map;
                return this;
            }

            public a d(String str) {
                this.f36977b = str;
                return this;
            }

            public a e(String str) {
                this.f36978c = str;
                return this;
            }
        }

        r() {
        }

        static r a(ArrayList<Object> arrayList) {
            r rVar = new r();
            rVar.c((Boolean) arrayList.get(0));
            rVar.e((String) arrayList.get(1));
            rVar.f((String) arrayList.get(2));
            rVar.b((String) arrayList.get(3));
            rVar.d((Map) arrayList.get(4));
            return rVar;
        }

        public void b(String str) {
            this.f36974d = str;
        }

        public void c(Boolean bool) {
            if (bool != null) {
                this.f36971a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"isNewUser\" is null.");
        }

        public void d(Map<String, Object> map) {
            this.f36975e = map;
        }

        public void e(String str) {
            this.f36972b = str;
        }

        public void f(String str) {
            this.f36973c = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f36971a);
            arrayList.add(this.f36972b);
            arrayList.add(this.f36973c);
            arrayList.add(this.f36974d);
            arrayList.add(this.f36975e);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class s {

        /* renamed from: a  reason: collision with root package name */
        private String f36981a;

        /* renamed from: b  reason: collision with root package name */
        private String f36982b;

        /* renamed from: c  reason: collision with root package name */
        private Long f36983c;

        /* renamed from: d  reason: collision with root package name */
        private String f36984d;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f36985a;

            /* renamed from: b  reason: collision with root package name */
            private String f36986b;

            /* renamed from: c  reason: collision with root package name */
            private Long f36987c;

            /* renamed from: d  reason: collision with root package name */
            private String f36988d;

            public s a() {
                s sVar = new s();
                sVar.d(this.f36985a);
                sVar.e(this.f36986b);
                sVar.c(this.f36987c);
                sVar.b(this.f36988d);
                return sVar;
            }

            public a b(String str) {
                this.f36988d = str;
                return this;
            }

            public a c(Long l10) {
                this.f36987c = l10;
                return this;
            }

            public a d(String str) {
                this.f36985a = str;
                return this;
            }

            public a e(String str) {
                this.f36986b = str;
                return this;
            }
        }

        s() {
        }

        static s a(ArrayList<Object> arrayList) {
            Long l10;
            s sVar = new s();
            sVar.d((String) arrayList.get(0));
            sVar.e((String) arrayList.get(1));
            Object obj = arrayList.get(2);
            if (obj == null) {
                l10 = null;
            } else {
                l10 = Long.valueOf(obj instanceof Integer ? (long) ((Integer) obj).intValue() : ((Long) obj).longValue());
            }
            sVar.c(l10);
            sVar.b((String) arrayList.get(3));
            return sVar;
        }

        public void b(String str) {
            this.f36984d = str;
        }

        public void c(Long l10) {
            if (l10 != null) {
                this.f36983c = l10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"nativeId\" is null.");
        }

        public void d(String str) {
            if (str != null) {
                this.f36981a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }

        public void e(String str) {
            if (str != null) {
                this.f36982b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"signInMethod\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f36981a);
            arrayList.add(this.f36982b);
            arrayList.add(this.f36983c);
            arrayList.add(this.f36984d);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class t {

        /* renamed from: a  reason: collision with root package name */
        private Boolean f36989a;

        /* renamed from: b  reason: collision with root package name */
        private String f36990b;

        /* renamed from: c  reason: collision with root package name */
        private String f36991c;

        /* renamed from: d  reason: collision with root package name */
        private String f36992d;

        /* renamed from: e  reason: collision with root package name */
        private Boolean f36993e;

        t() {
        }

        static t a(ArrayList<Object> arrayList) {
            t tVar = new t();
            tVar.f((Boolean) arrayList.get(0));
            tVar.j((String) arrayList.get(1));
            tVar.h((String) arrayList.get(2));
            tVar.i((String) arrayList.get(3));
            tVar.g((Boolean) arrayList.get(4));
            return tVar;
        }

        public Boolean b() {
            return this.f36989a;
        }

        public Boolean c() {
            return this.f36993e;
        }

        public String d() {
            return this.f36991c;
        }

        public String e() {
            return this.f36992d;
        }

        public void f(Boolean bool) {
            if (bool != null) {
                this.f36989a = bool;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appVerificationDisabledForTesting\" is null.");
        }

        public void g(Boolean bool) {
            this.f36993e = bool;
        }

        public void h(String str) {
            this.f36991c = str;
        }

        public void i(String str) {
            this.f36992d = str;
        }

        public void j(String str) {
            this.f36990b = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> k() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f36989a);
            arrayList.add(this.f36990b);
            arrayList.add(this.f36991c);
            arrayList.add(this.f36992d);
            arrayList.add(this.f36993e);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class u {

        /* renamed from: a  reason: collision with root package name */
        private String f36994a;

        /* renamed from: b  reason: collision with root package name */
        private Long f36995b;

        /* renamed from: c  reason: collision with root package name */
        private Long f36996c;

        /* renamed from: d  reason: collision with root package name */
        private Long f36997d;

        /* renamed from: e  reason: collision with root package name */
        private String f36998e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, Object> f36999f;

        /* renamed from: g  reason: collision with root package name */
        private String f37000g;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f37001a;

            /* renamed from: b  reason: collision with root package name */
            private Long f37002b;

            /* renamed from: c  reason: collision with root package name */
            private Long f37003c;

            /* renamed from: d  reason: collision with root package name */
            private Long f37004d;

            /* renamed from: e  reason: collision with root package name */
            private String f37005e;

            /* renamed from: f  reason: collision with root package name */
            private Map<String, Object> f37006f;

            /* renamed from: g  reason: collision with root package name */
            private String f37007g;

            public u a() {
                u uVar = new u();
                uVar.h(this.f37001a);
                uVar.d(this.f37002b);
                uVar.b(this.f37003c);
                uVar.e(this.f37004d);
                uVar.f(this.f37005e);
                uVar.c(this.f37006f);
                uVar.g(this.f37007g);
                return uVar;
            }

            public a b(Long l10) {
                this.f37003c = l10;
                return this;
            }

            public a c(Map<String, Object> map) {
                this.f37006f = map;
                return this;
            }

            public a d(Long l10) {
                this.f37002b = l10;
                return this;
            }

            public a e(Long l10) {
                this.f37004d = l10;
                return this;
            }

            public a f(String str) {
                this.f37005e = str;
                return this;
            }

            public a g(String str) {
                this.f37007g = str;
                return this;
            }

            public a h(String str) {
                this.f37001a = str;
                return this;
            }
        }

        static u a(ArrayList<Object> arrayList) {
            Long l10;
            Long l11;
            long j10;
            long j11;
            long j12;
            u uVar = new u();
            uVar.h((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            Long l12 = null;
            if (obj == null) {
                l10 = null;
            } else {
                if (obj instanceof Integer) {
                    j12 = (long) ((Integer) obj).intValue();
                } else {
                    j12 = ((Long) obj).longValue();
                }
                l10 = Long.valueOf(j12);
            }
            uVar.d(l10);
            Object obj2 = arrayList.get(2);
            if (obj2 == null) {
                l11 = null;
            } else {
                if (obj2 instanceof Integer) {
                    j11 = (long) ((Integer) obj2).intValue();
                } else {
                    j11 = ((Long) obj2).longValue();
                }
                l11 = Long.valueOf(j11);
            }
            uVar.b(l11);
            Object obj3 = arrayList.get(3);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    j10 = (long) ((Integer) obj3).intValue();
                } else {
                    j10 = ((Long) obj3).longValue();
                }
                l12 = Long.valueOf(j10);
            }
            uVar.e(l12);
            uVar.f((String) arrayList.get(4));
            uVar.c((Map) arrayList.get(5));
            uVar.g((String) arrayList.get(6));
            return uVar;
        }

        public void b(Long l10) {
            this.f36996c = l10;
        }

        public void c(Map<String, Object> map) {
            this.f36999f = map;
        }

        public void d(Long l10) {
            this.f36995b = l10;
        }

        public void e(Long l10) {
            this.f36997d = l10;
        }

        public void f(String str) {
            this.f36998e = str;
        }

        public void g(String str) {
            this.f37000g = str;
        }

        public void h(String str) {
            this.f36994a = str;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> i() {
            ArrayList<Object> arrayList = new ArrayList<>(7);
            arrayList.add(this.f36994a);
            arrayList.add(this.f36995b);
            arrayList.add(this.f36996c);
            arrayList.add(this.f36997d);
            arrayList.add(this.f36998e);
            arrayList.add(this.f36999f);
            arrayList.add(this.f37000g);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class v {

        /* renamed from: a  reason: collision with root package name */
        private String f37008a;

        /* renamed from: b  reason: collision with root package name */
        private Double f37009b;

        /* renamed from: c  reason: collision with root package name */
        private String f37010c;

        /* renamed from: d  reason: collision with root package name */
        private String f37011d;

        /* renamed from: e  reason: collision with root package name */
        private String f37012e;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f37013a;

            /* renamed from: b  reason: collision with root package name */
            private Double f37014b;

            /* renamed from: c  reason: collision with root package name */
            private String f37015c;

            /* renamed from: d  reason: collision with root package name */
            private String f37016d;

            /* renamed from: e  reason: collision with root package name */
            private String f37017e;

            public v a() {
                v vVar = new v();
                vVar.b(this.f37013a);
                vVar.c(this.f37014b);
                vVar.d(this.f37015c);
                vVar.f(this.f37016d);
                vVar.e(this.f37017e);
                return vVar;
            }

            public a b(String str) {
                this.f37013a = str;
                return this;
            }

            public a c(Double d10) {
                this.f37014b = d10;
                return this;
            }

            public a d(String str) {
                this.f37015c = str;
                return this;
            }

            public a e(String str) {
                this.f37017e = str;
                return this;
            }

            public a f(String str) {
                this.f37016d = str;
                return this;
            }
        }

        v() {
        }

        static v a(ArrayList<Object> arrayList) {
            v vVar = new v();
            vVar.b((String) arrayList.get(0));
            vVar.c((Double) arrayList.get(1));
            vVar.d((String) arrayList.get(2));
            vVar.f((String) arrayList.get(3));
            vVar.e((String) arrayList.get(4));
            return vVar;
        }

        public void b(String str) {
            this.f37008a = str;
        }

        public void c(Double d10) {
            if (d10 != null) {
                this.f37009b = d10;
                return;
            }
            throw new IllegalStateException("Nonnull field \"enrollmentTimestamp\" is null.");
        }

        public void d(String str) {
            this.f37010c = str;
        }

        public void e(String str) {
            this.f37012e = str;
        }

        public void f(String str) {
            if (str != null) {
                this.f37011d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"uid\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f37008a);
            arrayList.add(this.f37009b);
            arrayList.add(this.f37010c);
            arrayList.add(this.f37011d);
            arrayList.add(this.f37012e);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class w {

        /* renamed from: a  reason: collision with root package name */
        private String f37018a;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f37019a;

            public w a() {
                w wVar = new w();
                wVar.b(this.f37019a);
                return wVar;
            }

            public a b(String str) {
                this.f37019a = str;
                return this;
            }
        }

        w() {
        }

        static w a(ArrayList<Object> arrayList) {
            w wVar = new w();
            wVar.b((String) arrayList.get(0));
            return wVar;
        }

        public void b(String str) {
            if (str != null) {
                this.f37018a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"id\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> c() {
            ArrayList<Object> arrayList = new ArrayList<>(1);
            arrayList.add(this.f37018a);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class x {

        /* renamed from: a  reason: collision with root package name */
        private String f37020a;

        /* renamed from: b  reason: collision with root package name */
        private String f37021b;

        x() {
        }

        static x a(ArrayList<Object> arrayList) {
            x xVar = new x();
            xVar.e((String) arrayList.get(0));
            xVar.d((String) arrayList.get(1));
            return xVar;
        }

        public String b() {
            return this.f37021b;
        }

        public String c() {
            return this.f37020a;
        }

        public void d(String str) {
            if (str != null) {
                this.f37021b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationCode\" is null.");
        }

        public void e(String str) {
            if (str != null) {
                this.f37020a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"verificationId\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(2);
            arrayList.add(this.f37020a);
            arrayList.add(this.f37021b);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class y {

        /* renamed from: a  reason: collision with root package name */
        private String f37022a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f37023b;

        /* renamed from: c  reason: collision with root package name */
        private Map<String, String> f37024c;

        y() {
        }

        static y a(ArrayList<Object> arrayList) {
            y yVar = new y();
            yVar.f((String) arrayList.get(0));
            yVar.g((List) arrayList.get(1));
            yVar.e((Map) arrayList.get(2));
            return yVar;
        }

        public Map<String, String> b() {
            return this.f37024c;
        }

        public String c() {
            return this.f37022a;
        }

        public List<String> d() {
            return this.f37023b;
        }

        public void e(Map<String, String> map) {
            this.f37024c = map;
        }

        public void f(String str) {
            if (str != null) {
                this.f37022a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"providerId\" is null.");
        }

        public void g(List<String> list) {
            this.f37023b = list;
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> h() {
            ArrayList<Object> arrayList = new ArrayList<>(3);
            arrayList.add(this.f37022a);
            arrayList.add(this.f37023b);
            arrayList.add(this.f37024c);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseAuth */
    public static final class z {

        /* renamed from: a  reason: collision with root package name */
        private Long f37025a;

        /* renamed from: b  reason: collision with root package name */
        private Long f37026b;

        /* renamed from: c  reason: collision with root package name */
        private Long f37027c;

        /* renamed from: d  reason: collision with root package name */
        private String f37028d;

        /* renamed from: e  reason: collision with root package name */
        private String f37029e;

        /* compiled from: GeneratedAndroidFirebaseAuth */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private Long f37030a;

            /* renamed from: b  reason: collision with root package name */
            private Long f37031b;

            /* renamed from: c  reason: collision with root package name */
            private Long f37032c;

            /* renamed from: d  reason: collision with root package name */
            private String f37033d;

            /* renamed from: e  reason: collision with root package name */
            private String f37034e;

            public z a() {
                z zVar = new z();
                zVar.b(this.f37030a);
                zVar.c(this.f37031b);
                zVar.d(this.f37032c);
                zVar.e(this.f37033d);
                zVar.f(this.f37034e);
                return zVar;
            }

            public a b(Long l10) {
                this.f37030a = l10;
                return this;
            }

            public a c(Long l10) {
                this.f37031b = l10;
                return this;
            }

            public a d(Long l10) {
                this.f37032c = l10;
                return this;
            }

            public a e(String str) {
                this.f37033d = str;
                return this;
            }

            public a f(String str) {
                this.f37034e = str;
                return this;
            }
        }

        z() {
        }

        static z a(ArrayList<Object> arrayList) {
            Long l10;
            Long l11;
            long j10;
            long j11;
            z zVar = new z();
            Object obj = arrayList.get(0);
            Long l12 = null;
            if (obj == null) {
                l10 = null;
            } else {
                if (obj instanceof Integer) {
                    j11 = (long) ((Integer) obj).intValue();
                } else {
                    j11 = ((Long) obj).longValue();
                }
                l10 = Long.valueOf(j11);
            }
            zVar.b(l10);
            Object obj2 = arrayList.get(1);
            if (obj2 == null) {
                l11 = null;
            } else {
                l11 = Long.valueOf(obj2 instanceof Integer ? (long) ((Integer) obj2).intValue() : ((Long) obj2).longValue());
            }
            zVar.c(l11);
            Object obj3 = arrayList.get(2);
            if (obj3 != null) {
                if (obj3 instanceof Integer) {
                    j10 = (long) ((Integer) obj3).intValue();
                } else {
                    j10 = ((Long) obj3).longValue();
                }
                l12 = Long.valueOf(j10);
            }
            zVar.d(l12);
            zVar.e((String) arrayList.get(3));
            zVar.f((String) arrayList.get(4));
            return zVar;
        }

        public void b(Long l10) {
            this.f37025a = l10;
        }

        public void c(Long l10) {
            this.f37026b = l10;
        }

        public void d(Long l10) {
            this.f37027c = l10;
        }

        public void e(String str) {
            this.f37028d = str;
        }

        public void f(String str) {
            if (str != null) {
                this.f37029e = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"secretKey\" is null.");
        }

        /* access modifiers changed from: package-private */
        public ArrayList<Object> g() {
            ArrayList<Object> arrayList = new ArrayList<>(5);
            arrayList.add(this.f37025a);
            arrayList.add(this.f37026b);
            arrayList.add(this.f37027c);
            arrayList.add(this.f37028d);
            arrayList.add(this.f37029e);
            return arrayList;
        }
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof g) {
            g gVar = (g) th;
            arrayList.add(gVar.f36951a);
            arrayList.add(gVar.getMessage());
            arrayList.add(gVar.f36952b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
