package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", f = "InitializeStateLoadCache.kt", l = {32}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateLoadCache.kt */
final class InitializeStateLoadCache$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, xd.d<? super InitializeStateLoadCache$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateLoadCache;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m55doWorkgIAlus((InitializeStateLoadCache.Params) null, (xd.d<? super o<InitializeStateLoadCache.LoadCacheResult>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
