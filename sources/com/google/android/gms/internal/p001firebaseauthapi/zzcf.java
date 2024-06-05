package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzcf {
    private static final CopyOnWriteArrayList<zzcc> zza = new CopyOnWriteArrayList<>();

    public static zzcc zza(String str) throws GeneralSecurityException {
        Iterator<zzcc> it = zza.iterator();
        while (it.hasNext()) {
            zzcc next = it.next();
            if (next.zzb(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: " + str);
    }
}
