package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.i;
import h0.f;
import kotlin.jvm.internal.m;
import sd.w;
import se.g;
import xd.d;

/* compiled from: UniversalRequestDataSource.kt */
public final class UniversalRequestDataSource {
    private final f<e> universalRequestStore;

    public UniversalRequestDataSource(f<e> fVar) {
        m.e(fVar, "universalRequestStore");
        this.universalRequestStore = fVar;
    }

    public final Object get(d<? super e> dVar) {
        return g.q(g.f(this.universalRequestStore.getData(), new UniversalRequestDataSource$get$2((d<? super UniversalRequestDataSource$get$2>) null)), dVar);
    }

    public final Object remove(String str, d<? super w> dVar) {
        Object a10 = this.universalRequestStore.a(new UniversalRequestDataSource$remove$2(str, (d<? super UniversalRequestDataSource$remove$2>) null), dVar);
        return a10 == d.c() ? a10 : w.f38141a;
    }

    public final Object set(String str, i iVar, d<? super w> dVar) {
        Object a10 = this.universalRequestStore.a(new UniversalRequestDataSource$set$2(str, iVar, (d<? super UniversalRequestDataSource$set$2>) null), dVar);
        return a10 == d.c() ? a10 : w.f38141a;
    }
}
