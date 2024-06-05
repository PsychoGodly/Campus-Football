package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.Context;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.1.0 */
public abstract class zzc {
    private static zzc zza;

    public static zzc zza(Context context) {
        zzc zzc;
        synchronized (zzc.class) {
            if (zza == null) {
                zzal zzal = new zzal((zzak) null);
                zzal.zzb((Application) context.getApplicationContext());
                zza = zzal.zza();
            }
            zzc = zza;
        }
        return zzc;
    }

    public abstract zzl zzb();

    public abstract zzbq zzc();
}
