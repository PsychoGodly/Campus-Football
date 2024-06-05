package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
final class zzbb implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ zzbe zza;
    private final Activity zzb;

    public zzbb(zzbe zzbe, Activity activity) {
        this.zza = zzbe;
        this.zzb = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zzb) {
            this.zza.zzd(new zzi(3, "Activity is destroyed."));
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
