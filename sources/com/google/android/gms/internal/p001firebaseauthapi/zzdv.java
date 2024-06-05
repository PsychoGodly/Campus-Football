package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzdv extends zznb<zzsi> {
    zzdv() {
        super(zzsi.class, new zzdu(zzxi.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzsi.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzsj, zzsi> zzc() {
        return new zzdx(this, zzsj.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public static void zza(zzsi zzsi) throws GeneralSecurityException {
        zzxo.zza(zzsi.zza(), 0);
        zzxo.zza(zzsi.zzf().zzb());
        zza(zzsi.zze());
    }

    public final /* bridge */ /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zza((zzsi) zzakn);
    }

    /* access modifiers changed from: private */
    public static void zza(zzsm zzsm) throws GeneralSecurityException {
        if (zzsm.zza() < 12 || zzsm.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
