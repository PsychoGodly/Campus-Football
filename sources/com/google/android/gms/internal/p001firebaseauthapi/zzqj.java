package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzqj extends zzne<zzug, zzuc> {
    private final /* synthetic */ zzqg zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzqj(zzqg zzqg, Class cls) {
        super(cls);
        this.zza = zzqg;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        zzug zzug = (zzug) zzakn;
        return (zzuc) ((zzajc) zzuc.zzb().zza(zzqg.zza()).zza(zzug.zzf()).zza(zzahp.zza(zzou.zza(zzug.zza()))).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zzug zzug = (zzug) zzakn;
        if (zzug.zza() >= 16) {
            zzqg.zzb(zzug.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzug.zza(zzahp, zzaio.zza());
    }
}
