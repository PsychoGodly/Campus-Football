package com.unity3d.ads.core.data.model;

import java.util.List;
import kotlin.jvm.internal.m;

/* compiled from: WebViewConfiguration.kt */
public final class WebViewConfiguration {
    private final List<String> additionalFiles;
    private final String entryPoint;
    private final int version;

    public WebViewConfiguration(int i10, String str, List<String> list) {
        m.e(str, "entryPoint");
        m.e(list, "additionalFiles");
        this.version = i10;
        this.entryPoint = str;
        this.additionalFiles = list;
    }

    public static /* synthetic */ WebViewConfiguration copy$default(WebViewConfiguration webViewConfiguration, int i10, String str, List<String> list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = webViewConfiguration.version;
        }
        if ((i11 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i11 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i10, str, list);
    }

    public final int component1() {
        return this.version;
    }

    public final String component2() {
        return this.entryPoint;
    }

    public final List<String> component3() {
        return this.additionalFiles;
    }

    public final WebViewConfiguration copy(int i10, String str, List<String> list) {
        m.e(str, "entryPoint");
        m.e(list, "additionalFiles");
        return new WebViewConfiguration(i10, str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewConfiguration)) {
            return false;
        }
        WebViewConfiguration webViewConfiguration = (WebViewConfiguration) obj;
        return this.version == webViewConfiguration.version && m.a(this.entryPoint, webViewConfiguration.entryPoint) && m.a(this.additionalFiles, webViewConfiguration.additionalFiles);
    }

    public final List<String> getAdditionalFiles() {
        return this.additionalFiles;
    }

    public final String getEntryPoint() {
        return this.entryPoint;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return (((this.version * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode();
    }

    public String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }
}
