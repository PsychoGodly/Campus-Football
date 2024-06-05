package com.unity3d.ads.core.domain.exposure;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt$getPrivacy$1", f = "CommonAdViewerExposedFunctions.kt", l = {199}, m = "invoke")
/* compiled from: CommonAdViewerExposedFunctions.kt */
final class CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonAdViewerExposedFunctionsKt$getPrivacy$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1(CommonAdViewerExposedFunctionsKt$getPrivacy$1 commonAdViewerExposedFunctionsKt$getPrivacy$1, xd.d<? super CommonAdViewerExposedFunctionsKt$getPrivacy$1$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonAdViewerExposedFunctionsKt$getPrivacy$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Object[]) null, (xd.d<Object>) this);
    }
}
