package com.unity3d.ads.core.data.datasource;

import fe.q;
import h0.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.WebviewConfigurationDataSource$get$2", f = "WebviewConfigurationDataSource.kt", l = {18}, m = "invokeSuspend")
/* compiled from: WebviewConfigurationDataSource.kt */
final class WebviewConfigurationDataSource$get$2 extends l implements q<se.f<? super g>, Throwable, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    WebviewConfigurationDataSource$get$2(d<? super WebviewConfigurationDataSource$get$2> dVar) {
        super(3, dVar);
    }

    public final Object invoke(se.f<? super g> fVar, Throwable th, d<? super w> dVar) {
        WebviewConfigurationDataSource$get$2 webviewConfigurationDataSource$get$2 = new WebviewConfigurationDataSource$get$2(dVar);
        webviewConfigurationDataSource$get$2.L$0 = fVar;
        webviewConfigurationDataSource$get$2.L$1 = th;
        return webviewConfigurationDataSource$get$2.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            se.f fVar = (se.f) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof a) {
                g l02 = g.l0();
                m.d(l02, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(l02, this) == c10) {
                    return c10;
                }
            } else {
                throw th;
            }
        } else if (i10 == 1) {
            p.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return w.f38141a;
    }
}
