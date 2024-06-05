package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzjm extends zzoh<zzbr, zztu> {
    zzjm(Class cls) {
        super(cls);
    }

    public final /* synthetic */ Object zza(zzakn zzakn) throws GeneralSecurityException {
        zztu zztu = (zztu) zzakn;
        zztq zzb = zztu.zzb();
        zztv zzf = zzb.zzf();
        zzwo zza = zzkx.zza(zzf.zzd());
        byte[] zzg = zztu.zzf().zzg();
        byte[] zzg2 = zztu.zzg().zzg();
        ECParameterSpec zza2 = zzwp.zza(zza);
        ECPoint eCPoint = new ECPoint(new BigInteger(1, zzg), new BigInteger(1, zzg2));
        zzmg.zza(eCPoint, zza2.getCurve());
        ECPublicKeySpec eCPublicKeySpec = new ECPublicKeySpec(eCPoint, zza2);
        return new zzwk((ECPublicKey) zzwt.zze.zza("EC").generatePublic(eCPublicKeySpec), zzf.zzf().zzg(), zzkx.zza(zzf.zze()), zzkx.zza(zzb.zza()), new zzkz(zzb.zzb().zzd()));
    }
}
