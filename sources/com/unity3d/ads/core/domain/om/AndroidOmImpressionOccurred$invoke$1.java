package com.unity3d.ads.core.domain.om;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.om.AndroidOmImpressionOccurred", f = "AndroidOmImpressionOccurred.kt", l = {15}, m = "invoke")
/* compiled from: AndroidOmImpressionOccurred.kt */
final class AndroidOmImpressionOccurred$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOmImpressionOccurred this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOmImpressionOccurred$invoke$1(AndroidOmImpressionOccurred androidOmImpressionOccurred, xd.d<? super AndroidOmImpressionOccurred$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidOmImpressionOccurred;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((AdObject) null, false, this);
    }
}
