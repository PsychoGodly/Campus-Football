package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzhm;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzho  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzho {
    private static final zzxt zza;
    private static final zznz<zzhm, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzhg, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzhp, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zznz.zza(zzhn.zza, zzhm.class, cls2);
        zzc = zznv.zza(zzhq.zza, zzb2, cls2);
        zzd = zzmx.zza(zzhp.zza, zzhg.class, cls);
        zze = zzmu.zza(zzhs.zza, zzb2, cls);
    }

    private static zzhm.zza zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzhr.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzhm.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzhm.zza.zzb;
        }
        if (i10 == 4) {
            return zzhm.zza.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzhg zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                zzvx zza2 = zzvx.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return zzhg.zza(zza(zzos.zzc()), zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcs)), zzos.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzor zza(zzhm zzhm) {
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzvy.zzc().zzi());
        zzhm.zza zzb2 = zzhm.zzb();
        if (zzhm.zza.zza.equals(zzb2)) {
            zzvs = zzvs.TINK;
        } else if (zzhm.zza.zzb.equals(zzb2)) {
            zzvs = zzvs.CRUNCHY;
        } else if (zzhm.zza.zzc.equals(zzb2)) {
            zzvs = zzvs.RAW;
        } else {
            String valueOf = String.valueOf(zzb2);
            throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvs).zzf()));
    }

    /* access modifiers changed from: private */
    public static zzhm zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            try {
                if (zzvy.zza(zzor.zza().zze(), zzaio.zza()).zza() == 0) {
                    return zzhm.zza(zza(zzor.zza().zzd()));
                }
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzf);
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
