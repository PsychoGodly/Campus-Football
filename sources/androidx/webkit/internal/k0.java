package androidx.webkit.internal;

import android.webkit.WebView;
import mf.a;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebViewProviderFactoryAdapter */
public class k0 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    final WebViewProviderFactoryBoundaryInterface f5029a;

    public k0(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.f5029a = webViewProviderFactoryBoundaryInterface;
    }

    public String[] a() {
        return this.f5029a.getSupportedFeatures();
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) a.a(WebViewProviderBoundaryInterface.class, this.f5029a.createWebView(webView));
    }

    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) a.a(ProxyControllerBoundaryInterface.class, this.f5029a.getProxyController());
    }

    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) a.a(ServiceWorkerControllerBoundaryInterface.class, this.f5029a.getServiceWorkerController());
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) a.a(StaticsBoundaryInterface.class, this.f5029a.getStatics());
    }

    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) a.a(TracingControllerBoundaryInterface.class, this.f5029a.getTracingController());
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) a.a(WebkitToCompatConverterBoundaryInterface.class, this.f5029a.getWebkitToCompatConverter());
    }
}
