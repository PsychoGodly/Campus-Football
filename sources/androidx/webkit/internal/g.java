package androidx.webkit.internal;

import android.os.Looper;
import android.webkit.TracingConfig;
import android.webkit.TracingController;
import android.webkit.WebView;
import j1.j;
import java.io.OutputStream;
import java.util.concurrent.Executor;

/* compiled from: ApiHelperForP */
public class g {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        return WebView.getWebViewClassLoader();
    }

    public static Looper c(WebView webView) {
        return webView.getWebViewLooper();
    }

    public static boolean d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    public static void f(TracingController tracingController, j jVar) {
        tracingController.start(new TracingConfig.Builder().addCategories(new int[]{jVar.b()}).addCategories(jVar.a()).setTracingMode(jVar.c()).build());
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
