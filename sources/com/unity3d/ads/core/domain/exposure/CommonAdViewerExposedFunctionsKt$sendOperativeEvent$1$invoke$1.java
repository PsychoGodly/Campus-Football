package com.unity3d.ads.core.domain.exposure;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1", f = "CommonAdViewerExposedFunctions.kt", l = {111}, m = "invoke")
/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1(CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1 commonAdViewerExposedFunctionsKt$sendOperativeEvent$1, xd.d<? super CommonAdViewerExposedFunctionsKt$sendOperativeEvent$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$sendOperativeEvent$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Object[]) null, (xd.d<? super w>) this);
    }
}
