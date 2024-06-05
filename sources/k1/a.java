package k1;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.i;
import androidx.work.w;

/* compiled from: DefaultRunnableScheduler */
public class a implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f19547a = i.a(Looper.getMainLooper());

    public void a(long j10, Runnable runnable) {
        this.f19547a.postDelayed(runnable, j10);
    }

    public void b(Runnable runnable) {
        this.f19547a.removeCallbacks(runnable);
    }
}
