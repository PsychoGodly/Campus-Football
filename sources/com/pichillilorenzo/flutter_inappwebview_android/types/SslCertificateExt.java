package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.net.http.SslCertificate;
import android.os.Build;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;

public class SslCertificateExt extends SslCertificate {
    private SslCertificateExt(X509Certificate x509Certificate) {
        super(x509Certificate);
    }

    public static Map<String, Object> toMap(SslCertificate sslCertificate) {
        HashMap hashMap;
        HashMap hashMap2;
        byte[] bArr = null;
        if (sslCertificate == null) {
            return null;
        }
        SslCertificate.DName issuedBy = sslCertificate.getIssuedBy();
        if (issuedBy != null) {
            hashMap = new HashMap();
            hashMap.put("CName", issuedBy.getCName());
            hashMap.put("DName", issuedBy.getDName());
            hashMap.put("OName", issuedBy.getOName());
            hashMap.put("UName", issuedBy.getUName());
        } else {
            hashMap = null;
        }
        SslCertificate.DName issuedTo = sslCertificate.getIssuedTo();
        if (issuedTo != null) {
            hashMap2 = new HashMap();
            hashMap2.put("CName", issuedTo.getCName());
            hashMap2.put("DName", issuedTo.getDName());
            hashMap2.put("OName", issuedTo.getOName());
            hashMap2.put("UName", issuedTo.getUName());
        } else {
            hashMap2 = null;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            try {
                X509Certificate x509Certificate = sslCertificate.getX509Certificate();
                if (x509Certificate != null) {
                    bArr = x509Certificate.getEncoded();
                }
            } catch (CertificateEncodingException e10) {
                e10.printStackTrace();
            }
        } else {
            try {
                bArr = Util.getX509CertFromSslCertHack(sslCertificate).getEncoded();
            } catch (CertificateEncodingException e11) {
                e11.printStackTrace();
            }
        }
        long time = sslCertificate.getValidNotAfterDate().getTime();
        long time2 = sslCertificate.getValidNotBeforeDate().getTime();
        HashMap hashMap3 = new HashMap();
        hashMap3.put("issuedBy", hashMap);
        hashMap3.put("issuedTo", hashMap2);
        hashMap3.put("validNotAfterDate", Long.valueOf(time));
        hashMap3.put("validNotBeforeDate", Long.valueOf(time2));
        hashMap3.put("x509Certificate", bArr);
        return hashMap3;
    }
}
