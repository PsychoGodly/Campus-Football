package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeSDK", f = "InitializeSDK.kt", l = {111}, m = "executeErrorState-BWLJW6A")
/* compiled from: InitializeSDK.kt */
final class InitializeSDK$executeErrorState$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, xd.d<? super InitializeSDK$executeErrorState$1> dVar) {
        super(dVar);
        this.this$0 = initializeSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m40executeErrorStateBWLJW6A((ErrorState) null, (Throwable) null, (Configuration) null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
