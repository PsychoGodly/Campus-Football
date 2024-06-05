package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzbba {
    public static final void zza(zzbaz zzbaz, zzbax zzbax) {
        if (zzbax.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzbax.zzb())) {
            zzbaz.zzd(zzbax.zza(), zzbax.zzb(), zzbax.zzc(), zzbax.zzd());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
