package com.unity3d.ads.core.domain.work;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.work.DiagnosticEventJob", f = "DiagnosticEventJob.kt", l = {22, 25, 27}, m = "doWork")
/* compiled from: DiagnosticEventJob.kt */
final class DiagnosticEventJob$doWork$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DiagnosticEventJob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DiagnosticEventJob$doWork$1(DiagnosticEventJob diagnosticEventJob, xd.d<? super DiagnosticEventJob$doWork$1> dVar) {
        super(dVar);
        this.this$0 = diagnosticEventJob;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.doWork(this);
    }
}
