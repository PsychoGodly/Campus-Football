package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import kotlin.jvm.internal.m;

/* compiled from: EmptyActivityLifecycleCallbacks.kt */
public class e implements Application.ActivityLifecycleCallbacks {
    public void onActivityCreated(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
    }

    public void onActivityDestroyed(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityPaused(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityResumed(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        m.e(activity, "activity");
        m.e(bundle, "outState");
    }

    public void onActivityStarted(Activity activity) {
        m.e(activity, "activity");
    }

    public void onActivityStopped(Activity activity) {
        m.e(activity, "activity");
    }
}
