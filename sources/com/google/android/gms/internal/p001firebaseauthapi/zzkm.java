package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import com.google.android.gms.internal.p001firebaseauthapi.zzes;
import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import com.google.android.gms.internal.p001firebaseauthapi.zzka;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzkm {
    private static final String zza = new zzjj().zze();
    private static final String zzb = new zzji().zze();
    @Deprecated
    private static final zzvt zzc = zzvt.zzb();
    @Deprecated
    private static final zzvt zzd = zzvt.zzb();
    @Deprecated
    private static final zzvt zze = zzvt.zzb();

    static {
        try {
            zza();
        } catch (GeneralSecurityException e10) {
            throw new ExceptionInInitializerError(e10);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzkp.zzc();
        zzkr.zzc();
        zzcw.zza();
        zziz.zza();
        if (!zzif.zzb()) {
            zzct.zza(new zzji(), new zzjj(), true);
            zzjt.zza();
            zzns zza2 = zzns.zza();
            HashMap hashMap = new HashMap();
            zzjl.zza zzc2 = zzjl.zzc();
            zzjl.zzc zzc3 = zzjl.zzc.zza;
            zzjl.zza zza3 = zzc2.zza(zzc3);
            zzjl.zzb zzb2 = zzjl.zzb.zzc;
            zzjl.zza zza4 = zza3.zza(zzb2);
            zzjl.zze zze2 = zzjl.zze.zzb;
            zzjl.zza zza5 = zza4.zza(zze2);
            zzjl.zzd zzd2 = zzjl.zzd.zza;
            zzjl.zza zza6 = zza5.zza(zzd2);
            zzes.zza zzc4 = zzes.zze().zza(12).zzb(16).zzc(16);
            zzes.zzb zzb3 = zzes.zzb.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zza6.zza((zzch) zzc4.zza(zzb3).zza()).zza());
            zzjl.zza zza7 = zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze2);
            zzjl.zzd zzd3 = zzjl.zzd.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zza7.zza(zzd3).zza((zzch) zzes.zze().zza(12).zzb(16).zzc(16).zza(zzb3).zza()).zza());
            zzjl.zza zza8 = zzjl.zzc().zza(zzc3).zza(zzb2);
            zzjl.zze zze3 = zzjl.zze.zza;
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zza8.zza(zze3).zza(zzd2).zza((zzch) zzes.zze().zza(12).zzb(16).zzc(16).zza(zzb3).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze3).zza(zzd3).zza((zzch) zzes.zze().zza(12).zzb(16).zzc(16).zza(zzb3).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze3).zza(zzd3).zza((zzch) zzes.zze().zza(12).zzb(16).zzc(16).zza(zzb3).zza()).zza());
            zzjl.zza zza9 = zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze2).zza(zzd2);
            zzdl.zza zzc5 = zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16);
            zzdl.zzb zzb4 = zzdl.zzb.zzc;
            zzdl.zza zza10 = zzc5.zza(zzb4);
            zzdl.zzc zzc6 = zzdl.zzc.zzc;
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zza9.zza((zzch) zza10.zza(zzc6).zza()).zza());
            hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze2).zza(zzd3).zza((zzch) zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzb4).zza(zzc6).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze3).zza(zzd2).zza((zzch) zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzb4).zza(zzc6).zza()).zza());
            hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjl.zzc().zza(zzc3).zza(zzb2).zza(zze3).zza(zzd3).zza((zzch) zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzb4).zza(zzc6).zza()).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zzct.zza(new zzln(), new zzlr(), true);
            zzke.zza();
            zzns zza11 = zzns.zza();
            HashMap hashMap2 = new HashMap();
            zzka.zzc zzc7 = zzka.zzc();
            zzka.zzf zzf = zzka.zzf.zza;
            zzka.zzc zza12 = zzc7.zza(zzf);
            zzka.zzd zzd4 = zzka.zzd.zzd;
            zzka.zzc zza13 = zza12.zza(zzd4);
            zzka.zze zze4 = zzka.zze.zza;
            zzka.zzc zza14 = zza13.zza(zze4);
            zzka.zza zza15 = zzka.zza.zza;
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza14.zza(zza15).zza());
            zzka.zzc zzc8 = zzka.zzc();
            zzka.zzf zzf2 = zzka.zzf.zzc;
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzc8.zza(zzf2).zza(zzd4).zza(zze4).zza(zza15).zza());
            zzka.zzc zza16 = zzka.zzc().zza(zzf).zza(zzd4).zza(zze4);
            zzka.zza zza17 = zzka.zza.zzb;
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zza16.zza(zza17).zza());
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd4).zza(zze4).zza(zza17).zza());
            zzka.zzc zza18 = zzka.zzc().zza(zzf).zza(zzd4).zza(zze4);
            zzka.zza zza19 = zzka.zza.zzc;
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zza18.zza(zza19).zza());
            hashMap2.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzka.zzc().zza(zzf2).zza(zzd4).zza(zze4).zza(zza19).zza());
            zzka.zzc zza20 = zzka.zzc().zza(zzf);
            zzka.zzd zzd5 = zzka.zzd.zza;
            hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zza20.zza(zzd5).zza(zze4).zza(zza15).zza());
            hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd5).zza(zze4).zza(zza15).zza());
            hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzka.zzc().zza(zzf).zza(zzd5).zza(zze4).zza(zza17).zza());
            hashMap2.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd5).zza(zze4).zza(zza17).zza());
            zzka.zzc zza21 = zzka.zzc().zza(zzf);
            zzka.zzd zzd6 = zzka.zzd.zzb;
            zzka.zzc zza22 = zza21.zza(zzd6);
            zzka.zze zze5 = zzka.zze.zzb;
            hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zza22.zza(zze5).zza(zza15).zza());
            hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd6).zza(zze5).zza(zza15).zza());
            hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzka.zzc().zza(zzf).zza(zzd6).zza(zze5).zza(zza17).zza());
            hashMap2.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd6).zza(zze5).zza(zza17).zza());
            zzka.zzc zza23 = zzka.zzc().zza(zzf);
            zzka.zzd zzd7 = zzka.zzd.zzc;
            zzka.zzc zza24 = zza23.zza(zzd7);
            zzka.zze zze6 = zzka.zze.zzc;
            hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zza24.zza(zze6).zza(zza15).zza());
            hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd7).zza(zze6).zza(zza15).zza());
            hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzka.zzc().zza(zzf).zza(zzd7).zza(zze6).zza(zza17).zza());
            hashMap2.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzka.zzc().zza(zzf2).zza(zzd7).zza(zze6).zza(zza17).zza());
            zza11.zza(Collections.unmodifiableMap(hashMap2));
        }
    }
}
