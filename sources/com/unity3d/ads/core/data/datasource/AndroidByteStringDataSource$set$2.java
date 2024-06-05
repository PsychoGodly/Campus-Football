package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.i;
import com.google.protobuf.z;
import defpackage.c;
import fe.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.m;
import sd.w;
import xd.d;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidByteStringDataSource$set$2", f = "AndroidByteStringDataSource.kt", l = {}, m = "invokeSuspend")
/* compiled from: AndroidByteStringDataSource.kt */
final class AndroidByteStringDataSource$set$2 extends l implements p<c, d<? super c>, Object> {
    final /* synthetic */ i $data;
    /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidByteStringDataSource$set$2(i iVar, d<? super AndroidByteStringDataSource$set$2> dVar) {
        super(2, dVar);
        this.$data = iVar;
    }

    public final d<w> create(Object obj, d<?> dVar) {
        AndroidByteStringDataSource$set$2 androidByteStringDataSource$set$2 = new AndroidByteStringDataSource$set$2(this.$data, dVar);
        androidByteStringDataSource$set$2.L$0 = obj;
        return androidByteStringDataSource$set$2;
    }

    public final Object invoke(c cVar, d<? super c> dVar) {
        return ((AndroidByteStringDataSource$set$2) create(cVar, dVar)).invokeSuspend(w.f38141a);
    }

    public final Object invokeSuspend(Object obj) {
        Object unused = d.c();
        if (this.label == 0) {
            sd.p.b(obj);
            z s10 = ((c.a) ((c) this.L$0).b()).F(this.$data).build();
            m.d(s10, "currentData.toBuilder()\n…\n                .build()");
            return s10;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
