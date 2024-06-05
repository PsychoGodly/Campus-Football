package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {293}, m = "getTmpAdObject")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$getTmpAdObject$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$getTmpAdObject$1(LegacyShowUseCase legacyShowUseCase, xd.d<? super LegacyShowUseCase$getTmpAdObject$1> dVar) {
        super(dVar);
        this.this$0 = legacyShowUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getTmpAdObject(this);
    }
}
