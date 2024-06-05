package b1;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.Recreator;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateRegistryController.kt */
public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final a f5364d = new a((h) null);

    /* renamed from: a  reason: collision with root package name */
    private final d f5365a;

    /* renamed from: b  reason: collision with root package name */
    private final androidx.savedstate.a f5366b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5367c;

    /* compiled from: SavedStateRegistryController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(d dVar) {
            m.e(dVar, "owner");
            return new c(dVar, (h) null);
        }
    }

    private c(d dVar) {
        this.f5365a = dVar;
        this.f5366b = new androidx.savedstate.a();
    }

    public /* synthetic */ c(d dVar, h hVar) {
        this(dVar);
    }

    public static final c a(d dVar) {
        return f5364d.a(dVar);
    }

    public final androidx.savedstate.a b() {
        return this.f5366b;
    }

    public final void c() {
        i lifecycle = this.f5365a.getLifecycle();
        if (lifecycle.b() == i.b.INITIALIZED) {
            lifecycle.a(new Recreator(this.f5365a));
            this.f5366b.e(lifecycle);
            this.f5367c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f5367c) {
            c();
        }
        i lifecycle = this.f5365a.getLifecycle();
        if (!lifecycle.b().c(i.b.STARTED)) {
            this.f5366b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.b()).toString());
    }

    public final void e(Bundle bundle) {
        m.e(bundle, "outBundle");
        this.f5366b.g(bundle);
    }
}
