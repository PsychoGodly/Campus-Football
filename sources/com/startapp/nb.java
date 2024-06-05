package com.startapp;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import java.util.Collections;

/* compiled from: Sta */
public class nb implements Application.ActivityLifecycleCallbacks {

    /* renamed from: d  reason: collision with root package name */
    public static nb f16187d = new nb();

    /* renamed from: a  reason: collision with root package name */
    public boolean f16188a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f16189b;

    /* renamed from: c  reason: collision with root package name */
    public a f16190c;

    /* compiled from: Sta */
    public interface a {
    }

    public final void a(boolean z10) {
        if (this.f16189b != z10) {
            this.f16189b = z10;
            if (this.f16188a) {
                a();
                if (this.f16190c == null) {
                    return;
                }
                if (!z10) {
                    w8.f17503h.a();
                    return;
                }
                w8.f17503h.getClass();
                Handler handler = w8.f17505j;
                if (handler != null) {
                    handler.removeCallbacks(w8.f17507l);
                    w8.f17505j = null;
                }
            }
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a(false);
    }

    public void onActivityStopped(Activity activity) {
        View b10;
        if (Build.VERSION.SDK_INT >= 16) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            boolean z10 = true;
            boolean z11 = runningAppProcessInfo.importance != 100;
            boolean z12 = true;
            for (T t10 : Collections.unmodifiableCollection(cb.f15708c.f15710b)) {
                if (t10.c() && (b10 = t10.b()) != null && b10.hasWindowFocus()) {
                    z12 = false;
                }
            }
            if (!z11 || !z12) {
                z10 = false;
            }
            a(z10);
        }
    }

    public final void a() {
        boolean z10 = !this.f16189b;
        for (T t10 : Collections.unmodifiableCollection(cb.f15708c.f15709a)) {
            u9.a aVar = t10.f15795e;
            if (aVar.f30666a.get() != null) {
                ec.f15801a.a(aVar.c(), "setState", z10 ? "foregrounded" : "backgrounded");
            }
        }
    }
}
