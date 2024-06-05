package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzwp {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzmg.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    private static void zzb(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (!zzmg.zza(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    private static BigInteger zza(BigInteger bigInteger, boolean z10, EllipticCurve ellipticCurve) throws GeneralSecurityException {
        BigInteger bigInteger2;
        BigInteger zza = zzmg.zza(ellipticCurve);
        BigInteger mod = bigInteger.multiply(bigInteger).add(ellipticCurve.getA()).multiply(bigInteger).add(ellipticCurve.getB()).mod(zza);
        if (zza.signum() == 1) {
            BigInteger mod2 = mod.mod(zza);
            BigInteger bigInteger3 = null;
            BigInteger bigInteger4 = BigInteger.ZERO;
            if (!mod2.equals(bigInteger4)) {
                if (zza.testBit(0) && zza.testBit(1)) {
                    bigInteger3 = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
                } else if (zza.testBit(0) && !zza.testBit(1)) {
                    bigInteger2 = BigInteger.ONE;
                    BigInteger shiftRight = zza.subtract(bigInteger2).shiftRight(1);
                    int i10 = 0;
                    while (true) {
                        BigInteger mod3 = bigInteger2.multiply(bigInteger2).subtract(mod2).mod(zza);
                        if (mod3.equals(BigInteger.ZERO)) {
                            break;
                        }
                        BigInteger modPow = mod3.modPow(shiftRight, zza);
                        BigInteger bigInteger5 = BigInteger.ONE;
                        if (modPow.add(bigInteger5).equals(zza)) {
                            BigInteger shiftRight2 = zza.add(bigInteger5).shiftRight(1);
                            BigInteger bigInteger6 = bigInteger2;
                            for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                BigInteger multiply = bigInteger6.multiply(bigInteger5);
                                bigInteger6 = bigInteger6.multiply(bigInteger6).add(bigInteger5.multiply(bigInteger5).mod(zza).multiply(mod3)).mod(zza);
                                BigInteger mod4 = multiply.add(multiply).mod(zza);
                                if (shiftRight2.testBit(bitLength)) {
                                    BigInteger mod5 = bigInteger6.multiply(bigInteger2).add(mod4.multiply(mod3)).mod(zza);
                                    bigInteger5 = bigInteger2.multiply(mod4).add(bigInteger6).mod(zza);
                                    bigInteger6 = mod5;
                                } else {
                                    bigInteger5 = mod4;
                                }
                            }
                            bigInteger3 = bigInteger6;
                        } else if (modPow.equals(bigInteger5)) {
                            bigInteger2 = bigInteger2.add(bigInteger5);
                            i10++;
                            if (i10 == 128 && !zza.isProbablePrime(80)) {
                                throw new InvalidAlgorithmParameterException("p is not prime");
                            }
                        } else {
                            throw new InvalidAlgorithmParameterException("p is not prime");
                        }
                    }
                    bigInteger4 = bigInteger2;
                }
                if (bigInteger2 != null && bigInteger2.multiply(bigInteger2).mod(zza).compareTo(mod2) != 0) {
                    throw new GeneralSecurityException("Could not find a modular square root");
                }
                bigInteger4 = bigInteger2;
            }
            return z10 != bigInteger4.testBit(0) ? zza.subtract(bigInteger4).mod(zza) : bigInteger4;
        }
        throw new InvalidAlgorithmParameterException("p must be positive");
    }

    public static ECPrivateKey zza(zzwo zzwo, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) zzwt.zze.zza("EC").generatePrivate(new ECPrivateKeySpec(zzme.zza(bArr), zza(zzwo)));
    }

    public static ECPublicKey zza(zzwo zzwo, zzwr zzwr, byte[] bArr) throws GeneralSecurityException {
        return zza(zza(zzwo), zzwr, bArr);
    }

    public static ECPublicKey zza(ECParameterSpec eCParameterSpec, zzwr zzwr, byte[] bArr) throws GeneralSecurityException {
        return (ECPublicKey) zzwt.zze.zza("EC").generatePublic(new ECPublicKeySpec(zza(eCParameterSpec.getCurve(), zzwr, bArr), eCParameterSpec));
    }

    public static ECParameterSpec zza(zzwo zzwo) throws NoSuchAlgorithmException {
        int ordinal = zzwo.ordinal();
        if (ordinal == 0) {
            return zzmg.zza;
        }
        if (ordinal == 1) {
            return zzmg.zzb;
        }
        if (ordinal == 2) {
            return zzmg.zzc;
        }
        String valueOf = String.valueOf(zzwo);
        throw new NoSuchAlgorithmException("curve not implemented:" + valueOf);
    }

    public static ECPoint zza(EllipticCurve ellipticCurve, zzwr zzwr, byte[] bArr) throws GeneralSecurityException {
        int zza = zza(ellipticCurve);
        int ordinal = zzwr.ordinal();
        boolean z10 = false;
        if (ordinal != 0) {
            if (ordinal == 1) {
                BigInteger zza2 = zzmg.zza(ellipticCurve);
                if (bArr.length == zza + 1) {
                    if (bArr[0] != 2) {
                        if (bArr[0] == 3) {
                            z10 = true;
                        } else {
                            throw new GeneralSecurityException("invalid format");
                        }
                    }
                    BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, bArr.length));
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(zza2) < 0) {
                        return new ECPoint(bigInteger, zza(bigInteger, z10, ellipticCurve));
                    }
                    throw new GeneralSecurityException("x is out of range");
                }
                throw new GeneralSecurityException("compressed point has wrong length");
            } else if (ordinal != 2) {
                String valueOf = String.valueOf(zzwr);
                throw new GeneralSecurityException("invalid format:" + valueOf);
            } else if (bArr.length == zza * 2) {
                ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, zza)), new BigInteger(1, Arrays.copyOfRange(bArr, zza, bArr.length)));
                zzmg.zza(eCPoint, ellipticCurve);
                return eCPoint;
            } else {
                throw new GeneralSecurityException("invalid point size");
            }
        } else if (bArr.length != (zza * 2) + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else if (bArr[0] == 4) {
            int i10 = zza + 1;
            ECPoint eCPoint2 = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i10)), new BigInteger(1, Arrays.copyOfRange(bArr, i10, bArr.length)));
            zzmg.zza(eCPoint2, ellipticCurve);
            return eCPoint2;
        } else {
            throw new GeneralSecurityException("invalid point format");
        }
    }

    public static void zza(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        zzmg.zza(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    public static byte[] zza(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        zzb(eCPublicKey, eCPrivateKey);
        return zza(eCPrivateKey, eCPublicKey.getW());
    }

    private static byte[] zza(ECPrivateKey eCPrivateKey, ECPoint eCPoint) throws GeneralSecurityException {
        zzmg.zza(eCPoint, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = zzwt.zze.zza("EC").generatePublic(new ECPublicKeySpec(eCPoint, eCPrivateKey.getParams()));
        KeyAgreement zza = zzwt.zzc.zza("ECDH");
        zza.init(eCPrivateKey);
        try {
            zza.doPhase(generatePublic, true);
            byte[] generateSecret = zza.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger = new BigInteger(1, generateSecret);
            if (bigInteger.signum() == -1 || bigInteger.compareTo(zzmg.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            zza(bigInteger, true, curve);
            return generateSecret;
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
