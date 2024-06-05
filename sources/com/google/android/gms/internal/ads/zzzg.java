package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public class zzzg {
    protected final zzza zza;
    protected final zzzf zzb;
    protected zzzc zzc;
    private final int zzd;

    protected zzzg(zzzd zzzd, zzzf zzzf, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.zzb = zzzf;
        this.zzd = i10;
        this.zza = new zzza(zzzd, j10, 0, j12, j13, j14, j15);
    }

    protected static final int zzf(zzzv zzzv, long j10, zzaau zzaau) {
        if (j10 == zzzv.zzf()) {
            return 0;
        }
        zzaau.zza = j10;
        return 1;
    }

    protected static final boolean zzg(zzzv zzzv, long j10) throws IOException {
        long zzf = j10 - zzzv.zzf();
        if (zzf < 0 || zzf > 262144) {
            return false;
        }
        ((zzzk) zzzv).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzzv zzzv, zzaau zzaau) throws IOException {
        while (true) {
            zzzc zzzc = this.zzc;
            zzdl.zzb(zzzc);
            long zzb2 = zzzc.zzf;
            long zzc2 = zzzc.zzh;
            if (zzzc.zzg - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzzv, zzb2, zzaau);
            } else if (!zzg(zzzv, zzc2)) {
                return zzf(zzzv, zzc2, zzaau);
            } else {
                zzzv.zzj();
                zzze zza2 = this.zzb.zza(zzzv, zzzc.zzb);
                int zza3 = zza2.zzb;
                if (zza3 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzzv, zzc2, zzaau);
                } else if (zza3 == -2) {
                    zzzc.zzh(zzzc, zza2.zzc, zza2.zzd);
                } else if (zza3 != -1) {
                    zzg(zzzv, zza2.zzd);
                    zzc(true, zza2.zzd);
                    return zzf(zzzv, zza2.zzd, zzaau);
                } else {
                    zzzc.zzg(zzzc, zza2.zzc, zza2.zzd);
                }
            }
        }
    }

    public final zzaax zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z10, long j10) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j10) {
        long j11 = j10;
        zzzc zzzc = this.zzc;
        if (zzzc == null || zzzc.zza != j11) {
            long zzf = this.zza.zzf(j11);
            zzza zzza = this.zza;
            zzzc zzzc2 = r1;
            zzzc zzzc3 = new zzzc(j10, zzf, 0, zzza.zzc, zzza.zzd, zzza.zze, zzza.zzf);
            this.zzc = zzzc2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
