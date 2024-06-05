package androidx.lifecycle;

import androidx.lifecycle.i;
import androidx.savedstate.a;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateHandleController.kt */
public final class SavedStateHandleController implements m {

    /* renamed from: a  reason: collision with root package name */
    private final String f3870a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f3871b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3872c;

    public SavedStateHandleController(String str, d0 d0Var) {
        m.e(str, "key");
        m.e(d0Var, "handle");
        this.f3870a = str;
        this.f3871b = d0Var;
    }

    public final void g(a aVar, i iVar) {
        m.e(aVar, "registry");
        m.e(iVar, "lifecycle");
        if (!this.f3872c) {
            this.f3872c = true;
            iVar.a(this);
            aVar.h(this.f3870a, this.f3871b.c());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner".toString());
    }

    public final d0 h() {
        return this.f3871b;
    }

    public final boolean i() {
        return this.f3872c;
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        if (aVar == i.a.ON_DESTROY) {
            this.f3872c = false;
            pVar.getLifecycle().d(this);
        }
    }
}
