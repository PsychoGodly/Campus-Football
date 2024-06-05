package com.unity3d.services.core.domain.task;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.o;

@f(c = "com.unity3d.services.core.domain.task.MetricTask", f = "MetricTask.kt", l = {24}, m = "invoke-gIAlu-s$suspendImpl")
/* compiled from: MetricTask.kt */
final class MetricTask$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MetricTask$invoke$1(MetricTask<? super P, R> metricTask, xd.d<? super MetricTask$invoke$1> dVar) {
        super(dVar);
        this.this$0 = metricTask;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        Object r22 = MetricTask.m64invokegIAlus$suspendImpl(this.this$0, null, this);
        return r22 == d.c() ? r22 : o.a(r22);
    }
}
