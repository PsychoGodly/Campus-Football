package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.GetLatestWebViewConfiguration", f = "GetLatestWebViewConfiguration.kt", l = {17, 32}, m = "invoke")
/* compiled from: GetLatestWebViewConfiguration.kt */
final class GetLatestWebViewConfiguration$invoke$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GetLatestWebViewConfiguration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    GetLatestWebViewConfiguration$invoke$1(GetLatestWebViewConfiguration getLatestWebViewConfiguration, xd.d<? super GetLatestWebViewConfiguration$invoke$1> dVar) {
        super(dVar);
        this.this$0 = getLatestWebViewConfiguration;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((String) null, (Integer) null, (List<String>) null, this);
    }
}
