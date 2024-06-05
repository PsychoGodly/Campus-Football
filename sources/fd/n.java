package fd;

import gd.b;
import gd.f;
import gd.i;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import r6.o;

/* compiled from: OkHttpTlsUpgrader */
final class n {

    /* renamed from: a  reason: collision with root package name */
    static final List<i> f32754a = Collections.unmodifiableList(Arrays.asList(new i[]{i.HTTP_2}));

    static String a(String str) {
        return (!str.startsWith("[") || !str.endsWith("]")) ? str : str.substring(1, str.length() - 1);
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i10, b bVar) throws IOException {
        o.p(sSLSocketFactory, "sslSocketFactory");
        o.p(socket, "socket");
        o.p(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i10, true);
        bVar.c(sSLSocket, false);
        String h10 = k.e().h(sSLSocket, str, bVar.f() ? f32754a : null);
        List<i> list = f32754a;
        boolean contains = list.contains(i.a(h10));
        o.x(contains, "Only " + list + " are supported, but negotiated protocol is %s", h10);
        if (hostnameVerifier == null) {
            hostnameVerifier = f.f32891a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}
