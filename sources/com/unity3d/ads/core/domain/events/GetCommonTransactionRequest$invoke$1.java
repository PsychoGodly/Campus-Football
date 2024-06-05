package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.l3;

@f(c = "com.unity3d.ads.core.domain.events.GetCommonTransactionRequest", f = "GetCommonTransactionRequest.kt", l = {14}, m = "invoke")
/* compiled from: GetCommonTransactionRequest.kt */
final class GetCommonTransactionRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetCommonTransactionRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetCommonTransactionRequest$invoke$1(GetCommonTransactionRequest getCommonTransactionRequest, xd.d<? super GetCommonTransactionRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getCommonTransactionRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((List<l3>) null, this);
    }
}
