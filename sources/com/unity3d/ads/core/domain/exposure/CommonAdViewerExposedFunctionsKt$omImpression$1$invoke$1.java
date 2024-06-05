package com.unity3d.ads.core.domain.exposure;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$omImpression$1", f = "CommonAdViewerExposedFunctions.kt", l = {320}, m = "invoke")
/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$omImpression$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1(CommonAdViewerExposedFunctionsKt$omImpression$1 commonAdViewerExposedFunctionsKt$omImpression$1, xd.d<? super CommonAdViewerExposedFunctionsKt$omImpression$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$omImpression$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Object[]) null, (xd.d<? super w>) this);
    }
}
