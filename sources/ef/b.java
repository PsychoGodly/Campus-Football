package ef;

import bf.j;
import cf.a;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocket;

/* compiled from: ConnectionSpecSelector */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final List<j> f32531a;

    /* renamed from: b  reason: collision with root package name */
    private int f32532b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f32533c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f32534d;

    public b(List<j> list) {
        this.f32531a = list;
    }

    private boolean c(SSLSocket sSLSocket) {
        for (int i10 = this.f32532b; i10 < this.f32531a.size(); i10++) {
            if (this.f32531a.get(i10).c(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    public j a(SSLSocket sSLSocket) throws IOException {
        j jVar;
        int i10 = this.f32532b;
        int size = this.f32531a.size();
        while (true) {
            if (i10 >= size) {
                jVar = null;
                break;
            }
            jVar = this.f32531a.get(i10);
            if (jVar.c(sSLSocket)) {
                this.f32532b = i10 + 1;
                break;
            }
            i10++;
        }
        if (jVar != null) {
            this.f32533c = c(sSLSocket);
            a.f31981a.c(jVar, sSLSocket, this.f32534d);
            return jVar;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.f32534d + ", modes=" + this.f32531a + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    public boolean b(IOException iOException) {
        this.f32534d = true;
        if (!this.f32533c || (iOException instanceof ProtocolException) || (iOException instanceof InterruptedIOException)) {
            return false;
        }
        boolean z10 = iOException instanceof SSLHandshakeException;
        if ((z10 && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        if (z10 || (iOException instanceof SSLProtocolException) || (iOException instanceof SSLException)) {
            return true;
        }
        return false;
    }
}
