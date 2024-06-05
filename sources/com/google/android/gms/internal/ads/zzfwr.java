package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfwr {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzfwq zza(String str) throws GeneralSecurityException {
        Iterator it = zza.iterator();
        while (it.hasNext()) {
            zzfwq zzfwq = (zzfwq) it.next();
            if (zzfwq.zza()) {
                return zzfwq;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}
