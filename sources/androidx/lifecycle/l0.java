package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;
import p0.a;

/* compiled from: ViewModelProvider.kt */
public class l0 {

    /* renamed from: a  reason: collision with root package name */
    private final o0 f3944a;

    /* renamed from: b  reason: collision with root package name */
    private final b f3945b;

    /* renamed from: c  reason: collision with root package name */
    private final p0.a f3946c;

    /* compiled from: ViewModelProvider.kt */
    public interface b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3952a = a.f3953a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f3953a = new a();

            private a() {
            }
        }

        <T extends k0> T a(Class<T> cls);

        <T extends k0> T b(Class<T> cls, p0.a aVar);
    }

    /* compiled from: ViewModelProvider.kt */
    public static class c implements b {

        /* renamed from: b  reason: collision with root package name */
        public static final a f3954b = new a((h) null);
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static c f3955c;

        /* renamed from: d  reason: collision with root package name */
        public static final a.b<String> f3956d = a.C0063a.f3957a;

        /* compiled from: ViewModelProvider.kt */
        public static final class a {

            /* renamed from: androidx.lifecycle.l0$c$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0063a implements a.b<String> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0063a f3957a = new C0063a();

                private C0063a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(h hVar) {
                this();
            }

            public final c a() {
                if (c.f3955c == null) {
                    c.f3955c = new c();
                }
                c c10 = c.f3955c;
                m.b(c10);
                return c10;
            }
        }

        public <T extends k0> T a(Class<T> cls) {
            m.e(cls, "modelClass");
            try {
                T newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                m.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return (k0) newInstance;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (IllegalAccessException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }

        public /* synthetic */ k0 b(Class cls, p0.a aVar) {
            return m0.b(this, cls, aVar);
        }
    }

    /* compiled from: ViewModelProvider.kt */
    public static class d {
        public void c(k0 k0Var) {
            m.e(k0Var, "viewModel");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(o0 o0Var, b bVar) {
        this(o0Var, bVar, (p0.a) null, 4, (h) null);
        m.e(o0Var, "store");
        m.e(bVar, "factory");
    }

    public l0(o0 o0Var, b bVar, p0.a aVar) {
        m.e(o0Var, "store");
        m.e(bVar, "factory");
        m.e(aVar, "defaultCreationExtras");
        this.f3944a = o0Var;
        this.f3945b = bVar;
        this.f3946c = aVar;
    }

    public <T extends k0> T a(Class<T> cls) {
        m.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends k0> T b(String str, Class<T> cls) {
        T t10;
        m.e(str, "key");
        m.e(cls, "modelClass");
        T b10 = this.f3944a.b(str);
        if (cls.isInstance(b10)) {
            b bVar = this.f3945b;
            d dVar = bVar instanceof d ? (d) bVar : null;
            if (dVar != null) {
                m.b(b10);
                dVar.c(b10);
            }
            m.c(b10, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return b10;
        }
        p0.d dVar2 = new p0.d(this.f3946c);
        dVar2.c(c.f3956d, str);
        try {
            t10 = this.f3945b.b(cls, dVar2);
        } catch (AbstractMethodError unused) {
            t10 = this.f3945b.a(cls);
        }
        this.f3944a.d(str, t10);
        return t10;
    }

    /* compiled from: ViewModelProvider.kt */
    public static class a extends c {

        /* renamed from: f  reason: collision with root package name */
        public static final C0061a f3947f = new C0061a((h) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static a f3948g;

        /* renamed from: h  reason: collision with root package name */
        public static final a.b<Application> f3949h = C0061a.C0062a.f3951a;

        /* renamed from: e  reason: collision with root package name */
        private final Application f3950e;

        /* renamed from: androidx.lifecycle.l0$a$a  reason: collision with other inner class name */
        /* compiled from: ViewModelProvider.kt */
        public static final class C0061a {

            /* renamed from: androidx.lifecycle.l0$a$a$a  reason: collision with other inner class name */
            /* compiled from: ViewModelProvider.kt */
            private static final class C0062a implements a.b<Application> {

                /* renamed from: a  reason: collision with root package name */
                public static final C0062a f3951a = new C0062a();

                private C0062a() {
                }
            }

            private C0061a() {
            }

            public /* synthetic */ C0061a(h hVar) {
                this();
            }

            public final a a(Application application) {
                m.e(application, "application");
                if (a.f3948g == null) {
                    a.f3948g = new a(application);
                }
                a e10 = a.f3948g;
                m.b(e10);
                return e10;
            }
        }

        private a(Application application, int i10) {
            this.f3950e = application;
        }

        private final <T extends k0> T g(Class<T> cls, Application application) {
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            try {
                T t10 = (k0) cls.getConstructor(new Class[]{Application.class}).newInstance(new Object[]{application});
                m.d(t10, "{\n                try {\n…          }\n            }");
                return t10;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InstantiationException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            } catch (InvocationTargetException e13) {
                throw new RuntimeException("Cannot create an instance of " + cls, e13);
            }
        }

        public <T extends k0> T a(Class<T> cls) {
            m.e(cls, "modelClass");
            Application application = this.f3950e;
            if (application != null) {
                return g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public <T extends k0> T b(Class<T> cls, p0.a aVar) {
            m.e(cls, "modelClass");
            m.e(aVar, "extras");
            if (this.f3950e != null) {
                return a(cls);
            }
            Application application = (Application) aVar.a(f3949h);
            if (application != null) {
                return g(cls, application);
            }
            if (!a.class.isAssignableFrom(cls)) {
                return super.a(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }

        public a() {
            this((Application) null, 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            m.e(application, "application");
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(o0 o0Var, b bVar, p0.a aVar, int i10, h hVar) {
        this(o0Var, bVar, (i10 & 4) != 0 ? a.C0220a.f21097b : aVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public l0(p0 p0Var, b bVar) {
        this(p0Var.getViewModelStore(), bVar, n0.a(p0Var));
        m.e(p0Var, "owner");
        m.e(bVar, "factory");
    }
}
