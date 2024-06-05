package p002if;

import bf.v;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: if.c  reason: invalid package */
/* compiled from: ConscryptPlatform */
public class c extends g {
    private c() {
    }

    public static c u() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new c();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider v() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public void f(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) throws IOException {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) g.b(list).toArray(new String[0]));
            return;
        }
        super.g(sSLSocket, str, list);
    }

    public SSLContext m() {
        try {
            return SSLContext.getInstance("TLSv1.3", v());
        } catch (NoSuchAlgorithmException e10) {
            try {
                return SSLContext.getInstance("TLS", v());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e10);
            }
        }
    }

    public String n(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.n(sSLSocket);
    }
}
