package com.unity3d.ads.core.domain;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LegacyLoadUseCase f32015a;

    public /* synthetic */ d(LegacyLoadUseCase legacyLoadUseCase) {
        this.f32015a = legacyLoadUseCase;
    }

    public final void run() {
        LegacyLoadUseCase$loadSuccess$2.invokeSuspend$lambda$0(this.f32015a);
    }
}
