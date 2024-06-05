package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidInitializationCompletedRequest", f = "GetAndroidInitializationCompletedRequest.kt", l = {16, 24}, m = "invoke")
/* compiled from: GetAndroidInitializationCompletedRequest.kt */
final class GetAndroidInitializationCompletedRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidInitializationCompletedRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidInitializationCompletedRequest$invoke$1(GetAndroidInitializationCompletedRequest getAndroidInitializationCompletedRequest, xd.d<? super GetAndroidInitializationCompletedRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidInitializationCompletedRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
