package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.1.2 */
public final class zzgw {
    static final Charset zza = Charset.forName("US-ASCII");
    static final Charset zzb = Charset.forName("UTF-8");
    static final Charset zzc = Charset.forName("ISO-8859-1");
    public static final byte[] zzd;
    public static final ByteBuffer zze;
    public static final zzff zzf;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        zze = ByteBuffer.wrap(bArr);
        int i10 = zzff.zzd;
        zzf = zzff.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int zzb(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object zzc(Object obj, String str) {
        Objects.requireNonNull(obj, str);
        return obj;
    }

    public static String zzd(byte[] bArr) {
        return new String(bArr, zzb);
    }
}
