package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzln  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzln extends zzop<zzuu, zzuv> {
    public zzln() {
        super(zzuu.class, zzuv.class, new zzlm(zzbo.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzuu.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzuq, zzuu> zzc() {
        return new zzlp(this, zzuq.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PRIVATE;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzuu zzuu = (zzuu) zzakn;
        if (zzuu.zze().zze()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzuu.zzf()) {
            zzxo.zza(zzuu.zza(), 0);
            zzlt.zza(zzuu.zzd().zzb());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final /* synthetic */ zzakn zzb(zzakn zzakn) throws GeneralSecurityException {
        return ((zzuu) zzakn).zzd();
    }
}
