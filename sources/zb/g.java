package zb;

import android.os.Handler;
import android.os.Looper;
import bd.a;
import zb.c;

/* compiled from: PlatformTaskQueue */
public class g implements c.d {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f39526a = a.a(Looper.getMainLooper());

    public void a(Runnable runnable) {
        this.f39526a.post(runnable);
    }
}
