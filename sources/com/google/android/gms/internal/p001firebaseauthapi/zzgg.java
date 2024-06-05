package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzgg extends zznb<zzvo> {
    zzgg() {
        super(zzvo.class, new zzgj(zzbg.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzvo.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzvr, zzvo> zzc() {
        return new zzgi(this, zzvr.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.REMOTE;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzvo zzvo = (zzvo) zzakn;
        zzxo.zza(zzvo.zza(), 0);
        if (!zzgh.zza(zzvo.zzd().zza().zzf())) {
            String zzf = zzvo.zzd().zza().zzf();
            throw new GeneralSecurityException("Unsupported DEK key type: " + zzf + ". Only Tink AEAD key types are supported.");
        }
    }
}
