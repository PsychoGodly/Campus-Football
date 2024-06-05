package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.j2;

@f(c = "com.unity3d.ads.core.domain.events.GetOperativeEventApi", f = "GetOperativeEventApi.kt", l = {20}, m = "invoke")
/* compiled from: GetOperativeEventApi.kt */
final class GetOperativeEventApi$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetOperativeEventApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetOperativeEventApi$invoke$1(GetOperativeEventApi getOperativeEventApi, xd.d<? super GetOperativeEventApi$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getOperativeEventApi;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((j2) null, (i) null, (i) null, (i) null, (String) null, this);
    }
}
