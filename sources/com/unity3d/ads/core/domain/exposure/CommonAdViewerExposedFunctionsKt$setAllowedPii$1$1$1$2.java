package com.unity3d.ads.core.domain.exposure;

import kotlin.jvm.internal.p;
import vb.t;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* synthetic */ class CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2 extends p {
    CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$2(Object obj) {
        super(obj, t.class, "idfa", "getIdfa()Z", 0);
    }

    public Object get() {
        return Boolean.valueOf(((t) this.receiver).b());
    }

    public void set(Object obj) {
        ((t) this.receiver).d(((Boolean) obj).booleanValue());
    }
}
