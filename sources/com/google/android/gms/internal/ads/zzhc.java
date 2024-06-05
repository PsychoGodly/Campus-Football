package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzhc {
    public final String zza;
    public final zzaf zzb;
    public final zzaf zzc;
    public final int zzd;
    public final int zze;

    public zzhc(String str, zzaf zzaf, zzaf zzaf2, int i10, int i11) {
        boolean z10 = false;
        if (i10 != 0) {
            i11 = i11 == 0 ? 0 : i11;
            zzdl.zzd(z10);
            zzdl.zzc(str);
            this.zza = str;
            Objects.requireNonNull(zzaf);
            this.zzb = zzaf;
            Objects.requireNonNull(zzaf2);
            this.zzc = zzaf2;
            this.zzd = i10;
            this.zze = i11;
        }
        z10 = true;
        zzdl.zzd(z10);
        zzdl.zzc(str);
        this.zza = str;
        Objects.requireNonNull(zzaf);
        this.zzb = zzaf;
        Objects.requireNonNull(zzaf2);
        this.zzc = zzaf2;
        this.zzd = i10;
        this.zze = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhc.class == obj.getClass()) {
            zzhc zzhc = (zzhc) obj;
            return this.zzd == zzhc.zzd && this.zze == zzhc.zze && this.zza.equals(zzhc.zza) && this.zzb.equals(zzhc.zzb) && this.zzc.equals(zzhc.zzc);
        }
    }

    public final int hashCode() {
        return ((((((((this.zzd + 527) * 31) + this.zze) * 31) + this.zza.hashCode()) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode();
    }
}
