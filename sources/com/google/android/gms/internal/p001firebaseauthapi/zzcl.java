package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcl<P> {
    private final P zza;
    private final P zzb;
    private final byte[] zzc;
    private final zzuz zzd;
    private final zzvs zze;
    private final int zzf;
    private final String zzg;
    private final zzbt zzh;

    zzcl(P p10, P p11, byte[] bArr, zzuz zzuz, zzvs zzvs, int i10, String str, zzbt zzbt) {
        this.zza = p10;
        this.zzb = p11;
        this.zzc = Arrays.copyOf(bArr, bArr.length);
        this.zzd = zzuz;
        this.zze = zzvs;
        this.zzf = i10;
        this.zzg = str;
        this.zzh = zzbt;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzbt zzb() {
        return this.zzh;
    }

    public final zzuz zzc() {
        return this.zzd;
    }

    public final zzvs zzd() {
        return this.zze;
    }

    public final P zze() {
        return this.zza;
    }

    public final P zzf() {
        return this.zzb;
    }

    public final String zzg() {
        return this.zzg;
    }

    public final byte[] zzh() {
        byte[] bArr = this.zzc;
        if (bArr == null) {
            return null;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
