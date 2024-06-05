package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgfg implements zzfxc {
    private static final zzgfg zza = new zzgfg();

    private zzgfg() {
    }

    static void zzd() throws GeneralSecurityException {
        zzfxf.zzp(zza);
    }

    public final Class zza() {
        return zzgfd.class;
    }

    public final Class zzb() {
        return zzgfd.class;
    }

    public final /* bridge */ /* synthetic */ Object zzc(zzfxb zzfxb) throws GeneralSecurityException {
        if (zzfxb.zza() != null) {
            for (List<zzfwx> it : zzfxb.zzd()) {
                for (zzfwx zzd : it) {
                    zzgfd zzgfd = (zzgfd) zzd.zzd();
                }
            }
            return new zzgff(zzfxb, (zzgfe) null);
        }
        throw new GeneralSecurityException("no primary in primitive set");
    }
}
