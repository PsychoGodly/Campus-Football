package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgby extends zzgct {
    final /* synthetic */ zzgbz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgby(zzgbz zzgbz, Class cls) {
        super(cls);
        this.zza = zzgbz;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        zzgkk zzgkk = (zzgkk) zzgrw;
        int zzg = zzgkk.zze().zzg() - 2;
        if (zzg == 1) {
            bArr = zzgoh.zzb();
            bArr2 = zzgoh.zzc(bArr);
        } else if (zzg == 2 || zzg == 3 || zzg == 4) {
            int zzg2 = zzgcc.zzg(zzgkk.zze().zzg());
            KeyPair zzb = zzgne.zzb(zzgne.zzh(zzg2));
            bArr2 = zzgne.zzi(zzg2, 1, ((ECPublicKey) zzb.getPublic()).getW());
            bArr = ((ECPrivateKey) zzb.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        zzgks zzd = zzgkt.zzd();
        zzd.zzc(0);
        zzd.zza(zzgkk.zze());
        zzd.zzb(zzgpe.zzv(bArr2));
        zzgkp zzc = zzgkq.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgkt) zzd.zzal());
        zzc.zza(zzgpe.zzv(bArr));
        return (zzgkq) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgkk.zzd(zzgpe, zzgpy.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgbz.zzg(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgbz.zzg(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgbz.zzg(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgbz.zzg(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgbz.zzg(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgbz.zzg(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzgbz.zzg(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzgbz.zzg(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzgbz.zzg(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzgbz.zzg(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzgbz.zzg(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzgbz.zzg(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzgbz.zzg(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzgbz.zzg(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgcc.zza(((zzgkk) zzgrw).zze());
    }
}
