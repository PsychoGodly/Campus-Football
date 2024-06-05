package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzns  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzns {
    private static final zzns zza = new zzns();
    private final Map<String, zzch> zzb = new HashMap();

    zzns() {
    }

    public static zzns zza() {
        return zza;
    }

    private final synchronized void zza(String str, zzch zzch) throws GeneralSecurityException {
        if (!this.zzb.containsKey(str)) {
            this.zzb.put(str, zzch);
        } else if (!this.zzb.get(str).equals(zzch)) {
            String valueOf = String.valueOf(this.zzb.get(str));
            String valueOf2 = String.valueOf(zzch);
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + valueOf + "), cannot insert " + valueOf2);
        }
    }

    public final synchronized void zza(Map<String, zzch> map) throws GeneralSecurityException {
        for (Map.Entry next : map.entrySet()) {
            zza((String) next.getKey(), (zzch) next.getValue());
        }
    }
}
