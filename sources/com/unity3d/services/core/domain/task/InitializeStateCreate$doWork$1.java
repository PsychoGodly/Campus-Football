package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.InitializeStateCreate", f = "InitializeStateCreate.kt", l = {28}, m = "doWork-gIAlu-s")
/* compiled from: InitializeStateCreate.kt */
final class InitializeStateCreate$doWork$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateCreate this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeStateCreate$doWork$1(InitializeStateCreate initializeStateCreate, xd.d<? super InitializeStateCreate$doWork$1> dVar) {
        super(dVar);
        this.this$0 = initializeStateCreate;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = this.this$0.m51doWorkgIAlus((InitializeStateCreate.Params) null, (xd.d<? super o<? extends Configuration>>) this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
