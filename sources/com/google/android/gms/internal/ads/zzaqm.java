package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaqm implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzaqm(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzaqe(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzaqk(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzaqh(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzaqg(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzaqj(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzaqf(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzaqi(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzaql zzaql) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzaql.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception unused) {
        }
    }
}
