package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbb extends zzgct {
    final /* synthetic */ zzgbc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgbb(zzgbc zzgbc, Class cls) {
        super(cls);
        this.zza = zzgbc;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgjg zzgjg = (zzgjg) zzgrw;
        KeyPair zzb = zzgne.zzb(zzgne.zzh(zzgbk.zzc(zzgjg.zze().zzf().zzg())));
        ECPoint w10 = ((ECPublicKey) zzb.getPublic()).getW();
        zzgjo zzd = zzgjp.zzd();
        zzd.zzb(0);
        zzd.zza(zzgjg.zze());
        zzd.zzc(zzgpe.zzv(w10.getAffineX().toByteArray()));
        zzd.zzd(zzgpe.zzv(w10.getAffineY().toByteArray()));
        zzgjl zzc = zzgjm.zzc();
        zzc.zzc(0);
        zzc.zzb((zzgjp) zzd.zzal());
        zzc.zza(zzgpe.zzv(((ECPrivateKey) zzb.getPrivate()).getS().toByteArray()));
        return (zzgjm) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgjg.zzd(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_GCM"), zzgbc.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_GCM"), zzgbc.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 3, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgbc.zzh(4, 5, 4, zzfwi.zza("AES128_CTR_HMAC_SHA256"), zzgbc.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgbk.zza(((zzgjg) zzgrw).zze());
    }
}
