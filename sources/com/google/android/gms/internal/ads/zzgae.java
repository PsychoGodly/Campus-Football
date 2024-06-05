package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
final class zzgae extends zzgct {
    final /* synthetic */ zzgaf zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgae(zzgaf zzgaf, Class cls) {
        super(cls);
        this.zza = zzgaf;
    }

    public final /* bridge */ /* synthetic */ zzgrw zza(zzgrw zzgrw) throws GeneralSecurityException {
        zzgmn zzgmn = (zzgmn) zzgrw;
        zzgmj zzc = zzgmk.zzc();
        zzc.zzb(0);
        zzc.zza(zzgpe.zzv(zzgoe.zza(32)));
        return (zzgmk) zzc.zzal();
    }

    public final /* synthetic */ zzgrw zzb(zzgpe zzgpe) throws zzgqy {
        return zzgmn.zzd(zzgpe, zzgpy.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzgcs(zzgmn.zzc(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzgcs(zzgmn.zzc(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgrw zzgrw) throws GeneralSecurityException {
        zzgmn zzgmn = (zzgmn) zzgrw;
    }
}
