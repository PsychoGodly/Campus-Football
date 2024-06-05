package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzmd implements zzcc {
    private static final Object zza = new Object();
    private static final String zzb = "zzmd";
    private final String zzc;
    private KeyStore zzd;

    /* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmd$zza */
    /* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
    public static final class zza {
        KeyStore zza = null;
        private String zzb = null;

        public zza() {
            if (zzmd.zza()) {
                try {
                    KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                    this.zza = instance;
                    instance.load((KeyStore.LoadStoreParameter) null);
                } catch (IOException | GeneralSecurityException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                throw new IllegalStateException("need Android Keystore on Android M or newer");
            }
        }
    }

    public zzmd() throws GeneralSecurityException {
        this(new zza());
    }

    static boolean zzc(String str) throws GeneralSecurityException {
        zzmd zzmd = new zzmd();
        synchronized (zza) {
            if (zzmd.zzd(str)) {
                return false;
            }
            String zza2 = zzxo.zza("android-keystore://", str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return true;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:8|9|(11:10|11|12|(2:13|14)|15|17|18|19|20|21|22)) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        java.lang.Thread.sleep((long) ((int) (java.lang.Math.random() * 40.0d)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r0 = java.security.KeyStore.getInstance("AndroidKeyStore");
        r4.zzd = r0;
        r0.load((java.security.KeyStore.LoadStoreParameter) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        return r4.zzd.containsAlias(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        throw new java.security.GeneralSecurityException(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        android.util.Log.w(zzb, "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x000f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean zzd(java.lang.String r5) throws java.security.GeneralSecurityException {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "android-keystore://"
            java.lang.String r5 = com.google.android.gms.internal.p001firebaseauthapi.zzxo.zza((java.lang.String) r0, (java.lang.String) r5)     // Catch:{ all -> 0x003e }
            java.security.KeyStore r0 = r4.zzd     // Catch:{ NullPointerException -> 0x000f }
            boolean r5 = r0.containsAlias(r5)     // Catch:{ NullPointerException -> 0x000f }
            monitor-exit(r4)
            return r5
        L_0x000f:
            java.lang.String r0 = zzb     // Catch:{ all -> 0x003e }
            java.lang.String r1 = "Keystore is temporarily unavailable, wait, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x003e }
            double r0 = java.lang.Math.random()     // Catch:{ IOException -> 0x0037 }
            r2 = 4630826316843712512(0x4044000000000000, double:40.0)
            double r0 = r0 * r2
            int r0 = (int) r0
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x0023 }
        L_0x0023:
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x0037 }
            r4.zzd = r0     // Catch:{ IOException -> 0x0037 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x0037 }
            java.security.KeyStore r0 = r4.zzd     // Catch:{ all -> 0x003e }
            boolean r5 = r0.containsAlias(r5)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)
            return r5
        L_0x0037:
            r5 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x003e }
            r0.<init>(r5)     // Catch:{ all -> 0x003e }
            throw r0     // Catch:{ all -> 0x003e }
        L_0x003e:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzmd.zzd(java.lang.String):boolean");
    }

    public final synchronized zzbg zza(String str) throws GeneralSecurityException {
        zzmb zzmb;
        zzmb = new zzmb(zzxo.zza("android-keystore://", str), this.zzd);
        byte[] zza2 = zzou.zza(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(zza2, zzmb.zza(zzmb.zzb(zza2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return zzmb;
    }

    public final synchronized boolean zzb(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    private zzmd(zza zza2) {
        this.zzc = null;
        this.zzd = zza2.zza;
    }

    static /* synthetic */ boolean zza() {
        return Build.VERSION.SDK_INT >= 23;
    }
}
