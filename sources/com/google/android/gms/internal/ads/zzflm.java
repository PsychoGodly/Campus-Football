package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzflm extends zzfme {
    private final String zza;
    private final String zzb;

    /* synthetic */ zzflm(String str, String str2, zzfll zzfll) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfme) {
            zzfme zzfme = (zzfme) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzfme.zzb()) : zzfme.zzb() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzfme.zza()) : zzfme.zza() == null) {
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
        return "OverlayDisplayUpdateRequest{sessionToken=" + str + ", appId=" + str2 + "}";
    }

    public final String zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
