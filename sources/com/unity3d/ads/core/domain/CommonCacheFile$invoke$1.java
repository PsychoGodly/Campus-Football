package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.model.AdObject;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import org.json.JSONArray;

@f(c = "com.unity3d.ads.core.domain.CommonCacheFile", f = "CommonCacheFile.kt", l = {28}, m = "invoke")
/* compiled from: CommonCacheFile.kt */
final class CommonCacheFile$invoke$1 extends d {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CommonCacheFile this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CommonCacheFile$invoke$1(CommonCacheFile commonCacheFile, xd.d<? super CommonCacheFile$invoke$1> dVar) {
        super(dVar);
        this.this$0 = commonCacheFile;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((String) null, (AdObject) null, (JSONArray) null, 0, this);
    }
}
