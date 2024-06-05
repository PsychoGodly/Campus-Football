package ff;

import bf.r;
import bf.x;
import java.net.Proxy;

/* compiled from: RequestLine */
public final class i {
    public static String a(x xVar, Proxy.Type type) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(xVar.f());
        sb2.append(' ');
        if (b(xVar, type)) {
            sb2.append(xVar.h());
        } else {
            sb2.append(c(xVar.h()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    private static boolean b(x xVar, Proxy.Type type) {
        return !xVar.e() && type == Proxy.Type.HTTP;
    }

    public static String c(r rVar) {
        String g10 = rVar.g();
        String i10 = rVar.i();
        if (i10 == null) {
            return g10;
        }
        return g10 + '?' + i10;
    }
}
