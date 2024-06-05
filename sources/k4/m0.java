package k4;

import java.util.concurrent.ThreadFactory;

/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class m0 implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f35779a;

    public /* synthetic */ m0(String str) {
        this.f35779a = str;
    }

    public final Thread newThread(Runnable runnable) {
        return n0.y0(this.f35779a, runnable);
    }
}
