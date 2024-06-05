package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.HashMap;
import java.util.Map;

public class URLAuthenticationChallenge {
    private URLProtectionSpace protectionSpace;

    public URLAuthenticationChallenge(URLProtectionSpace uRLProtectionSpace) {
        this.protectionSpace = uRLProtectionSpace;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.protectionSpace.equals(((URLAuthenticationChallenge) obj).protectionSpace);
    }

    public URLProtectionSpace getProtectionSpace() {
        return this.protectionSpace;
    }

    public int hashCode() {
        return this.protectionSpace.hashCode();
    }

    public void setProtectionSpace(URLProtectionSpace uRLProtectionSpace) {
        this.protectionSpace = uRLProtectionSpace;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("protectionSpace", this.protectionSpace.toMap());
        return hashMap;
    }

    public String toString() {
        return "URLAuthenticationChallenge{protectionSpace=" + this.protectionSpace + '}';
    }
}
