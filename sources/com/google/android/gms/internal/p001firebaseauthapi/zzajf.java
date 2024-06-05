package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzajf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@22.3.0 */
public final class zzajf {
    static final Charset zza = Charset.forName("UTF-8");
    public static final byte[] zzb;
    private static final Charset zzc = Charset.forName("US-ASCII");
    private static final Charset zzd = Charset.forName("ISO-8859-1");
    private static final ByteBuffer zze;
    private static final zzaia zzf;

    static {
        byte[] bArr = new byte[0];
        zzb = bArr;
        zze = ByteBuffer.wrap(bArr);
        zzf = zzaia.zza(bArr, 0, bArr.length, false);
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
        return zzaml.zza(bArr);
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

    static boolean zza(zzakn zzakn) {
        if (!(zzakn instanceof zzahh)) {
            return false;
        }
        zzahh zzahh = (zzahh) zzakn;
        return false;
    }
}
