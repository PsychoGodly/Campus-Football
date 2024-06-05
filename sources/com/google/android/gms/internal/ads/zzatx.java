package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.applovin.mediation.MaxReward;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;
import com.google.android.gms.ads.internal.util.b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzatx implements Application.ActivityLifecycleCallbacks {
    private Activity zza;
    private Context zzb;
    /* access modifiers changed from: private */
    public final Object zzc = new Object();
    /* access modifiers changed from: private */
    public boolean zzd = true;
    /* access modifiers changed from: private */
    public boolean zze = false;
    /* access modifiers changed from: private */
    public final List zzf = new ArrayList();
    private final List zzg = new ArrayList();
    private Runnable zzh;
    private boolean zzi = false;
    private long zzj;

    zzatx() {
    }

    private final void zzk(Activity activity) {
        synchronized (this.zzc) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.zza = activity;
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.zzc) {
            Activity activity2 = this.zza;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.zza = null;
                }
                Iterator it = this.zzg.iterator();
                while (it.hasNext()) {
                    try {
                        if (((zzaum) it.next()).zza()) {
                            it.remove();
                        }
                    } catch (Exception e10) {
                        t.q().zzu(e10, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        zzk(activity);
        synchronized (this.zzc) {
            for (zzaum zzb2 : this.zzg) {
                try {
                    zzb2.zzb();
                } catch (Exception e10) {
                    t.q().zzu(e10, "AppActivityTracker.ActivityListener.onActivityPaused");
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                }
            }
        }
        this.zze = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            b2.f14773i.removeCallbacks(runnable);
        }
        zzfkr zzfkr = b2.f14773i;
        zzatw zzatw = new zzatw(this);
        this.zzh = zzatw;
        zzfkr.postDelayed(zzatw, this.zzj);
    }

    public final void onActivityResumed(Activity activity) {
        zzk(activity);
        this.zze = false;
        boolean z10 = !this.zzd;
        this.zzd = true;
        Runnable runnable = this.zzh;
        if (runnable != null) {
            b2.f14773i.removeCallbacks(runnable);
        }
        synchronized (this.zzc) {
            for (zzaum zzc2 : this.zzg) {
                try {
                    zzc2.zzc();
                } catch (Exception e10) {
                    t.q().zzu(e10, "AppActivityTracker.ActivityListener.onActivityResumed");
                    zzbza.zzh(MaxReward.DEFAULT_LABEL, e10);
                }
            }
            if (z10) {
                for (zzaty zza2 : this.zzf) {
                    try {
                        zza2.zza(true);
                    } catch (Exception e11) {
                        zzbza.zzh(MaxReward.DEFAULT_LABEL, e11);
                    }
                }
            } else {
                zzbza.zze("App is still foreground.");
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        zzk(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final Activity zza() {
        return this.zza;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final void zzf(zzaty zzaty) {
        synchronized (this.zzc) {
            this.zzf.add(zzaty);
        }
    }

    public final void zzg(Application application, Context context) {
        if (!this.zzi) {
            application.registerActivityLifecycleCallbacks(this);
            if (context instanceof Activity) {
                zzk((Activity) context);
            }
            this.zzb = application;
            this.zzj = ((Long) a0.c().zzb(zzbar.zzaM)).longValue();
            this.zzi = true;
        }
    }

    public final void zzh(zzaty zzaty) {
        synchronized (this.zzc) {
            this.zzf.remove(zzaty);
        }
    }
}
