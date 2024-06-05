package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzgs;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgu {
    private static final zzxt zza;
    private static final zznz<zzgs, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzgq, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzmz, com.google.android.gms.internal.firebase-auth-api.zzgz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zznz.zza(zzgx.zza, zzgs.class, cls2);
        zzc = zznv.zza(zzgw.zza, zzb2, cls2);
        zzd = zzmx.zza(zzgz.zza, zzgq.class, cls);
        zze = zzmu.zza(zzgy.zza, zzb2, cls);
    }

    private static zzgs zza(zzvr zzvr) throws GeneralSecurityException {
        zzgs.zzb zzb2;
        zzch zza2 = zzcu.zza(((zzvb) ((zzajc) zzvb.zza().zza(zzvr.zza().zzf()).zza(zzvr.zza().zze()).zza(zzvs.RAW).zzf())).zzj());
        if (zza2 instanceof zzes) {
            zzb2 = zzgs.zzb.zza;
        } else if (zza2 instanceof zzfv) {
            zzb2 = zzgs.zzb.zzc;
        } else if (zza2 instanceof zzhm) {
            zzb2 = zzgs.zzb.zzb;
        } else if (zza2 instanceof zzdl) {
            zzb2 = zzgs.zzb.zzd;
        } else if (zza2 instanceof zzed) {
            zzb2 = zzgs.zzb.zze;
        } else if (zza2 instanceof zzfj) {
            zzb2 = zzgs.zzb.zzf;
        } else {
            String valueOf = String.valueOf(zza2);
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + valueOf);
        }
        return new zzgs.zza().zza(zzvr.zze()).zza((zzdb) zza2).zza(zzb2).zza();
    }

    /* access modifiers changed from: private */
    public static zzgq zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                zzvo zza2 = zzvo.zza(zzos.zzd(), zzaio.zza());
                if (zzos.zzc() != zzvs.RAW) {
                    String valueOf = String.valueOf(zza2);
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with OutputPrefixType RAW, got " + valueOf);
                } else if (zza2.zza() == 0) {
                    return zzgq.zza(zza(zza2.zzd()));
                } else {
                    String valueOf2 = String.valueOf(zza2);
                    throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + valueOf2);
                }
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e10);
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
    }

    /* access modifiers changed from: private */
    public static zzgs zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            try {
                return zza(zzvr.zza(zzor.zza().zze(), zzaio.zza()));
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzf);
        }
    }

    private static zzvr zzb(zzgs zzgs) throws GeneralSecurityException {
        try {
            return (zzvr) ((zzajc) zzvr.zzb().zza(zzgs.zzc()).zza(zzvb.zza(zzcu.zza((zzch) zzgs.zzb()), zzaio.zza())).zzf());
        } catch (zzaji e10) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e10);
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
