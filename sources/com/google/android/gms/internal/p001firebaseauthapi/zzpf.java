package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzpf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzpf {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static final zzxt zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzpd("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxt.zza(bArr);
    }

    public static final zzxt zza(String str) throws GeneralSecurityException {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new GeneralSecurityException("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzxt.zza(bArr);
    }

    public static Integer zzb() {
        String property = System.getProperty("java.vendor");
        if (!(property == "The Android Project" || (property != null && property.equals("The Android Project")))) {
            return null;
        }
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }

    public static boolean zza(byte[] bArr, byte[] bArr2) {
        if (bArr2.length < bArr.length) {
            return false;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr2[i10] != bArr[i10]) {
                return false;
            }
        }
        return true;
    }
}
