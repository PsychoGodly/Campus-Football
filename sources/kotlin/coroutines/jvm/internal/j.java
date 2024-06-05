package kotlin.coroutines.jvm.internal;

import xd.d;
import xd.g;
import xd.h;

/* compiled from: ContinuationImpl.kt */
public abstract class j extends a {
    public j(d<Object> dVar) {
        super(dVar);
        if (dVar != null) {
            if (!(dVar.getContext() == h.f39347a)) {
                throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    public g getContext() {
        return h.f39347a;
    }
}
