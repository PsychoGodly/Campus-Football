package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;
import sd.w;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateComplete", f = "InitializeStateComplete.kt", l = {18}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateComplete.kt */
final class InitializeStateComplete$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateComplete this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateComplete$doWork$1(InitializeStateComplete initializeStateComplete, xd.d<? super InitializeStateComplete$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateComplete;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m43doWorkgIAlus((InitializeStateComplete.Params) null, (xd.d<? super o<w>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
