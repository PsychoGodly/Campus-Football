package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.collection.b;
import com.google.android.gms.common.internal.q;
import h5.e;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class z extends x2 {

    /* renamed from: f  reason: collision with root package name */
    private final b<b<?>> f15335f = new b<>();

    /* renamed from: g  reason: collision with root package name */
    private final f f15336g;

    z(i iVar, f fVar, e eVar) {
        super(iVar, eVar);
        this.f15336g = fVar;
        this.mLifecycleFragment.a("ConnectionlessLifecycleHelper", this);
    }

    public static void j(Activity activity, f fVar, b<?> bVar) {
        i fragment = LifecycleCallback.getFragment(activity);
        z zVar = (z) fragment.b("ConnectionlessLifecycleHelper", z.class);
        if (zVar == null) {
            zVar = new z(fragment, fVar, e.q());
        }
        q.l(bVar, "ApiKey cannot be null");
        zVar.f15335f.add(bVar);
        fVar.c(zVar);
    }

    private final void k() {
        if (!this.f15335f.isEmpty()) {
            this.f15336g.c(this);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(h5.b bVar, int i10) {
        this.f15336g.I(bVar, i10);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.f15336g.a();
    }

    /* access modifiers changed from: package-private */
    public final b<b<?>> i() {
        return this.f15335f;
    }

    public final void onResume() {
        super.onResume();
        k();
    }

    public final void onStart() {
        super.onStart();
        k();
    }

    public final void onStop() {
        super.onStop();
        this.f15336g.d(this);
    }
}
