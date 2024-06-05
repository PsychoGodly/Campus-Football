package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.z;
import defpackage.e;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.UniversalRequestDataSource$remove$2", f = "UniversalRequestDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: UniversalRequestDataSource.kt */
final class UniversalRequestDataSource$remove$2 extends l implements p<e, d<? super e>, Object> {
    final /* synthetic */ String $key;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UniversalRequestDataSource$remove$2(String str, d<? super UniversalRequestDataSource$remove$2> dVar) {
        super(2, dVar);
        this.$key = str;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        UniversalRequestDataSource$remove$2 universalRequestDataSource$remove$2 = new UniversalRequestDataSource$remove$2(this.$key, dVar);
        universalRequestDataSource$remove$2.L$0 = obj;
        return universalRequestDataSource$remove$2;
    }

    public final Object invoke(e eVar, d<? super e> dVar) {
        return ((UniversalRequestDataSource$remove$2) create(eVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            e.a aVar = (e.a) ((e) this.L$0).b();
            aVar.G(this.$key);
            z s10 = aVar.build();
            m.d(s10, "dataBuilder.build()");
            return s10;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
