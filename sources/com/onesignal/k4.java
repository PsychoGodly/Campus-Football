package com.onesignal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: TLS12SocketFactory */
public class k4 extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    SSLSocketFactory f28029a;

    public k4(SSLSocketFactory sSLSocketFactory) {
        this.f28029a = sSLSocketFactory;
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(new String[]{"TLSv1.2"});
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return a(this.f28029a.createSocket());
    }

    public String[] getDefaultCipherSuites() {
        return this.f28029a.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.f28029a.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i10, boolean z10) throws IOException {
        return a(this.f28029a.createSocket(socket, str, i10, z10));
    }

    public Socket createSocket(String str, int i10) throws IOException {
        return a(this.f28029a.createSocket(str, i10));
    }

    public Socket createSocket(String str, int i10, InetAddress inetAddress, int i11) throws IOException {
        return a(this.f28029a.createSocket(str, i10, inetAddress, i11));
    }

    public Socket createSocket(InetAddress inetAddress, int i10) throws IOException {
        return a(this.f28029a.createSocket(inetAddress, i10));
    }

    public Socket createSocket(InetAddress inetAddress, int i10, InetAddress inetAddress2, int i11) throws IOException {
        return a(this.f28029a.createSocket(inetAddress, i10, inetAddress2, i11));
    }
}
