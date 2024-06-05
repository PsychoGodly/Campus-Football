package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzqr {
    private int zza = 0;
    private int zzb = -1;
    private int zzc = 0;
    private int[] zzd;
    private int zze;

    public zzqr() {
        int[] iArr = new int[16];
        this.zzd = iArr;
        this.zze = iArr.length - 1;
    }

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 0) {
            int[] iArr = this.zzd;
            int i11 = this.zza;
            int i12 = iArr[i11];
            this.zza = (i11 + 1) & this.zze;
            this.zzc = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    public final void zzb(int i10) {
        int i11 = this.zzc;
        int[] iArr = this.zzd;
        int length = iArr.length;
        if (i11 == length) {
            int i12 = length + length;
            if (i12 >= 0) {
                int[] iArr2 = new int[i12];
                int i13 = this.zza;
                int i14 = length - i13;
                System.arraycopy(iArr, i13, iArr2, 0, i14);
                System.arraycopy(this.zzd, 0, iArr2, i14, i13);
                this.zza = 0;
                this.zzb = this.zzc - 1;
                this.zzd = iArr2;
                this.zze = iArr2.length - 1;
                iArr = iArr2;
            } else {
                throw new IllegalStateException();
            }
        }
        int i15 = (this.zzb + 1) & this.zze;
        this.zzb = i15;
        iArr[i15] = i10;
        this.zzc++;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = 0;
    }

    public final boolean zzd() {
        return this.zzc == 0;
    }
}
