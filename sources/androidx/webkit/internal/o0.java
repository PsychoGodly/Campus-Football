package androidx.webkit.internal;

import android.webkit.CookieManager;
import android.webkit.SafeBrowsingResponse;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import java.lang.reflect.InvocationHandler;
import mf.a;
import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* compiled from: WebkitToCompatConverter */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f5051a;

    public o0(WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f5051a = webkitToCompatConverterBoundaryInterface;
    }

    public l a(CookieManager cookieManager) {
        return new l((WebViewCookieManagerBoundaryInterface) a.a(WebViewCookieManagerBoundaryInterface.class, this.f5051a.convertCookieManager(cookieManager)));
    }

    public SafeBrowsingResponse b(InvocationHandler invocationHandler) {
        return (SafeBrowsingResponse) this.f5051a.convertSafeBrowsingResponse(invocationHandler);
    }

    public InvocationHandler c(SafeBrowsingResponse safeBrowsingResponse) {
        return this.f5051a.convertSafeBrowsingResponse((Object) safeBrowsingResponse);
    }

    public ServiceWorkerWebSettings d(InvocationHandler invocationHandler) {
        return (ServiceWorkerWebSettings) this.f5051a.convertServiceWorkerSettings(invocationHandler);
    }

    public InvocationHandler e(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return this.f5051a.convertServiceWorkerSettings((Object) serviceWorkerWebSettings);
    }

    public f0 f(WebSettings webSettings) {
        return new f0((WebSettingsBoundaryInterface) a.a(WebSettingsBoundaryInterface.class, this.f5051a.convertSettings(webSettings)));
    }

    public WebMessagePort g(InvocationHandler invocationHandler) {
        return (WebMessagePort) this.f5051a.convertWebMessagePort(invocationHandler);
    }

    public InvocationHandler h(WebMessagePort webMessagePort) {
        return this.f5051a.convertWebMessagePort((Object) webMessagePort);
    }

    public WebResourceError i(InvocationHandler invocationHandler) {
        return (WebResourceError) this.f5051a.convertWebResourceError(invocationHandler);
    }

    public InvocationHandler j(WebResourceError webResourceError) {
        return this.f5051a.convertWebResourceError((Object) webResourceError);
    }

    public e0 k(WebResourceRequest webResourceRequest) {
        return new e0((WebResourceRequestBoundaryInterface) a.a(WebResourceRequestBoundaryInterface.class, this.f5051a.convertWebResourceRequest(webResourceRequest)));
    }
}
