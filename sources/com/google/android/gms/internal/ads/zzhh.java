package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzhh implements zzjq {
    private final zzkt zza;
    private final zzhg zzb;
    private zzkn zzc;
    private zzjq zzd;
    private boolean zze = true;
    private boolean zzf;

    public zzhh(zzhg zzhg, zzdm zzdm) {
        this.zzb = zzhg;
        this.zza = new zzkt(zzdm);
    }

    public final long zza() {
        throw null;
    }

    public final long zzb(boolean z10) {
        zzkn zzkn = this.zzc;
        if (zzkn == null || zzkn.zzM() || (!this.zzc.zzN() && (z10 || this.zzc.zzG()))) {
            this.zze = true;
            if (this.zzf) {
                this.zza.zzd();
            }
        } else {
            zzjq zzjq = this.zzd;
            Objects.requireNonNull(zzjq);
            long zza2 = zzjq.zza();
            if (this.zze) {
                if (zza2 < this.zza.zza()) {
                    this.zza.zze();
                } else {
                    this.zze = false;
                    if (this.zzf) {
                        this.zza.zzd();
                    }
                }
            }
            this.zza.zzb(zza2);
            zzby zzc2 = zzjq.zzc();
            if (!zzc2.equals(this.zza.zzc())) {
                this.zza.zzg(zzc2);
                this.zzb.zza(zzc2);
            }
        }
        if (this.zze) {
            return this.zza.zza();
        }
        zzjq zzjq2 = this.zzd;
        Objects.requireNonNull(zzjq2);
        return zzjq2.zza();
    }

    public final zzby zzc() {
        zzjq zzjq = this.zzd;
        return zzjq != null ? zzjq.zzc() : this.zza.zzc();
    }

    public final void zzd(zzkn zzkn) {
        if (zzkn == this.zzc) {
            this.zzd = null;
            this.zzc = null;
            this.zze = true;
        }
    }

    public final void zze(zzkn zzkn) throws zzhj {
        zzjq zzjq;
        zzjq zzi = zzkn.zzi();
        if (zzi != null && zzi != (zzjq = this.zzd)) {
            if (zzjq == null) {
                this.zzd = zzi;
                this.zzc = zzkn;
                zzi.zzg(this.zza.zzc());
                return;
            }
            throw zzhj.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    public final void zzf(long j10) {
        this.zza.zzb(j10);
    }

    public final void zzg(zzby zzby) {
        zzjq zzjq = this.zzd;
        if (zzjq != null) {
            zzjq.zzg(zzby);
            zzby = this.zzd.zzc();
        }
        this.zza.zzg(zzby);
    }

    public final void zzh() {
        this.zzf = true;
        this.zza.zzd();
    }

    public final void zzi() {
        this.zzf = false;
        this.zza.zze();
    }
}
