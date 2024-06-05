package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.ShowEvent;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", l = {156, 157, 158, 160, 165}, m = "emit")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$invoke$4$emit$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, xd.d<? super LegacyShowUseCase$invoke$4$emit$1> dVar) {
        super(dVar);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.emit((ShowEvent) null, (xd.d<? super w>) this);
    }
}
