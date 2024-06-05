package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidAdPlayerContext", f = "GetAndroidAdPlayerContext.kt", l = {15}, m = "invoke")
/* compiled from: GetAndroidAdPlayerContext.kt */
final class GetAndroidAdPlayerContext$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidAdPlayerContext this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidAdPlayerContext$invoke$1(GetAndroidAdPlayerContext getAndroidAdPlayerContext, xd.d<? super GetAndroidAdPlayerContext$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidAdPlayerContext;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
