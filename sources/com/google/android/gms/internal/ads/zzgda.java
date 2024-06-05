package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgda {
    public static final zzggm zza = new zzgcz((zzgcy) null);

    public static zzggs zza(zzfxb zzfxb) {
        zzfwg zzfwg;
        zzggo zzggo = new zzggo();
        zzggo.zzb(zzfxb.zzb());
        for (List it : zzfxb.zzd()) {
            Iterator it2 = it.iterator();
            while (true) {
                if (it2.hasNext()) {
                    zzfwx zzfwx = (zzfwx) it2.next();
                    int zzh = zzfwx.zzh() - 2;
                    if (zzh == 1) {
                        zzfwg = zzfwg.zza;
                    } else if (zzh == 2) {
                        zzfwg = zzfwg.zzb;
                    } else if (zzh == 3) {
                        zzfwg = zzfwg.zzc;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int zza2 = zzfwx.zza();
                    String zzf = zzfwx.zzf();
                    if (zzf.startsWith("type.googleapis.com/google.crypto.")) {
                        zzf = zzf.substring(34);
                    }
                    zzggo.zza(zzfwg, zza2, zzf, zzfwx.zzc().name());
                }
            }
        }
        if (zzfxb.zza() != null) {
            zzggo.zzc(zzfxb.zza().zza());
        }
        try {
            return zzggo.zzd();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }
}
