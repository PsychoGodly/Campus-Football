package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzagr {
    private final zzags zza = new zzags();
    private final zzen zzb = new zzen(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzagr() {
    }

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzags zzags = this.zza;
            if (i14 >= zzags.zzc) {
                break;
            }
            int[] iArr = zzags.zzf;
            this.zzd = i13 + 1;
            i11 = iArr[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final zzen zza() {
        return this.zzb;
    }

    public final zzags zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzC(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzen zzen = this.zzb;
        if (zzen.zzH().length != 65025) {
            zzen.zzD(Arrays.copyOf(zzen.zzH(), Math.max(65025, zzen.zzd())), this.zzb.zzd());
        }
    }

    public final boolean zze(zzzv zzzv) throws IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzC(0);
        }
        while (true) {
            boolean z10 = true;
            if (this.zze) {
                return true;
            }
            int i10 = this.zzc;
            if (i10 < 0) {
                if (!this.zza.zzc(zzzv, -1) || !this.zza.zzb(zzzv, true)) {
                    return false;
                }
                zzags zzags = this.zza;
                int i11 = zzags.zzd;
                if ((zzags.zza & 1) == 1 && this.zzb.zzd() == 0) {
                    i11 += zzf(0);
                    i10 = this.zzd;
                } else {
                    i10 = 0;
                }
                if (!zzzy.zze(zzzv, i11)) {
                    return false;
                }
                this.zzc = i10;
            }
            int zzf = zzf(i10);
            int i12 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzen zzen = this.zzb;
                zzen.zzz(zzen.zzd() + zzf);
                zzen zzen2 = this.zzb;
                if (!zzzy.zzd(zzzv, zzen2.zzH(), zzen2.zzd(), zzf)) {
                    return false;
                }
                zzen zzen3 = this.zzb;
                zzen3.zzE(zzen3.zzd() + zzf);
                if (this.zza.zzf[i12 - 1] == 255) {
                    z10 = false;
                }
                this.zze = z10;
            }
            if (i12 == this.zza.zzc) {
                i12 = -1;
            }
            this.zzc = i12;
        }
        return false;
    }
}
