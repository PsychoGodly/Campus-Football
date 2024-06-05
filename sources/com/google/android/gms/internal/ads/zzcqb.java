package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzcqb implements zzcwc, zzatf {
    private final zzeyc zza;
    private final zzcvg zzb;
    private final zzcwl zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzcqb(zzeyc zzeyc, zzcvg zzcvg, zzcwl zzcwl) {
        this.zza = zzeyc;
        this.zzb = zzcvg;
        this.zzc = zzcwl;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzc(zzate zzate) {
        if (this.zza.zzf == 1 && zzate.zzj) {
            zza();
        }
        if (zzate.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
