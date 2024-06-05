package com.unity3d.services;

import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.core.di.IServiceComponent;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: IServiceComponent.kt */
public final class UnityAdsSDK$special$$inlined$inject$default$8 extends n implements a<SendDiagnosticEvent> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UnityAdsSDK$special$$inlined$inject$default$8(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.unity3d.ads.core.domain.SendDiagnosticEvent, java.lang.Object] */
    public final SendDiagnosticEvent invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, a0.b(SendDiagnosticEvent.class));
    }
}
