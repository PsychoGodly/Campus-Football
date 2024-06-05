package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.model.WebViewClientError;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m;
import sd.s;

/* compiled from: AndroidSendWebViewClientErrorDiagnostics.kt */
public final class AndroidSendWebViewClientErrorDiagnostics implements SendWebViewClientErrorDiagnostics {
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidSendWebViewClientErrorDiagnostics(SendDiagnosticEvent sendDiagnosticEvent2) {
        m.e(sendDiagnosticEvent2, "sendDiagnosticEvent");
        this.sendDiagnosticEvent = sendDiagnosticEvent2;
    }

    public void invoke(List<WebViewClientError> list) {
        m.e(list, "errors");
        for (WebViewClientError webViewClientError : list) {
            String url = webViewClientError.getUrl();
            Map e10 = !(url == null || url.length() == 0) ? j0.e(s.a("webview_url", webViewClientError.getUrl())) : null;
            Map l10 = k0.l(s.a("reason", Integer.valueOf(webViewClientError.getReason().getCode())));
            if (webViewClientError.getStatusCode() != null) {
                l10.put("webview_error_code", webViewClientError.getStatusCode());
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "webview_error", (Double) null, e10, l10, (AdObject) null, 18, (Object) null);
        }
    }
}
