package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzgn {
    private static final zzxt zza;
    private static final zznz<zzgk, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzgl, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzgo, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zznz.zza(zzgm.zza, zzgk.class, cls2);
        zzc = zznv.zza(zzgp.zza, zzb2, cls2);
        zzd = zzmx.zza(zzgo.zza, zzgl.class, cls);
        zze = zzmu.zza(zzgr.zza, zzb2, cls);
    }

    /* access modifiers changed from: private */
    public static zzgl zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (!zzos.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        } else if (zzos.zzc() == zzvs.RAW) {
            try {
                zzvk zza2 = zzvk.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return zzgl.zza(zzgk.zza(zza2.zzd().zzd()));
                }
                String valueOf = String.valueOf(zza2);
                throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + valueOf);
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e10);
            }
        } else {
            String valueOf2 = String.valueOf(zzos.zzc());
            throw new GeneralSecurityException("KmsAeadKey are only accepted with RAW, got " + valueOf2);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zznu zza2 = zznu.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    /* access modifiers changed from: private */
    public static zzgk zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            try {
                zzvn zza2 = zzvn.zza(zzor.zza().zze(), zzaio.zza());
                if (zzor.zza().zzd() == zzvs.RAW) {
                    return zzgk.zza(zza2.zzd());
                }
                String valueOf = String.valueOf(zzor.zza().zzd());
                String valueOf2 = String.valueOf(zza2);
                throw new GeneralSecurityException("Only key templates with RAW are accepted, but got " + valueOf + " with format " + valueOf2);
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzf);
        }
    }
}
