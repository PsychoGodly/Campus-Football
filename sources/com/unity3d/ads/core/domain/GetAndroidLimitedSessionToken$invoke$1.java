package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetAndroidLimitedSessionToken", f = "GetAndroidLimitedSessionToken.kt", l = {20, 21, 22, 23}, m = "invoke")
/* compiled from: GetAndroidLimitedSessionToken.kt */
final class GetAndroidLimitedSessionToken$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetAndroidLimitedSessionToken this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetAndroidLimitedSessionToken$invoke$1(GetAndroidLimitedSessionToken getAndroidLimitedSessionToken, xd.d<? super GetAndroidLimitedSessionToken$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getAndroidLimitedSessionToken;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
