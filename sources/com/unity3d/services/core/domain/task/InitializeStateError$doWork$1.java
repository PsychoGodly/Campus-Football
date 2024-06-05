package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateError;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;
import sd.w;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateError", f = "InitializeStateError.kt", l = {27}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateError.kt */
final class InitializeStateError$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateError this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateError$doWork$1(InitializeStateError initializeStateError, xd.d<? super InitializeStateError$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateError;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m53doWorkgIAlus((InitializeStateError.Params) null, (xd.d<? super o<w>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
