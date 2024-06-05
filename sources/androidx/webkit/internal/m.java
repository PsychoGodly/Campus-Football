package androidx.webkit.internal;

import android.webkit.ServiceWorkerClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import j1.g;

/* compiled from: FrameworkServiceWorkerClient */
public class m extends ServiceWorkerClient {

    /* renamed from: a  reason: collision with root package name */
    private final g f5042a;

    public m(g gVar) {
        this.f5042a = gVar;
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f5042a.shouldInterceptRequest(webResourceRequest);
    }
}
