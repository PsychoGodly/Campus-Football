package com.onesignal;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.os.Bundle;

/* compiled from: ActivityLifecycleListener */
class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    private static b f27554a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static a f27555b;

    /* renamed from: c  reason: collision with root package name */
    private static ComponentCallbacks f27556c;

    /* compiled from: ActivityLifecycleListener */
    class a implements ComponentCallbacks {
        a() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            b.f27555b.p(configuration, b.f27555b.e());
        }

        public void onLowMemory() {
        }
    }

    b() {
    }

    public static a b() {
        return f27555b;
    }

    static void c(Application application) {
        if (f27554a == null) {
            b bVar = new b();
            f27554a = bVar;
            application.registerActivityLifecycleCallbacks(bVar);
        }
        if (f27555b == null) {
            f27555b = new a(new OSFocusHandler());
        }
        if (f27556c == null) {
            a aVar = new a();
            f27556c = aVar;
            application.registerComponentCallbacks(aVar);
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.j(activity);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.k(activity);
        }
    }

    public void onActivityPaused(Activity activity) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.l(activity);
        }
    }

    public void onActivityResumed(Activity activity) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.m(activity);
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.n(activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        a aVar = f27555b;
        if (aVar != null) {
            aVar.o(activity);
        }
    }
}
