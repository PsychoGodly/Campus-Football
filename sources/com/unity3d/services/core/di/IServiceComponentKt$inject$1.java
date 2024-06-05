package com.unity3d.services.core.di;

import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import kotlin.jvm.internal.n;

/* compiled from: IServiceComponent.kt */
public final class IServiceComponentKt$inject$1 extends n implements a<T> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IServiceComponentKt$inject$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    public final T invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        String str = this.$named;
        IServicesRegistry registry = iServiceComponent.getServiceProvider().getRegistry();
        m.j(4, "T");
        return registry.getService(str, a0.b(Object.class));
    }
}
