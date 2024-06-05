package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgex extends zzggc {
    private final int zza;
    private final int zzb;
    private final zzgev zzc;

    /* synthetic */ zzgex(int i10, int i11, zzgev zzgev, zzgew zzgew) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgev;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgex)) {
            return false;
        }
        zzgex zzgex = (zzgex) obj;
        if (zzgex.zza == this.zza && zzgex.zzb() == zzb() && zzgex.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i10 = this.zzb;
        int i11 = this.zza;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgev zzgev = this.zzc;
        if (zzgev == zzgev.zzd) {
            return this.zzb;
        }
        if (zzgev == zzgev.zza || zzgev == zzgev.zzb || zzgev == zzgev.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgev zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgev.zzd;
    }
}
