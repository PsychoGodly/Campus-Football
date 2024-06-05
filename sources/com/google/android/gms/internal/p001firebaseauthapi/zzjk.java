package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzjk extends zzne<zztn, zztr> {
    private final /* synthetic */ zzji zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzjk(zzji zzji, Class cls) {
        super(cls);
        this.zza = zzji;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        zztn zztn = (zztn) zzakn;
        ECParameterSpec zza2 = zzwp.zza(zzkx.zza(zztn.zzc().zzf().zzd()));
        KeyPairGenerator zza3 = zzwt.zzd.zza("EC");
        zza3.initialize(zza2);
        KeyPair generateKeyPair = zza3.generateKeyPair();
        ECPoint w10 = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        return (zztr) ((zzajc) zztr.zzb().zza(0).zza((zztu) ((zzajc) zztu.zzc().zza(0).zza(zztn.zzc()).zza(zzahp.zza(w10.getAffineX().toByteArray())).zzb(zzahp.zza(w10.getAffineY().toByteArray())).zzf())).zza(zzahp.zza(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray())).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zzkx.zza(((zztn) zzakn).zzc());
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zztn.zza(zzahp, zzaio.zza());
    }
}
