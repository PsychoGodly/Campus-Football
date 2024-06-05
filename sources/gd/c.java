package gd;

import java.io.UnsupportedEncodingException;
import lf.f;

/* compiled from: Credentials */
public final class c {
    public static String a(String str, String str2) {
        try {
            String a10 = f.k((str + ":" + str2).getBytes("ISO-8859-1")).a();
            return "Basic " + a10;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
