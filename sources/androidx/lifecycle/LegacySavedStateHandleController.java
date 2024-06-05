package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.i;
import androidx.savedstate.a;
import b1.d;
import kotlin.jvm.internal.m;

/* compiled from: LegacySavedStateHandleController.kt */
public final class LegacySavedStateHandleController {

    /* renamed from: a  reason: collision with root package name */
    public static final LegacySavedStateHandleController f3825a = new LegacySavedStateHandleController();

    /* compiled from: LegacySavedStateHandleController.kt */
    public static final class a implements a.C0081a {
        public void a(d dVar) {
            m.e(dVar, "owner");
            if (dVar instanceof p0) {
                o0 viewModelStore = ((p0) dVar).getViewModelStore();
                androidx.savedstate.a savedStateRegistry = dVar.getSavedStateRegistry();
                for (String b10 : viewModelStore.c()) {
                    k0 b11 = viewModelStore.b(b10);
                    m.b(b11);
                    LegacySavedStateHandleController.a(b11, savedStateRegistry, dVar.getLifecycle());
                }
                if (!viewModelStore.c().isEmpty()) {
                    savedStateRegistry.i(a.class);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner".toString());
        }
    }

    private LegacySavedStateHandleController() {
    }

    public static final void a(k0 k0Var, androidx.savedstate.a aVar, i iVar) {
        m.e(k0Var, "viewModel");
        m.e(aVar, "registry");
        m.e(iVar, "lifecycle");
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) k0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.i()) {
            savedStateHandleController.g(aVar, iVar);
            f3825a.c(aVar, iVar);
        }
    }

    public static final SavedStateHandleController b(androidx.savedstate.a aVar, i iVar, String str, Bundle bundle) {
        m.e(aVar, "registry");
        m.e(iVar, "lifecycle");
        m.b(str);
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, d0.f3900f.a(aVar.b(str), bundle));
        savedStateHandleController.g(aVar, iVar);
        f3825a.c(aVar, iVar);
        return savedStateHandleController;
    }

    private final void c(androidx.savedstate.a aVar, i iVar) {
        i.b b10 = iVar.b();
        if (b10 == i.b.INITIALIZED || b10.c(i.b.STARTED)) {
            aVar.i(a.class);
        } else {
            iVar.a(new LegacySavedStateHandleController$tryToAddRecreator$1(iVar, aVar));
        }
    }
}
