package p002if;

import bf.u;
import bf.v;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kf.a;
import kf.b;
import kf.e;
import lf.c;

/* renamed from: if.g  reason: invalid package */
/* compiled from: Platform */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private static final g f33362a = k();

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f33363b = Logger.getLogger(u.class.getName());

    public static List<String> b(List<v> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            if (vVar != v.HTTP_1_0) {
                arrayList.add(vVar.toString());
            }
        }
        return arrayList;
    }

    static byte[] e(List<v> list) {
        c cVar = new c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            v vVar = list.get(i10);
            if (vVar != v.HTTP_1_0) {
                cVar.G(vVar.toString().length());
                cVar.T(vVar.toString());
            }
        }
        return cVar.D();
    }

    private static g i() {
        g w10 = a.w();
        if (w10 != null) {
            return w10;
        }
        g w11 = b.w();
        Objects.requireNonNull(w11, "No platform found on Android");
        return w11;
    }

    private static g j() {
        c u10;
        if (r() && (u10 = c.u()) != null) {
            return u10;
        }
        d u11 = d.u();
        if (u11 != null) {
            return u11;
        }
        g u12 = e.u();
        if (u12 != null) {
            return u12;
        }
        return new g();
    }

    private static g k() {
        if (p()) {
            return i();
        }
        return j();
    }

    public static g l() {
        return f33362a;
    }

    public static boolean p() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean r() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public kf.c c(X509TrustManager x509TrustManager) {
        return new a(d(x509TrustManager));
    }

    public e d(X509TrustManager x509TrustManager) {
        return new b(x509TrustManager.getAcceptedIssuers());
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) throws IOException {
    }

    public void h(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public SSLContext m() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    public String n(SSLSocket sSLSocket) {
        return null;
    }

    public Object o(String str) {
        if (f33363b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public boolean q(String str) {
        return true;
    }

    public void s(int i10, String str, Throwable th) {
        f33363b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void t(String str, Object obj) {
        if (obj == null) {
            str = str + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        s(5, str, (Throwable) obj);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
