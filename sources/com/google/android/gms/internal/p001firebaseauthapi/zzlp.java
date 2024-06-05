package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzlp extends zzne<zzuq, zzuu> {
    private final /* synthetic */ zzln zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzlp(zzln zzln, Class cls) {
        super(cls);
        this.zza = zzln;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        zzuq zzuq = (zzuq) zzakn;
        zzuo zzc = zzuq.zzc().zzc();
        int i10 = zzlo.zza[zzc.ordinal()];
        if (i10 != 1) {
            int i11 = 3;
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                zzwo zzc2 = zzlt.zzc(zzuq.zzc().zzc());
                ECParameterSpec zza2 = zzwp.zza(zzc2);
                KeyPairGenerator zza3 = zzwt.zzd.zza("EC");
                zza3.initialize(zza2);
                KeyPair generateKeyPair = zza3.generateKeyPair();
                zzwr zzwr = zzwr.UNCOMPRESSED;
                ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
                EllipticCurve curve = zzwp.zza(zzc2).getCurve();
                zzmg.zza(w10, curve);
                int zza4 = zzwp.zza(curve);
                int ordinal = zzwr.ordinal();
                if (ordinal == 0) {
                    int i12 = (zza4 * 2) + 1;
                    byte[] bArr3 = new byte[i12];
                    byte[] zza5 = zzme.zza(w10.getAffineX());
                    byte[] zza6 = zzme.zza(w10.getAffineY());
                    System.arraycopy(zza6, 0, bArr3, i12 - zza6.length, zza6.length);
                    System.arraycopy(zza5, 0, bArr3, (zza4 + 1) - zza5.length, zza5.length);
                    bArr3[0] = 4;
                    bArr = bArr3;
                } else if (ordinal == 1) {
                    int i13 = zza4 + 1;
                    bArr = new byte[i13];
                    byte[] zza7 = zzme.zza(w10.getAffineX());
                    System.arraycopy(zza7, 0, bArr, i13 - zza7.length, zza7.length);
                    if (!w10.getAffineY().testBit(0)) {
                        i11 = 2;
                    }
                    bArr[0] = (byte) i11;
                } else if (ordinal == 2) {
                    int i14 = zza4 * 2;
                    bArr = new byte[i14];
                    byte[] zza8 = zzme.zza(w10.getAffineX());
                    if (zza8.length > zza4) {
                        zza8 = Arrays.copyOfRange(zza8, zza8.length - zza4, zza8.length);
                    }
                    byte[] zza9 = zzme.zza(w10.getAffineY());
                    if (zza9.length > zza4) {
                        zza9 = Arrays.copyOfRange(zza9, zza9.length - zza4, zza9.length);
                    }
                    System.arraycopy(zza9, 0, bArr, i14 - zza9.length, zza9.length);
                    System.arraycopy(zza8, 0, bArr, zza4 - zza8.length, zza8.length);
                } else {
                    String valueOf = String.valueOf(zzwr);
                    throw new GeneralSecurityException("invalid format:" + valueOf);
                }
                bArr2 = zzme.zza(((ECPrivateKey) generateKeyPair.getPrivate()).getS(), zzlt.zza(zzc));
            } else {
                throw new GeneralSecurityException("Invalid KEM");
            }
        } else {
            bArr2 = zzou.zza(32);
            bArr2[0] = (byte) (bArr2[0] | 7);
            bArr2[31] = (byte) (bArr2[31] & 63);
            bArr2[31] = (byte) (bArr2[31] | 128);
            bArr = zzxr.zza(bArr2);
        }
        return (zzuu) ((zzajc) zzuu.zzb().zza(0).zza((zzuv) ((zzajc) zzuv.zzc().zza(0).zza(zzuq.zzc()).zza(zzahp.zza(bArr)).zzf())).zza(zzahp.zza(bArr2)).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zzlt.zza(((zzuq) zzakn).zzc());
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzuq.zza(zzahp, zzaio.zza());
    }
}
