package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgcd implements zzgbt {
    private final zzgbo zza;
    private final int zzb;

    private zzgcd(zzgbo zzgbo, int i10) {
        this.zza = zzgbo;
        this.zzb = i10;
    }

    static zzgcd zzc(int i10) throws GeneralSecurityException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return new zzgcd(new zzgbo("HmacSha256"), 1);
        }
        if (i11 != 1) {
            return new zzgcd(new zzgbo("HmacSha512"), 3);
        }
        return new zzgcd(new zzgbo("HmacSha384"), 2);
    }

    public final zzgbu zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair zzb2 = zzgne.zzb(zzgne.zzh(this.zzb));
        byte[] zze = zzgne.zze((ECPrivateKey) zzb2.getPrivate(), zzgne.zzg(zzgne.zzh(this.zzb), 1, bArr));
        byte[] zzi = zzgne.zzi(this.zzb, 1, ((ECPublicKey) zzb2.getPublic()).getW());
        byte[] zzb3 = zzgmv.zzb(zzi, bArr);
        byte[] zzd = zzgcc.zzd(zzb());
        zzgbo zzgbo = this.zza;
        return new zzgbu(zzgbo.zzb((byte[]) null, zze, "eae_prk", zzb3, "shared_secret", zzd, zzgbo.zza()), zzi);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i10 = this.zzb - 1;
        if (i10 == 0) {
            return zzgcc.zzc;
        }
        if (i10 != 1) {
            return zzgcc.zze;
        }
        return zzgcc.zzd;
    }
}
