package com.unity3d.ads.core.data.repository;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", l = {167}, m = "getPrivacy")
/* compiled from: AndroidSessionRepository.kt */
final class AndroidSessionRepository$getPrivacy$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AndroidSessionRepository$getPrivacy$1(AndroidSessionRepository androidSessionRepository, xd.d<? super AndroidSessionRepository$getPrivacy$1> dVar) {
        super(dVar);
        this.this$0 = androidSessionRepository;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.getPrivacy(this);
    }
}
