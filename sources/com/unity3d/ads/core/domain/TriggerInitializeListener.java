package com.unity3d.ads.core.domain;

import com.unity3d.ads.UnityAds;
import kotlin.jvm.internal.m;
import pe.c2;
import pe.k0;
import pe.q0;
import pe.r0;
import xd.d;
import xd.g;

/* compiled from: TriggerInitializeListener.kt */
public final class TriggerInitializeListener {
    private final k0 coroutineDispatcher;

    public TriggerInitializeListener(k0 k0Var) {
        m.e(k0Var, "coroutineDispatcher");
        this.coroutineDispatcher = k0Var;
    }

    public final void error(UnityAds.UnityAdsInitializationError unityAdsInitializationError, String str) {
        m.e(unityAdsInitializationError, "unityAdsInitializationError");
        m.e(str, "errorMsg");
        c2 unused = k.d(q0.a(this.coroutineDispatcher), (g) null, (r0) null, new TriggerInitializeListener$error$1(unityAdsInitializationError, str, (d<? super TriggerInitializeListener$error$1>) null), 3, (Object) null);
    }

    public final void success() {
        c2 unused = k.d(q0.a(this.coroutineDispatcher), (g) null, (r0) null, new TriggerInitializeListener$success$1((d<? super TriggerInitializeListener$success$1>) null), 3, (Object) null);
    }
}
