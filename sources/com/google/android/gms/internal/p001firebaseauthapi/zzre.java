package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzql;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzre  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzre {
    private static final zzxt zza;
    private static final zzmi<zzvs, zzql.zzb> zzb = zzmi.zza().zza(zzvs.RAW, zzql.zzb.zzd).zza(zzvs.TINK, zzql.zzb.zza).zza(zzvs.LEGACY, zzql.zzb.zzc).zza(zzvs.CRUNCHY, zzql.zzb.zzb).zza();
    private static final zzmi<zzub, zzql.zzc> zzc = zzmi.zza().zza(zzub.SHA1, zzql.zzc.zza).zza(zzub.SHA224, zzql.zzc.zzb).zza(zzub.SHA256, zzql.zzc.zzc).zza(zzub.SHA384, zzql.zzc.zzd).zza(zzub.SHA512, zzql.zzc.zze).zza();
    private static final zznz<zzql, zzor> zzd;
    private static final zznv<zzor> zze;
    private static final zzmx<zzqc, zzos> zzf;
    private static final zzmu<zzos> zzg;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzrj, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zza = zzb2;
        zzd = zznz.zza(zzrh.zza, zzql.class, cls2);
        zze = zznv.zza(zzrg.zza, zzb2, cls2);
        zzf = zzmx.zza(zzrj.zza, zzqc.class, cls);
        zzg = zzmu.zza(zzri.zza, zzb2, cls);
    }

    /* access modifiers changed from: private */
    public static zzqc zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzuc zza2 = zzuc.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return zzqc.zzc().zza(zzql.zzd().zza(zza2.zzf().zzb()).zzb(zza2.zze().zza()).zza(zzc.zza(zza2.zze().zzb())).zza(zzb.zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zzf().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzd);
        zza2.zza(zze);
        zza2.zza(zzf);
        zza2.zza(zzg);
    }

    /* access modifiers changed from: private */
    public static zzql zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzug zza2 = zzug.zza(zzor.zza().zze(), zzaio.zza());
                if (zza2.zzb() == 0) {
                    return zzql.zzd().zza(zza2.zza()).zzb(zza2.zzf().zza()).zza(zzc.zza(zza2.zzf().zzb())).zza(zzb.zza(zzor.zza().zzd())).zza();
                }
                int zzb2 = zza2.zzb();
                throw new GeneralSecurityException("Parsing HmacParameters failed: unknown Version " + zzb2);
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing HmacParameters failed: ", e10);
            }
        } else {
            String zzf2 = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseParameters: " + zzf2);
        }
    }
}
