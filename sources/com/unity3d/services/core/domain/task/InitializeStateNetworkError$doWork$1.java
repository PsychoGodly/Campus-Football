package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateNetworkError;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;
import sd.w;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateNetworkError", f = "InitializeStateNetworkError.kt", l = {33}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateNetworkError.kt */
final class InitializeStateNetworkError$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateNetworkError this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateNetworkError$doWork$1(InitializeStateNetworkError initializeStateNetworkError, xd.d<? super InitializeStateNetworkError$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateNetworkError;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m59doWorkgIAlus((InitializeStateNetworkError.Params) null, (xd.d<? super o<w>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
