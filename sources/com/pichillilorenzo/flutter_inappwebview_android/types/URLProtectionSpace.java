package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.net.http.SslCertificate;
import android.net.http.SslError;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import java.util.HashMap;
import java.util.Map;

public class URLProtectionSpace {
    private String host;

    /* renamed from: id  reason: collision with root package name */
    private Long f28501id;
    private int port;
    private String protocol;
    private String realm;
    private SslCertificate sslCertificate;
    private SslError sslError;

    public URLProtectionSpace(String str, String str2, String str3, int i10, SslCertificate sslCertificate2, SslError sslError2) {
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i10;
        this.sslCertificate = sslCertificate2;
        this.sslError = sslError2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLProtectionSpace uRLProtectionSpace = (URLProtectionSpace) obj;
        if (this.port != uRLProtectionSpace.port || !this.host.equals(uRLProtectionSpace.host) || !this.protocol.equals(uRLProtectionSpace.protocol)) {
            return false;
        }
        String str = this.realm;
        if (str == null ? uRLProtectionSpace.realm != null : !str.equals(uRLProtectionSpace.realm)) {
            return false;
        }
        SslCertificate sslCertificate2 = this.sslCertificate;
        if (sslCertificate2 == null ? uRLProtectionSpace.sslCertificate != null : !sslCertificate2.equals(uRLProtectionSpace.sslCertificate)) {
            return false;
        }
        SslError sslError2 = this.sslError;
        SslError sslError3 = uRLProtectionSpace.sslError;
        if (sslError2 != null) {
            return sslError2.equals(sslError3);
        }
        if (sslError3 == null) {
            return true;
        }
        return false;
    }

    public String getHost() {
        return this.host;
    }

    public Long getId() {
        return this.f28501id;
    }

    public int getPort() {
        return this.port;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public String getRealm() {
        return this.realm;
    }

    public SslCertificate getSslCertificate() {
        return this.sslCertificate;
    }

    public SslError getSslError() {
        return this.sslError;
    }

    public int hashCode() {
        int hashCode = ((this.host.hashCode() * 31) + this.protocol.hashCode()) * 31;
        String str = this.realm;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.port) * 31;
        SslCertificate sslCertificate2 = this.sslCertificate;
        int hashCode3 = (hashCode2 + (sslCertificate2 != null ? sslCertificate2.hashCode() : 0)) * 31;
        SslError sslError2 = this.sslError;
        if (sslError2 != null) {
            i10 = sslError2.hashCode();
        }
        return hashCode3 + i10;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setId(Long l10) {
        this.f28501id = l10;
    }

    public void setPort(int i10) {
        this.port = i10;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setRealm(String str) {
        this.realm = str;
    }

    public void setSslCertificate(SslCertificate sslCertificate2) {
        this.sslCertificate = sslCertificate2;
    }

    public void setSslError(SslError sslError2) {
        this.sslError = sslError2;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, this.host);
        hashMap.put("protocol", this.protocol);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_REALM, this.realm);
        hashMap.put(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_PORT, Integer.valueOf(this.port));
        hashMap.put("sslCertificate", SslCertificateExt.toMap(this.sslCertificate));
        hashMap.put("sslError", SslErrorExt.toMap(this.sslError));
        hashMap.put("authenticationMethod", (Object) null);
        hashMap.put("distinguishedNames", (Object) null);
        hashMap.put("receivesCredentialSecurely", (Object) null);
        hashMap.put("isProxy", (Object) null);
        hashMap.put("proxyType", (Object) null);
        return hashMap;
    }

    public String toString() {
        return "URLProtectionSpace{host='" + this.host + '\'' + ", protocol='" + this.protocol + '\'' + ", realm='" + this.realm + '\'' + ", port=" + this.port + ", sslCertificate=" + this.sslCertificate + ", sslError=" + this.sslError + '}';
    }

    public URLProtectionSpace(Long l10, String str, String str2, String str3, int i10) {
        this.f28501id = l10;
        this.host = str;
        this.protocol = str2;
        this.realm = str3;
        this.port = i10;
    }
}
