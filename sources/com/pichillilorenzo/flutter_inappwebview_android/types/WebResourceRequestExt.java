package com.pichillilorenzo.flutter_inappwebview_android.types;

import android.os.Build;
import android.webkit.WebResourceRequest;
import j1.o;
import j1.s;
import java.util.HashMap;
import java.util.Map;

public class WebResourceRequestExt {
    private boolean hasGesture;
    private Map<String, String> headers;
    private boolean isForMainFrame;
    private boolean isRedirect;
    private String method;
    private String url;

    public WebResourceRequestExt(String str, Map<String, String> map, boolean z10, boolean z11, boolean z12, String str2) {
        this.url = str;
        this.headers = map;
        this.isRedirect = z10;
        this.hasGesture = z11;
        this.isForMainFrame = z12;
        this.method = str2;
    }

    public static WebResourceRequestExt fromWebResourceRequest(WebResourceRequest webResourceRequest) {
        boolean z10;
        boolean isRedirect2;
        if (s.a("WEB_RESOURCE_REQUEST_IS_REDIRECT")) {
            isRedirect2 = o.b(webResourceRequest);
        } else if (Build.VERSION.SDK_INT >= 24) {
            isRedirect2 = webResourceRequest.isRedirect();
        } else {
            z10 = false;
            return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), z10, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
        }
        z10 = isRedirect2;
        return new WebResourceRequestExt(webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders(), z10, webResourceRequest.hasGesture(), webResourceRequest.isForMainFrame(), webResourceRequest.getMethod());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebResourceRequestExt webResourceRequestExt = (WebResourceRequestExt) obj;
        if (this.isRedirect != webResourceRequestExt.isRedirect || this.hasGesture != webResourceRequestExt.hasGesture || this.isForMainFrame != webResourceRequestExt.isForMainFrame || !this.url.equals(webResourceRequestExt.url)) {
            return false;
        }
        Map<String, String> map = this.headers;
        if (map == null ? webResourceRequestExt.headers != null : !map.equals(webResourceRequestExt.headers)) {
            return false;
        }
        String str = this.method;
        String str2 = webResourceRequestExt.method;
        if (str != null) {
            return str.equals(str2);
        }
        if (str2 == null) {
            return true;
        }
        return false;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public String getMethod() {
        return this.method;
    }

    public String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = this.url.hashCode() * 31;
        Map<String, String> map = this.headers;
        int i10 = 0;
        int hashCode2 = (((((((hashCode + (map != null ? map.hashCode() : 0)) * 31) + (this.isRedirect ? 1 : 0)) * 31) + (this.hasGesture ? 1 : 0)) * 31) + (this.isForMainFrame ? 1 : 0)) * 31;
        String str = this.method;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public boolean isForMainFrame() {
        return this.isForMainFrame;
    }

    public boolean isHasGesture() {
        return this.hasGesture;
    }

    public boolean isRedirect() {
        return this.isRedirect;
    }

    public void setForMainFrame(boolean z10) {
        this.isForMainFrame = z10;
    }

    public void setHasGesture(boolean z10) {
        this.hasGesture = z10;
    }

    public void setHeaders(Map<String, String> map) {
        this.headers = map;
    }

    public void setMethod(String str) {
        this.method = str;
    }

    public void setRedirect(boolean z10) {
        this.isRedirect = z10;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public Map<String, Object> toMap() {
        HashMap hashMap = new HashMap();
        hashMap.put("url", this.url);
        hashMap.put("headers", this.headers);
        hashMap.put("isRedirect", Boolean.valueOf(this.isRedirect));
        hashMap.put("hasGesture", Boolean.valueOf(this.hasGesture));
        hashMap.put("isForMainFrame", Boolean.valueOf(this.isForMainFrame));
        hashMap.put("method", this.method);
        return hashMap;
    }

    public String toString() {
        return "WebResourceRequestExt{url=" + this.url + ", headers=" + this.headers + ", isRedirect=" + this.isRedirect + ", hasGesture=" + this.hasGesture + ", isForMainFrame=" + this.isForMainFrame + ", method='" + this.method + '\'' + '}';
    }
}
