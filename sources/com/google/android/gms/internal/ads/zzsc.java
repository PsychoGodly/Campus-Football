package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzsc implements zzul {
    protected final zzul[] zza;

    public zzsc(zzul[] zzulArr) {
        this.zza = zzulArr;
    }

    public final long zzb() {
        long j10 = Long.MAX_VALUE;
        for (zzul zzb : this.zza) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzb2);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final long zzc() {
        long j10 = Long.MAX_VALUE;
        for (zzul zzc : this.zza) {
            long zzc2 = zzc.zzc();
            if (zzc2 != Long.MIN_VALUE) {
                j10 = Math.min(j10, zzc2);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public final void zzm(long j10) {
        for (zzul zzm : this.zza) {
            zzm.zzm(j10);
        }
    }

    public final boolean zzo(long j10) {
        long j11 = j10;
        boolean z10 = false;
        while (true) {
            long zzc = zzc();
            if (zzc == Long.MIN_VALUE) {
                break;
            }
            boolean z11 = false;
            for (zzul zzul : this.zza) {
                long zzc2 = zzul.zzc();
                boolean z12 = zzc2 != Long.MIN_VALUE && zzc2 <= j11;
                if (zzc2 == zzc || z12) {
                    z11 |= zzul.zzo(j11);
                }
            }
            z10 |= z11;
            if (!z11) {
                break;
            }
        }
        return z10;
    }

    public final boolean zzp() {
        for (zzul zzp : this.zza) {
            if (zzp.zzp()) {
                return true;
            }
        }
        return false;
    }
}
