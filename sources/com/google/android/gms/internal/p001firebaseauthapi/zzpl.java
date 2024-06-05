package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzpo;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzpl extends zznb<zzrw> {
    private static final zzod<zzph, zzpz> zza;
    private static final zzod<zzph, zzce> zzb;

    static {
        Class<zzph> cls = zzph.class;
        zza = zzod.zza(zzpk.zza, cls, zzpz.class);
        zzb = zzod.zza(zzpn.zza, cls, zzce.class);
    }

    zzpl() {
        super(zzrw.class, new zzpm(zzce.class));
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzrw.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_NOT_FIPS;
    }

    public final zzne<zzsa, zzrw> zzc() {
        return new zzpp(this, zzsa.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzpl(), true);
        zzpt.zza();
        zznr.zza().zza(zza);
        zznr.zza().zza(zzb);
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        zzpo zzpo = zzqx.zzc;
        hashMap.put("AES_CMAC", zzpo);
        hashMap.put("AES256_CMAC", zzpo);
        hashMap.put("AES256_CMAC_RAW", zzpo.zzd().zza(32).zzb(16).zza(zzpo.zzb.zzd).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
    }

    /* access modifiers changed from: private */
    public static void zzb(zzsb zzsb) throws GeneralSecurityException {
        if (zzsb.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzsb.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzb(int i10) throws GeneralSecurityException {
        if (i10 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zzrw zzrw = (zzrw) zzakn;
        zzxo.zza(zzrw.zza(), 0);
        zzb(zzrw.zze().zzb());
        zzb(zzrw.zzd());
    }
}
