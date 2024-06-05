package androidx.appcompat.widget;

import android.window.OnBackInvokedCallback;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class c1 implements OnBackInvokedCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f1549a;

    public /* synthetic */ c1(Runnable runnable) {
        this.f1549a = runnable;
    }

    public final void onBackInvoked() {
        this.f1549a.run();
    }
}
