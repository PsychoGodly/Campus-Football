package androidx.profileinstaller;

import android.view.Choreographer;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m implements Choreographer.FrameCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f4306a;

    public /* synthetic */ m(Runnable runnable) {
        this.f4306a = runnable;
    }

    public final void doFrame(long j10) {
        this.f4306a.run();
    }
}
