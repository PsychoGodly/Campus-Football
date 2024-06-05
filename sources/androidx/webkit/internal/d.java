package androidx.webkit.internal;

import android.content.Context;
import android.webkit.ServiceWorkerClient;
import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import j1.g;
import java.io.File;

/* compiled from: ApiHelperForN */
public class d {
    public static boolean a(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowContentAccess();
    }

    public static boolean b(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getAllowFileAccess();
    }

    public static boolean c(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getBlockNetworkLoads();
    }

    public static int d(ServiceWorkerWebSettings serviceWorkerWebSettings) {
        return serviceWorkerWebSettings.getCacheMode();
    }

    public static File e(Context context) {
        return context.getDataDir();
    }

    public static int f(WebSettings webSettings) {
        return webSettings.getDisabledActionModeMenuItems();
    }

    public static ServiceWorkerController g() {
        return ServiceWorkerController.getInstance();
    }

    public static ServiceWorkerWebSettings h(ServiceWorkerController serviceWorkerController) {
        return serviceWorkerController.getServiceWorkerWebSettings();
    }

    public static v i(ServiceWorkerController serviceWorkerController) {
        return new v(h(serviceWorkerController));
    }

    public static boolean j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isRedirect();
    }

    public static void k(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowContentAccess(z10);
    }

    public static void l(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setAllowFileAccess(z10);
    }

    public static void m(ServiceWorkerWebSettings serviceWorkerWebSettings, boolean z10) {
        serviceWorkerWebSettings.setBlockNetworkLoads(z10);
    }

    public static void n(ServiceWorkerWebSettings serviceWorkerWebSettings, int i10) {
        serviceWorkerWebSettings.setCacheMode(i10);
    }

    public static void o(WebSettings webSettings, int i10) {
        webSettings.setDisabledActionModeMenuItems(i10);
    }

    public static void p(ServiceWorkerController serviceWorkerController, ServiceWorkerClient serviceWorkerClient) {
        serviceWorkerController.setServiceWorkerClient(serviceWorkerClient);
    }

    public static void q(ServiceWorkerController serviceWorkerController, g gVar) {
        serviceWorkerController.setServiceWorkerClient(new m(gVar));
    }
}
