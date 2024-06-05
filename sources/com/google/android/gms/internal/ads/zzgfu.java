package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgfu extends zzggc {
    private final int zza;
    private final int zzb;
    private final zzgfs zzc;
    private final zzgfr zzd;

    /* synthetic */ zzgfu(int i10, int i11, zzgfs zzgfs, zzgfr zzgfr, zzgft zzgft) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgfs;
        this.zzd = zzgfr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgfu)) {
            return false;
        }
        zzgfu zzgfu = (zzgfu) obj;
        if (zzgfu.zza == this.zza && zzgfu.zzb() == zzb() && zzgfu.zzc == this.zzc && zzgfu.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i10 = this.zzb;
        int i11 = this.zza;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i10 + "-byte tags, and " + i11 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgfs zzgfs = this.zzc;
        if (zzgfs == zzgfs.zzd) {
            return this.zzb;
        }
        if (zzgfs == zzgfs.zza || zzgfs == zzgfs.zzb || zzgfs == zzgfs.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgfs zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgfs.zzd;
    }
}
