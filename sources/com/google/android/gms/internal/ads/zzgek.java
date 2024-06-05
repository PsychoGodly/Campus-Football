package com.google.android.gms.internal.ads;

import android.os.Build;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.SecureRandom;

/* compiled from: com.google.android.gms:play-services-ads@@22.0.0 */
public final class zzgek {
    public static final Charset zza = Charset.forName("UTF-8");

    public static int zza() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        byte b10 = 0;
        while (b10 == 0) {
            secureRandom.nextBytes(bArr);
            b10 = ((bArr[0] & Ascii.DEL) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return b10;
    }

    public static final zzgoj zzb(String str) {
        byte[] bArr = new byte[str.length()];
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt < '!' || charAt > '~') {
                throw new zzgej("Not a printable ASCII character: " + charAt);
            }
            bArr[i10] = (byte) charAt;
        }
        return zzgoj.zzb(bArr);
    }

    public static Integer zzc() {
        return Integer.valueOf(Build.VERSION.SDK_INT);
    }
}
