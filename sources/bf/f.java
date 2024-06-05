package bf;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kf.c;

/* compiled from: CertificatePinner */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f31687c = new a().a();

    /* renamed from: a  reason: collision with root package name */
    private final Set<b> f31688a;

    /* renamed from: b  reason: collision with root package name */
    private final c f31689b;

    /* compiled from: CertificatePinner */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<b> f31690a = new ArrayList();

        public f a() {
            return new f(new LinkedHashSet(this.f31690a), (c) null);
        }
    }

    /* compiled from: CertificatePinner */
    static final class b {

        /* renamed from: a  reason: collision with root package name */
        final String f31691a;

        /* renamed from: b  reason: collision with root package name */
        final String f31692b;

        /* renamed from: c  reason: collision with root package name */
        final String f31693c;

        /* renamed from: d  reason: collision with root package name */
        final lf.f f31694d;

        /* access modifiers changed from: package-private */
        public boolean a(String str) {
            if (!this.f31691a.startsWith("*.")) {
                return str.equals(this.f31692b);
            }
            int indexOf = str.indexOf(46);
            if ((str.length() - indexOf) - 1 == this.f31692b.length()) {
                String str2 = this.f31692b;
                if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f31691a.equals(bVar.f31691a) && this.f31693c.equals(bVar.f31693c) && this.f31694d.equals(bVar.f31694d);
            }
        }

        public int hashCode() {
            return ((((527 + this.f31691a.hashCode()) * 31) + this.f31693c.hashCode()) * 31) + this.f31694d.hashCode();
        }

        public String toString() {
            return this.f31693c + this.f31694d.a();
        }
    }

    f(Set<b> set, c cVar) {
        this.f31688a = set;
        this.f31689b = cVar;
    }

    public static String c(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return "sha256/" + e((X509Certificate) certificate).a();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static lf.f d(X509Certificate x509Certificate) {
        return lf.f.k(x509Certificate.getPublicKey().getEncoded()).n();
    }

    static lf.f e(X509Certificate x509Certificate) {
        return lf.f.k(x509Certificate.getPublicKey().getEncoded()).o();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> b10 = b(str);
        if (!b10.isEmpty()) {
            c cVar = this.f31689b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i10);
                int size2 = b10.size();
                lf.f fVar = null;
                lf.f fVar2 = null;
                for (int i11 = 0; i11 < size2; i11++) {
                    b bVar = b10.get(i11);
                    if (bVar.f31693c.equals("sha256/")) {
                        if (fVar == null) {
                            fVar = e(x509Certificate);
                        }
                        if (bVar.f31694d.equals(fVar)) {
                            return;
                        }
                    } else if (bVar.f31693c.equals("sha1/")) {
                        if (fVar2 == null) {
                            fVar2 = d(x509Certificate);
                        }
                        if (bVar.f31694d.equals(fVar2)) {
                            return;
                        }
                    } else {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f31693c);
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i12 = 0; i12 < size3; i12++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i12);
                sb2.append("\n    ");
                sb2.append(c(x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = b10.size();
            for (int i13 = 0; i13 < size4; i13++) {
                sb2.append("\n    ");
                sb2.append(b10.get(i13));
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* access modifiers changed from: package-private */
    public List<b> b(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b next : this.f31688a) {
            if (next.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(next);
            }
        }
        return emptyList;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (!cf.c.q(this.f31689b, fVar.f31689b) || !this.f31688a.equals(fVar.f31688a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public f f(c cVar) {
        if (cf.c.q(this.f31689b, cVar)) {
            return this;
        }
        return new f(this.f31688a, cVar);
    }

    public int hashCode() {
        c cVar = this.f31689b;
        return ((cVar != null ? cVar.hashCode() : 0) * 31) + this.f31688a.hashCode();
    }
}
