package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.applovin.mediation.MaxReward;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzfmx {
    public static String zza(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return MaxReward.DEFAULT_LABEL;
        }
    }
}
