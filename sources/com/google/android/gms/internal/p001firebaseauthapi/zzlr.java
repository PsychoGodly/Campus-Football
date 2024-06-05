package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzlr extends zznb<zzuv> {
    public zzlr() {
        super(zzuv.class, new zzlq(zzbr.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzuv.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.ASYMMETRIC_PUBLIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzuv zzuv = (zzuv) zzakn;
        zzxo.zza(zzuv.zza(), 0);
        if (zzuv.zzg()) {
            zzlt.zza(zzuv.zzb());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
