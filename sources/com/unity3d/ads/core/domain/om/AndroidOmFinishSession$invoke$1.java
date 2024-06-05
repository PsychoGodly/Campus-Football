package com.unity3d.ads.core.domain.om;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.om.AndroidOmFinishSession", f = "AndroidOmFinishSession.kt", l = {17}, m = "invoke")
/* compiled from: AndroidOmFinishSession.kt */
final class AndroidOmFinishSession$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOmFinishSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOmFinishSession$invoke$1(AndroidOmFinishSession androidOmFinishSession, xd.d<? super AndroidOmFinishSession$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidOmFinishSession;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((AdObject) null, this);
    }
}
