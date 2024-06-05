package com.unity3d.ads.core.domain.work;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.work.UniversalRequestJob", f = "UniversalRequestJob.kt", l = {25, 28, 31}, m = "doWork$suspendImpl")
/* compiled from: UniversalRequestJob.kt */
final class UniversalRequestJob$doWork$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UniversalRequestJob this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    UniversalRequestJob$doWork$1(UniversalRequestJob universalRequestJob, xd.d<? super UniversalRequestJob$doWork$1> dVar) {
        super(dVar);
        this.this$0 = universalRequestJob;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return UniversalRequestJob.doWork$suspendImpl(this.this$0, this);
    }
}
