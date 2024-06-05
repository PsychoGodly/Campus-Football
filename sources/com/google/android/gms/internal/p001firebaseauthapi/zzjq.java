package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzjq extends zzkv {
    private final zzjy zza;
    private final zzxs zzb;
    private final zzxu zzc;

    private zzjq(zzjy zzjy, zzxs zzxs, zzxu zzxu) {
        this.zza = zzjy;
        this.zzb = zzxs;
        this.zzc = zzxu;
    }

    public static zzjq zza(zzjy zzjy, zzxu zzxu) throws GeneralSecurityException {
        if (zzjy == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else if (zzjy.zzb() == null) {
            throw new GeneralSecurityException("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        } else if (zzxu != null) {
            byte[] zza2 = zzxu.zza(zzbq.zza());
            byte[] zzb2 = zzjy.zzb().zzb();
            if (zza2.length != 32) {
                throw new GeneralSecurityException("Private key bytes length for X25519 curve must be 32");
            } else if (Arrays.equals(zzxr.zza(zza2), zzb2)) {
                return new zzjq(zzjy, (zzxs) null, zzxu);
            } else {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
    }

    public static zzjq zza(zzjy zzjy, zzxs zzxs) throws GeneralSecurityException {
        if (zzjy == null) {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without an ECIES public key");
        } else if (zzjy.zzc() == null) {
            throw new GeneralSecurityException("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        } else if (zzxs != null) {
            BigInteger zza2 = zzxs.zza(zzbq.zza());
            ECPoint zzc2 = zzjy.zzc();
            zzjl.zzc zzd = zzjy.zza().zzd();
            BigInteger order = zza(zzd).getOrder();
            if (zza2.signum() <= 0 || zza2.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private value");
            } else if (zzmg.zza(zza2, zza(zzd)).equals(zzc2)) {
                return new zzjq(zzjy, zzxs, (zzxu) null);
            } else {
                throw new GeneralSecurityException("Invalid private value");
            }
        } else {
            throw new GeneralSecurityException("ECIES private key cannot be constructed without secret");
        }
    }

    private static ECParameterSpec zza(zzjl.zzc zzc2) {
        if (zzc2 == zzjl.zzc.zza) {
            return zzmg.zza;
        }
        if (zzc2 == zzjl.zzc.zzb) {
            return zzmg.zzb;
        }
        if (zzc2 == zzjl.zzc.zzc) {
            return zzmg.zzc;
        }
        String valueOf = String.valueOf(zzc2);
        throw new IllegalArgumentException("Unable to determine NIST curve type for " + valueOf);
    }
}
