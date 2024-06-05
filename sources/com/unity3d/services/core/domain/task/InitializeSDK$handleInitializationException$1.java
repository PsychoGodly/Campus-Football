package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {102}, m = "handleInitializationException")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$handleInitializationException$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$handleInitializationException$1(InitializeSDK initializeSDK, xd.d<? super InitializeSDK$handleInitializationException$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.handleInitializationException((InitializationException) null, this);
    }
}
