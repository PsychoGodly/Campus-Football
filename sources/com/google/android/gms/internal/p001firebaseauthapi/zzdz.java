package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzdz extends zznb<zzsn> {
    zzdz() {
        super(zzsn.class, new zzec(zzbg.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzsn.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzsq, zzsn> zzc() {
        return new zzeb(this, zzsq.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzsn zzsn = (zzsn) zzakn;
        zzxo.zza(zzsn.zza(), 0);
        zzxo.zza(zzsn.zze().zzb());
        if (zzsn.zzd().zza() != 12 && zzsn.zzd().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
