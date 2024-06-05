package com.unity3d.ads.core.domain;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.services.banners.UnityBannerSize;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@f(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", l = {91, 152, 153, 163}, m = "invoke")
/* compiled from: LegacyLoadUseCase.kt */
final class LegacyLoadUseCase$invoke$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyLoadUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LegacyLoadUseCase$invoke$1(LegacyLoadUseCase legacyLoadUseCase, xd.d<? super LegacyLoadUseCase$invoke$1> dVar) {
        super(dVar);
        this.this$0 = legacyLoadUseCase;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        return this.this$0.invoke((Context) null, (String) null, (UnityAdsLoadOptions) null, (IUnityAdsLoadListener) null, (UnityBannerSize) null, this);
    }
}
