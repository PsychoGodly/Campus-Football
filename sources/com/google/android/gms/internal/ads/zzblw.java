package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.a0;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzblw {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbmf zzc;
    private zzbmf zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbmf zza(Context context, zzbzg zzbzg, zzfep zzfep) {
        zzbmf zzbmf;
        synchronized (this.zza) {
            if (this.zzc == null) {
                this.zzc = new zzbmf(zzc(context), zzbzg, (String) a0.c().zzb(zzbar.zza), zzfep);
            }
            zzbmf = this.zzc;
        }
        return zzbmf;
    }

    public final zzbmf zzb(Context context, zzbzg zzbzg, zzfep zzfep) {
        zzbmf zzbmf;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                this.zzd = new zzbmf(zzc(context), zzbzg, (String) zzbcu.zzb.zze(), zzfep);
            }
            zzbmf = this.zzd;
        }
        return zzbmf;
    }
}
