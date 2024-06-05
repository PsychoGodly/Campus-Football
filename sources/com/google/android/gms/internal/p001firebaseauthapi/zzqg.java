package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzif;
import com.google.android.gms.internal.p001firebaseauthapi.zzql;
import com.google.android.gms.internal.p001firebaseauthapi.zzuy;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzqg extends zznb<zzuc> {
    private static final zzod<zzqc, zzpz> zza;
    private static final zzod<zzqc, zzce> zzb;
    private static final zzno<zzql> zzc = zzqh.zza;

    static {
        Class<zzqc> cls = zzqc.class;
        zza = zzod.zza(zzqf.zza, cls, zzpz.class);
        zzb = zzod.zza(zzqi.zza, cls, zzce.class);
    }

    public zzqg() {
        super(zzuc.class, new zzqk(zzce.class));
    }

    public static int zza() {
        return 0;
    }

    public final /* synthetic */ zzakn zza(zzahp zzahp) throws zzaji {
        return zzuc.zza(zzahp, zzaio.zza());
    }

    public final zzif.zza zzb() {
        return zzif.zza.ALGORITHM_REQUIRES_BORINGCRYPTO;
    }

    public final zzne<zzug, zzuc> zzc() {
        return new zzqj(this, zzug.class);
    }

    public final zzuy.zza zzd() {
        return zzuy.zza.SYMMETRIC;
    }

    public final String zze() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public static void zza(boolean z10) throws GeneralSecurityException {
        zzct.zza(new zzqg(), true);
        zzre.zza();
        zznr.zza().zza(zza);
        zznr.zza().zza(zzb);
        zzns zza2 = zzns.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzqx.zza);
        zzql.zza zzb2 = zzql.zzd().zza(32).zzb(16);
        zzql.zzb zzb3 = zzql.zzb.zzd;
        zzql.zza zza3 = zzb2.zza(zzb3);
        zzql.zzc zzc2 = zzql.zzc.zzc;
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zza3.zza(zzc2).zza());
        zzql.zza zzb4 = zzql.zzd().zza(32).zzb(32);
        zzql.zzb zzb5 = zzql.zzb.zza;
        hashMap.put("HMAC_SHA256_256BITTAG", zzb4.zza(zzb5).zza(zzc2).zza());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzql.zzd().zza(32).zzb(32).zza(zzb3).zza(zzc2).zza());
        zzql.zza zza4 = zzql.zzd().zza(64).zzb(16).zza(zzb5);
        zzql.zzc zzc3 = zzql.zzc.zze;
        hashMap.put("HMAC_SHA512_128BITTAG", zza4.zza(zzc3).zza());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzql.zzd().zza(64).zzb(16).zza(zzb3).zza(zzc3).zza());
        hashMap.put("HMAC_SHA512_256BITTAG", zzql.zzd().zza(64).zzb(32).zza(zzb5).zza(zzc3).zza());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzql.zzd().zza(64).zzb(32).zza(zzb3).zza(zzc3).zza());
        hashMap.put("HMAC_SHA512_512BITTAG", zzqx.zzb);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzql.zzd().zza(64).zzb(64).zza(zzb3).zza(zzc3).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznl.zza().zza(zzc, zzql.class);
    }

    /* access modifiers changed from: private */
    public static void zzb(zzuh zzuh) throws GeneralSecurityException {
        if (zzuh.zza() >= 10) {
            int i10 = zzqm.zza[zzuh.zzb().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            if (i10 != 5) {
                                throw new GeneralSecurityException("unknown hash type");
                            } else if (zzuh.zza() > 64) {
                                throw new GeneralSecurityException("tag size too big");
                            }
                        } else if (zzuh.zza() > 48) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                    } else if (zzuh.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (zzuh.zza() > 28) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (zzuh.zza() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public static void zza(zzuc zzuc) throws GeneralSecurityException {
        zzxo.zza(zzuc.zza(), 0);
        if (zzuc.zzf().zzb() >= 16) {
            zzb(zzuc.zze());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    public final /* bridge */ /* synthetic */ void zza(zzakn zzakn) throws GeneralSecurityException {
        zza((zzuc) zzakn);
    }
}
