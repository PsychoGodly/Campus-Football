package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwx {
    private final Object zza;
    private final Object zzb;
    private final byte[] zzc;
    private final zzgme zzd;
    private final int zze;
    private final String zzf;
    private final zzfvx zzg;
    private final int zzh;

    zzfwx(Object obj, Object obj2, byte[] bArr, int i10, zzgme zzgme, int i11, String str, zzfvx zzfvx) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzh = i10;
        this.zzd = zzgme;
        this.zze = i11;
        this.zzf = str;
        this.zzg = zzfvx;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzfvx zzb() {
        return this.zzg;
    }

    public final zzgme zzc() {
        return this.zzd;
    }

    public final Object zzd() {
        return this.zza;
    }

    public final Object zze() {
        return this.zzb;
    }

    public final String zzf() {
        return this.zzf;
    }

    public final byte[] zzg() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final int zzh() {
        return this.zzh;
    }
}
