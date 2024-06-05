package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import androidx.lifecycle.i;
import androidx.lifecycle.p;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import bd.h;
import io.flutter.embedding.android.e;
import io.flutter.embedding.engine.g;
import io.flutter.plugin.platform.c;
import java.util.List;
import xb.b;

/* compiled from: FlutterActivity */
public class d extends Activity implements e.c, p {

    /* renamed from: f  reason: collision with root package name */
    public static final int f33388f = h.e(61938);

    /* renamed from: a  reason: collision with root package name */
    private boolean f33389a = false;

    /* renamed from: b  reason: collision with root package name */
    protected e f33390b;

    /* renamed from: c  reason: collision with root package name */
    private r f33391c;

    /* renamed from: d  reason: collision with root package name */
    private final OnBackInvokedCallback f33392d;

    /* compiled from: FlutterActivity */
    class a implements OnBackInvokedCallback {
        a() {
        }

        public void onBackInvoked() {
            d.this.onBackPressed();
        }
    }

    public d() {
        this.f33392d = Build.VERSION.SDK_INT >= 33 ? new a() : null;
        this.f33391c = new r(this);
    }

    private void B() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void C() {
        if (E() == f.transparent) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    private View D() {
        return this.f33390b.s((LayoutInflater) null, (ViewGroup) null, (Bundle) null, f33388f, y() == v.surface);
    }

    private Drawable H() {
        try {
            Bundle G = G();
            int i10 = G != null ? G.getInt("io.flutter.embedding.android.SplashScreenDrawable") : 0;
            if (i10 != 0) {
                return androidx.core.content.res.h.d(getResources(), i10, getTheme());
            }
            return null;
        } catch (Resources.NotFoundException e10) {
            b.b("FlutterActivity", "Splash screen not found. Ensure the drawable exists and that it's valid.");
            throw e10;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private boolean I() {
        return (getApplicationInfo().flags & 2) != 0;
    }

    private boolean L(String str) {
        e eVar = this.f33390b;
        if (eVar == null) {
            b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after release.");
            return false;
        } else if (eVar.m()) {
            return true;
        } else {
            b.g("FlutterActivity", "FlutterActivity " + hashCode() + " " + str + " called after detach.");
            return false;
        }
    }

    private void M() {
        try {
            Bundle G = G();
            if (G != null) {
                int i10 = G.getInt("io.flutter.embedding.android.NormalTheme", -1);
                if (i10 != -1) {
                    setTheme(i10);
                    return;
                }
                return;
            }
            b.f("FlutterActivity", "Using the launch theme as normal theme.");
        } catch (PackageManager.NameNotFoundException unused) {
            b.b("FlutterActivity", "Could not read meta-data for FlutterActivity. Using the launch theme as normal theme.");
        }
    }

    public y A() {
        if (E() == f.opaque) {
            return y.opaque;
        }
        return y.transparent;
    }

    /* access modifiers changed from: protected */
    public f E() {
        if (getIntent().hasExtra("background_mode")) {
            return f.valueOf(getIntent().getStringExtra("background_mode"));
        }
        return f.opaque;
    }

    /* access modifiers changed from: protected */
    public io.flutter.embedding.engine.a F() {
        return this.f33390b.l();
    }

    /* access modifiers changed from: protected */
    public Bundle G() throws PackageManager.NameNotFoundException {
        return getPackageManager().getActivityInfo(getComponentName(), 128).metaData;
    }

    public void J() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f33392d);
            this.f33389a = true;
        }
    }

    public void K() {
        N();
        e eVar = this.f33390b;
        if (eVar != null) {
            eVar.H();
            this.f33390b = null;
        }
    }

