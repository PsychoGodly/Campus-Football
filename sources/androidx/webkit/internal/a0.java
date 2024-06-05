package androidx.webkit.internal;

import android.net.Uri;
import android.webkit.WebView;
import j1.l;
import j1.r;
import java.lang.reflect.InvocationHandler;
import mf.a;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* compiled from: WebMessageListenerAdapter */
public class a0 implements WebMessageListenerBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private r.b f4983a;

    public a0(r.b bVar) {
        this.f4983a = bVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        l c10 = y.c((WebMessageBoundaryInterface) a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (c10 != null) {
            this.f4983a.onPostMessage(webView, c10, uri, z10, o.c(invocationHandler2));
        }
    }
}
