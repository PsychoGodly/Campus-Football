package com.unity3d.ads.core.domain.events;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vb.t3;

@f(c = "com.unity3d.ads.core.domain.events.UniversalRequestEventSender", f = "UniversalRequestEventSender.kt", l = {15, 21}, m = "invoke")
/* compiled from: UniversalRequestEventSender.kt */
final class UniversalRequestEventSender$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestEventSender this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UniversalRequestEventSender$invoke$1(UniversalRequestEventSender universalRequestEventSender, xd.d<? super UniversalRequestEventSender$invoke$1> dVar) {
        super(dVar);
        this.this$0 = universalRequestEventSender;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((t3) null, (RequestPolicy) null, this);
    }
}
