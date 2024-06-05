package io.flutter.plugins.firebase.core;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.r;

/* compiled from: GeneratedAndroidFirebaseCore */
public class p {

    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface a {
        void d(String str, Boolean bool, g<Void> gVar);

        void e(String str, g<Void> gVar);

        void f(String str, Boolean bool, g<Void> gVar);
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface b {
        void a(String str, e eVar, g<f> gVar);

        void b(g<List<f>> gVar);

        void c(g<e> gVar);
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    private static class c extends r {

        /* renamed from: d  reason: collision with root package name */
        public static final c f33814d = new c();

        private c() {
        }

        /* access modifiers changed from: protected */
        public Object g(byte b10, ByteBuffer byteBuffer) {
            if (b10 == Byte.MIN_VALUE) {
                return e.a((ArrayList) f(byteBuffer));
            }
            if (b10 != -127) {
                return super.g(b10, byteBuffer);
            }
            return f.a((ArrayList) f(byteBuffer));
        }

        /* access modifiers changed from: protected */
        public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
            if (obj instanceof e) {
                byteArrayOutputStream.write(128);
                p(byteArrayOutputStream, ((e) obj).x());
            } else if (obj instanceof f) {
                byteArrayOutputStream.write(129);
                p(byteArrayOutputStream, ((f) obj).f());
            } else {
                super.p(byteArrayOutputStream, obj);
            }
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    public static class d extends RuntimeException {

        /* renamed from: a  reason: collision with root package name */
        public final String f33815a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f33816b;
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        private String f33817a;

        /* renamed from: b  reason: collision with root package name */
        private String f33818b;

        /* renamed from: c  reason: collision with root package name */
        private String f33819c;

        /* renamed from: d  reason: collision with root package name */
        private String f33820d;

        /* renamed from: e  reason: collision with root package name */
        private String f33821e;

        /* renamed from: f  reason: collision with root package name */
        private String f33822f;

        /* renamed from: g  reason: collision with root package name */
        private String f33823g;

        /* renamed from: h  reason: collision with root package name */
        private String f33824h;

        /* renamed from: i  reason: collision with root package name */
        private String f33825i;

        /* renamed from: j  reason: collision with root package name */
        private String f33826j;

        /* renamed from: k  reason: collision with root package name */
        private String f33827k;

        /* renamed from: l  reason: collision with root package name */
        private String f33828l;

        /* renamed from: m  reason: collision with root package name */
        private String f33829m;

        /* renamed from: n  reason: collision with root package name */
        private String f33830n;

        /* compiled from: GeneratedAndroidFirebaseCore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f33831a;

            /* renamed from: b  reason: collision with root package name */
            private String f33832b;

            /* renamed from: c  reason: collision with root package name */
            private String f33833c;

            /* renamed from: d  reason: collision with root package name */
            private String f33834d;

            /* renamed from: e  reason: collision with root package name */
            private String f33835e;

            /* renamed from: f  reason: collision with root package name */
            private String f33836f;

            /* renamed from: g  reason: collision with root package name */
            private String f33837g;

            /* renamed from: h  reason: collision with root package name */
            private String f33838h;

            /* renamed from: i  reason: collision with root package name */
            private String f33839i;

            /* renamed from: j  reason: collision with root package name */
            private String f33840j;

            /* renamed from: k  reason: collision with root package name */
            private String f33841k;

            /* renamed from: l  reason: collision with root package name */
            private String f33842l;

            /* renamed from: m  reason: collision with root package name */
            private String f33843m;

            /* renamed from: n  reason: collision with root package name */
            private String f33844n;

            public e a() {
                e eVar = new e();
                eVar.k(this.f33831a);
                eVar.m(this.f33832b);
                eVar.t(this.f33833c);
                eVar.u(this.f33834d);
                eVar.n(this.f33835e);
                eVar.o(this.f33836f);
                eVar.v(this.f33837g);
                eVar.s(this.f33838h);
                eVar.w(this.f33839i);
                eVar.p(this.f33840j);
                eVar.j(this.f33841k);
                eVar.r(this.f33842l);
                eVar.q(this.f33843m);
                eVar.l(this.f33844n);
                return eVar;
            }

            public a b(String str) {
                this.f33831a = str;
                return this;
            }

            public a c(String str) {
                this.f33832b = str;
                return this;
            }

            public a d(String str) {
                this.f33836f = str;
                return this;
            }

            public a e(String str) {
                this.f33833c = str;
                return this;
            }

            public a f(String str) {
                this.f33834d = str;
                return this;
            }

            public a g(String str) {
                this.f33837g = str;
                return this;
            }

            public a h(String str) {
                this.f33839i = str;
                return this;
            }
        }

        e() {
        }

        static e a(ArrayList<Object> arrayList) {
            e eVar = new e();
            eVar.k((String) arrayList.get(0));
            eVar.m((String) arrayList.get(1));
            eVar.t((String) arrayList.get(2));
            eVar.u((String) arrayList.get(3));
            eVar.n((String) arrayList.get(4));
            eVar.o((String) arrayList.get(5));
            eVar.v((String) arrayList.get(6));
            eVar.s((String) arrayList.get(7));
            eVar.w((String) arrayList.get(8));
            eVar.p((String) arrayList.get(9));
            eVar.j((String) arrayList.get(10));
            eVar.r((String) arrayList.get(11));
            eVar.q((String) arrayList.get(12));
            eVar.l((String) arrayList.get(13));
            return eVar;
        }

        public String b() {
            return this.f33817a;
        }

        public String c() {
            return this.f33818b;
        }

        public String d() {
            return this.f33821e;
        }

        public String e() {
            return this.f33822f;
        }

        public String f() {
            return this.f33819c;
        }

        public String g() {
            return this.f33820d;
        }

        public String h() {
            return this.f33823g;
        }

        public String i() {
            return this.f33825i;
        }

        public void j(String str) {
            this.f33827k = str;
        }

        public void k(String str) {
            if (str != null) {
                this.f33817a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"apiKey\" is null.");
        }

        public void l(String str) {
            this.f33830n = str;
        }

        public void m(String str) {
            if (str != null) {
                this.f33818b = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"appId\" is null.");
        }

        public void n(String str) {
            this.f33821e = str;
        }

        public void o(String str) {
            this.f33822f = str;
        }

        public void p(String str) {
            this.f33826j = str;
        }

        public void q(String str) {
            this.f33829m = str;
        }

        public void r(String str) {
            this.f33828l = str;
        }

        public void s(String str) {
            this.f33824h = str;
        }

        public void t(String str) {
            if (str != null) {
                this.f33819c = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"messagingSenderId\" is null.");
        }

        public void u(String str) {
            if (str != null) {
                this.f33820d = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"projectId\" is null.");
        }

        public void v(String str) {
            this.f33823g = str;
        }

        public void w(String str) {
            this.f33825i = str;
        }

        public ArrayList<Object> x() {
            ArrayList<Object> arrayList = new ArrayList<>(14);
            arrayList.add(this.f33817a);
            arrayList.add(this.f33818b);
            arrayList.add(this.f33819c);
            arrayList.add(this.f33820d);
            arrayList.add(this.f33821e);
            arrayList.add(this.f33822f);
            arrayList.add(this.f33823g);
            arrayList.add(this.f33824h);
            arrayList.add(this.f33825i);
            arrayList.add(this.f33826j);
            arrayList.add(this.f33827k);
            arrayList.add(this.f33828l);
            arrayList.add(this.f33829m);
            arrayList.add(this.f33830n);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        private String f33845a;

        /* renamed from: b  reason: collision with root package name */
        private e f33846b;

        /* renamed from: c  reason: collision with root package name */
        private Boolean f33847c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, Object> f33848d;

        /* compiled from: GeneratedAndroidFirebaseCore */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            private String f33849a;

            /* renamed from: b  reason: collision with root package name */
            private e f33850b;

            /* renamed from: c  reason: collision with root package name */
            private Boolean f33851c;

            /* renamed from: d  reason: collision with root package name */
            private Map<String, Object> f33852d;

            public f a() {
                f fVar = new f();
                fVar.c(this.f33849a);
                fVar.d(this.f33850b);
                fVar.b(this.f33851c);
                fVar.e(this.f33852d);
                return fVar;
            }

            public a b(Boolean bool) {
                this.f33851c = bool;
                return this;
            }

            public a c(String str) {
                this.f33849a = str;
                return this;
            }

            public a d(e eVar) {
                this.f33850b = eVar;
                return this;
            }

            public a e(Map<String, Object> map) {
                this.f33852d = map;
                return this;
            }
        }

        f() {
        }

        static f a(ArrayList<Object> arrayList) {
            e eVar;
            f fVar = new f();
            fVar.c((String) arrayList.get(0));
            Object obj = arrayList.get(1);
            if (obj == null) {
                eVar = null;
            } else {
                eVar = e.a((ArrayList) obj);
            }
            fVar.d(eVar);
            fVar.b((Boolean) arrayList.get(2));
            fVar.e((Map) arrayList.get(3));
            return fVar;
        }

        public void b(Boolean bool) {
            this.f33847c = bool;
        }

        public void c(String str) {
            if (str != null) {
                this.f33845a = str;
                return;
            }
            throw new IllegalStateException("Nonnull field \"name\" is null.");
        }

        public void d(e eVar) {
            if (eVar != null) {
                this.f33846b = eVar;
                return;
            }
            throw new IllegalStateException("Nonnull field \"options\" is null.");
        }

        public void e(Map<String, Object> map) {
            if (map != null) {
                this.f33848d = map;
                return;
            }
            throw new IllegalStateException("Nonnull field \"pluginConstants\" is null.");
        }

        public ArrayList<Object> f() {
            ArrayList<Object> arrayList = new ArrayList<>(4);
            arrayList.add(this.f33845a);
            e eVar = this.f33846b;
            arrayList.add(eVar == null ? null : eVar.x());
            arrayList.add(this.f33847c);
            arrayList.add(this.f33848d);
            return arrayList;
        }
    }

    /* compiled from: GeneratedAndroidFirebaseCore */
    public interface g<T> {
        void a(Throwable th);

        void success(T t10);
    }

    protected static ArrayList<Object> a(Throwable th) {
        ArrayList<Object> arrayList = new ArrayList<>(3);
        if (th instanceof d) {
            d dVar = (d) th;
            arrayList.add(dVar.f33815a);
            arrayList.add(dVar.getMessage());
            arrayList.add(dVar.f33816b);
        } else {
            arrayList.add(th.toString());
            arrayList.add(th.getClass().getSimpleName());
            arrayList.add("Cause: " + th.getCause() + ", Stacktrace: " + Log.getStackTraceString(th));
        }
        return arrayList;
    }
}
