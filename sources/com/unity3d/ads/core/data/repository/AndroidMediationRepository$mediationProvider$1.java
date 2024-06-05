package com.unity3d.ads.core.data.repository;

import fe.a;
import kotlin.jvm.internal.n;
import vb.f0;

/* compiled from: AndroidMediationRepository.kt */
final class AndroidMediationRepository$mediationProvider$1 extends n implements a<f0> {
    final /* synthetic */ AndroidMediationRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidMediationRepository$mediationProvider$1(AndroidMediationRepository androidMediationRepository) {
        super(0);
        this.this$0 = androidMediationRepository;
    }

    public final f0 invoke() {
        f0 f0Var;
        String name = this.this$0.getName();
        if (name != null) {
            if (o.r(name, "AppLovinSdk_", false, 2, (Object) null)) {
                f0Var = f0.MEDIATION_PROVIDER_MAX;
            } else if (o.l(name, "AdMob", true)) {
                f0Var = f0.MEDIATION_PROVIDER_ADMOB;
            } else if (o.l(name, "MAX", true)) {
                f0Var = f0.MEDIATION_PROVIDER_MAX;
            } else if (o.l(name, "ironSource", true)) {
                f0Var = f0.MEDIATION_PROVIDER_LEVELPLAY;
            } else {
                f0Var = f0.MEDIATION_PROVIDER_CUSTOM;
            }
            if (f0Var != null) {
                return f0Var;
            }
        }
        return f0.MEDIATION_PROVIDER_UNSPECIFIED;
    }
}
