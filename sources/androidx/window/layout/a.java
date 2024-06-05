package androidx.window.layout;

import androidx.window.layout.SidecarWindowBackend;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SidecarWindowBackend.WindowLayoutChangeCallbackWrapper f5079a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ WindowLayoutInfo f5080b;

    public /* synthetic */ a(SidecarWindowBackend.WindowLayoutChangeCallbackWrapper windowLayoutChangeCallbackWrapper, WindowLayoutInfo windowLayoutInfo) {
        this.f5079a = windowLayoutChangeCallbackWrapper;
        this.f5080b = windowLayoutInfo;
    }

    public final void run() {
        SidecarWindowBackend.WindowLayoutChangeCallbackWrapper.m6accept$lambda0(this.f5079a, this.f5080b);
    }
}
