package com.unity3d.ads.core.data.datasource;

import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$set$2", f = "WebviewConfigurationDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: WebviewConfigurationDataSource.kt */
final class WebviewConfigurationDataSource$set$2 extends l implements p<g, d<? super g>, Object> {
    final /* synthetic */ g $data;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    WebviewConfigurationDataSource$set$2(g gVar, d<? super WebviewConfigurationDataSource$set$2> dVar) {
        super(2, dVar);
        this.$data = gVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new WebviewConfigurationDataSource$set$2(this.$data, dVar);
    }

    public final Object invoke(g gVar, d<? super g> dVar) {
        return ((WebviewConfigurationDataSource$set$2) create(gVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            return this.$data;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
