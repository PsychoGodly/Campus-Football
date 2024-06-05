package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidInitializationRequest", f = "GetAndroidInitializationRequest.kt", l = {27, 37, 42, 47, 52, 62}, m = "invoke")
/* compiled from: GetAndroidInitializationRequest.kt */
final class GetAndroidInitializationRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidInitializationRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidInitializationRequest$invoke$1(GetAndroidInitializationRequest getAndroidInitializationRequest, xd.d<? super GetAndroidInitializationRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidInitializationRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
