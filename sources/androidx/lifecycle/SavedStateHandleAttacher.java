package androidx.lifecycle;

import androidx.lifecycle.i;
import kotlin.jvm.internal.m;

/* compiled from: SavedStateHandleSupport.kt */
public final class SavedStateHandleAttacher implements m {

    /* renamed from: a  reason: collision with root package name */
    private final f0 f3869a;

    public SavedStateHandleAttacher(f0 f0Var) {
        m.e(f0Var, "provider");
        this.f3869a = f0Var;
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        if (aVar == i.a.ON_CREATE) {
            pVar.getLifecycle().d(this);
            this.f3869a.d();
            return;
        }
        throw new IllegalStateException(("Next event must be ON_CREATE, it was " + aVar).toString());
    }
}
