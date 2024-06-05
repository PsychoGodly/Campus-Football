package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzats implements Application.ActivityLifecycleCallbacks {
    private final Application zza;
    private final WeakReference zzb;
    private boolean zzc = false;

    public zzats(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.zzb = new WeakReference(activityLifecycleCallbacks);
        this.zza = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(new zzatk(this, activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        zza(new zzatq(this, activity));
    }

    public final void onActivityPaused(Activity activity) {
        zza(new zzatn(this, activity));
    }

    public final void onActivityResumed(Activity activity) {
        zza(new zzatm(this, activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zza(new zzatp(this, activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        zza(new zzatl(this, activity));
    }

    public final void onActivityStopped(Activity activity) {
        zza(new zzato(this, activity));
    }

    /* access modifiers changed from: protected */
    public final void zza(zzatr zzatr) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.zzb.get();
            if (activityLifecycleCallbacks != null) {
                zzatr.zza(activityLifecycleCallbacks);
            } else if (!this.zzc) {
                this.zza.unregisterActivityLifecycleCallbacks(this);
                this.zzc = true;
            }
        } catch (Exception e10) {
            zzbza.zzh("Error while dispatching lifecycle callback.", e10);
        }
    }
}
