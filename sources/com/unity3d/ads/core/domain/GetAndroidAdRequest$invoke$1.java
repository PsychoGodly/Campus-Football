package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.p;

@f(c = "com.unity3d.ads.core.domain.GetAndroidAdRequest", f = "GetAndroidAdRequest.kt", l = {31, 38, 51}, m = "invoke")
/* compiled from: GetAndroidAdRequest.kt */
final class GetAndroidAdRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidAdRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidAdRequest$invoke$1(GetAndroidAdRequest getAndroidAdRequest, xd.d<? super GetAndroidAdRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidAdRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((String) null, (i) null, (p) null, this);
    }
}
