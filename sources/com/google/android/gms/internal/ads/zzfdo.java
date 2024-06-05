package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfdo {
    public final String zza;
    public final String zzb;

    public zzfdo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfdo)) {
            return false;
        }
        zzfdo zzfdo = (zzfdo) obj;
        return this.zza.equals(zzfdo.zza) && this.zzb.equals(zzfdo.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
