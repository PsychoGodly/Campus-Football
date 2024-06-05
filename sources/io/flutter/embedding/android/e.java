package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.lifecycle.i;
import bd.h;
import com.unity3d.services.UnityAdsConstants;
import io.flutter.embedding.engine.d;
import io.flutter.embedding.engine.g;
import io.flutter.plugin.platform.c;
import java.util.Arrays;
import java.util.List;
import zb.a;

/* compiled from: FlutterActivityAndFragmentDelegate */
class e implements c<Activity> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public c f33394a;

    /* renamed from: b  reason: collision with root package name */
    private io.flutter.embedding.engine.a f33395b;

    /* renamed from: c  reason: collision with root package name */
    k f33396c;

    /* renamed from: d  reason: collision with root package name */
    private io.flutter.plugin.platform.c f33397d;

    /* renamed from: e  reason: collision with root package name */
    ViewTreeObserver.OnPreDrawListener f33398e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f33399f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f33400g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public boolean f33401h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33402i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f33403j;

    /* renamed from: k  reason: collision with root package name */
    private d f33404k;

    /* renamed from: l  reason: collision with root package name */
    private final jc.b f33405l;

    /* compiled from: FlutterActivityAndFragmentDelegate */
    class a implements jc.b {
        a() {
        }

        public void b() {
            e.this.f33394a.b();
            boolean unused = e.this.f33400g = false;
        }

        public void d() {
            e.this.f33394a.d();
            boolean unused = e.this.f33400g = true;
            boolean unused2 = e.this.f33401h = true;
        }
    }

    /* compiled from: FlutterActivityAndFragmentDelegate */
    class b implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k f33407a;

        b(k kVar) {
            this.f33407a = kVar;
        }

        public boolean onPreDraw() {
            if (e.this.f33400g && e.this.f33398e != null) {
                this.f33407a.getViewTreeObserver().removeOnPreDrawListener(this);
                e.this.f33398e = null;
            }
            return e.this.f33400g;
        }
    }

    /* compiled from: FlutterActivityAndFragmentDelegate */
    interface c extends c.d {
        y A();

        void b();

        void c();

        void d();

        List<String> f();

        String g();

        Activity getActivity();

        Context getContext();

        i getLifecycle();

        boolean h();

        String i();

        io.flutter.plugin.platform.c j(Activity activity, io.flutter.embedding.engine.a aVar);

        boolean k();

        io.flutter.embedding.engine.a l(Context context);

        void m(i iVar);

        void n(io.flutter.embedding.engine.a aVar);

        String o();

        String p();

        boolean q();

        boolean r();

        boolean s();

        void t(io.flutter.embedding.engine.a aVar);

        String u();

        void v(h hVar);

        String w();

        g x();

        v y();

        x z();
    }

    e(c cVar) {
        this(cVar, (d) null);
    }

    private d.b g(d.b bVar) {
        String w10 = this.f33394a.w();
        if (w10 == null || w10.isEmpty()) {
            w10 = xb.a.e().c().i();
        }
        a.c cVar = new a.c(w10, this.f33394a.i());
        String p10 = this.f33394a.p();
        if (p10 == null && (p10 = o(this.f33394a.getActivity().getIntent())) == null) {
            p10 = UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
        }
        return bVar.i(cVar).k(p10).j(this.f33394a.f());
    }

    private void h(k kVar) {
        if (this.f33394a.y() == v.surface) {
            if (this.f33398e != null) {
                kVar.getViewTreeObserver().removeOnPreDrawListener(this.f33398e);
            }
            this.f33398e = new b(kVar);
            kVar.getViewTreeObserver().addOnPreDrawListener(this.f33398e);
            return;
        }
        throw new IllegalArgumentException("Cannot delay the first Android view draw when the render mode is not set to `RenderMode.surface`.");
    }

    private void i() {
        String str;
        a.c cVar;
        if (this.f33394a.g() == null && !this.f33395b.j().n()) {
            String p10 = this.f33394a.p();
            if (p10 == null && (p10 = o(this.f33394a.getActivity().getIntent())) == null) {
                p10 = UnityAdsConstants.DefaultUrls.AD_ASSET_PATH;
            }
            String u10 = this.f33394a.u();
            if (("Executing Dart entrypoint: " + this.f33394a.i() + ", library uri: " + u10) == null) {
                str = "\"\"";
            } else {
                str = u10 + ", and sending initial route: " + p10;
            }
            xb.b.f("FlutterActivityAndFragmentDelegate", str);
            this.f33395b.n().c(p10);
            String w10 = this.f33394a.w();
            if (w10 == null || w10.isEmpty()) {
                w10 = xb.a.e().c().i();
            }
            if (u10 == null) {
                cVar = new a.c(w10, this.f33394a.i());
            } else {
                cVar = new a.c(w10, u10, this.f33394a.i());
            }
            this.f33395b.j().l(cVar, this.f33394a.f());
        }
    }

    private void j() {
        if (this.f33394a == null) {
            throw new IllegalStateException("Cannot execute method on a destroyed FlutterActivityAndFragmentDelegate.");
        }
    }

    private String o(Intent intent) {
        Uri data;
        if (!this.f33394a.k() || (data = intent.getData()) == null) {
            return null;
        }
        return data.toString();
    }

    /* access modifiers changed from: package-private */
    public void A() {
        io.flutter.embedding.engine.a aVar;
        xb.b.f("FlutterActivityAndFragmentDelegate", "onResume()");
        j();
        if (this.f33394a.s() && (aVar = this.f33395b) != null) {
            aVar.k().e();
        }
    }

    /* access modifiers changed from: package-private */
    public void B(Bundle bundle) {
        xb.b.f("FlutterActivityAndFragmentDelegate", "onSaveInstanceState. Giving framework and plugins an opportunity to save state.");
        j();
        if (this.f33394a.h()) {
            bundle.putByteArray("framework", this.f33395b.s().h());
        }
        if (this.f33394a.q()) {
            Bundle bundle2 = new Bundle();
            this.f33395b.i().onSaveInstanceState(bundle2);
            bundle.putBundle("plugins", bundle2);
        }
    }

    /* access modifiers changed from: package-private */
    public void C() {
        xb.b.f("FlutterActivityAndFragmentDelegate", "onStart()");
        j();
        i();
        Integer num = this.f33403j;
        if (num != null) {
            this.f33396c.setVisibility(num.intValue());
        }
    }

    /* access modifiers changed from: package-private */
    public void D() {
        io.flutter.embedding.engine.a aVar;
        xb.b.f("FlutterActivityAndFragmentDelegate", "onStop()");
        j();
        if (this.f33394a.s() && (aVar = this.f33395b) != null) {
            aVar.k().d();
        }
        this.f33403j = Integer.valueOf(this.f33396c.getVisibility());
        this.f33396c.setVisibility(8);
    }

    /* access modifiers changed from: package-private */
    public void E(int i10) {
        j();
        io.flutter.embedding.engine.a aVar = this.f33395b;
        if (aVar != null) {
            if (this.f33401h && i10 >= 10) {
                aVar.j().o();
                this.f33395b.v().a();
            }
            this.f33395b.r().n(i10);
        }
    }

    /* access modifiers changed from: package-private */
    public void F() {
        j();
        if (this.f33395b != null) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onUserLeaveHint() to FlutterEngine.");
            this.f33395b.i().c();
            return;
        }
        xb.b.g("FlutterActivityAndFragmentDelegate", "onUserLeaveHint() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void G(boolean z10) {
        io.flutter.embedding.engine.a aVar;
        j();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Received onWindowFocusChanged: ");
        sb2.append(z10 ? "true" : "false");
        xb.b.f("FlutterActivityAndFragmentDelegate", sb2.toString());
        if (this.f33394a.s() && (aVar = this.f33395b) != null) {
            if (z10) {
                aVar.k().a();
            } else {
                aVar.k().f();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void H() {
        this.f33394a = null;
        this.f33395b = null;
        this.f33396c = null;
        this.f33397d = null;
    }

    /* access modifiers changed from: package-private */
    public void I() {
        xb.b.f("FlutterActivityAndFragmentDelegate", "Setting up FlutterEngine.");
        String g10 = this.f33394a.g();
        if (g10 != null) {
            io.flutter.embedding.engine.a a10 = io.flutter.embedding.engine.b.b().a(g10);
            this.f33395b = a10;
            this.f33399f = true;
            if (a10 == null) {
                throw new IllegalStateException("The requested cached FlutterEngine did not exist in the FlutterEngineCache: '" + g10 + "'");
            }
            return;
        }
        c cVar = this.f33394a;
        io.flutter.embedding.engine.a l10 = cVar.l(cVar.getContext());
        this.f33395b = l10;
        if (l10 != null) {
            this.f33399f = true;
            return;
        }
        String o10 = this.f33394a.o();
        if (o10 != null) {
            d a11 = io.flutter.embedding.engine.e.b().a(o10);
            if (a11 != null) {
                this.f33395b = a11.a(g(new d.b(this.f33394a.getContext())));
                this.f33399f = false;
                return;
            }
            throw new IllegalStateException("The requested cached FlutterEngineGroup did not exist in the FlutterEngineGroupCache: '" + o10 + "'");
        }
        xb.b.f("FlutterActivityAndFragmentDelegate", "No preferred FlutterEngine was provided. Creating a new FlutterEngine for this FlutterFragment.");
        d dVar = this.f33404k;
        if (dVar == null) {
            dVar = new d(this.f33394a.getContext(), this.f33394a.x().b());
        }
        this.f33395b = dVar.a(g(new d.b(this.f33394a.getContext()).h(false).l(this.f33394a.h())));
        this.f33399f = false;
    }

    /* access modifiers changed from: package-private */
    public void J() {
        io.flutter.plugin.platform.c cVar = this.f33397d;
        if (cVar != null) {
            cVar.C();
        }
    }

    public void c() {
        if (!this.f33394a.r()) {
            this.f33394a.c();
            return;
        }
        throw new AssertionError("The internal FlutterEngine created by " + this.f33394a + " has been attached to by another activity. To persist a FlutterEngine beyond the ownership of this activity, explicitly create a FlutterEngine");
    }

    /* renamed from: k */
    public Activity d() {
        Activity activity = this.f33394a.getActivity();
        if (activity != null) {
            return activity;
        }
        throw new AssertionError("FlutterActivityAndFragmentDelegate's getAppComponent should only be queried after onAttach, when the host's activity should always be non-null");
    }

    /* access modifiers changed from: package-private */
    public io.flutter.embedding.engine.a l() {
        return this.f33395b;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f33402i;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        return this.f33399f;
    }

    /* access modifiers changed from: package-private */
    public void p(int i10, int i11, Intent intent) {
        j();
        if (this.f33395b != null) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onActivityResult() to FlutterEngine:\nrequestCode: " + i10 + "\nresultCode: " + i11 + "\ndata: " + intent);
            this.f33395b.i().onActivityResult(i10, i11, intent);
            return;
        }
        xb.b.g("FlutterActivityAndFragmentDelegate", "onActivityResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void q(Context context) {
        j();
        if (this.f33395b == null) {
            I();
        }
        if (this.f33394a.q()) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to the Activity that owns this delegate.");
            this.f33395b.i().e(this, this.f33394a.getLifecycle());
        }
        c cVar = this.f33394a;
        this.f33397d = cVar.j(cVar.getActivity(), this.f33395b);
        this.f33394a.n(this.f33395b);
        this.f33402i = true;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        j();
        if (this.f33395b != null) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onBackPressed() to FlutterEngine.");
            this.f33395b.n().a();
            return;
        }
        xb.b.g("FlutterActivityAndFragmentDelegate", "Invoked onBackPressed() before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public View s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, int i10, boolean z10) {
        xb.b.f("FlutterActivityAndFragmentDelegate", "Creating FlutterView.");
        j();
        boolean z11 = true;
        if (this.f33394a.y() == v.surface) {
            Context context = this.f33394a.getContext();
            if (this.f33394a.A() != y.transparent) {
                z11 = false;
            }
            h hVar = new h(context, z11);
            this.f33394a.v(hVar);
            this.f33396c = new k(this.f33394a.getContext(), hVar);
        } else {
            i iVar = new i(this.f33394a.getContext());
            if (this.f33394a.A() != y.opaque) {
                z11 = false;
            }
            iVar.setOpaque(z11);
            this.f33394a.m(iVar);
            this.f33396c = new k(this.f33394a.getContext(), iVar);
        }
        this.f33396c.m(this.f33405l);
        xb.b.f("FlutterActivityAndFragmentDelegate", "Attaching FlutterEngine to FlutterView.");
        this.f33396c.o(this.f33395b);
        this.f33396c.setId(i10);
        x z12 = this.f33394a.z();
        if (z12 != null) {
            xb.b.g("FlutterActivityAndFragmentDelegate", "A splash screen was provided to Flutter, but this is deprecated. See flutter.dev/go/android-splash-migration for migration steps.");
            FlutterSplashView flutterSplashView = new FlutterSplashView(this.f33394a.getContext());
            flutterSplashView.setId(h.e(486947586));
            flutterSplashView.g(this.f33396c, z12);
            return flutterSplashView;
        }
        if (z10) {
            h(this.f33396c);
        }
        return this.f33396c;
    }

    /* access modifiers changed from: package-private */
    public void t() {
        xb.b.f("FlutterActivityAndFragmentDelegate", "onDestroyView()");
        j();
        if (this.f33398e != null) {
            this.f33396c.getViewTreeObserver().removeOnPreDrawListener(this.f33398e);
            this.f33398e = null;
        }
        k kVar = this.f33396c;
        if (kVar != null) {
            kVar.t();
            this.f33396c.B(this.f33405l);
        }
    }

    /* access modifiers changed from: package-private */
    public void u() {
        io.flutter.embedding.engine.a aVar;
        xb.b.f("FlutterActivityAndFragmentDelegate", "onDetach()");
        j();
        this.f33394a.t(this.f33395b);
        if (this.f33394a.q()) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Detaching FlutterEngine from the Activity that owns this Fragment.");
            if (this.f33394a.getActivity().isChangingConfigurations()) {
                this.f33395b.i().h();
            } else {
                this.f33395b.i().g();
            }
        }
        io.flutter.plugin.platform.c cVar = this.f33397d;
        if (cVar != null) {
            cVar.p();
            this.f33397d = null;
        }
        if (this.f33394a.s() && (aVar = this.f33395b) != null) {
            aVar.k().b();
        }
        if (this.f33394a.r()) {
            this.f33395b.g();
            if (this.f33394a.g() != null) {
                io.flutter.embedding.engine.b.b().d(this.f33394a.g());
            }
            this.f33395b = null;
        }
        this.f33402i = false;
    }

    /* access modifiers changed from: package-private */
    public void v(Intent intent) {
        j();
        if (this.f33395b != null) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onNewIntent() to FlutterEngine and sending pushRouteInformation message.");
            this.f33395b.i().d(intent);
            String o10 = o(intent);
            if (o10 != null && !o10.isEmpty()) {
                this.f33395b.n().b(o10);
                return;
            }
            return;
        }
        xb.b.g("FlutterActivityAndFragmentDelegate", "onNewIntent() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void w() {
        io.flutter.embedding.engine.a aVar;
        xb.b.f("FlutterActivityAndFragmentDelegate", "onPause()");
        j();
        if (this.f33394a.s() && (aVar = this.f33395b) != null) {
            aVar.k().c();
        }
    }

    /* access modifiers changed from: package-private */
    public void x() {
        xb.b.f("FlutterActivityAndFragmentDelegate", "onPostResume()");
        j();
        if (this.f33395b != null) {
            J();
        } else {
            xb.b.g("FlutterActivityAndFragmentDelegate", "onPostResume() invoked before FlutterFragment was attached to an Activity.");
        }
    }

    /* access modifiers changed from: package-private */
    public void y(int i10, String[] strArr, int[] iArr) {
        j();
        if (this.f33395b != null) {
            xb.b.f("FlutterActivityAndFragmentDelegate", "Forwarding onRequestPermissionsResult() to FlutterEngine:\nrequestCode: " + i10 + "\npermissions: " + Arrays.toString(strArr) + "\ngrantResults: " + Arrays.toString(iArr));
            this.f33395b.i().onRequestPermissionsResult(i10, strArr, iArr);
            return;
        }
        xb.b.g("FlutterActivityAndFragmentDelegate", "onRequestPermissionResult() invoked before FlutterFragment was attached to an Activity.");
    }

    /* access modifiers changed from: package-private */
    public void z(Bundle bundle) {
        Bundle bundle2;
        xb.b.f("FlutterActivityAndFragmentDelegate", "onRestoreInstanceState. Giving framework and plugins an opportunity to restore state.");
        j();
        byte[] bArr = null;
        if (bundle != null) {
            Bundle bundle3 = bundle.getBundle("plugins");
            bArr = bundle.getByteArray("framework");
            bundle2 = bundle3;
        } else {
            bundle2 = null;
        }
        if (this.f33394a.h()) {
            this.f33395b.s().j(bArr);
        }
        if (this.f33394a.q()) {
            this.f33395b.i().b(bundle2);
        }
    }

    e(c cVar, d dVar) {
        this.f33405l = new a();
        this.f33394a = cVar;
        this.f33401h = false;
        this.f33404k = dVar;
    }
}
