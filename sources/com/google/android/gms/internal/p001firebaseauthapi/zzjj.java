package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzjj extends zznb<zztu> {
    public zzjj() {
        super(zztu.class, new zzjm(zzbr.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zztu.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PUBLIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zztu zztu = (zztu) zzakn;
        zzxo.zza(zztu.zza(), 0);
        zzkx.zza(zztu.zzb());
    }
}
