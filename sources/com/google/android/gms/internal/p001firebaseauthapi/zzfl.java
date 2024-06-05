package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfc;
import com.google.android.gms.internal.p001firebaseauthapi.zzfj;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzfl {
    private static final zzxt zza;
    private static final zznz<zzfj, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfc, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzfq, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zza = zzb2;
        zzb = zznz.zza(zzfo.zza, zzfj.class, cls2);
        zzc = zznv.zza(zzfn.zza, zzb2, cls2);
        zzd = zzmx.zza(zzfq.zza, zzfc.class, cls);
        zze = zzmu.zza(zzfp.zza, zzb2, cls);
    }

    private static zzfj.zzb zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzfs.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzfj.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzfj.zzb.zzb;
        }
        if (i10 == 4) {
            return zzfj.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzfc zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzsy zza2 = zzsy.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return new zzfc.zza().zza(zzfj.zzc().zza(zza2.zzd().zzb()).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzor zza(zzfj zzfj) {
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey").zza(((zzsz) ((zzajc) zzsz.zzc().zza(zzfj.zzb()).zzf())).zzi());
        zzfj.zzb zzd2 = zzfj.zzd();
        if (zzfj.zzb.zza.equals(zzd2)) {
            zzvs = zzvs.TINK;
        } else if (zzfj.zzb.zzb.equals(zzd2)) {
            zzvs = zzvs.CRUNCHY;
        } else if (zzfj.zzb.zzc.equals(zzd2)) {
            zzvs = zzvs.RAW;
        } else {
            String valueOf = String.valueOf(zzd2);
            throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvs).zzf()));
    }

    /* access modifiers changed from: private */
    public static zzfj zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            try {
                zzsz zza2 = zzsz.zza(zzor.zza().zze(), zzaio.zza());
                if (zza2.zzb() == 0) {
                    return zzfj.zzc().zza(zza2.zza()).zza(zza(zzor.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesGcmSivParameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseParameters: " + zzf);
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
