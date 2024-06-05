package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzde;
import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import com.google.android.gms.internal.p001firebaseauthapi.zzsf;
import com.google.android.gms.internal.p001firebaseauthapi.zzug;
import com.google.android.gms.internal.p001firebaseauthapi.zzuh;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzdp {
    private static final zzxt zza;
    private static final zznz<zzdl, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzde, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzdq, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza = zzb2;
        zzb = zznz.zza(zzdo.zza, zzdl.class, cls2);
        zzc = zznv.zza(zzdr.zza, zzb2, cls2);
        zzd = zzmx.zza(zzdq.zza, zzde.class, cls);
        zze = zzmu.zza(zzdt.zza, zzb2, cls);
    }

    private static zzdl.zzb zza(zzub zzub) throws GeneralSecurityException {
        int i10 = zzds.zzb[zzub.ordinal()];
        if (i10 == 1) {
            return zzdl.zzb.zza;
        }
        if (i10 == 2) {
            return zzdl.zzb.zzb;
        }
        if (i10 == 3) {
            return zzdl.zzb.zzc;
        }
        if (i10 == 4) {
            return zzdl.zzb.zzd;
        }
        if (i10 == 5) {
            return zzdl.zzb.zze;
        }
        int zza2 = zzub.zza();
        throw new GeneralSecurityException("Unable to parse HashType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzde zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzse zza2 = zzse.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } else if (zza2.zzd().zza() != 0) {
                    throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                } else if (zza2.zze().zza() == 0) {
                    return new zzde.zza().zza(zzdl.zzf().zza(zza2.zzd().zzf().zzb()).zzb(zza2.zze().zzf().zzb()).zzc(zza2.zzd().zze().zza()).zzd(zza2.zze().zze().zza()).zza(zza(zza2.zze().zze().zzb())).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzf().zzg(), zzcs.zza(zzcs))).zzb(zzxu.zza(zza2.zze().zzf().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                } else {
                    throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                }
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
        }
    }

    private static zzdl.zzc zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzds.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzdl.zzc.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzdl.zzc.zzb;
        }
        if (i10 == 4) {
            return zzdl.zzc.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    public static /* synthetic */ zzor zza(zzdl zzdl) {
        zzub zzub;
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzsf.zza zza3 = zzsf.zza().zza((zzsj) ((zzajc) zzsj.zzb().zza((zzsm) ((zzajc) zzsm.zzb().zza(zzdl.zzd()).zzf())).zza(zzdl.zzb()).zzf()));
        zzug.zza zzc2 = zzug.zzc();
        zzuh.zza zza4 = zzuh.zzc().zza(zzdl.zze());
        zzdl.zzb zzg = zzdl.zzg();
        if (zzdl.zzb.zza.equals(zzg)) {
            zzub = zzub.SHA1;
        } else if (zzdl.zzb.zzb.equals(zzg)) {
            zzub = zzub.SHA224;
        } else if (zzdl.zzb.zzc.equals(zzg)) {
            zzub = zzub.SHA256;
        } else if (zzdl.zzb.zzd.equals(zzg)) {
            zzub = zzub.SHA384;
        } else if (zzdl.zzb.zze.equals(zzg)) {
            zzub = zzub.SHA512;
        } else {
            String valueOf = String.valueOf(zzg);
            throw new GeneralSecurityException("Unable to serialize HashType " + valueOf);
        }
        zzvb.zza zza5 = zza2.zza(((zzsf) ((zzajc) zza3.zza((zzug) ((zzajc) zzc2.zza((zzuh) ((zzajc) zza4.zza(zzub).zzf())).zza(zzdl.zzc()).zzf())).zzf())).zzi());
        zzdl.zzc zzh = zzdl.zzh();
        if (zzdl.zzc.zza.equals(zzh)) {
            zzvs = zzvs.TINK;
        } else if (zzdl.zzc.zzb.equals(zzh)) {
            zzvs = zzvs.CRUNCHY;
        } else if (zzdl.zzc.zzc.equals(zzh)) {
            zzvs = zzvs.RAW;
        } else {
            String valueOf2 = String.valueOf(zzh);
            throw new GeneralSecurityException("Unable to serialize variant: " + valueOf2);
        }
        return zzor.zzb((zzvb) ((zzajc) zza5.zza(zzvs).zzf()));
    }

    /* access modifiers changed from: private */
    public static zzdl zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
            try {
                zzsf zza2 = zzsf.zza(zzor.zza().zze(), zzaio.zza());
                if (zza2.zzd().zzb() == 0) {
                    return zzdl.zzf().zza(zza2.zzc().zza()).zzb(zza2.zzd().zza()).zzc(zza2.zzc().zze().zza()).zzd(zza2.zzd().zzf().zza()).zza(zza(zza2.zzd().zzf().zzb())).zza(zza(zzor.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesCtrHmacAeadParameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseParameters: " + zzf);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
