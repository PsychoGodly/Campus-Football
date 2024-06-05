package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.core.domain.task.BaseParams;
import com.unity3d.services.core.domain.task.BaseTask;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", f = "BaseTask.kt", l = {11}, m = "invoke-gIAlu-s")
/* compiled from: BaseTask.kt */
final class BaseTask$invoke$1<P extends BaseParams, R> extends d {
    int label;
    /* synthetic */ Object result;

    BaseTask$invoke$1(xd.d<? super BaseTask$invoke$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = BaseTask.DefaultImpls.m36invokegIAlus((BaseTask) null, null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
