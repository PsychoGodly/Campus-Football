package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import com.google.android.gms.internal.p001firebaseauthapi.zzvg;
import com.google.android.gms.internal.p001firebaseauthapi.zzvj;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzcx {
    private static final Charset zza = Charset.forName("UTF-8");

    public static zzvj zza(zzvg zzvg) {
        zzvj.zzb zza2 = zzvj.zza().zza(zzvg.zzb());
        for (zzvg.zzb next : zzvg.zze()) {
            zza2.zza((zzvj.zza) ((zzajc) zzvj.zza.zzb().zza(next.zzb().zzf()).zza(next.zzc()).zza(next.zzf()).zza(next.zza()).zzf()));
        }
        return (zzvj) ((zzajc) zza2.zzf());
    }

    public static void zzb(zzvg zzvg) throws GeneralSecurityException {
        int zzb = zzvg.zzb();
        int i10 = 0;
        boolean z10 = false;
        boolean z11 = true;
        for (zzvg.zzb next : zzvg.zze()) {
            if (next.zzc() == zzuz.ENABLED) {
                if (!next.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(next.zza())}));
                } else if (next.zzf() == zzvs.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(next.zza())}));
                } else if (next.zzc() != zzuz.UNKNOWN_STATUS) {
                    if (next.zza() == zzb) {
                        if (!z10) {
                            z10 = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (next.zzb().zzb() != zzuy.zza.ASYMMETRIC_PUBLIC) {
                        z11 = false;
                    }
                    i10++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(next.zza())}));
                }
            }
        }
        if (i10 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z10 && !z11) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
