package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidAdDataRefreshRequest", f = "GetAndroidAdDataRefreshRequest.kt", l = {25, 34}, m = "invoke")
/* compiled from: GetAndroidAdDataRefreshRequest.kt */
final class GetAndroidAdDataRefreshRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidAdDataRefreshRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidAdDataRefreshRequest$invoke$1(GetAndroidAdDataRefreshRequest getAndroidAdDataRefreshRequest, xd.d<? super GetAndroidAdDataRefreshRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidAdDataRefreshRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((i) null, (i) null, this);
    }
}
