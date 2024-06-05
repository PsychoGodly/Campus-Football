package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzka;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzkn extends zzku {
    private final zzka zza;
    private final zzxt zzb;
    private final zzxt zzc;
    private final Integer zzd;

    private zzkn(zzka zzka, zzxt zzxt, zzxt zzxt2, Integer num) {
        this.zza = zzka;
        this.zzb = zzxt;
        this.zzc = zzxt2;
        this.zzd = num;
    }

    public final zzka zza() {
        return this.zza;
    }

    public final zzxt zzb() {
        return this.zzb;
    }

    public static zzkn zza(zzka zzka, zzxt zzxt, Integer num) throws GeneralSecurityException {
        zzxt zzxt2;
        EllipticCurve ellipticCurve;
        zzka.zzf zzf = zzka.zzf();
        zzka.zzf zzf2 = zzka.zzf.zzc;
        if (!zzf.equals(zzf2) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzf) + " variant.");
        } else if (!zzf.equals(zzf2) || num == null) {
            zzka.zzd zze = zzka.zze();
            int zza2 = zzxt.zza();
            String str = "Encoded public key byte length for " + String.valueOf(zze) + " must be %d, not " + zza2;
            zzka.zzd zzd2 = zzka.zzd.zza;
            if (zze == zzd2) {
                if (zza2 != 65) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{65}));
                }
            } else if (zze == zzka.zzd.zzb) {
                if (zza2 != 97) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{97}));
                }
            } else if (zze == zzka.zzd.zzc) {
                if (zza2 != 133) {
                    throw new GeneralSecurityException(String.format(str, new Object[]{133}));
                }
            } else if (zze != zzka.zzd.zzd) {
                throw new GeneralSecurityException("Unable to validate public key length for " + String.valueOf(zze));
            } else if (zza2 != 32) {
                throw new GeneralSecurityException(String.format(str, new Object[]{32}));
            }
            if (zze == zzd2 || zze == zzka.zzd.zzb || zze == zzka.zzd.zzc) {
                if (zze == zzd2) {
                    ellipticCurve = zzmg.zza.getCurve();
                } else if (zze == zzka.zzd.zzb) {
                    ellipticCurve = zzmg.zzb.getCurve();
                } else if (zze == zzka.zzd.zzc) {
                    ellipticCurve = zzmg.zzc.getCurve();
                } else {
                    throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zze));
                }
                zzmg.zza(zzwp.zza(ellipticCurve, zzwr.UNCOMPRESSED, zzxt.zzb()), ellipticCurve);
            }
            zzka.zzf zzf3 = zzka.zzf();
            if (zzf3 == zzf2) {
                zzxt2 = zzxt.zza(new byte[0]);
            } else if (num == null) {
                throw new IllegalStateException("idRequirement must be non-null for HpkeParameters.Variant " + String.valueOf(zzf3));
            } else if (zzf3 == zzka.zzf.zzb) {
                zzxt2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzf3 == zzka.zzf.zza) {
                zzxt2 = zzxt.zza(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown HpkeParameters.Variant: " + String.valueOf(zzf3));
            }
            return new zzkn(zzka, zzxt, zzxt2, num);
        } else {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }
}
