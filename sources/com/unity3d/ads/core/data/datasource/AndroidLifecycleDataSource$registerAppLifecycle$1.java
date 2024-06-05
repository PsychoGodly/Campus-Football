package com.unity3d.ads.core.data.datasource;

import androidx.lifecycle.a0;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import pe.p0;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidLifecycleDataSource.kt */
final class AndroidLifecycleDataSource$registerAppLifecycle$1 extends l implements p<p0, d<? super w>, Object> {
    int label;
    final /* synthetic */ AndroidLifecycleDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidLifecycleDataSource$registerAppLifecycle$1(AndroidLifecycleDataSource androidLifecycleDataSource, d<? super AndroidLifecycleDataSource$registerAppLifecycle$1> dVar) {
        super(2, dVar);
        this.this$0 = androidLifecycleDataSource;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        return new AndroidLifecycleDataSource$registerAppLifecycle$1(this.this$0, dVar);
    }

    public final Object invoke(p0 p0Var, d<? super w> dVar) {
        return ((AndroidLifecycleDataSource$registerAppLifecycle$1) create(p0Var, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            a0.f3878j.a().getLifecycle().a(this.this$0);
            return w.f38141a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
