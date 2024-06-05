package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdw;
import com.google.android.gms.internal.p001firebaseauthapi.zzed;
import com.google.android.gms.internal.p001firebaseauthapi.zzsq;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzef  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzef {
    private static final zzxt zza;
    private static final zznz<zzed, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzdw, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzek, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza = zzb2;
        zzb = zznz.zza(zzei.zza, zzed.class, cls2);
        zzc = zznv.zza(zzeh.zza, zzb2, cls2);
        zzd = zzmx.zza(zzek.zza, zzdw.class, cls);
        zze = zzmu.zza(zzej.zza, zzb2, cls);
    }

    private static zzed.zzb zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzem.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzed.zzb.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzed.zzb.zzb;
        }
        if (i10 == 4) {
            return zzed.zzb.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzdw zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsn zza2 = zzsn.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return new zzdw.zza().zza(zzed.zze().zzb(zza2.zze().zzb()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzos.zzc())).zza()).zza(zzxu.zza(zza2.zze().zzg(), zzcs.zza(zzcs))).zza(zzos.zze()).zza();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing AesEaxcKey failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzor zza(zzed zzed) {
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzsq.zza zzb2 = zzsq.zzb();
        if (zzed.zzd() == 16) {
            zzvb.zza zza3 = zza2.zza(((zzsq) ((zzajc) zzb2.zza((zzsr) ((zzajc) zzsr.zzb().zza(zzed.zzb()).zzf())).zza(zzed.zzc()).zzf())).zzi());
            zzed.zzb zzf = zzed.zzf();
            if (zzed.zzb.zza.equals(zzf)) {
                zzvs = zzvs.TINK;
            } else if (zzed.zzb.zzb.equals(zzf)) {
                zzvs = zzvs.CRUNCHY;
            } else if (zzed.zzb.zzc.equals(zzf)) {
                zzvs = zzvs.RAW;
            } else {
                String valueOf = String.valueOf(zzf);
                throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
            }
            return zzor.zzb((zzvb) ((zzajc) zza3.zza(zzvs).zzf()));
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", new Object[]{Integer.valueOf(zzed.zzd())}));
    }

    /* access modifiers changed from: private */
    public static zzed zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
            try {
                zzsq zza2 = zzsq.zza(zzor.zza().zze(), zzaio.zza());
                return zzed.zze().zzb(zza2.zza()).zza(zza2.zzd().zza()).zzc(16).zza(zza(zzor.zza().zzd())).zza();
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing AesEaxParameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseParameters: " + zzf);
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
