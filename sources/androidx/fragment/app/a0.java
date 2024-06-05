package androidx.fragment.app;

import android.os.Bundle;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import androidx.lifecycle.o0;
import androidx.lifecycle.p0;
import androidx.lifecycle.r;
import b1.c;
import b1.d;
import p0.a;

/* compiled from: FragmentViewLifecycleOwner */
class a0 implements h, d, p0 {

    /* renamed from: a  reason: collision with root package name */
    private final Fragment f3482a;

    /* renamed from: b  reason: collision with root package name */
    private final o0 f3483b;

    /* renamed from: c  reason: collision with root package name */
    private r f3484c = null;

    /* renamed from: d  reason: collision with root package name */
    private c f3485d = null;

    a0(Fragment fragment, o0 o0Var) {
        this.f3482a = fragment;
        this.f3483b = o0Var;
    }

    /* access modifiers changed from: package-private */
    public void a(i.a aVar) {
        this.f3484c.i(aVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (this.f3484c == null) {
            this.f3484c = new r(this);
            this.f3485d = c.a(this);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean c() {
        return this.f3484c != null;
    }

    /* access modifiers changed from: package-private */
    public void d(Bundle bundle) {
        this.f3485d.d(bundle);
    }

    /* access modifiers changed from: package-private */
    public void e(Bundle bundle) {
        this.f3485d.e(bundle);
    }

    /* access modifiers changed from: package-private */
    public void f(i.b bVar) {
        this.f3484c.o(bVar);
    }

    public /* synthetic */ a getDefaultViewModelCreationExtras() {
        return g.a(this);
    }

    public i getLifecycle() {
        b();
        return this.f3484c;
    }

    public androidx.savedstate.a getSavedStateRegistry() {
        b();
        return this.f3485d.b();
    }

    public o0 getViewModelStore() {
        b();
        return this.f3483b;
    }
}
