package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzdl;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzdi extends zznb<zzse> {
    private static final zzno<zzdl> zza = zzdh.zza;

    zzdi() {
        super(zzse.class, new zzdk(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzse.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public final zzne<zzsf, zzse> zzc() {
        return new zzdj(this, zzsf.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzdi(), true);
        zzdp.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzhb.zze);
        zzdl.zza zzc = zzdl.zzf().zza(16).zzb(32).zzd(16).zzc(16);
        zzdl.zzb zzb = zzdl.zzb.zzc;
        zzdl.zza zza3 = zzc.zza(zzb);
        zzdl.zzc zzc2 = zzdl.zzc.zzc;
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zza3.zza(zzc2).zza());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzhb.zzf);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzdl.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzb).zza(zzc2).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzdl.class);
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzse zzse = (zzse) zzakn;
        zzxo.zza(zzse.zza(), 0);
        new zzdv();
        zzdv.zza(zzse.zzd());
        new zzqg();
        zzqg.zza(zzse.zze());
    }
}
