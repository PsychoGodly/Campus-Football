package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import pe.p0;

@f(c = "com.unity3d.ads.core.domain.AndroidGetWebViewContainerUseCase", f = "AndroidGetWebViewContainerUseCase.kt", l = {24}, m = "invoke")
/* compiled from: AndroidGetWebViewContainerUseCase.kt */
final class AndroidGetWebViewContainerUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidGetWebViewContainerUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidGetWebViewContainerUseCase$invoke$1(AndroidGetWebViewContainerUseCase androidGetWebViewContainerUseCase, xd.d<? super AndroidGetWebViewContainerUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidGetWebViewContainerUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((p0) null, this);
    }
}
