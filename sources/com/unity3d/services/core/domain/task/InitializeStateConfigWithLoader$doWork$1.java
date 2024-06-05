package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", f = "InitializeStateConfigWithLoader.kt", l = {33}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateConfigWithLoader.kt */
final class InitializeStateConfigWithLoader$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, xd.d<? super InitializeStateConfigWithLoader$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateConfigWithLoader;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m47doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (xd.d<? super o<? extends Configuration>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
