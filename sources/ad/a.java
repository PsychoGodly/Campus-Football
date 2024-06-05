package ad;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* compiled from: CustomSSLSocketFactory */
public class a extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f31545a;

    public a() throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        this.f31545a = instance.getSocketFactory();
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.1", "TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return a(this.f31545a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f31545a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f31545a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f31545a.createSocket(socket, str, i10, z10));
    }

    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f31545a.createSocket(str, i10));
    }

    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f31545a.createSocket(str, i10, inetAddress, i11));
    }

    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f31545a.createSocket(inetAddress, i10));
    }

    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f31545a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
