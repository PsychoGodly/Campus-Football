package io.flutter.plugins.webviewflutter;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import dc.a;
import io.flutter.plugin.platform.h;
import io.flutter.plugins.webviewflutter.d6;
import io.flutter.plugins.webviewflutter.h;
import io.flutter.plugins.webviewflutter.h5;
import io.flutter.plugins.webviewflutter.i5;
import io.flutter.plugins.webviewflutter.j4;
import io.flutter.plugins.webviewflutter.k;
import io.flutter.plugins.webviewflutter.v4;
import io.flutter.plugins.webviewflutter.w6;
import lc.c;

/* compiled from: WebViewFlutterPlugin */
public class s6 implements a, ec.a {

    /* renamed from: a  reason: collision with root package name */
    private d4 f34424a;

    /* renamed from: b  reason: collision with root package name */
    private a.b f34425b;

    /* renamed from: c  reason: collision with root package name */
    private w6 f34426c;

    /* renamed from: d  reason: collision with root package name */
    private j4 f34427d;

    /* access modifiers changed from: private */
    public static /* synthetic */ void e(Void voidR) {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g() {
        this.f34424a.e();
    }

    private void h(c cVar, h hVar, Context context, k kVar) {
        this.f34424a = d4.g(new r6(cVar));
        m0.d(cVar, new p6(this));
        hVar.a("plugins.flutter.io/webview", new m(this.f34424a));
        this.f34426c = new w6(this.f34424a, cVar, new w6.b(), context);
        this.f34427d = new j4(this.f34424a, new j4.a(), new i4(cVar, this.f34424a), new Handler(context.getMainLooper()));
        p0.d(cVar, new e4(this.f34424a));
        x3.b0(cVar, this.f34426c);
        s0.d(cVar, this.f34427d);
        u2.f(cVar, new d6(this.f34424a, new d6.b(), new t5(cVar, this.f34424a)));
        p1.n(cVar, new v4(this.f34424a, new v4.b(), new u4(cVar, this.f34424a)));
        y.d(cVar, new h(this.f34424a, new h.a(), new g(cVar, this.f34424a)));
        f2.F(cVar, new h5(this.f34424a, new h5.a()));
        c0.f(cVar, new l(kVar));
        s.j(cVar, new c(cVar, this.f34424a));
        i2.f(cVar, new i5(this.f34424a, new i5.a()));
        if (Build.VERSION.SDK_INT >= 21) {
            w0.f(cVar, new l4(cVar, this.f34424a));
        }
        f0.d(cVar, new z3(cVar, this.f34424a));
        v.d(cVar, new e(cVar, this.f34424a));
        k0.h(cVar, new b4(cVar, this.f34424a));
    }

    private void i(Context context) {
        this.f34426c.A(context);
        this.f34427d.b(new Handler(context.getMainLooper()));
    }

    public d4 d() {
        return this.f34424a;
    }

    public void onAttachedToActivity(ec.c cVar) {
        i(cVar.getActivity());
    }

    public void onAttachedToEngine(a.b bVar) {
        this.f34425b = bVar;
        h(bVar.b(), bVar.e(), bVar.a(), new k.a(bVar.a().getAssets(), bVar.c()));
    }

    public void onDetachedFromActivity() {
        i(this.f34425b.a());
    }

    public void onDetachedFromActivityForConfigChanges() {
        i(this.f34425b.a());
    }

    public void onDetachedFromEngine(a.b bVar) {
        d4 d4Var = this.f34424a;
        if (d4Var != null) {
            d4Var.n();
            this.f34424a = null;
        }
    }

    public void onReattachedToActivityForConfigChanges(ec.c cVar) {
        i(cVar.getActivity());
    }
}
