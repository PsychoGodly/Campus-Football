package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfig", f = "InitializeStateConfig.kt", l = {22}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateConfig.kt */
final class InitializeStateConfig$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, xd.d<? super InitializeStateConfig$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateConfig;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m45doWorkgIAlus((InitializeStateConfig.Params) null, (xd.d<? super o<? extends Configuration>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
