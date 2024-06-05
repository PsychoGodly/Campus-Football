package com.unity3d.ads.core.domain.exposure;

import kotlin.jvm.internal.p;
import vb.t;

/* compiled from: CommonAdViewerExposedFunctions.kt */
/* synthetic */ class CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4 extends p {
    CommonAdViewerExposedFunctionsKt$setAllowedPii$1$1$1$4(Object obj) {
        super(obj, t.class, "idfv", "getIdfv()Z", 0);
    }

    public Object get() {
        return Boolean.valueOf(((t) this.receiver).c());
    }

    public void set(Object obj) {
        ((t) this.receiver).e(((Boolean) obj).booleanValue());
    }
}