    public void N() {
        if (Build.VERSION.SDK_INT >= 33) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f33392d);
            this.f33389a = false;
        }
    }

    public boolean a() {
        return false;
    }

    public void b() {
    }

    public void c() {
        b.g("FlutterActivity", "FlutterActivity " + this + " connection to the engine " + F() + " evicted by another attaching activity");
        e eVar = this.f33390b;
        if (eVar != null) {
            eVar.t();
            this.f33390b.u();
        }
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 29) {
            reportFullyDrawn();
        }
    }

    public void e(boolean z10) {
        if (z10 && !this.f33389a) {
            J();
        } else if (!z10 && this.f33389a) {
            N();
        }
    }

    public List<String> f() {
        return (List) getIntent().getSerializableExtra("dart_entrypoint_args");
    }

    public String g() {
        return getIntent().getStringExtra("cached_engine_id");
    }

    public Activity getActivity() {
        return this;
    }

    public Context getContext() {
        return this;
    }

    public i getLifecycle() {
        return this.f33391c;
    }

    public boolean h() {
        if (getIntent().hasExtra("enable_state_restoration")) {
            return getIntent().getBooleanExtra("enable_state_restoration", false);
        }
        if (g() != null) {
            return false;
        }
        return true;
    }

    public String i() {
        if (getIntent().hasExtra("dart_entrypoint")) {
            return getIntent().getStringExtra("dart_entrypoint");
        }
        try {
            Bundle G = G();
            String string = G != null ? G.getString("io.flutter.Entrypoint") : null;
            if (string != null) {
                return string;
            }
            return "main";
        } catch (PackageManager.NameNotFoundException unused) {
            return "main";
        }
    }

    public c j(Activity activity, io.flutter.embedding.engine.a aVar) {
        return new c(getActivity(), aVar.o(), this);
    }

    public boolean k() {
        try {
            Bundle G = G();
            if (G != null) {
                return G.getBoolean("flutter_deeplinking_enabled");
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public io.flutter.embedding.engine.a l(Context context) {
        return null;
    }

    public void m(i iVar) {
    }

    public void n(io.flutter.embedding.engine.a aVar) {
        if (!this.f33390b.n()) {
            ic.a.a(aVar);
        }
    }

    public String o() {
        return getIntent().getStringExtra("cached_engine_group_id");
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (L("onActivityResult")) {
            this.f33390b.p(i10, i11, intent);
        }
    }

    public void onBackPressed() {
        if (L("onBackPressed")) {
            this.f33390b.r();
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        M();
        super.onCreate(bundle);
        e eVar = new e(this);
        this.f33390b = eVar;
        eVar.q(this);
        this.f33390b.z(bundle);
        this.f33391c.i(i.a.ON_CREATE);
        C();
        setContentView(D());
        B();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (L("onDestroy")) {
            this.f33390b.t();
            this.f33390b.u();
        }
        K();
        this.f33391c.i(i.a.ON_DESTROY);
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (L("onNewIntent")) {
            this.f33390b.v(intent);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        if (L("onPause")) {
            this.f33390b.w();
        }
        this.f33391c.i(i.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        if (L("onPostResume")) {
            this.f33390b.x();
        }
    }

    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (L("onRequestPermissionsResult")) {
            this.f33390b.y(i10, strArr, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        this.f33391c.i(i.a.ON_RESUME);
        if (L("onResume")) {
            this.f33390b.A();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (L("onSaveInstanceState")) {
            this.f33390b.B(bundle);
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f33391c.i(i.a.ON_START);
        if (L("onStart")) {
            this.f33390b.C();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        if (L("onStop")) {
            this.f33390b.D();
        }
        this.f33391c.i(i.a.ON_STOP);
    }

    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        if (L("onTrimMemory")) {
            this.f33390b.E(i10);
        }
    }

    public void onUserLeaveHint() {
        if (L("onUserLeaveHint")) {
            this.f33390b.F();
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (L("onWindowFocusChanged")) {
            this.f33390b.G(z10);
        }
    }

    public String p() {
        if (getIntent().hasExtra("route")) {
            return getIntent().getStringExtra("route");
        }
        try {
            Bundle G = G();
            if (G != null) {
                return G.getString("io.flutter.InitialRoute");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public boolean q() {
        return true;
    }

    public boolean r() {
        boolean booleanExtra = getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        return (g() != null || this.f33390b.n()) ? booleanExtra : getIntent().getBooleanExtra("destroy_engine_with_activity", true);
    }

    public boolean s() {
        return true;
    }

    public void t(io.flutter.embedding.engine.a aVar) {
    }

    public String u() {
        try {
            Bundle G = G();
            if (G != null) {
                return G.getString("io.flutter.EntrypointUri");
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public void v(h hVar) {
    }

    public String w() {
        String dataString;
        if (!I() || !"android.intent.action.RUN".equals(getIntent().getAction()) || (dataString = getIntent().getDataString()) == null) {
            return null;
        }
        return dataString;
    }

    public g x() {
        return g.a(getIntent());
    }

    public v y() {
        return E() == f.opaque ? v.surface : v.texture;
    }

    public x z() {
        Drawable H = H();
        if (H != null) {
            return new b(H);
        }
        return null;
    }
}
