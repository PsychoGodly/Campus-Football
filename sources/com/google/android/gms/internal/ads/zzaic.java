package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzaic {
    public byte[] zza;
    public int zzb;
    private final int zzc;
    private boolean zzd;
    private boolean zze;

    public zzaic(int i10, int i11) {
        this.zzc = i10;
        byte[] bArr = new byte[131];
        this.zza = bArr;
        bArr[2] = 1;
    }

    public final void zza(byte[] bArr, int i10, int i11) {
        if (this.zzd) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.zza;
            int length = bArr2.length;
            int i13 = this.zzb + i12;
            if (length < i13) {
                this.zza = Arrays.copyOf(bArr2, i13 + i13);
            }
            System.arraycopy(bArr, i10, this.zza, this.zzb, i12);
            this.zzb += i12;
        }
    }

    public final void zzb() {
        this.zzd = false;
        this.zze = false;
    }

    public final void zzc(int i10) {
        boolean z10 = true;
        zzdl.zzf(!this.zzd);
        if (i10 != this.zzc) {
            z10 = false;
        }
        this.zzd = z10;
        if (z10) {
            this.zzb = 3;
            this.zze = false;
        }
    }

    public final boolean zzd(int i10) {
        if (!this.zzd) {
            return false;
        }
        this.zzb -= i10;
        this.zzd = false;
        this.zze = true;
        return true;
    }

    public final boolean zze() {
        return this.zze;
    }
}
