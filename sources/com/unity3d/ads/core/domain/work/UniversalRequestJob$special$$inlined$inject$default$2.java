package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.data.datasource.UniversalRequestDataSource;
import com.unity3d.services.core.di.IServiceComponent;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: IServiceComponent.kt */
public final class UniversalRequestJob$special$$inlined$inject$default$2 extends n implements a<UniversalRequestDataSource> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UniversalRequestJob$special$$inlined$inject$default$2(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.unity3d.ads.core.data.datasource.UniversalRequestDataSource] */
    public final UniversalRequestDataSource invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, a0.b(UniversalRequestDataSource.class));
    }
}
