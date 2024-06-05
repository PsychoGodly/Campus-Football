package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzpd extends RuntimeException {
    public zzpd(String str) {
        super(str);
    }

    public static <T> T zza(zzpg<T> zzpg) {
        try {
            return zzpg.zza();
        } catch (Exception e10) {
            throw new zzpd((Throwable) e10);
        }
    }

    private zzpd(Throwable th) {
        super(th);
    }

    public zzpd(String str, Throwable th) {
        super(str, th);
    }
}
