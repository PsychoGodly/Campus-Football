package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidUniversalRequestSharedData", f = "GetAndroidUniversalRequestSharedData.kt", l = {26}, m = "invoke")
/* compiled from: GetAndroidUniversalRequestSharedData.kt */
final class GetAndroidUniversalRequestSharedData$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidUniversalRequestSharedData this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidUniversalRequestSharedData$invoke$1(GetAndroidUniversalRequestSharedData getAndroidUniversalRequestSharedData, xd.d<? super GetAndroidUniversalRequestSharedData$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidUniversalRequestSharedData;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
