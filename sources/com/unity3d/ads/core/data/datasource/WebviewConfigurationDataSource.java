package com.unity3d.ads.core.data.datasource;

import h0.f;
import kotlin.jvm.internal.m;
import sd.w;
import se.g;
import xd.d;

/* compiled from: WebviewConfigurationDataSource.kt */
public final class WebviewConfigurationDataSource {
    private final f<g> webviewConfigurationStore;

    public WebviewConfigurationDataSource(f<g> fVar) {
        m.e(fVar, "webviewConfigurationStore");
        this.webviewConfigurationStore = fVar;
    }

    public final Object get(d<? super g> dVar) {
        return g.q(g.f(this.webviewConfigurationStore.getData(), new WebviewConfigurationDataSource$get$2((d<? super WebviewConfigurationDataSource$get$2>) null)), dVar);
    }

    public final Object set(g gVar, d<? super w> dVar) {
        Object a10 = this.webviewConfigurationStore.a(new WebviewConfigurationDataSource$set$2(gVar, (d<? super WebviewConfigurationDataSource$set$2>) null), dVar);
        return a10 == d.c() ? a10 : w.f38141a;
    }
}
