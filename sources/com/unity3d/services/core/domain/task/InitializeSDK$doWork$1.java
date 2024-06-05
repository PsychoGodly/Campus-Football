package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;
import sd.w;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {37}, m = "doWork-gIAlu-s")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$1(InitializeSDK initializeSDK, xd.d<? super InitializeSDK$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m41doWorkgIAlus((EmptyParams) null, (xd.d<? super o<w>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
