package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", f = "CommonGetIsFileCache.kt", l = {22}, m = "invoke")
/* compiled from: CommonGetIsFileCache.kt */
final class CommonGetIsFileCache$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonGetIsFileCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonGetIsFileCache$invoke$1(CommonGetIsFileCache commonGetIsFileCache, xd.d<? super CommonGetIsFileCache$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonGetIsFileCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((String) null, this);
    }
}
