package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgc extends zznb<zzvk> {
    zzgc() {
        super(zzvk.class, new zzgf(zzbg.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzvk.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzvn, zzvk> zzc() {
        return new zzge(this, zzvn.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.REMOTE;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzxo.zza(((zzvk) zzakn).zza(), 0);
    }
}
