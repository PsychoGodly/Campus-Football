package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcmm implements zzcvj {
    private final zzezs zza;

    public zzcmm(zzezs zzezs) {
        this.zza = zzezs;
    }

    public final void zzbn(Context context) {
        try {
            this.zza.zzg();
        } catch (zzezc e10) {
            zzbza.zzk("Cannot invoke onDestroy for the mediation adapter.", e10);
        }
    }

    public final void zzbp(Context context) {
        try {
            this.zza.zzt();
        } catch (zzezc e10) {
            zzbza.zzk("Cannot invoke onPause for the mediation adapter.", e10);
        }
    }

    public final void zzbq(Context context) {
        try {
            this.zza.zzu();
            if (context != null) {
                this.zza.zzs(context);
            }
        } catch (zzezc e10) {
            zzbza.zzk("Cannot invoke onResume for the mediation adapter.", e10);
        }
    }
}
