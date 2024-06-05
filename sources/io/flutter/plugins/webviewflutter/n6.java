package io.flutter.plugins.webviewflutter;

import android.webkit.WebView;
import io.flutter.embedding.engine.a;

/* compiled from: WebViewFlutterAndroidExternalApi */
public final /* synthetic */ class n6 {
    public static WebView a(a aVar, long j10) {
        s6 s6Var = (s6) aVar.q().a(s6.class);
        if (s6Var == null || s6Var.d() == null) {
            return null;
        }
        Object i10 = s6Var.d().i(j10);
        if (i10 instanceof WebView) {
            return (WebView) i10;
        }
        return null;
    }
}
