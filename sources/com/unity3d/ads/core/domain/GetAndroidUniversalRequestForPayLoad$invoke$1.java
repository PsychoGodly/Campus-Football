package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.t3;

@f(c = "com.unity3d.ads.core.domain.GetAndroidUniversalRequestForPayLoad", f = "GetAndroidUniversalRequestForPayLoad.kt", l = {14}, m = "invoke")
/* compiled from: GetAndroidUniversalRequestForPayLoad.kt */
final class GetAndroidUniversalRequestForPayLoad$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidUniversalRequestForPayLoad this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidUniversalRequestForPayLoad$invoke$1(GetAndroidUniversalRequestForPayLoad getAndroidUniversalRequestForPayLoad, xd.d<? super GetAndroidUniversalRequestForPayLoad$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidUniversalRequestForPayLoad;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((t3.b) null, this);
    }
}
