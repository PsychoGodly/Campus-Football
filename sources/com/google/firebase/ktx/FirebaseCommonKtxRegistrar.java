package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import e7.e;
import e7.f0;
import e7.h;
import e7.r;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.m;
import pe.k0;
import pe.u1;

@Keep
/* compiled from: Firebase.kt */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* compiled from: Firebase.kt */
    public static final class a<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final a<T> f26698a = new a<>();

        /* renamed from: b */
        public final k0 a(e eVar) {
            Object f10 = eVar.f(f0.a(a7.a.class, Executor.class));
            m.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return u1.b((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class b<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final b<T> f26699a = new b<>();

        /* renamed from: b */
        public final k0 a(e eVar) {
            Object f10 = eVar.f(f0.a(a7.c.class, Executor.class));
            m.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return u1.b((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class c<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final c<T> f26700a = new c<>();

        /* renamed from: b */
        public final k0 a(e eVar) {
            Object f10 = eVar.f(f0.a(a7.b.class, Executor.class));
            m.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return u1.b((Executor) f10);
        }
    }

    /* compiled from: Firebase.kt */
    public static final class d<T> implements h {

        /* renamed from: a  reason: collision with root package name */
        public static final d<T> f26701a = new d<>();

        /* renamed from: b */
        public final k0 a(e eVar) {
            Object f10 = eVar.f(f0.a(a7.d.class, Executor.class));
            m.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return u1.b((Executor) f10);
        }
    }

    public List<e7.c<?>> getComponents() {
        Class<k0> cls = k0.class;
        e7.c<a7.a> d10 = e7.c.c(f0.a(a7.a.class, cls)).b(r.j(f0.a(a7.a.class, Executor.class))).f(a.f26698a).d();
        m.d(d10, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        e7.c<a7.c> d11 = e7.c.c(f0.a(a7.c.class, cls)).b(r.j(f0.a(a7.c.class, Executor.class))).f(b.f26699a).d();
        m.d(d11, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        e7.c<a7.b> d12 = e7.c.c(f0.a(a7.b.class, cls)).b(r.j(f0.a(a7.b.class, Executor.class))).f(c.f26700a).d();
        m.d(d12, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        e7.c<a7.d> d13 = e7.c.c(f0.a(a7.d.class, cls)).b(r.j(f0.a(a7.d.class, Executor.class))).f(d.f26701a).d();
        m.d(d13, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return q.f(d10, d11, d12, d13);
    }
}
