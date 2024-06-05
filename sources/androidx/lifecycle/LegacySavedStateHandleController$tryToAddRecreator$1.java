package androidx.lifecycle;

import androidx.lifecycle.LegacySavedStateHandleController;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import kotlin.jvm.internal.m;

/* compiled from: LegacySavedStateHandleController.kt */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements m {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ i f3826a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ a f3827b;

    LegacySavedStateHandleController$tryToAddRecreator$1(i iVar, a aVar) {
        this.f3826a = iVar;
        this.f3827b = aVar;
    }

    public void onStateChanged(p pVar, i.a aVar) {
        m.e(pVar, "source");
        m.e(aVar, "event");
        if (aVar == i.a.ON_START) {
            this.f3826a.d(this);
            this.f3827b.i(LegacySavedStateHandleController.a.class);
        }
    }
}
