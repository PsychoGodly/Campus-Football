package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzou  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzou {
    private static final ThreadLocal<SecureRandom> zza = new zzot();

    static /* synthetic */ SecureRandom zza() {
        SecureRandom zzc = zzc();
        zzc.nextLong();
        return zzc;
    }

    private static Provider zzb() throws GeneralSecurityException {
        try {
            return (Provider) Class.forName("org.conscrypt.Conscrypt").getMethod("newProvider", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException e10) {
            throw new GeneralSecurityException("Failed to get Conscrypt provider", e10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001f, code lost:
        return java.security.SecureRandom.getInstance("SHA1PRNG", zzb());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        return new java.security.SecureRandom();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.security.SecureRandom zzc() {
        /*
            java.lang.String r0 = "SHA1PRNG"
            java.lang.String r1 = "GmsCore_OpenSSL"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0, r1)     // Catch:{ GeneralSecurityException -> 0x0009 }
            return r0
        L_0x0009:
            java.lang.String r1 = "AndroidOpenSSL"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0, r1)     // Catch:{ GeneralSecurityException -> 0x0010 }
            return r0
        L_0x0010:
            java.lang.String r1 = "Conscrypt"
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0, r1)     // Catch:{ GeneralSecurityException -> 0x0017 }
            return r0
        L_0x0017:
            java.security.Provider r1 = zzb()     // Catch:{ GeneralSecurityException -> 0x0020 }
            java.security.SecureRandom r0 = java.security.SecureRandom.getInstance(r0, r1)     // Catch:{ GeneralSecurityException -> 0x0020 }
            return r0
        L_0x0020:
            java.security.SecureRandom r0 = new java.security.SecureRandom
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzou.zzc():java.security.SecureRandom");
    }

    public static byte[] zza(int i10) {
        byte[] bArr = new byte[i10];
        zza.get().nextBytes(bArr);
        return bArr;
    }
}
