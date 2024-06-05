package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzph;
import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzpt {
    private static final zzxt zza;
    private static final zznz<zzpo, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzph, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzpu, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zza = zzb2;
        zzb = zznz.zza(zzps.zza, zzpo.class, cls2);
        zzc = zznv.zza(zzpv.zza, zzb2, cls2);
        zzd = zzmx.zza(zzpu.zza, zzph.class, cls);
        zze = zzmu.zza(zzpx.zza, zzb2, cls);
    }

    public static /* synthetic */ zzor zza(zzpo zzpo) {
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesCmacKey").zza(((zzsa) ((zzajc) zzsa.zzb().zza((zzsb) ((zzajc) zzsb.zzb().zza(zzpo.zzb()).zzf())).zza(zzpo.zzc()).zzf())).zzi());
        zzpo.zzb zze2 = zzpo.zze();
        if (zzpo.zzb.zza.equals(zze2)) {
            zzvs = zzvs.TINK;
        } else if (zzpo.zzb.zzb.equals(zze2)) {
            zzvs = zzvs.CRUNCHY;
        } else if (zzpo.zzb.zzd.equals(zze2)) {
            zzvs = zzvs.RAW;
        } else if (zzpo.zzb.zzc.equals(zze2)) {
            zzvs = zzvs.LEGACY;
        } else {
            String valueOf = String.valueOf(zze2);
            throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvs).zzf()));
    }

    /* access modifiers changed from: private */
    public static zzph zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzrw zza2 = zzrw.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return new zzph.zza().zza(zzpo.zzd().zza(zza2.zze().zzb()).zzb(zza2.zzd().zza()).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing AesCmacKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
        }
    }

    /* access modifiers changed from: private */
    public static zzpo zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            try {
                zzsa zza2 = zzsa.zza(zzor.zza().zze(), zzaio.zza());
                return zzpo.zzd().zza(zza2.zza()).zzb(zza2.zzd().zza()).zza(zza(zzor.zza().zzd())).zza();
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesCmacParameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzpo.zzb zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzpw.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzpo.zzb.zza;
        }
        if (i10 == 2) {
            return zzpo.zzb.zzb;
        }
        if (i10 == 3) {
            return zzpo.zzb.zzc;
        }
        if (i10 == 4) {
            return zzpo.zzb.zzd;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
