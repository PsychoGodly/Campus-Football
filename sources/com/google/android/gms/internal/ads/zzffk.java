package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzffk {
    public static zzffk zza(zzffl zzffl, zzffm zzffm) {
        if (zzffi.zzb()) {
            return new zzffo(zzffl, zzffm);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }

    public abstract void zzb(View view, zzffq zzffq, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();
}
