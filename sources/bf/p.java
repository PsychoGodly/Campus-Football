package bf;

import cf.c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: Handshake */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private final c0 f31811a;

    /* renamed from: b  reason: collision with root package name */
    private final g f31812b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Certificate> f31813c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Certificate> f31814d;

    private p(c0 c0Var, g gVar, List<Certificate> list, List<Certificate> list2) {
        this.f31811a = c0Var;
        this.f31812b = gVar;
        this.f31813c = list;
        this.f31814d = list2;
    }

    public static p b(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            g a10 = g.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                c0 a11 = c0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = c.u(certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = c.u(localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new p(a11, a10, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public g a() {
        return this.f31812b;
    }

    public List<Certificate> c() {
        return this.f31813c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f31811a.equals(pVar.f31811a) || !this.f31812b.equals(pVar.f31812b) || !this.f31813c.equals(pVar.f31813c) || !this.f31814d.equals(pVar.f31814d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((527 + this.f31811a.hashCode()) * 31) + this.f31812b.hashCode()) * 31) + this.f31813c.hashCode()) * 31) + this.f31814d.hashCode();
    }
}
