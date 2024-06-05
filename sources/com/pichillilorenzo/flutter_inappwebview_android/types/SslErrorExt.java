package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import java.util.HashMap;
import java.util.Map;

public class SslErrorExt extends SslError {
    private SslErrorExt(int i10, SslCertificate sslCertificate, String str) {
        super(i10, sslCertificate, str);
    }

    public static Map<String, Object> toMap(SslError sslError) {
        Integer num = null;
        if (sslError == null) {
            return null;
        }
        int primaryError = sslError.getPrimaryError();
        String str = primaryError != 0 ? primaryError != 1 ? primaryError != 2 ? primaryError != 3 ? primaryError != 4 ? primaryError != 5 ? null : "A generic error occurred" : "The date of the certificate is invalid" : "The certificate authority is not trusted" : "Hostname mismatch" : "The certificate has expired" : "The certificate is not yet valid";
        HashMap hashMap = new HashMap();
        if (primaryError >= 0) {
            num = Integer.valueOf(primaryError);
        }
        hashMap.put("code", num);
        hashMap.put("message", str);
        return hashMap;
    }
}
