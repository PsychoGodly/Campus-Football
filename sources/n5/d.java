package n5;

import android.os.Process;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f20981a;

    public d(Runnable runnable, int i10) {
        this.f20981a = runnable;
    }

    public final void run() {
        Process.setThreadPriority(0);
        this.f20981a.run();
    }
}
