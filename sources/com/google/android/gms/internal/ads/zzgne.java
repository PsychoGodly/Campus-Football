package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
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

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgne {
    public static int zza(EllipticCurve ellipticCurve) throws GeneralSecurityException {
        return (zzgcj.zza(ellipticCurve).subtract(BigInteger.ONE).bitLength() + 7) / 8;
    }

    public static KeyPair zzb(ECParameterSpec eCParameterSpec) throws GeneralSecurityException {
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzgnn.zzf.zza("EC");
        keyPairGenerator.initialize(eCParameterSpec);
        return keyPairGenerator.generateKeyPair();
    }

    public static void zzc(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        zzd(eCPublicKey, eCPrivateKey);
        zzgcj.zzb(eCPublicKey.getW(), eCPrivateKey.getParams().getCurve());
    }

    static void zzd(ECPublicKey eCPublicKey, ECPrivateKey eCPrivateKey) throws GeneralSecurityException {
        try {
            if (!zzgcj.zzc(eCPublicKey.getParams(), eCPrivateKey.getParams())) {
                throw new GeneralSecurityException("invalid public key spec");
            }
        } catch (IllegalArgumentException | NullPointerException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static byte[] zze(ECPrivateKey eCPrivateKey, ECPublicKey eCPublicKey) throws GeneralSecurityException {
        BigInteger bigInteger;
        zzd(eCPublicKey, eCPrivateKey);
        ECPoint w10 = eCPublicKey.getW();
        zzgcj.zzb(w10, eCPrivateKey.getParams().getCurve());
        PublicKey generatePublic = ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w10, eCPrivateKey.getParams()));
        KeyAgreement keyAgreement = (KeyAgreement) zzgnn.zze.zza("ECDH");
        keyAgreement.init(eCPrivateKey);
        try {
            keyAgreement.doPhase(generatePublic, true);
            byte[] generateSecret = keyAgreement.generateSecret();
            EllipticCurve curve = eCPrivateKey.getParams().getCurve();
            BigInteger bigInteger2 = new BigInteger(1, generateSecret);
            if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzgcj.zza(curve)) >= 0) {
                throw new GeneralSecurityException("shared secret is out of range");
            }
            BigInteger zza = zzgcj.zza(curve);
            BigInteger mod = bigInteger2.multiply(bigInteger2).add(curve.getA()).multiply(bigInteger2).add(curve.getB()).mod(zza);
            if (zza.signum() == 1) {
                BigInteger mod2 = mod.mod(zza);
                BigInteger bigInteger3 = BigInteger.ZERO;
                if (!mod2.equals(bigInteger3)) {
                    if (!zza.testBit(0) || !zza.testBit(1)) {
                        if (zza.testBit(0) && !zza.testBit(1)) {
                            bigInteger3 = BigInteger.ONE;
                            BigInteger shiftRight = zza.subtract(bigInteger3).shiftRight(1);
                            int i10 = 0;
                            while (true) {
                                BigInteger mod3 = bigInteger3.multiply(bigInteger3).subtract(mod2).mod(zza);
                                if (mod3.equals(BigInteger.ZERO)) {
                                    break;
                                }
                                BigInteger modPow = mod3.modPow(shiftRight, zza);
                                BigInteger bigInteger4 = BigInteger.ONE;
                                if (modPow.add(bigInteger4).equals(zza)) {
                                    BigInteger shiftRight2 = zza.add(bigInteger4).shiftRight(1);
                                    BigInteger bigInteger5 = bigInteger3;
                                    for (int bitLength = shiftRight2.bitLength() - 2; bitLength >= 0; bitLength--) {
                                        BigInteger multiply = bigInteger5.multiply(bigInteger4);
                                        bigInteger5 = bigInteger5.multiply(bigInteger5).add(bigInteger4.multiply(bigInteger4).mod(zza).multiply(mod3)).mod(zza);
                                        bigInteger4 = multiply.add(multiply).mod(zza);
                                        if (shiftRight2.testBit(bitLength)) {
                                            BigInteger mod4 = bigInteger5.multiply(bigInteger3).add(bigInteger4.multiply(mod3)).mod(zza);
                                            bigInteger4 = bigInteger3.multiply(bigInteger4).add(bigInteger5).mod(zza);
                                            bigInteger5 = mod4;
                                        }
                                    }
                                    bigInteger = bigInteger5;
                                } else if (modPow.equals(bigInteger4)) {
                                    bigInteger3 = bigInteger3.add(bigInteger4);
                                    i10++;
                                    if (i10 == 128) {
                                        if (!zza.isProbablePrime(80)) {
                                            throw new InvalidAlgorithmParameterException("p is not prime");
                                        }
                                    }
                                } else {
                                    throw new InvalidAlgorithmParameterException("p is not prime");
                                }
                            }
                        } else {
                            bigInteger = null;
                        }
                    } else {
                        bigInteger = mod2.modPow(zza.add(BigInteger.ONE).shiftRight(2), zza);
                    }
                    if (bigInteger3 != null) {
                        if (bigInteger3.multiply(bigInteger3).mod(zza).compareTo(mod2) != 0) {
                            throw new GeneralSecurityException("Could not find a modular square root");
                        }
                    }
                }
                if (!bigInteger3.testBit(0)) {
                    zza.subtract(bigInteger3).mod(zza);
                }
                return generateSecret;
            }
            throw new InvalidAlgorithmParameterException("p must be positive");
        } catch (IllegalStateException e10) {
            throw new GeneralSecurityException(e10);
        }
    }

    public static ECPrivateKey zzf(int i10, byte[] bArr) throws GeneralSecurityException {
        return (ECPrivateKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), zzh(i10)));
    }

    public static ECPublicKey zzg(ECParameterSpec eCParameterSpec, int i10, byte[] bArr) throws GeneralSecurityException {
        EllipticCurve curve = eCParameterSpec.getCurve();
        int zza = zza(curve);
        int length = bArr.length;
        if (length != zza + zza + 1) {
            throw new GeneralSecurityException("invalid point size");
        } else if (bArr[0] == 4) {
            int i11 = zza + 1;
            ECPoint eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i11)), new BigInteger(1, Arrays.copyOfRange(bArr, i11, length)));
            zzgcj.zzb(eCPoint, curve);
            return (ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, eCParameterSpec));
        } else {
            throw new GeneralSecurityException("invalid point format");
        }
    }

    public static ECParameterSpec zzh(int i10) throws NoSuchAlgorithmException {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return zzgcj.zza;
        }
        if (i11 != 1) {
            return zzgcj.zzc;
        }
        return zzgcj.zzb;
    }

    public static byte[] zzi(int i10, int i11, ECPoint eCPoint) throws GeneralSecurityException {
        return zzj(zzh(i10).getCurve(), 1, eCPoint);
    }

    public static byte[] zzj(EllipticCurve ellipticCurve, int i10, ECPoint eCPoint) throws GeneralSecurityException {
        zzgcj.zzb(eCPoint, ellipticCurve);
        int zza = zza(ellipticCurve);
        int i11 = i10 - 1;
        if (i11 != 0) {
            byte b10 = 2;
            if (i11 != 2) {
                int i12 = zza + 1;
                byte[] bArr = new byte[i12];
                byte[] zza2 = zzgci.zza(eCPoint.getAffineX());
                int length = zza2.length;
                System.arraycopy(zza2, 0, bArr, i12 - length, length);
                if (true == eCPoint.getAffineY().testBit(0)) {
                    b10 = 3;
                }
                bArr[0] = b10;
                return bArr;
            }
            int i13 = zza + zza;
            byte[] bArr2 = new byte[i13];
            byte[] zza3 = zzgci.zza(eCPoint.getAffineX());
            int length2 = zza3.length;
            if (length2 > zza) {
                zza3 = Arrays.copyOfRange(zza3, length2 - zza, length2);
            }
            byte[] zza4 = zzgci.zza(eCPoint.getAffineY());
            int length3 = zza4.length;
            if (length3 > zza) {
                zza4 = Arrays.copyOfRange(zza4, length3 - zza, length3);
            }
            int length4 = zza4.length;
            System.arraycopy(zza4, 0, bArr2, i13 - length4, length4);
            int length5 = zza3.length;
            System.arraycopy(zza3, 0, bArr2, zza - length5, length5);
            return bArr2;
        }
        int i14 = zza + zza + 1;
        byte[] bArr3 = new byte[i14];
        byte[] zza5 = zzgci.zza(eCPoint.getAffineX());
        byte[] zza6 = zzgci.zza(eCPoint.getAffineY());
        int length6 = zza6.length;
        System.arraycopy(zza6, 0, bArr3, i14 - length6, length6);
        int length7 = zza5.length;
        System.arraycopy(zza5, 0, bArr3, (zza + 1) - length7, length7);
        bArr3[0] = 4;
        return bArr3;
    }
}
