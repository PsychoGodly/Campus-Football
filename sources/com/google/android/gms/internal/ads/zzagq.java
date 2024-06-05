package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzagq implements zzzu {
    public static final zzaab zza = zzagp.zza;
    private zzzx zzb;
    private zzagy zzc;
    private boolean zzd;

    private final boolean zze(zzzv zzzv) throws IOException {
        zzags zzags = new zzags();
        if (zzags.zzb(zzzv, true) && (zzags.zza & 2) == 2) {
            int min = Math.min(zzags.zze, 8);
            zzen zzen = new zzen(min);
            ((zzzk) zzzv).zzm(zzen.zzH(), 0, min, false);
            zzen.zzF(0);
            if (zzen.zza() >= 5 && zzen.zzk() == 127 && zzen.zzs() == 1179402563) {
                this.zzc = new zzago();
            } else {
                zzen.zzF(0);
                try {
                    if (zzabh.zzd(1, zzen, true)) {
                        this.zzc = new zzaha();
                    }
                } catch (zzbu unused) {
                }
                zzen.zzF(0);
                if (zzagu.zzd(zzen)) {
                    this.zzc = new zzagu();
                }
            }
            return true;
        }
        return false;
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        zzdl.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzzv)) {
                zzzv.zzj();
            } else {
                throw zzbu.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzd) {
            zzabb zzv = this.zzb.zzv(0, 1);
            this.zzb.zzC();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzzv, zzaau);
    }

    public final void zzb(zzzx zzzx) {
        this.zzb = zzzx;
    }

    public final void zzc(long j10, long j11) {
        zzagy zzagy = this.zzc;
        if (zzagy != null) {
            zzagy.zzj(j10, j11);
        }
    }

    public final boolean zzd(zzzv zzzv) throws IOException {
        try {
            return zze(zzzv);
        } catch (zzbu unused) {
            return false;
        }
    }
}
