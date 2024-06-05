package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a0;
import com.google.android.gms.ads.internal.t;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdzr implements zzfdb {
    private final zzdzf zza;
    private final zzdzj zzb;

    zzdzr(zzdzf zzdzf, zzdzj zzdzj) {
        this.zza = zzdzf;
        this.zzb = zzdzj;
    }

    public final void zzbB(zzfcu zzfcu, String str) {
    }

    public final void zzbC(zzfcu zzfcu, String str, Throwable th) {
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue() && zzfcu.RENDERER == zzfcu && this.zza.zzc() != 0) {
            this.zza.zzf(t.b().b() - this.zza.zzc());
        }
    }

    public final void zzc(zzfcu zzfcu, String str) {
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue()) {
            if (zzfcu.RENDERER == zzfcu) {
                this.zza.zzg(t.b().b());
            } else if (zzfcu.PRELOADED_LOADER == zzfcu || zzfcu.SERVER_TRANSACTION == zzfcu) {
                this.zza.zzh(t.b().b());
                zzdzj zzdzj = this.zzb;
                zzdzj.zza.zza(new zzdzi(zzdzj, this.zza.zzd()));
            }
        }
    }

    public final void zzd(zzfcu zzfcu, String str) {
        if (((Boolean) a0.c().zzb(zzbar.zzfL)).booleanValue() && zzfcu.RENDERER == zzfcu && this.zza.zzc() != 0) {
            this.zza.zzf(t.b().b() - this.zza.zzc());
        }
    }
}
