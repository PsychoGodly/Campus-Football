package com.unity3d.services.ads.operation.load;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ LoadOperationState f32056a;

    public /* synthetic */ a(LoadOperationState loadOperationState) {
        this.f32056a = loadOperationState;
    }

    public final void run() {
        LoadModuleDecoratorTimeout.lambda$onOperationTimeout$0(this.f32056a);
    }
}
