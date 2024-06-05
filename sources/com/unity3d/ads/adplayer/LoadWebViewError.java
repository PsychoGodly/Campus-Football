package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import java.util.List;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m;

/* compiled from: AdPlayerError.kt */
public final class LoadWebViewError extends AdPlayerError {
    private final List<WebViewClientError> errors;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadWebViewError(List<WebViewClientError> list) {
        super("AdPlayer was not able to load the webview.", (h) null);
        m.e(list, "errors");
        this.errors = list;
    }

    public final List<WebViewClientError> getErrors() {
        return this.errors;
    }
}
