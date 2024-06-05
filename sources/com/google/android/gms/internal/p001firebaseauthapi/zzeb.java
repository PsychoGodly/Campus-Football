package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
final class zzeb extends zzne<zzsq, zzsn> {
    private final /* synthetic */ zzdz zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzeb(zzdz zzdz, Class cls) {
        super(cls);
        this.zza = zzdz;
    }

    public final /* synthetic */ zzakn zza(zzakn zzakn) throws GeneralSecurityException {
        zzsq zzsq = (zzsq) zzakn;
        return (zzsn) ((zzajc) zzsn.zzb().zza(zzahp.zza(zzou.zza(zzsq.zza()))).zza(zzsq.zzd()).zza(0).zzf());
    }

    public final /* synthetic */ void zzb(zzakn zzakn) throws GeneralSecurityException {
        zzsq zzsq = (zzsq) zzakn;
        zzxo.zza(zzsq.zza());
        if (zzsq.zzd().zza() != 12 && zzsq.zzd().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzsq.zza(zzahp, zzaio.zza());
    }
}
