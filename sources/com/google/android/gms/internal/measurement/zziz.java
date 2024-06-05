package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.5.0 */
public final class zziz {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("US-ASCII");
    private static final Charset zzd = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zze;
    private static final zzib zzf;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzib.zza(bArr, 0, bArr.length, false);
    }

    public static int zza(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int zza(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        int zza2 = zza(length, bArr, 0, length);
        if (zza2 == 0) {
            return 1;
        }
        return zza2;
    }

    public static String zzb(byte[] bArr) {
        return new String(bArr, zza);
    }

    public static boolean zzc(byte[] bArr) {
        return zzmh.zza(bArr);
    }

    static int zza(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static <T> T zza(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    static <T> T zza(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    static boolean zza(zzkj zzkj) {
        if (!(zzkj instanceof zzhe)) {
            return false;
        }
        zzhe zzhe = (zzhe) zzkj;
        return false;
    }
}
