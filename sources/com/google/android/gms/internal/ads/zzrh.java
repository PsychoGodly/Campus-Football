package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzrh {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzrh(String str, boolean z10, boolean z11) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzrh.class) {
            zzrh zzrh = (zzrh) obj;
            return TextUtils.equals(this.zza, zzrh.zza) && this.zzb == zzrh.zzb && this.zzc == zzrh.zzc;
        }
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 31;
        int i10 = 1237;
        int i11 = true != this.zzb ? 1237 : 1231;
        if (true == this.zzc) {
            i10 = 1231;
        }
        return (((hashCode * 31) + i11) * 31) + i10;
    }
}
