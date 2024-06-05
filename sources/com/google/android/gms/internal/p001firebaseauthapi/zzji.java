package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzji  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzji extends zzop<zztr, zztu> {
    zzji() {
        super(zztr.class, zztu.class, new zzjh(zzbo.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zztr.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zztn, zztr> zzc() {
        return new zzjk(this, zztn.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PRIVATE;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zztr zztr = (zztr) zzakn;
        if (!zztr.zze().zze()) {
            zzxo.zza(zztr.zza(), 0);
            zzkx.zza(zztr.zzd().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final /* synthetic */ zzakn zzb(zzakn zzakn) throws GeneralSecurityException {
        return ((zztr) zzakn).zzd();
    }
}
