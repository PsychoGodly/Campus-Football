package f7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: UiExecutor */
public enum k implements Executor {
    INSTANCE;
    

    /* renamed from: b  reason: collision with root package name */
    private static final Handler f28857b = null;

    static {
        f28857b = new Handler(Looper.getMainLooper());
    }

    public void execute(Runnable runnable) {
        f28857b.post(runnable);
    }
}
