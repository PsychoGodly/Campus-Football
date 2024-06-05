package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzes;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzeo extends zznb<zzsu> {
    private static final zzno<zzes> zza = zzer.zza;

    zzeo() {
        super(zzsu.class, new zzeq(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzsu.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public final zzne<zzsv, zzsu> zzc() {
        return new zzet(this, zzsv.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzeo(), true);
        zzex.zza();
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzhb.zza);
        zzes.zza zzc = zzes.zze().zza(12).zzb(16).zzc(16);
        zzes.zzb zzb = zzes.zzb.zzc;
        hashMap.put("AES128_GCM_RAW", zzc.zza(zzb).zza());
        hashMap.put("AES256_GCM", zzhb.zzb);
        hashMap.put("AES256_GCM_RAW", zzes.zze().zza(12).zzb(32).zzc(16).zza(zzb).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zza, zzes.class);
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzsu zzsu = (zzsu) zzakn;
        zzxo.zza(zzsu.zza(), 0);
        zzxo.zza(zzsu.zzd().zzb());
    }
}
