package com.unity3d.ads.adplayer.model;

import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: WebViewClientError.kt */
public final class WebViewClientError {
    private final ErrorReason reason;
    private final Integer statusCode;
    private final String url;

    public WebViewClientError(String str, ErrorReason errorReason, Integer num) {
        m.e(errorReason, "reason");
        this.url = str;
        this.reason = errorReason;
        this.statusCode = num;
    }

    public static /* synthetic */ WebViewClientError copy$default(WebViewClientError webViewClientError, String str, ErrorReason errorReason, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = webViewClientError.url;
        }
        if ((i10 & 2) != 0) {
            errorReason = webViewClientError.reason;
        }
        if ((i10 & 4) != 0) {
            num = webViewClientError.statusCode;
        }
        return webViewClientError.copy(str, errorReason, num);
    }

    public final String component1() {
        return this.url;
    }

    public final ErrorReason component2() {
        return this.reason;
    }

    public final Integer component3() {
        return this.statusCode;
    }

    public final WebViewClientError copy(String str, ErrorReason errorReason, Integer num) {
        m.e(errorReason, "reason");
        return new WebViewClientError(str, errorReason, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewClientError)) {
            return false;
        }
        WebViewClientError webViewClientError = (WebViewClientError) obj;
        return m.a(this.url, webViewClientError.url) && this.reason == webViewClientError.reason && m.a(this.statusCode, webViewClientError.statusCode);
    }

    public final ErrorReason getReason() {
        return this.reason;
    }

    public final Integer getStatusCode() {
        return this.statusCode;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int i10 = 0;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.reason.hashCode()) * 31;
        Integer num = this.statusCode;
        if (num != null) {
            i10 = num.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "WebViewClientError(url=" + this.url + ", reason=" + this.reason + ", statusCode=" + this.statusCode + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WebViewClientError(String str, ErrorReason errorReason, Integer num, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str, errorReason, (i10 & 4) != 0 ? null : num);
    }
}
