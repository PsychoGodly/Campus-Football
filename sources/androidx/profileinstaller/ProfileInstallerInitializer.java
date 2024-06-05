package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.unity3d.services.UnityAdsConstants;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ProfileInstallerInitializer implements e1.a<c> {

    private static class a {
        public static void c(Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new m(runnable));
        }
    }

    private static class b {
        public static Handler a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    public static class c {
    }

    /* access modifiers changed from: private */
    public static void j(Context context) {
        new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new k(context));
    }

    /* renamed from: d */
    public c create(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new c();
        }
        e(context.getApplicationContext());
        return new c();
    }

    public List<Class<? extends e1.a<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* access modifiers changed from: package-private */
    public void e(Context context) {
        a.c(new l(this, context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void g(Context context) {
        Handler handler;
        if (Build.VERSION.SDK_INT >= 28) {
            handler = b.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new j(context), (long) (new Random().nextInt(Math.max(1000, 1)) + UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS));
    }
}
