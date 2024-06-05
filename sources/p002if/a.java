package p002if;

import android.net.ssl.SSLSockets;
import bf.v;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* renamed from: if.a  reason: invalid package */
/* compiled from: Android10Platform */
class a extends b {
    a(Class<?> cls) {
        super(cls, (f<Socket>) null, (f<Socket>) null, (f<Socket>) null, (f<Socket>) null);
    }

    public static g w() {
        if (!g.p()) {
            return null;
        }
        try {
            if (b.x() >= 29) {
                return new a(Class.forName("com.android.org.conscrypt.SSLParametersImpl"));
            }
        } catch (ClassNotFoundException unused) {
        }
        return null;
    }

    private void z(SSLSocket sSLSocket) {
        if (SSLSockets.isSupportedSocket(sSLSocket)) {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
        }
    }

    public void g(SSLSocket sSLSocket, String str, List<v> list) throws IOException {
        try {
            z(sSLSocket);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) g.b(list).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e10) {
            throw new IOException("Android internal error", e10);
        }
    }

    public String n(SSLSocket sSLSocket) {
        String applicationProtocol = sSLSocket.getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.isEmpty()) {
            return null;
        }
        return applicationProtocol;
    }
}
