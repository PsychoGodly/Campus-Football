package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.CommonClearCache", f = "CommonClearCache.kt", l = {18, 19}, m = "invoke")
/* compiled from: CommonClearCache.kt */
final class CommonClearCache$invoke$1 extends d {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonClearCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonClearCache$invoke$1(CommonClearCache commonClearCache, xd.d<? super CommonClearCache$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonClearCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
