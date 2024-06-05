package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfld extends zzflo {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzfld(String str, String str2, zzflc zzflc) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzflo) {
            zzflo zzflo = (zzflo) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzflo.zzb()) : zzflo.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzflo.zza()) : zzflo.zza() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.zza;
        int i11 = 0;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        String str2 = this.zzb;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return ((i10 ^ 1000003) * 1000003) ^ i11;
    }

    public final String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        return "OverlayDisplayDismissRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
