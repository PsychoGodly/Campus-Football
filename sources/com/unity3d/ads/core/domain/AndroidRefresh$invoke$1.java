package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.google.protobuf.i;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.AndroidRefresh", f = "AndroidRefresh.kt", l = {25}, m = "invoke")
/* compiled from: AndroidRefresh.kt */
final class AndroidRefresh$invoke$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidRefresh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidRefresh$invoke$1(AndroidRefresh androidRefresh, xd.d<? super AndroidRefresh$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidRefresh;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((i) null, (i) null, this);
    }
}
