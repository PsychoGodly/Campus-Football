package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzka;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzke  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzke {
    private static final zzxt zza;
    private static final zzxt zzb;
    private static final zznz<zzka, zzor> zzc;
    private static final zznv<zzor> zzd;
    private static final zzmx<zzkn, zzos> zze;
    private static final zzmu<zzos> zzf;
    private static final zzmx<zzkf, zzos> zzg;
    private static final zzmu<zzos> zzh;
    private static final zzmi<zzvs, zzka.zzf> zzi;
    private static final zzmi<zzuo, zzka.zzd> zzj = zzmi.zza().zza(zzuo.DHKEM_P256_HKDF_SHA256, zzka.zzd.zza).zza(zzuo.DHKEM_P384_HKDF_SHA384, zzka.zzd.zzb).zza(zzuo.DHKEM_P521_HKDF_SHA512, zzka.zzd.zzc).zza(zzuo.DHKEM_X25519_HKDF_SHA256, zzka.zzd.zzd).zza();
    private static final zzmi<zzum, zzka.zze> zzk = zzmi.zza().zza(zzum.HKDF_SHA256, zzka.zze.zza).zza(zzum.HKDF_SHA384, zzka.zze.zzb).zza(zzum.HKDF_SHA512, zzka.zze.zzc).zza();
    private static final zzmi<zzuk, zzka.zza> zzl = zzmi.zza().zza(zzuk.AES_128_GCM, zzka.zza.zza).zza(zzuk.AES_256_GCM, zzka.zza.zzb).zza(zzuk.CHACHA20_POLY1305, zzka.zza.zzc).zza();

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzkj, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.firebase-auth-api.zzmz, com.google.android.gms.internal.firebase-auth-api.zzkl] */
    static {
        Class<zzor> cls = zzor.class;
        Class<zzos> cls2 = zzos.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        zza = zzb2;
        zzxt zzb3 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        zzb = zzb3;
        zzc = zznz.zza(zzkh.zza, zzka.class, cls);
        zzd = zznv.zza(zzkg.zza, zzb2, cls);
        zze = zzmx.zza(zzkj.zza, zzkn.class, cls2);
        zzf = zzmu.zza(zzki.zza, zzb3, cls2);
        zzg = zzmx.zza(zzkl.zza, zzkf.class, cls2);
        zzh = zzmu.zza(zzkk.zza, zzb2, cls2);
        zzml zza2 = zzmi.zza().zza(zzvs.RAW, zzka.zzf.zzc).zza(zzvs.TINK, zzka.zzf.zza);
        zzvs zzvs = zzvs.LEGACY;
        zzka.zzf zzf2 = zzka.zzf.zzb;
        zzi = zza2.zza(zzvs, zzf2).zza(zzvs.CRUNCHY, zzf2).zza();
    }

    private static zzka zza(zzvs zzvs, zzur zzur) throws GeneralSecurityException {
        return zzka.zzc().zza(zzi.zza(zzvs)).zza(zzj.zza(zzur.zzc())).zza(zzk.zza(zzur.zzb())).zza(zzl.zza(zzur.zza())).zza();
    }

    /* access modifiers changed from: private */
    public static zzka zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                return zza(zzor.zza().zzd(), zzuq.zza(zzor.zza().zze(), zzaio.zza()).zzc());
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing HpkeParameters failed: ", e10);
            }
        } else {
            String zzf2 = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parseParameters: " + zzf2);
        }
    }

    /* access modifiers changed from: private */
    public static zzkf zzc(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePrivateKey")) {
            try {
                zzuu zza2 = zzuu.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    zzuv zzd2 = zza2.zzd();
                    return zzkf.zza(zzkn.zza(zza(zzos.zzc(), zzd2.zzb()), zza(zzd2.zzb().zzc(), zzd2.zzf().zzg()), zzos.zze()), zzxu.zza(zzme.zza(zzme.zza(zza2.zze().zzg()), zzlt.zza(zzd2.zzb().zzc())), zzcs.zza(zzcs)));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing HpkePrivateKey failed");
            }
        } else {
            String zzf2 = zzos.zzf();
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePrivateKey: " + zzf2);
        }
    }

    /* access modifiers changed from: private */
    public static zzkn zzd(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.HpkePublicKey")) {
            try {
                zzuv zza2 = zzuv.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return zzkn.zza(zza(zzos.zzc(), zza2.zzb()), zza(zza2.zzb().zzc(), zza2.zzf().zzg()), zzos.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing HpkePublicKey failed");
            }
        } else {
            String zzf2 = zzos.zzf();
            throw new IllegalArgumentException("Wrong type URL in call to HpkeProtoSerialization.parsePublicKey: " + zzf2);
        }
    }

    private static zzxt zza(zzuo zzuo, byte[] bArr) throws GeneralSecurityException {
        return zzxt.zza(zzme.zza(zzme.zza(bArr), zzlt.zzb(zzuo)));
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
        zza2.zza(zzh);
    }
}
