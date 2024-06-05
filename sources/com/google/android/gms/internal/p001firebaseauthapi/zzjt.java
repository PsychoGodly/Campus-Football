package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import com.google.android.gms.internal.p001firebaseauthapi.zztv;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzjt {
    private static final zzxt zza;
    private static final zzxt zzb;
    private static final zznz<zzjl, zzor> zzc;
    private static final zznv<zzor> zzd;
    private static final zzmx<zzjy, zzos> zze;
    private static final zzmu<zzos> zzf;
    private static final zzmx<zzjq, zzos> zzg;
    private static final zzmu<zzos> zzh;
    private static final zzmi<zzvs, zzjl.zzd> zzi;
    private static final zzmi<zzub, zzjl.zzb> zzj = zzmi.zza().zza(zzub.SHA1, zzjl.zzb.zza).zza(zzub.SHA224, zzjl.zzb.zzb).zza(zzub.SHA256, zzjl.zzb.zzc).zza(zzub.SHA384, zzjl.zzb.zzd).zza(zzub.SHA512, zzjl.zzb.zze).zza();
    private static final zzmi<zzty, zzjl.zzc> zzk = zzmi.zza().zza(zzty.NIST_P256, zzjl.zzc.zza).zza(zzty.NIST_P384, zzjl.zzc.zzb).zza(zzty.NIST_P521, zzjl.zzc.zzc).zza(zzty.CURVE25519, zzjl.zzc.zzd).zza();
    private static final zzmi<zztk, zzjl.zze> zzl = zzmi.zza().zza(zztk.UNCOMPRESSED, zzjl.zze.zzb).zza(zztk.COMPRESSED, zzjl.zze.zza).zza(zztk.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, zzjl.zze.zzc).zza();

    /* JADX WARNING: type inference failed for: r0v2, types: [com.google.android.gms.internal.firebase-auth-api.zzju, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.google.android.gms.internal.firebase-auth-api.zzjw, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzor> cls = zzor.class;
        Class<zzos> cls2 = zzos.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza = zzb2;
        zzxt zzb3 = zzpf.zzb("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        zzb = zzb3;
        zzc = zznz.zza(zzjs.zza, zzjl.class, cls);
        zzd = zznv.zza(zzjv.zza, zzb2, cls);
        zze = zzmx.zza(zzju.zza, zzjy.class, cls2);
        zzf = zzmu.zza(zzjx.zza, zzb3, cls2);
        zzg = zzmx.zza(zzjw.zza, zzjq.class, cls2);
        zzh = zzmu.zza(zzjz.zza, zzb2, cls2);
        zzml zza2 = zzmi.zza().zza(zzvs.RAW, zzjl.zzd.zzc).zza(zzvs.TINK, zzjl.zzd.zza);
        zzvs zzvs = zzvs.LEGACY;
        zzjl.zzd zzd2 = zzjl.zzd.zzb;
        zzi = zza2.zza(zzvs, zzd2).zza(zzvs.CRUNCHY, zzd2).zza();
    }

    private static zzjl zza(zzvs zzvs, zztq zztq) throws GeneralSecurityException {
        zzjl.zza zza2 = zzjl.zzc().zza(zzi.zza(zzvs)).zza(zzk.zza(zztq.zzf().zzd())).zza(zzj.zza(zztq.zzf().zze())).zza(zzcu.zza(((zzvb) ((zzajc) zzvb.zza().zza(zztq.zzb().zzd().zzf()).zza(zzvs.RAW).zza(zztq.zzb().zzd().zze()).zzf())).zzj())).zza(zzxt.zza(zztq.zzf().zzf().zzg()));
        if (!zztq.zzf().zzd().equals(zzty.CURVE25519)) {
            zza2.zza(zzl.zza(zztq.zza()));
        } else if (!zztq.zza().equals(zztk.COMPRESSED)) {
            throw new GeneralSecurityException("For CURVE25519 EcPointFormat must be compressed");
        }
        return zza2.zza();
    }

    /* access modifiers changed from: private */
    public static zzjl zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                return zza(zzor.zza().zzd(), zztn.zza(zzor.zza().zze(), zzaio.zza()).zzc());
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
            }
        } else {
            String zzf2 = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parseParameters: " + zzf2);
        }
    }

    /* access modifiers changed from: private */
    public static zzjq zzc(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey")) {
            try {
                zztr zza2 = zztr.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    zztu zzd2 = zza2.zzd();
                    zzjl zza3 = zza(zzos.zzc(), zzd2.zzb());
                    if (zza3.zzd().equals(zzjl.zzc.zzd)) {
                        return zzjq.zza(zzjy.zza(zza3, zzxt.zza(zzd2.zzf().zzg()), zzos.zze()), zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcs)));
                    }
                    return zzjq.zza(zzjy.zza(zza3, new ECPoint(zzme.zza(zzd2.zzf().zzg()), zzme.zza(zzd2.zzg().zzg())), zzos.zze()), zzxs.zza(zzme.zza(zza2.zze().zzg()), zzcs.zza(zzcs)));
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPrivateKey failed");
            }
        } else {
            String zzf2 = zzos.zzf();
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePrivateKey: " + zzf2);
        }
    }

    /* access modifiers changed from: private */
    public static zzjy zzd(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
            try {
                zztu zza2 = zztu.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    zzjl zza3 = zza(zzos.zzc(), zza2.zzb());
                    if (!zza3.zzd().equals(zzjl.zzc.zzd)) {
                        return zzjy.zza(zza3, new ECPoint(zzme.zza(zza2.zzf().zzg()), zzme.zza(zza2.zzg().zzg())), zzos.zze());
                    }
                    if (zza2.zzg().zze()) {
                        return zzjy.zza(zza3, zzxt.zza(zza2.zzf().zzg()), zzos.zze());
                    }
                    throw new GeneralSecurityException("Y must be empty for X25519 points");
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing EcdsaPublicKey failed");
            }
        } else {
            String zzf2 = zzos.zzf();
            throw new IllegalArgumentException("Wrong type URL in call to EciesProtoSerialization.parsePublicKey: " + zzf2);
        }
    }

    private static zztq zzb(zzjl zzjl) throws GeneralSecurityException {
        zztv.zza zza2 = zztv.zza().zza(zzk.zza(zzjl.zzd())).zza(zzj.zza(zzjl.zze()));
        if (zzjl.zzh() != null && zzjl.zzh().zza() > 0) {
            zza2.zza(zzahp.zza(zzjl.zzh().zzb()));
        }
        zztv zztv = (zztv) ((zzajc) zza2.zzf());
        try {
            zzvb zza3 = zzvb.zza(zzcu.zza(zzjl.zzb()), zzaio.zza());
            zztm zztm = (zztm) ((zzajc) zztm.zza().zza((zzvb) ((zzajc) zzvb.zza().zza(zza3.zzf()).zza(zzvs.TINK).zza(zza3.zze()).zzf())).zzf());
            zzjl.zze zzf2 = zzjl.zzf();
            if (zzf2 == null) {
                zzf2 = zzjl.zze.zza;
            }
            return (zztq) ((zzajc) zztq.zzc().zza(zztv).zza(zztm).zza(zzl.zza(zzf2)).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e10);
        }
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
