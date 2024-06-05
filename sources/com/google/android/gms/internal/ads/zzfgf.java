package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfgf {
    private static zzfgf zza;
    private float zzb = 0.0f;
    private final zzffy zzc;
    private final zzffw zzd;
    private zzffx zze;
    private zzffz zzf;

    public zzfgf(zzffy zzffy, zzffw zzffw) {
        this.zzc = zzffy;
        this.zzd = zzffw;
    }

    public static zzfgf zzb() {
        if (zza == null) {
            zza = new zzfgf(new zzffy(), new zzffw());
        }
        return zza;
    }

    public final float zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zze = new zzffx(new Handler(), context, new zzffv(), this, (byte[]) null);
    }

    public final void zzd(float f10) {
        this.zzb = f10;
        if (this.zzf == null) {
            this.zzf = zzffz.zza();
        }
        for (zzffo zzg : this.zzf.zzb()) {
            zzg.zzg().zzh(f10);
        }
    }

    public final void zze() {
        zzfga.zza().zzd(this);
        zzfga.zza().zzb();
        zzfhb.zzd().zzi();
        this.zze.zza();
    }

    public final void zzf() {
        zzfhb.zzd().zzj();
        zzfga.zza().zzc();
        this.zze.zzb();
    }
}
