package com.unity3d.services;

import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.services.core.di.IServiceComponent;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: IServiceComponent.kt */
public final class UnityAdsSDK$special$$inlined$inject$default$9 extends n implements a<OmFinishSession> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$special$$inlined$inject$default$9(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.unity3d.ads.core.domain.om.OmFinishSession] */
    public final OmFinishSession invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, a0.b(OmFinishSession.class));
    }
}
