package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzel;
import com.google.android.gms.internal.p001firebaseauthapi.zzes;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzex  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzex {
    private static final zzxt zza;
    private static final zznz<zzes, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzel, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzey, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zznz.zza(zzew.zza, zzes.class, cls2);
        zzc = zznv.zza(zzez.zza, zzb2, cls2);
        zzd = zzmx.zza(zzey.zza, zzel.class, cls);
        zze = zzmu.zza(zzfb.zza, zzb2, cls);
    }

    private static zzes.zzb zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzfa.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzes.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzes.zzb.zzb;
        }
        if (i10 == 4) {
            return zzes.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzel zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsu zza2 = zzsu.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return new zzel.zza().zza(zzes.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing AesGcmKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzor zza(zzes zzes) {
        zzvs zzvs;
        if (zzes.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzes.zzd())}));
        } else if (zzes.zzb() == 12) {
            zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsv) ((zzajc) zzsv.zzc().zza(zzes.zzc()).zzf())).zzi());
            zzes.zzb zzf = zzes.zzf();
            if (zzes.zzb.zza.equals(zzf)) {
                zzvs = zzvs.TINK;
            } else if (zzes.zzb.zzb.equals(zzf)) {
                zzvs = zzvs.CRUNCHY;
            } else if (zzes.zzb.zzc.equals(zzf)) {
                zzvs = zzvs.RAW;
            } else {
                String valueOf = String.valueOf(zzf);
                throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
            }
            return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvs).zzf()));
        } else {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", new Object[]{Integer.valueOf(zzes.zzb())}));
        }
    }

    /* access modifiers changed from: private */
    public static zzes zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            try {
                zzsv zza2 = zzsv.zza(zzor.zza().zze(), zzaio.zza());
                if (zza2.zzb() == 0) {
                    return zzes.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzor.zza().zzd())).zza();
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzf);
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
