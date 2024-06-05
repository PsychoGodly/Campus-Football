package com.startapp.sdk.omsdk;

import java.io.Serializable;

/* compiled from: Sta */
public class VerificationDetails implements Serializable {
    private static final long serialVersionUID = 1;
    private String javascriptResourceUrl;
    private String vendorKey;
    private String verificationParameters;

    public VerificationDetails() {
    }

    public String a() {
        return this.vendorKey;
    }

    public String b() {
        return this.verificationParameters;
    }

    public String c() {
        return this.javascriptResourceUrl;
    }

    public VerificationDetails(String str, String str2, String str3) {
        this.vendorKey = str;
        this.javascriptResourceUrl = str2;
        this.verificationParameters = str3;
    }
}
