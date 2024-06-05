package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzdc {
    public static final zzdc zza = new zzdc(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzdc(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzew.zzW(i12) ? zzew.zzo(i12, i11) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdc)) {
            return false;
        }
        zzdc zzdc = (zzdc) obj;
        return this.zzb == zzdc.zzb && this.zzc == zzdc.zzc && this.zzd == zzdc.zzd;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd)});
    }

    public final String toString() {
        int i10 = this.zzb;
        int i11 = this.zzc;
        int i12 = this.zzd;
        return "AudioFormat[sampleRate=" + i10 + ", channelCount=" + i11 + ", encoding=" + i12 + "]";
    }
}
