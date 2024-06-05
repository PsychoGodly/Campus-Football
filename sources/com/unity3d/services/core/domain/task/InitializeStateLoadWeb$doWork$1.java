package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb", f = "InitializeStateLoadWeb.kt", l = {39}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateLoadWeb.kt */
final class InitializeStateLoadWeb$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$1(InitializeStateLoadWeb initializeStateLoadWeb, xd.d<? super InitializeStateLoadWeb$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateLoadWeb;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m57doWorkgIAlus((InitializeStateLoadWeb.Params) null, (xd.d<? super o<InitializeStateLoadWeb.LoadWebResult>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
