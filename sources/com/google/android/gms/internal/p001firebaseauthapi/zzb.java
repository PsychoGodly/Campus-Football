package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public abstract class zzb {
    private static zzb zza = new zze();

    public static synchronized zzb zza() {
        zzb zzb;
        synchronized (zzb.class) {
            zzb = zza;
        }
        return zzb;
    }

    public abstract URLConnection zza(URL url, String str) throws IOException;
}
