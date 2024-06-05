package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzfj;
import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzfg extends zznb<zzsy> {
    private static final zzno<zzfj> zza = zzff.zza;

    zzfg() {
        super(zzsy.class, new zzfi(zzbg.class));
    }

    public static int zza() {
        return 0;
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzsy.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzsz, zzsy> zzc() {
        return new zzfh(this, zzsz.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        if (zzi()) {
            zzct.zza(new zzfg(), true);
            zzfl.zza();
            zzns zza2 = zzns.zza();
            HashMap hashMap = new HashMap();
            zzfj.zza zza3 = zzfj.zzc().zza(16);
            zzfj.zzb zzb = zzfj.zzb.zza;
            hashMap.put("AES128_GCM_SIV", zza3.zza(zzb).zza());
            zzfj.zza zza4 = zzfj.zzc().zza(16);
            zzfj.zzb zzb2 = zzfj.zzb.zzc;
            hashMap.put("AES128_GCM_SIV_RAW", zza4.zza(zzb2).zza());
            hashMap.put("AES256_GCM_SIV", zzfj.zzc().zza(32).zza(zzb).zza());
            hashMap.put("AES256_GCM_SIV_RAW", zzfj.zzc().zza(32).zza(zzb2).zza());
            zza2.zza(Collections.unmodifiableMap(hashMap));
            zznl.zza().zza(zza, zzfj.class);
        }
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzsy zzsy = (zzsy) zzakn;
        zzxo.zza(zzsy.zza(), 0);
        zzxo.zza(zzsy.zzd().zzb());
    }
}
