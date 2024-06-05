package io.flutter.plugins.webviewflutter;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;

/* compiled from: JavaScriptChannel */
public class h4 {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f34264a;

    /* renamed from: b  reason: collision with root package name */
    final String f34265b;

    /* renamed from: c  reason: collision with root package name */
    private final i4 f34266c;

    public h4(i4 i4Var, String str, Handler handler) {
        this.f34266c = i4Var;
        this.f34265b = str;
        this.f34264a = handler;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void c(Void voidR) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d(String str) {
        this.f34266c.f(this, str, f4.f34244a);
    }

    @JavascriptInterface
    public void postMessage(String str) {
        g4 g4Var = new g4(this, str);
        if (this.f34264a.getLooper() == Looper.myLooper()) {
            g4Var.run();
        } else {
            this.f34264a.post(g4Var);
        }
    }
}
