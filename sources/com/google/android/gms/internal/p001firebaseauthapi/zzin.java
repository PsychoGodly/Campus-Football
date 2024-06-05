package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzir;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzin  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzin extends zznb<zztc> {
    private static final zzno<zzir> zza = zziq.zza;

    zzin() {
        super(zztc.class, new zzip(zzbp.class));
    }

    public static int zza() {
        return 0;
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zztc.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zztd, zztc> zzc() {
        return new zzis(this, zztd.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzin(), true);
        zziw.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", zzjg.zza);
        hashMap.put("AES256_SIV_RAW", zzir.zzc().zza(64).zza(zzir.zzb.zzc).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzir.class);
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zztc zztc = (zztc) zzakn;
        zzxo.zza(zztc.zza(), 0);
        if (zztc.zzd().zzb() != 64) {
            int zzb = zztc.zzd().zzb();
            throw new InvalidKeyException("invalid key size: " + zzb + ". Valid keys must have 64 bytes.");
        }
    }
}
