package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzrw implements zzuj {
    public final zzuj zza;
    final /* synthetic */ zzrx zzb;
    private boolean zzc;

    public zzrw(zzrx zzrx, zzuj zzuj) {
        this.zzb = zzrx;
        this.zza = zzuj;
    }

    public final int zza(zzjo zzjo, zzgr zzgr, int i10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        if (this.zzc) {
            zzgr.zzc(4);
            return -4;
        }
        int zza2 = this.zza.zza(zzjo, zzgr, i10);
        if (zza2 == -5) {
            zzaf zzaf = zzjo.zza;
            Objects.requireNonNull(zzaf);
            int i11 = zzaf.zzC;
            int i12 = 0;
            if (i11 == 0) {
                if (zzaf.zzD != 0) {
                    i11 = 0;
                }
                return -5;
            }
            if (this.zzb.zzb == Long.MIN_VALUE) {
                i12 = zzaf.zzD;
            }
            zzad zzb2 = zzaf.zzb();
            zzb2.zzC(i11);
            zzb2.zzD(i12);
            zzjo.zza = zzb2.zzY();
            return -5;
        }
        zzrx zzrx = this.zzb;
        long j10 = zzrx.zzb;
        if (j10 == Long.MIN_VALUE || ((zza2 != -4 || zzgr.zzd < j10) && (zza2 != -3 || zzrx.zzb() != Long.MIN_VALUE || zzgr.zzc))) {
            return zza2;
        }
        zzgr.zzb();
        zzgr.zzc(4);
        this.zzc = true;
        return -4;
    }

    public final int zzb(long j10) {
        if (this.zzb.zzq()) {
            return -3;
        }
        return this.zza.zzb(j10);
    }

    public final void zzc() {
        this.zzc = false;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
    }

    public final boolean zze() {
        return !this.zzb.zzq() && this.zza.zze();
    }
}
