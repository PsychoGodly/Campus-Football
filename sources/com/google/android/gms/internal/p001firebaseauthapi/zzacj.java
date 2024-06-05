package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final /* synthetic */ class zzacj {
    public static String zza(zzack zzack, String str) {
        try {
            String str2 = new String(MessageDigest.getInstance("SHA-256").digest(str.getBytes()));
            int length = str2.length();
            int i10 = 0;
            while (i10 < length) {
                if (zzk.zza(str2.charAt(i10))) {
                    char[] charArray = str2.toCharArray();
                    while (i10 < length) {
                        char c10 = charArray[i10];
                        if (zzk.zza(c10)) {
                            charArray[i10] = (char) (c10 ^ ' ');
                        }
                        i10++;
                    }
                    return String.valueOf(charArray);
                }
                i10++;
            }
            return str2;
        } catch (NoSuchAlgorithmException unused) {
            zzack.zza.c("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }

    public static void zzb(zzack zzack, String str) {
        zzack.zza(str, (Status) null);
    }
}
