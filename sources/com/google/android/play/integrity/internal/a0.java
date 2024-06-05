package com.google.android.play.integrity.internal;

import android.util.Base64;
import com.applovin.mediation.MaxReward;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
public final class a0 {
    public static String a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(bArr);
            return Base64.encodeToString(instance.digest(), 11);
        } catch (NoSuchAlgorithmException unused) {
            return MaxReward.DEFAULT_LABEL;
        }
    }
}
