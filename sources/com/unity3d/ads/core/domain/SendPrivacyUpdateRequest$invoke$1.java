package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", l = {21, 23}, m = "invoke")
/* compiled from: SendPrivacyUpdateRequest.kt */
final class SendPrivacyUpdateRequest$invoke$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendPrivacyUpdateRequest this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SendPrivacyUpdateRequest$invoke$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest, xd.d<? super SendPrivacyUpdateRequest$invoke$1> dVar) {
        super(dVar);
        this.this$0 = sendPrivacyUpdateRequest;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(0, (i) null, this);
    }
}
