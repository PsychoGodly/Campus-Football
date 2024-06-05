package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaev {
    private final zzen zza = new zzen(8);
    private int zzb;

    private final long zzb(zzzv zzzv) throws IOException {
        zzzk zzzk = (zzzk) zzzv;
        int i10 = 0;
        zzzk.zzm(this.zza.zzH(), 0, 1, false);
        byte b10 = this.zza.zzH()[0] & 255;
        if (b10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((b10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = b10 & (~i11);
        zzzk.zzm(this.zza.zzH(), 1, i12, false);
        while (i10 < i12) {
            i10++;
            i13 = (this.zza.zzH()[i10] & 255) + (i13 << 8);
        }
        this.zzb += i12 + 1;
        return (long) i13;
    }

    public final boolean zza(zzzv zzzv) throws IOException {
        long zzb2;
        int i10;
        long zzd = zzzv.zzd();
        long j10 = 1024;
        int i11 = (zzd > -1 ? 1 : (zzd == -1 ? 0 : -1));
        if (i11 != 0 && zzd <= 1024) {
            j10 = zzd;
        }
        zzzk zzzk = (zzzk) zzzv;
        zzzk.zzm(this.zza.zzH(), 0, 4, false);
        long zzs = this.zza.zzs();
        this.zzb = 4;
        while (zzs != 440786851) {
            int i12 = (int) j10;
            int i13 = this.zzb + 1;
            this.zzb = i13;
            if (i13 == i12) {
                return false;
            }
            zzzk.zzm(this.zza.zzH(), 0, 1, false);
            zzs = ((zzs << 8) & -256) | ((long) (this.zza.zzH()[0] & 255));
        }
        long zzb3 = zzb(zzzv);
        long j11 = (long) this.zzb;
        if (zzb3 != Long.MIN_VALUE && (i11 == 0 || j11 + zzb3 < zzd)) {
            while (true) {
                int i14 = (((long) this.zzb) > (j11 + zzb3) ? 1 : (((long) this.zzb) == (j11 + zzb3) ? 0 : -1));
                if (i14 < 0) {
                    if (zzb(zzzv) == Long.MIN_VALUE || zzb2 < 0) {
                        return false;
                    }
                    if (i10 != 0) {
                        int zzb4 = (int) (zzb2 = zzb(zzzv));
                        zzzk.zzl(zzb4, false);
                        this.zzb += zzb4;
                    }
                } else if (i14 == 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
