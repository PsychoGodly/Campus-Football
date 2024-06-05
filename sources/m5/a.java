package m5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o5.c;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class a {
    @Deprecated
    public static byte[] a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest b10;
        PackageInfo f10 = c.a(context).f(str, 64);
        Signature[] signatureArr = f10.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b10 = b("SHA1")) == null) {
            return null;
        }
        return b10.digest(f10.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        int i10 = 0;
        while (i10 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i10++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
