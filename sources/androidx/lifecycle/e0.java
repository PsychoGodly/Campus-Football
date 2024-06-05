package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.lifecycle.l0;
import androidx.savedstate.a;
import fe.l;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;
import p0.a;

/* compiled from: SavedStateHandleSupport.kt */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a.b<b1.d> f3907a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final a.b<p0> f3908b = new c();

    /* renamed from: c  reason: collision with root package name */
    public static final a.b<Bundle> f3909c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class a implements a.b<Bundle> {
        a() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class b implements a.b<b1.d> {
        b() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    public static final class c implements a.b<p0> {
        c() {
        }
    }

    /* compiled from: SavedStateHandleSupport.kt */
    static final class d extends n implements l<p0.a, g0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f3910a = new d();

        d() {
            super(1);
        }

        /* renamed from: a */
        public final g0 invoke(p0.a aVar) {
            m.e(aVar, "$this$initializer");
            return new g0();
        }
    }

    private static final d0 a(b1.d dVar, p0 p0Var, String str, Bundle bundle) {
        f0 d10 = d(dVar);
        g0 e10 = e(p0Var);
        d0 d0Var = e10.f().get(str);
        if (d0Var != null) {
            return d0Var;
        }
        d0 a10 = d0.f3900f.a(d10.b(str), bundle);
        e10.f().put(str, a10);
        return a10;
    }

    public static final d0 b(p0.a aVar) {
        m.e(aVar, "<this>");
        b1.d dVar = (b1.d) aVar.a(f3907a);
        if (dVar != null) {
            p0 p0Var = (p0) aVar.a(f3908b);
            if (p0Var != null) {
                Bundle bundle = (Bundle) aVar.a(f3909c);
                String str = (String) aVar.a(l0.c.f3956d);
                if (str != null) {
                    return a(dVar, p0Var, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final <T extends b1.d & p0> void c(T t10) {
        m.e(t10, "<this>");
        i.b b10 = t10.getLifecycle().b();
        if (!(b10 == i.b.INITIALIZED || b10 == i.b.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (t10.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            f0 f0Var = new f0(t10.getSavedStateRegistry(), (p0) t10);
            t10.getSavedStateRegistry().h("androidx.lifecycle.internal.SavedStateHandlesProvider", f0Var);
            t10.getLifecycle().a(new SavedStateHandleAttacher(f0Var));
        }
    }

    public static final f0 d(b1.d dVar) {
        m.e(dVar, "<this>");
        a.c c10 = dVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        f0 f0Var = c10 instanceof f0 ? (f0) c10 : null;
        if (f0Var != null) {
            return f0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final g0 e(p0 p0Var) {
        Class cls = g0.class;
        m.e(p0Var, "<this>");
        p0.c cVar = new p0.c();
        cVar.a(a0.b(cls), d.f3910a);
        return (g0) new l0(p0Var, cVar.b()).b("androidx.lifecycle.internal.SavedStateHandlesVM", cls);
    }
}
