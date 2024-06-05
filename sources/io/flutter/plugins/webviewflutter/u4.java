package io.flutter.plugins.webviewflutter;

import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import io.flutter.plugins.webviewflutter.n;
import java.util.List;
import java.util.Objects;
import lc.c;

/* compiled from: WebChromeClientFlutterApiImpl */
public class u4 extends n.y {

    /* renamed from: b  reason: collision with root package name */
    private final c f34442b;

    /* renamed from: c  reason: collision with root package name */
    private final d4 f34443c;

    /* renamed from: d  reason: collision with root package name */
    private final o6 f34444d;

    /* compiled from: WebChromeClientFlutterApiImpl */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f34445a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.webkit.ConsoleMessage$MessageLevel[] r0 = android.webkit.ConsoleMessage.MessageLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34445a = r0
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.TIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34445a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.LOG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f34445a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.WARNING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f34445a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f34445a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.webkit.ConsoleMessage$MessageLevel r1 = android.webkit.ConsoleMessage.MessageLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.webviewflutter.u4.a.<clinit>():void");
        }
    }

    public u4(c cVar, d4 d4Var) {
        super(cVar);
        this.f34442b = cVar;
        this.f34443c = d4Var;
        this.f34444d = new o6(cVar, d4Var);
    }

    private long P(WebChromeClient webChromeClient) {
        Long h10 = this.f34443c.h(webChromeClient);
        if (h10 != null) {
            return h10.longValue();
        }
        throw new IllegalStateException("Could not find identifier for WebChromeClient.");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Q(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void R(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void S(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void T(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void U(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void V(Void voidR) {
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void W(Void voidR) {
    }

    private static n.b i0(ConsoleMessage.MessageLevel messageLevel) {
        int i10 = a.f34445a[messageLevel.ordinal()];
        if (i10 == 1) {
            return n.b.TIP;
        }
        if (i10 == 2) {
            return n.b.LOG;
        }
        if (i10 == 3) {
            return n.b.WARNING;
        }
        if (i10 == 4) {
            return n.b.ERROR;
        }
        if (i10 != 5) {
            return n.b.UNKNOWN;
        }
        return n.b.DEBUG;
    }

    public void X(WebChromeClient webChromeClient, ConsoleMessage consoleMessage, n.y.a<Void> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.x(h10, new n.a.C0389a().c(Long.valueOf((long) consoleMessage.lineNumber())).d(consoleMessage.message()).b(i0(consoleMessage.messageLevel())).e(consoleMessage.sourceId()).a(), aVar);
    }

    public void Y(WebChromeClient webChromeClient, n.y.a<Void> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.y(h10, aVar);
    }

    public void Z(WebChromeClient webChromeClient, String str, GeolocationPermissions.Callback callback, n.y.a<Void> aVar) {
        new y3(this.f34442b, this.f34443c).a(callback, p4.f34398a);
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        Long h11 = this.f34443c.h(callback);
        Objects.requireNonNull(h11);
        z(h10, h11, str, aVar);
    }

    public void a0(WebChromeClient webChromeClient, n.y.a<Void> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.A(h10, aVar);
    }

    public void b0(WebChromeClient webChromeClient, String str, String str2, n.y.a<Void> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.B(h10, str, str2, aVar);
    }

    public void c0(WebChromeClient webChromeClient, String str, String str2, n.y.a<Boolean> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.C(h10, str, str2, aVar);
    }

    public void d0(WebChromeClient webChromeClient, String str, String str2, String str3, n.y.a<String> aVar) {
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        super.D(h10, str, str2, str3, aVar);
    }

    public void e0(WebChromeClient webChromeClient, PermissionRequest permissionRequest, n.y.a<Void> aVar) {
        new k4(this.f34442b, this.f34443c).a(permissionRequest, permissionRequest.getResources(), q4.f34406a);
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        Long h11 = this.f34443c.h(permissionRequest);
        Objects.requireNonNull(h11);
        super.E(h10, h11, aVar);
    }

    public void f0(WebChromeClient webChromeClient, WebView webView, Long l10, n.y.a<Void> aVar) {
        this.f34444d.a(webView, t4.f34433a);
        Long h10 = this.f34443c.h(webView);
        Objects.requireNonNull(h10);
        super.F(Long.valueOf(P(webChromeClient)), h10, l10, aVar);
    }

    public void g0(WebChromeClient webChromeClient, View view, WebChromeClient.CustomViewCallback customViewCallback, n.y.a<Void> aVar) {
        new m4(this.f34442b, this.f34443c).a(view, r4.f34414a);
        new d(this.f34442b, this.f34443c).a(customViewCallback, n4.f34383a);
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        Long h11 = this.f34443c.h(view);
        Objects.requireNonNull(h11);
        Long h12 = this.f34443c.h(customViewCallback);
        Objects.requireNonNull(h12);
        G(h10, h11, h12, aVar);
    }

    public void h0(WebChromeClient webChromeClient, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, n.y.a<List<String>> aVar) {
        this.f34444d.a(webView, s4.f34422a);
        new j(this.f34442b, this.f34443c).e(fileChooserParams, o4.f34390a);
        Long h10 = this.f34443c.h(webChromeClient);
        Objects.requireNonNull(h10);
        Long h11 = this.f34443c.h(webView);
        Objects.requireNonNull(h11);
        Long h12 = this.f34443c.h(fileChooserParams);
        Objects.requireNonNull(h12);
        H(h10, h11, h12, aVar);
    }
}
