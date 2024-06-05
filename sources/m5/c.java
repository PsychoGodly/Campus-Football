package m5;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class c {
    public static byte[] a(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 10);
    }

    public static byte[] b(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 11);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 0);
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 10);
    }

    public static String e(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
