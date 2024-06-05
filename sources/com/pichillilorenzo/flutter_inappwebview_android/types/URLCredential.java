package com.pichillilorenzo.flutter_inappwebview_android.types;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import java.util.HashMap;
import java.util.Map;

public class URLCredential {

    /* renamed from: id  reason: collision with root package name */
    private Long f28500id;
    private String password;
    private Long protectionSpaceId;
    private String username;

    public URLCredential(String str, String str2) {
        this.username = str;
        this.password = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        URLCredential uRLCredential = (URLCredential) obj;
        String str = this.username;
        if (str == null ? uRLCredential.username != null : !str.equals(uRLCredential.username)) {
            return false;
        }
        String str2 = this.password;
        String str3 = uRLCredential.password;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public Long getId() {
        return this.f28500id;
    }

    public String getPassword() {
        return this.password;
    }

    public Long getProtectionSpaceId() {
        return this.protectionSpaceId;
    }

    public String getUsername() {
        return this.username;
    }

    public int hashCode() {
        String str = this.username;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.password;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public void setId(Long l10) {
        this.f28500id = l10;
    }

    public void setPassword(String str) {
        this.password = str;
    }

    public void setProtectionSpaceId(Long l10) {
        this.protectionSpaceId = l10;
    }

    public void setUsername(String str) {
        this.username = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("username", this.username);
        hashMap.put(URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD, this.password);
        hashMap.put("certificates", (Object) null);
        hashMap.put("persistence", (Object) null);
        return hashMap;
    }

    public String toString() {
        return "URLCredential{username='" + this.username + '\'' + ", password='" + this.password + '\'' + '}';
    }

    public URLCredential(Long l10, String str, String str2, Long l11) {
        this.f28500id = l10;
        this.username = str;
        this.password = str2;
        this.protectionSpaceId = l11;
    }
}
