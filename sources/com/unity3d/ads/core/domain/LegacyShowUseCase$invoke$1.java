package com.unity3d.ads.core.domain;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.data.model.Listeners;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {83, 88, 93, 99, 104, 107, 112, 119, 124, 154}, m = "invoke")
/* compiled from: LegacyShowUseCase.kt */
final class LegacyShowUseCase$invoke$1 extends d {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyShowUseCase$invoke$1(LegacyShowUseCase legacyShowUseCase, xd.d<? super LegacyShowUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = legacyShowUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Context) null, (String) null, (UnityAdsShowOptions) null, (Listeners) null, this);
    }
}
