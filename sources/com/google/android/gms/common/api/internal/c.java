package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import m5.m;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f  reason: collision with root package name */
    private static final c f15076f = new c();

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f15077a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f15078b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final ArrayList f15079c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private boolean f15080d = false;

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public interface a {
        void a(boolean z10);
    }

    private c() {
    }

    public static c b() {
        return f15076f;
    }

    public static void c(Application application) {
        c cVar = f15076f;
        synchronized (cVar) {
            if (!cVar.f15080d) {
                application.registerActivityLifecycleCallbacks(cVar);
                application.registerComponentCallbacks(cVar);
                cVar.f15080d = true;
            }
        }
    }

    private final void f(boolean z10) {
        synchronized (f15076f) {
            Iterator it = this.f15079c.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(z10);
            }
        }
    }

    public void a(a aVar) {
        synchronized (f15076f) {
            this.f15079c.add(aVar);
        }
    }

    public boolean d() {
        return this.f15077a.get();
    }

    public boolean e(boolean z10) {
        if (!this.f15078b.get()) {
            if (!m.b()) {
                return z10;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f15078b.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f15077a.set(true);
            }
        }
        return d();
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f15077a.compareAndSet(true, false);
        this.f15078b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f15077a.compareAndSet(true, false);
        this.f15078b.set(true);
        if (compareAndSet) {
            f(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i10) {
        if (i10 == 20 && this.f15077a.compareAndSet(false, true)) {
            this.f15078b.set(true);
            f(true);
        }
    }
}
