package com.unity3d.services.core.extensions;

import androidx.recyclerview.widget.RecyclerView;
import fe.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.services.core.extensions.TaskExtensionsKt", f = "TaskExtensions.kt", l = {17, 30}, m = "withRetry")
/* compiled from: TaskExtensions.kt */
final class TaskExtensionsKt$withRetry$1<T> extends d {
    double D$0;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    TaskExtensionsKt$withRetry$1(xd.d<? super TaskExtensionsKt$withRetry$1> dVar) {
        super(dVar);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return TaskExtensionsKt.withRetry(0, 0, 0.0d, (Exception) null, (p) null, this);
    }
}
