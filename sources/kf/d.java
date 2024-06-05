package kf;

import cf.c;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: OkHostnameVerifier */
public final class d implements HostnameVerifier {

    /* renamed from: a  reason: collision with root package name */
    public static final d f36027a = new d();

    private d() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> b10 = b(x509Certificate, 7);
        List<String> b11 = b(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(b10.size() + b11.size());
        arrayList.addAll(b10);
        arrayList.addAll(b11);
        return arrayList;
    }

    private static List<String> b(X509Certificate x509Certificate, int i10) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i10 && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    private boolean e(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        for (String d10 : b(x509Certificate, 2)) {
            if (d(lowerCase, d10)) {
                return true;
            }
        }
        return false;
    }

    private boolean f(String str, X509Certificate x509Certificate) {
        List<String> b10 = b(x509Certificate, 7);
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (str.equalsIgnoreCase(b10.get(i10))) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str, X509Certificate x509Certificate) {
        if (c.J(str)) {
            return f(str, x509Certificate);
        }
        return e(str, x509Certificate);
    }

    public boolean d(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(".") && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(".") && !str2.endsWith("..")) {
            if (!str.endsWith(".")) {
                str = str + '.';
            }
            if (!str2.endsWith(".")) {
                str2 = str2 + '.';
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String substring = lowerCase.substring(1);
            if (!str.endsWith(substring)) {
                return false;
            }
            int length = str.length() - substring.length();
            if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return c(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }
}
