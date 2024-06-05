package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzjl;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzjy extends zzku {
    private final zzjl zza;
    private final ECPoint zzb;
    private final zzxt zzc;
    private final zzxt zzd;
    private final Integer zze;

    private zzjy(zzjl zzjl, ECPoint eCPoint, zzxt zzxt, zzxt zzxt2, Integer num) {
        this.zza = zzjl;
        this.zzb = eCPoint;
        this.zzc = zzxt;
        this.zzd = zzxt2;
        this.zze = num;
    }

    public final zzjl zza() {
        return this.zza;
    }

    public final zzxt zzb() {
        return this.zzc;
    }

    public final ECPoint zzc() {
        return this.zzb;
    }

    public static zzjy zza(zzjl zzjl, zzxt zzxt, Integer num) throws GeneralSecurityException {
        if (zzjl.zzd().equals(zzjl.zzc.zzd)) {
            zzb(zzjl.zzg(), num);
            if (zzxt.zza() == 32) {
                return new zzjy(zzjl, (ECPoint) null, zzxt, zza(zzjl.zzg(), num), num);
            }
            throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
        }
        throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
    }

    private static void zzb(zzjl.zzd zzd2, Integer num) throws GeneralSecurityException {
        zzjl.zzd zzd3 = zzjl.zzd.zzc;
        if (!zzd2.equals(zzd3) && num == null) {
            String valueOf = String.valueOf(zzd2);
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + valueOf + " variant.");
        } else if (zzd2.equals(zzd3) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }

    public static zzjy zza(zzjl zzjl, ECPoint eCPoint, Integer num) throws GeneralSecurityException {
        EllipticCurve ellipticCurve;
        if (!zzjl.zzd().equals(zzjl.zzc.zzd)) {
            zzb(zzjl.zzg(), num);
            zzjl.zzc zzd2 = zzjl.zzd();
            if (zzd2 == zzjl.zzc.zza) {
                ellipticCurve = zzmg.zza.getCurve();
            } else if (zzd2 == zzjl.zzc.zzb) {
                ellipticCurve = zzmg.zzb.getCurve();
            } else if (zzd2 == zzjl.zzc.zzc) {
                ellipticCurve = zzmg.zzc.getCurve();
            } else {
                String valueOf = String.valueOf(zzd2);
                throw new IllegalArgumentException("Unable to determine NIST curve type for " + valueOf);
            }
            zzmg.zza(eCPoint, ellipticCurve);
            return new zzjy(zzjl, eCPoint, (zzxt) null, zza(zzjl.zzg(), num), num);
        }
        throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
    }

    private static zzxt zza(zzjl.zzd zzd2, Integer num) {
        if (zzd2 == zzjl.zzd.zzc) {
            return zzxt.zza(new byte[0]);
        }
        if (num == null) {
            String valueOf = String.valueOf(zzd2);
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + valueOf);
        } else if (zzd2 == zzjl.zzd.zzb) {
            return zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
        } else {
            if (zzd2 == zzjl.zzd.zza) {
                return zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            }
            String valueOf2 = String.valueOf(zzd2);
            throw new IllegalStateException("Unknown EciesParameters.Variant: " + valueOf2);
        }
    }
}
