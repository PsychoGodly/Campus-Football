package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ConcurrencyHelpers */
class b {

    /* compiled from: ConcurrencyHelpers */
    static class a {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    static ThreadPoolExecutor b(String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a(str));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Thread c(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    static Handler d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(Looper.getMainLooper());
        }
        return new Handler(Looper.getMainLooper());
    }
}
