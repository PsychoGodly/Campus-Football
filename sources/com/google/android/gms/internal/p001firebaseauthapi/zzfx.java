package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfv;
import com.google.android.gms.internal.p001firebaseauthapi.zzvb;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzfx {
    private static final zzxt zza;
    private static final zznz<zzfv, zzor> zzb;
    private static final zznv<zzor> zzc;
    private static final zzmx<zzfr, zzos> zzd;
    private static final zzmu<zzos> zze;

    /* JADX WARNING: type inference failed for: r1v2, types: [com.google.android.gms.internal.firebase-auth-api.zzgb, com.google.android.gms.internal.firebase-auth-api.zzmz] */
    static {
        Class<zzos> cls = zzos.class;
        Class<zzor> cls2 = zzor.class;
        zzxt zzb2 = zzpf.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zznz.zza(zzfz.zza, zzfv.class, cls2);
        zzc = zznv.zza(zzfy.zza, zzb2, cls2);
        zzd = zzmx.zza(zzgb.zza, zzfr.class, cls);
        zze = zzmu.zza(zzga.zza, zzb2, cls);
    }

    private static zzfv.zza zza(zzvs zzvs) throws GeneralSecurityException {
        int i10 = zzgd.zza[zzvs.ordinal()];
        if (i10 == 1) {
            return zzfv.zza.zza;
        }
        if (i10 == 2 || i10 == 3) {
            return zzfv.zza.zzb;
        }
        if (i10 == 4) {
            return zzfv.zza.zzc;
        }
        int zza2 = zzvs.zza();
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zza2);
    }

    /* access modifiers changed from: private */
    public static zzfr zzb(zzos zzos, zzcs zzcs) throws GeneralSecurityException {
        if (zzos.zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zztg zza2 = zztg.zza(zzos.zzd(), zzaio.zza());
                if (zza2.zza() == 0) {
                    return zzfr.zza(zza(zzos.zzc()), zzxu.zza(zza2.zzd().zzg(), zzcs.zza(zzcs)), zzos.zze());
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzaji unused) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
            }
        } else {
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
        }
    }

    public static /* synthetic */ zzor zza(zzfv zzfv) {
        zzvs zzvs;
        zzvb.zza zza2 = zzvb.zza().zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key").zza(zzth.zzb().zzi());
        zzfv.zza zzb2 = zzfv.zzb();
        if (zzfv.zza.zza.equals(zzb2)) {
            zzvs = zzvs.TINK;
        } else if (zzfv.zza.zzb.equals(zzb2)) {
            zzvs = zzvs.CRUNCHY;
        } else if (zzfv.zza.zzc.equals(zzb2)) {
            zzvs = zzvs.RAW;
        } else {
            String valueOf = String.valueOf(zzb2);
            throw new GeneralSecurityException("Unable to serialize variant: " + valueOf);
        }
        return zzor.zzb((zzvb) ((zzajc) zza2.zza(zzvs).zzf()));
    }

    /* access modifiers changed from: private */
    public static zzfv zzb(zzor zzor) throws GeneralSecurityException {
        if (zzor.zza().zzf().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
            try {
                zzth.zza(zzor.zza().zze(), zzaio.zza());
                return zzfv.zza(zza(zzor.zza().zzd()));
            } catch (zzaji e10) {
                throw new GeneralSecurityException("Parsing ChaCha20Poly1305Parameters failed: ", e10);
            }
        } else {
            String zzf = zzor.zza().zzf();
            throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseParameters: " + zzf);
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
