package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public abstract class zzaug {
    private static MessageDigest zzb;
    protected final Object zza = new Object();

    /* access modifiers changed from: protected */
    public final MessageDigest zza() {
        synchronized (this.zza) {
            MessageDigest messageDigest = zzb;
            if (messageDigest != null) {
                return messageDigest;
            }
            for (int i10 = 0; i10 < 2; i10++) {
                try {
                    zzb = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            MessageDigest messageDigest2 = zzb;
            return messageDigest2;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] zzb(String str);
}
