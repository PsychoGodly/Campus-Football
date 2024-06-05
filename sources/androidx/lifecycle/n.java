package androidx.lifecycle;

import kotlin.jvm.internal.m;
import pe.c2;
import pe.g1;
import pe.z2;

/* compiled from: Lifecycle.kt */
public final class n {
    public static final j a(i iVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        m.e(iVar, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) iVar.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(iVar, z2.b((c2) null, 1, (Object) null).plus(g1.c().b1()));
        } while (!iVar.c().compareAndSet((Object) null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.h();
        return lifecycleCoroutineScopeImpl;
    }
}
