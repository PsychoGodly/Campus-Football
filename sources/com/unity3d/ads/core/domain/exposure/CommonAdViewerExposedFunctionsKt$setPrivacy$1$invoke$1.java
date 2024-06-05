package com.unity3d.ads.core.domain.exposure;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import sd.w;

@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$setPrivacy$1", f = "CommonAdViewerExposedFunctions.kt", l = {203}, m = "invoke")
/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$setPrivacy$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1(CommonAdViewerExposedFunctionsKt$setPrivacy$1 commonAdViewerExposedFunctionsKt$setPrivacy$1, xd.d<? super CommonAdViewerExposedFunctionsKt$setPrivacy$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$setPrivacy$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Object[]) null, (xd.d<? super w>) this);
    }
}
