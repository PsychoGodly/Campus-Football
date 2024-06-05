package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzka;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzkf extends zzkv {
    private final zzkn zza;
    private final zzxu zzb;

    private zzkf(zzkn zzkn, zzxu zzxu) {
        this.zza = zzkn;
        this.zzb = zzxu;
    }

    public static zzkf zza(zzkn zzkn, zzxu zzxu) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkn == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        } else if (zzxu != null) {
            zzka.zzd zze = zzkn.zza().zze();
            int zza2 = zzxu.zza();
            String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza2;
            zzka.zzd zzd = zzka.zzd.zza;
            boolean z10 = false;
            if (zze == zzd) {
                if (zza2 != 32) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{32}));
                }
            } else if (zze == zzka.zzd.zzb) {
                if (zza2 != 48) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{48}));
                }
            } else if (zze == zzka.zzd.zzc) {
                if (zza2 != 66) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{66}));
                }
            } else if (zze != zzka.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zze));
            } else if (zza2 != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
            zzka.zzd zze2 = zzkn.zza().zze();
            byte[] zzb2 = zzkn.zzb().zzb();
            byte[] zza3 = zzxu.zza(zzbq.zza());
            if (zze2 == zzd || zze2 == zzka.zzd.zzb || zze2 == zzka.zzd.zzc) {
                z10 = true;
            }
            if (z10) {
                if (zze2 == zzd) {
                    eCParameterSpec = zzmg.zza;
                } else if (zze2 == zzka.zzd.zzb) {
                    eCParameterSpec = zzmg.zzb;
                } else if (zze2 == zzka.zzd.zzc) {
                    eCParameterSpec = zzmg.zzc;
                } else {
                    throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zze2));
                }
                BigInteger order = eCParameterSpec.getOrder();
                BigInteger zza4 = zzme.zza(zza3);
                if (zza4.signum() <= 0 || zza4.compareTo(order) >= 0) {
                    throw new GeneralSecurityException("Invalid private key.");
                } else if (!zzmg.zza(zza4, eCParameterSpec).equals(zzwp.zza(eCParameterSpec.getCurve(), zzwr.UNCOMPRESSED, zzb2))) {
                    throw new GeneralSecurityException("Invalid private key for public key.");
                }
            } else if (zze2 != zzka.zzd.zzd) {
                throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zze2));
            } else if (!Arrays.equals(zzxr.zza(zza3), zzb2)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
            return new zzkf(zzkn, zzxu);
        } else {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
    }
}
