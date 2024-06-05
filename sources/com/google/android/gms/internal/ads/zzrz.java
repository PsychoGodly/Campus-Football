package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzrz implements zztc, zzpu {
    final /* synthetic */ zzsb zza;
    private final Object zzb;
    private zztb zzc;
    private zzpt zzd;

    public zzrz(zzsb zzsb, Object obj) {
        this.zza = zzsb;
        this.zzc = zzsb.zze((zzss) null);
        this.zzd = zzsb.zzc((zzss) null);
        this.zzb = obj;
    }

    private final zzso zzf(zzso zzso) {
        zzsb zzsb = this.zza;
        Object obj = this.zzb;
        long j10 = zzso.zzc;
        zzsb.zzw(obj, j10);
        zzsb zzsb2 = this.zza;
        Object obj2 = this.zzb;
        long j11 = zzso.zzd;
        zzsb2.zzw(obj2, j11);
        return (j10 == zzso.zzc && j11 == zzso.zzd) ? zzso : new zzso(1, zzso.zza, zzso.zzb, 0, (Object) null, j10, j11);
    }

    private final boolean zzg(int i10, zzss zzss) {
        zzss zzss2;
        if (zzss != null) {
            zzss2 = this.zza.zzx(this.zzb, zzss);
            if (zzss2 == null) {
                return false;
            }
        } else {
            zzss2 = null;
        }
        this.zza.zzv(this.zzb, 0);
        zztb zztb = this.zzc;
        int i11 = zztb.zza;
        if (!zzew.zzU(zztb.zzb, zzss2)) {
            this.zzc = this.zza.zzf(0, zzss2, 0);
        }
        zzpt zzpt = this.zzd;
        int i12 = zzpt.zza;
        if (zzew.zzU(zzpt.zzb, zzss2)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzss2);
        return true;
    }

    public final void zzaf(int i10, zzss zzss, zzso zzso) {
        if (zzg(0, zzss)) {
            this.zzc.zzc(zzf(zzso));
        }
    }

    public final void zzag(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        if (zzg(0, zzss)) {
            this.zzc.zze(zzsj, zzf(zzso));
        }
    }

    public final void zzah(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        if (zzg(0, zzss)) {
            this.zzc.zzg(zzsj, zzf(zzso));
        }
    }

    public final void zzai(int i10, zzss zzss, zzsj zzsj, zzso zzso, IOException iOException, boolean z10) {
        if (zzg(0, zzss)) {
            this.zzc.zzi(zzsj, zzf(zzso), iOException, z10);
        }
    }

    public final void zzaj(int i10, zzss zzss, zzsj zzsj, zzso zzso) {
        if (zzg(0, zzss)) {
            this.zzc.zzk(zzsj, zzf(zzso));
        }
    }
}
