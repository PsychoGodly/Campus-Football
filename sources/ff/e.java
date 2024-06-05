package ff;

import bf.k;
import bf.l;
import bf.q;
import bf.r;
import bf.z;
import com.google.android.gms.common.api.a;
import java.util.List;
import lf.f;

/* compiled from: HttpHeaders */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final f f32778a = f.h("\"\\");

    /* renamed from: b  reason: collision with root package name */
    private static final f f32779b = f.h("\t ,=");

    public static long a(q qVar) {
        return h(qVar.c("Content-Length"));
    }

    public static long b(z zVar) {
        return a(zVar.A());
    }

    public static boolean c(z zVar) {
        if (zVar.Z().f().equals("HEAD")) {
            return false;
        }
        int j10 = zVar.j();
        if (((j10 >= 100 && j10 < 200) || j10 == 204 || j10 == 304) && b(zVar) == -1 && !"chunked".equalsIgnoreCase(zVar.q("Transfer-Encoding"))) {
            return false;
        }
        return true;
    }

    public static int d(String str, int i10) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return a.e.API_PRIORITY_OTHER;
            }
            if (parseLong < 0) {
                return 0;
            }
            return (int) parseLong;
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static void e(l lVar, r rVar, q qVar) {
        if (lVar != l.f31800a) {
            List<k> f10 = k.f(rVar, qVar);
            if (!f10.isEmpty()) {
                lVar.a(rVar, f10);
            }
        }
    }

    public static int f(String str, int i10, String str2) {
        while (i10 < str.length() && str2.indexOf(str.charAt(i10)) == -1) {
            i10++;
        }
        return i10;
    }

    public static int g(String str, int i10) {
        while (i10 < str.length() && ((r0 = str.charAt(i10)) == ' ' || r0 == 9)) {
            i10++;
        }
        return i10;
    }

    private static long h(String str) {
        if (str == null) {
            return -1;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
