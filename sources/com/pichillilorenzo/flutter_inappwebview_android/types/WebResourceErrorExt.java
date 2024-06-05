package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebResourceError;
import com.applovin.mediation.MaxReward;
import j1.n;
import j1.s;
import java.util.HashMap;
import java.util.Map;

public class WebResourceErrorExt {
    private String description;
    private int type;

    public WebResourceErrorExt(int i10, String str) {
        this.type = i10;
        this.description = str;
    }

    public static WebResourceErrorExt fromWebResourceError(WebResourceError webResourceError) {
        return new WebResourceErrorExt(webResourceError.getErrorCode(), webResourceError.getDescription().toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceErrorExt webResourceErrorExt = (WebResourceErrorExt) obj;
        if (this.type != webResourceErrorExt.type) {
            return false;
        }
        return this.description.equals(webResourceErrorExt.description);
    }

    public String getDescription() {
        return this.description;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        return (this.type * 31) + this.description.hashCode();
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(getType()));
        hashMap.put("description", getDescription());
        return hashMap;
    }

    public String toString() {
        return "WebResourceErrorExt{type=" + this.type + ", description='" + this.description + '\'' + '}';
    }

    public static WebResourceErrorExt fromWebResourceError(n nVar) {
        return new WebResourceErrorExt(s.a("WEB_RESOURCE_ERROR_GET_CODE") ? nVar.b() : -1, s.a("WEB_RESOURCE_ERROR_GET_DESCRIPTION") ? nVar.a().toString() : MaxReward.DEFAULT_LABEL);
    }
}
