package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzis  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzis extends zzne<zztd, zztc> {
    private final /* synthetic */ zzin zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzis(zzin zzin, Class cls) {
        super(cls);
        this.zza = zzin;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        return (zztc) ((zzajc) zztc.zzb().zza(zzahp.zza(zzou.zza(((zztd) zzakn).zza()))).zza(zzin.zza()).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zztd zztd = (zztd) zzakn;
        if (zztd.zza() != 64) {
            int zza2 = zztd.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zztd.zza(zzahp, zzaio.zza());
    }
}
