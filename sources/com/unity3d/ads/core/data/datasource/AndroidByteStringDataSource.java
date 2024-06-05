package com.unity3d.ads.core.data.datasource;

import com.google.protobuf.i;
import h0.f;
import kotlin.jvm.internal.m;
import sd.w;
import se.g;
import xd.d;

/* compiled from: AndroidByteStringDataSource.kt */
public final class AndroidByteStringDataSource implements ByteStringDataSource {
    private final f<c> dataStore;

    public AndroidByteStringDataSource(f<c> fVar) {
        m.e(fVar, "dataStore");
        this.dataStore = fVar;
    }

    public Object get(d<? super c> dVar) {
        return g.q(g.f(this.dataStore.getData(), new AndroidByteStringDataSource$get$2((d<? super AndroidByteStringDataSource$get$2>) null)), dVar);
    }

    public Object set(i iVar, d<? super w> dVar) {
        Object a10 = this.dataStore.a(new AndroidByteStringDataSource$set$2(iVar, (d<? super AndroidByteStringDataSource$set$2>) null), dVar);
        return a10 == d.c() ? a10 : w.f38141a;
    }
}
