package com.unity3d.ads.adplayer;

import kotlin.jvm.internal.m;
import pe.k0;
import pe.p0;
import pe.q0;
import xd.g;

/* compiled from: AdPlayerScope.kt */
public final class AdPlayerScope implements p0 {
    private final /* synthetic */ p0 $$delegate_0;
    private final k0 defaultDispatcher;

    public AdPlayerScope(k0 k0Var) {
        m.e(k0Var, "defaultDispatcher");
        this.defaultDispatcher = k0Var;
        this.$$delegate_0 = q0.a(k0Var);
    }

    public g getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
