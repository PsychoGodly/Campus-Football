package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzfhv extends zzfhr {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzfhv(String str, boolean z10, boolean z11, zzfhu zzfhu) {
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfhr) {
            zzfhr zzfhr = (zzfhr) obj;
            return this.zza.equals(zzfhr.zzb()) && this.zzb == zzfhr.zzd() && this.zzc == zzfhr.zzc();
        }
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        int i10 = 1237;
        int i11 = true != this.zzb ? 1237 : 1231;
        if (true == this.zzc) {
            i10 = 1231;
        }
        return (((hashCode * 1000003) ^ i11) * 1000003) ^ i10;
    }

    public final String toString() {
        String str = this.zza;
        boolean z10 = this.zzb;
        boolean z11 = this.zzc;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z10 + ", isGooglePlayServicesAvailable=" + z11 + "}";
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
