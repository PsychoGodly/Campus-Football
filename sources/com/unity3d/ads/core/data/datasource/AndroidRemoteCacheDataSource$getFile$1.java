package com.unity3d.ads.core.data.datasource;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.data.datasource.AndroidRemoteCacheDataSource", f = "AndroidRemoteCacheDataSource.kt", l = {26}, m = "getFile")
/* compiled from: AndroidRemoteCacheDataSource.kt */
final class AndroidRemoteCacheDataSource$getFile$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidRemoteCacheDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidRemoteCacheDataSource$getFile$1(AndroidRemoteCacheDataSource androidRemoteCacheDataSource, xd.d<? super AndroidRemoteCacheDataSource$getFile$1> dVar) {
        super(dVar);
        this.this$0 = androidRemoteCacheDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getFile((File) null, (String) null, (String) null, (Integer) null, this);
    }
}
