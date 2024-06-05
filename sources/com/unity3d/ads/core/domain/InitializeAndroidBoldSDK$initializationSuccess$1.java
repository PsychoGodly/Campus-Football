package com.unity3d.ads.core.domain;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import oe.i;

@f(c = "com.unity3d.ads.core.domain.InitializeAndroidBoldSDK", f = "InitializeAndroidBoldSDK.kt", l = {94, 95, 97}, m = "initializationSuccess")
/* compiled from: InitializeAndroidBoldSDK.kt */
final class InitializeAndroidBoldSDK$initializationSuccess$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeAndroidBoldSDK this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    InitializeAndroidBoldSDK$initializationSuccess$1(InitializeAndroidBoldSDK initializeAndroidBoldSDK, xd.d<? super InitializeAndroidBoldSDK$initializationSuccess$1> dVar) {
        super(dVar);
        this.this$0 = initializeAndroidBoldSDK;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.initializationSuccess((i) null, this);
    }
}
