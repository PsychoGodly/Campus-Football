package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.TriggerAndroidInitializationCompletedRequest", f = "TriggerAndroidInitializationCompletedRequest.kt", l = {33, 35}, m = "invoke")
/* compiled from: TriggerAndroidInitializationCompletedRequest.kt */
final class TriggerAndroidInitializationCompletedRequest$invoke$1 extends d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TriggerAndroidInitializationCompletedRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TriggerAndroidInitializationCompletedRequest$invoke$1(TriggerAndroidInitializationCompletedRequest triggerAndroidInitializationCompletedRequest, xd.d<? super TriggerAndroidInitializationCompletedRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = triggerAndroidInitializationCompletedRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
