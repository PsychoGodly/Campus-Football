package com.pichillilorenzo.flutter_inappwebview_android.types;

import java.util.Map;

public class GeolocationPermissionShowPromptResponse {
    boolean allow;
    private String origin;
    boolean retain;

    public GeolocationPermissionShowPromptResponse(String str, boolean z10, boolean z11) {
        this.origin = str;
        this.allow = z10;
        this.retain = z11;
    }

    public static GeolocationPermissionShowPromptResponse fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new GeolocationPermissionShowPromptResponse((String) map.get("origin"), ((Boolean) map.get("allow")).booleanValue(), ((Boolean) map.get("retain")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeolocationPermissionShowPromptResponse geolocationPermissionShowPromptResponse = (GeolocationPermissionShowPromptResponse) obj;
        if (this.allow == geolocationPermissionShowPromptResponse.allow && this.retain == geolocationPermissionShowPromptResponse.retain) {
            return this.origin.equals(geolocationPermissionShowPromptResponse.origin);
        }
        return false;
    }

    public String getOrigin() {
        return this.origin;
    }

    public int hashCode() {
        return (((this.origin.hashCode() * 31) + (this.allow ? 1 : 0)) * 31) + (this.retain ? 1 : 0);
    }

    public boolean isAllow() {
        return this.allow;
    }

    public boolean isRetain() {
        return this.retain;
    }

    public void setAllow(boolean z10) {
        this.allow = z10;
    }

    public void setOrigin(String str) {
        this.origin = str;
    }

    public void setRetain(boolean z10) {
        this.retain = z10;
    }

    public String toString() {
        return "GeolocationPermissionShowPromptResponse{origin='" + this.origin + '\'' + ", allow=" + this.allow + ", retain=" + this.retain + '}';
    }
}
