package com.unity3d.ads.core.domain.om;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.om.InitializeOMAndroidSDK", f = "InitializeOMAndroidSDK.kt", l = {28}, m = "invoke")
/* compiled from: InitializeOMAndroidSDK.kt */
final class InitializeOMAndroidSDK$invoke$1 extends d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeOMAndroidSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeOMAndroidSDK$invoke$1(InitializeOMAndroidSDK initializeOMAndroidSDK, xd.d<? super InitializeOMAndroidSDK$invoke$1> dVar) {
        super(dVar);
        this.this$0 = initializeOMAndroidSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke(this);
    }
}
