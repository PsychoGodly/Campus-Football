package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.webkit.WebView;
import java.util.HashMap;
import java.util.Map;

public class HitTestResult {
    private String extra;
    private int type;

    public HitTestResult(int i10, String str) {
        this.type = i10;
        this.extra = str;
    }

    public static HitTestResult fromWebViewHitTestResult(WebView.HitTestResult hitTestResult) {
        if (hitTestResult == null) {
            return null;
        }
        return new HitTestResult(hitTestResult.getType(), hitTestResult.getExtra());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HitTestResult hitTestResult = (HitTestResult) obj;
        if (this.type != hitTestResult.type) {
            return false;
        }
        String str = this.extra;
        String str2 = hitTestResult.extra;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public String getExtra() {
        return this.extra;
    }

    public int getType() {
        return this.type;
    }

    public int hashCode() {
        int i10 = this.type * 31;
        String str = this.extra;
        return i10 + (str != null ? str.hashCode() : 0);
    }

    public void setExtra(String str) {
        this.extra = str;
    }

    public void setType(int i10) {
        this.type = i10;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("type", Integer.valueOf(this.type));
        hashMap.put("extra", this.extra);
        return hashMap;
    }

    public String toString() {
        return "HitTestResultMap{type=" + this.type + ", extra='" + this.extra + '\'' + '}';
    }
}
