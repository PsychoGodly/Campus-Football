package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.a;
import com.google.android.gms.ads.internal.client.c3;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdoc implements zzcxj, zzcwc, zzcur, zzcvi, a, zzczv {
    private final zzawe zza;
    private boolean zzb = false;

    public zzdoc(zzawe zzawe, zzevx zzevx) {
        this.zza = zzawe;
        zzawe.zzc(2);
        if (zzevx != null) {
            zzawe.zzc(1101);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zza(c3 c3Var) {
        switch (c3Var.f14427a) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzb(zzeyo zzeyo) {
        this.zza.zzb(new zzdny(zzeyo));
    }

    public final void zzbA(zzbtn zzbtn) {
    }

    public final void zzd() {
        this.zza.zzc(1109);
    }

    public final void zze(zzawz zzawz) {
        this.zza.zzb(new zzdob(zzawz));
        this.zza.zzc(1103);
    }

    public final void zzf(zzawz zzawz) {
        this.zza.zzb(new zzdoa(zzawz));
        this.zza.zzc(1102);
    }

    public final void zzh(boolean z10) {
        this.zza.zzc(true != z10 ? 1108 : 1107);
    }

    public final void zzi(zzawz zzawz) {
        this.zza.zzb(new zzdnz(zzawz));
        this.zza.zzc(1104);
    }

    public final void zzk(boolean z10) {
        this.zza.zzc(true != z10 ? 1106 : 1105);
    }

    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    public final void zzn() {
        this.zza.zzc(3);
    }
}
