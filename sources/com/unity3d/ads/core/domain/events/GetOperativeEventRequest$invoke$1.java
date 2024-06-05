package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.j2;

@f(c = "com.unity3d.ads.core.domain.events.GetOperativeEventRequest", f = "GetOperativeEventRequest.kt", l = {35}, m = "invoke")
/* compiled from: GetOperativeEventRequest.kt */
final class GetOperativeEventRequest$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOperativeEventRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetOperativeEventRequest$invoke$1(GetOperativeEventRequest getOperativeEventRequest, xd.d<? super GetOperativeEventRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getOperativeEventRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((j2) null, (i) null, (i) null, (i) null, (String) null, this);
    }
}
