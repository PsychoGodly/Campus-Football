package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwi {
    public static zzfwh zza(String str) throws GeneralSecurityException {
        zzfwh zzfwh = (zzfwh) zzfxf.zzl().get(str);
        if (zzfwh != null) {
            return zzfwh;
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
