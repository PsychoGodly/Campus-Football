package com.unity3d.ads.core.domain.om;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.json.JSONObject;

@f(c = "com.unity3d.ads.core.domain.om.AndroidOmStartSession", f = "AndroidOmStartSession.kt", l = {18}, m = "invoke")
/* compiled from: AndroidOmStartSession.kt */
final class AndroidOmStartSession$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidOmStartSession this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidOmStartSession$invoke$1(AndroidOmStartSession androidOmStartSession, xd.d<? super AndroidOmStartSession$invoke$1> dVar) {
        super(dVar);
        this.this$0 = androidOmStartSession;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((AdObject) null, (JSONObject) null, this);
    }
}
