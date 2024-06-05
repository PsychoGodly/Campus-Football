package k4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: SystemClock */
public class g0 implements d {
    protected g0() {
    }

    public long b() {
        return SystemClock.elapsedRealtime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }

    public n d(Looper looper, Handler.Callback callback) {
        return new h0(new Handler(looper, callback));
    }

    public void e() {
    }
}
