package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzq {
    public static final zzq zza = new zzq(1, 2, 3, (byte[]) null);
    public static final zzn zzb = zzp.zza;
    private static final String zzg = zzew.zzP(0);
    private static final String zzh = zzew.zzP(1);
    private static final String zzi = zzew.zzP(2);
    private static final String zzj = zzew.zzP(3);
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final byte[] zzf;
    private int zzk;

    @Deprecated
    public zzq(int i10, int i11, int i12, byte[] bArr) {
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = bArr;
    }

    public static int zza(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int zzb(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzq.class == obj.getClass()) {
            zzq zzq = (zzq) obj;
            return this.zzc == zzq.zzc && this.zzd == zzq.zzd && this.zze == zzq.zze && Arrays.equals(this.zzf, zzq.zzf);
        }
    }

    public final int hashCode() {
        int i10 = this.zzk;
        if (i10 != 0) {
            return i10;
        }
        int hashCode = ((((((this.zzc + 527) * 31) + this.zzd) * 31) + this.zze) * 31) + Arrays.hashCode(this.zzf);
        this.zzk = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i10 = this.zzc;
        boolean z10 = true;
        String str = i10 != -1 ? i10 != 6 ? i10 != 1 ? i10 != 2 ? "Undefined color space" : "BT601" : "BT709" : "BT2020" : "Unset color space";
        int i11 = this.zzd;
        String str2 = i11 != -1 ? i11 != 1 ? i11 != 2 ? "Undefined color range" : "Limited range" : "Full range" : "Unset color range";
        int i12 = this.zze;
        String str3 = i12 != -1 ? i12 != 1 ? i12 != 3 ? i12 != 6 ? i12 != 7 ? "Undefined color transfer" : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "Linear" : "Unset color transfer";
        if (this.zzf == null) {
            z10 = false;
        }
        return "ColorInfo(" + str + ", " + str2 + ", " + str3 + ", " + z10 + ")";
    }
}
