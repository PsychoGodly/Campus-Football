package androidx.webkit.internal;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import j1.g;
import org.chromium.support_lib_boundary.ServiceWorkerClientBoundaryInterface;

/* compiled from: ServiceWorkerClientAdapter */
public class t implements ServiceWorkerClientBoundaryInterface {

    /* renamed from: a  reason: collision with root package name */
    private final g f5056a;

    public t(g gVar) {
        this.f5056a = gVar;
    }

    public String[] getSupportedFeatures() {
        return new String[]{"SERVICE_WORKER_SHOULD_INTERCEPT_REQUEST"};
    }

    public WebResourceResponse shouldInterceptRequest(WebResourceRequest webResourceRequest) {
        return this.f5056a.shouldInterceptRequest(webResourceRequest);
    }
}
