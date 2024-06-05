package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgbd extends zzgds {
    zzgbd(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgjp zzgjp = (zzgjp) zzgrw;
        zzgjj zzc = zzgjp.zzc();
        zzgjs zzf = zzc.zzf();
        int zzc2 = zzgbk.zzc(zzf.zzg());
        byte[] zzE = zzgjp.zzh().zzE();
        byte[] zzE2 = zzgjp.zzi().zzE();
        ECParameterSpec zzh = zzgne.zzh(zzc2);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzE), new BigInteger(1, zzE2));
        zzgcj.zzb(eCPoint, zzh.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, zzh);
        return new zzgna((ECPublicKey) ((KeyFactory) zzgnn.zzg.zza("EC")).generatePublic(eCPublicKeySpec), zzf.zze().zzE(), zzgbk.zzb(zzf.zzh()), zzgbk.zzd(zzc.zzi()), new zzgbl(zzc.zza().zze()));
    }
}
