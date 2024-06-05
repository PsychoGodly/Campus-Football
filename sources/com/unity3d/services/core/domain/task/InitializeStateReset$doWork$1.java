package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateReset", f = "InitializeStateReset.kt", l = {33}, m = "doWork-gIAlu-s$suspendImpl")
/* compiled from: InitializeStateReset.kt */
final class InitializeStateReset$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, xd.d<? super InitializeStateReset$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateReset;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = InitializeStateReset.m61doWorkgIAlus$suspendImpl(this.this$0, (InitializeStateReset.Params) null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
