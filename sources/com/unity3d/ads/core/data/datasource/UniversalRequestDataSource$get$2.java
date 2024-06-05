package com.unity3d.ads.core.data.datasource;

import fe.q;
import h0.a;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.p;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$get$2", f = "UniversalRequestDataSource.kt", l = {19}, m = "invokeSuspend")
/* compiled from: UniversalRequestDataSource.kt */
final class UniversalRequestDataSource$get$2 extends l implements q<se.f<? super e>, Throwable, d<? super w>, Object> {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    UniversalRequestDataSource$get$2(d<? super UniversalRequestDataSource$get$2> dVar) {
        super(3, dVar);
    }

    public final Object invoke(se.f<? super e> fVar, Throwable th, d<? super w> dVar) {
        UniversalRequestDataSource$get$2 universalRequestDataSource$get$2 = new UniversalRequestDataSource$get$2(dVar);
        universalRequestDataSource$get$2.L$0 = fVar;
        universalRequestDataSource$get$2.L$1 = th;
        return universalRequestDataSource$get$2.invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object c10 = d.c();
        int i10 = this.label;
        if (i10 == 0) {
            p.b(obj);
            se.f fVar = (se.f) this.L$0;
            Throwable th = (Throwable) this.L$1;
            if (th instanceof a) {
                e g02 = e.g0();
                m.d(g02, "getDefaultInstance()");
                this.L$0 = null;
                this.label = 1;
                if (fVar.emit(g02, this) == c10) {
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
