package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.LoadResult;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LegacyLoadUseCase f32013a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LoadResult.Failure f32014b;

    public /* synthetic */ c(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
        this.f32013a = legacyLoadUseCase;
        this.f32014b = failure;
    }

    public final void run() {
        LegacyLoadUseCase$loadFailure$2.invokeSuspend$lambda$0(this.f32013a, this.f32014b);
    }
}
