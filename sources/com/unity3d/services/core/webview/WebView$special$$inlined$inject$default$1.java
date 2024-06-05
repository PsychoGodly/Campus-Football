package com.unity3d.services.core.webview;

import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.request.metrics.SDKMetricsSender;
import fe.a;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.n;

/* compiled from: IServiceComponent.kt */
public final class WebView$special$$inlined$inject$default$1 extends n implements a<SDKMetricsSender> {
    final /* synthetic */ String $named;
    final /* synthetic */ IServiceComponent $this_inject;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WebView$special$$inlined$inject$default$1(IServiceComponent iServiceComponent, String str) {
        super(0);
        this.$this_inject = iServiceComponent;
        this.$named = str;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.unity3d.services.core.request.metrics.SDKMetricsSender, java.lang.Object] */
    public final SDKMetricsSender invoke() {
        IServiceComponent iServiceComponent = this.$this_inject;
        return iServiceComponent.getServiceProvider().getRegistry().getService(this.$named, a0.b(SDKMetricsSender.class));
    }
}
