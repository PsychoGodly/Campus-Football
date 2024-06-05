package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.oj;
import com.applovin.impl.qj;
import com.applovin.impl.r;
import com.applovin.impl.r6;
import com.applovin.impl.s;
import com.applovin.impl.s9;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class AppLovinFullscreenActivity extends Activity implements r6 {
    public static ob parentInterstitialWrapper;

    /* renamed from: a  reason: collision with root package name */
    private k f5995a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public n9 f5996b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f5997c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f5998d;

    /* renamed from: f  reason: collision with root package name */
    private b f5999f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6000g;

    private static class b implements OnBackInvokedCallback {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f6002a;

        protected b(Runnable runnable) {
            this.f6002a = runnable;
        }

        public void onBackInvoked() {
            this.f6002a.run();
        }
    }

    /* access modifiers changed from: private */
    public void b() {
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.u();
        }
        if (zp.e(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void dismiss() {
        if (x3.l() && this.f5999f != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f5999f);
            this.f5999f = null;
        }
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.f();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null || parentInterstitialWrapper != null) {
            try {
                requestWindowFeature(1);
            } catch (Throwable th) {
                t.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
            }
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(16777216);
            getWindow().addFlags(128);
            View findViewById = findViewById(16908290);
            findViewById.setBackgroundColor(-16777216);
            String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
            if (TextUtils.isEmpty(stringExtra)) {
                ob obVar = parentInterstitialWrapper;
                if (!(obVar == null || obVar.f() == null)) {
                    ob.a(parentInterstitialWrapper.f(), parentInterstitialWrapper.c(), "Empty SDK key", (Throwable) null, this);
                }
                finish();
                return;
            }
            k a10 = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).a();
            this.f5995a = a10;
            this.f6000g = ((Boolean) a10.a(oj.I2)).booleanValue();
            findViewById.setFitsSystemWindows(true);
            r.a(this.f6000g, (Activity) this);
            if (x3.l() && ((Boolean) this.f5995a.a(oj.X5)).booleanValue()) {
                this.f5999f = new b(new a(this));
                getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f5999f);
            }
            a();
            ob obVar2 = parentInterstitialWrapper;
            if (obVar2 != null) {
                n9.a(obVar2.f(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), parentInterstitialWrapper.d(), parentInterstitialWrapper.g(), this.f5995a, this, new a());
                return;
            }
            Intent intent = new Intent(this, FullscreenAdService.class);
            com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f5995a);
            this.f5998d = aVar;
            bindService(intent, aVar, 1);
            if (x3.j()) {
                String str = this.f5995a.g0().getExtraParameters().get("disable_set_data_dir_suffix");
                if (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) {
                    try {
                        WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                    } catch (Throwable unused) {
                    }
                }
            }
        } else {
            t.j("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        k kVar = this.f5995a;
        if (kVar != null && ((Boolean) kVar.a(oj.f10402s2)).booleanValue()) {
            this.f5995a.i0().b(qj.M);
            this.f5995a.i0().b(qj.N);
        }
        com.applovin.impl.adview.activity.a aVar = this.f5998d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            if (n9Var.B()) {
                parentInterstitialWrapper.i();
            }
            if (!this.f5996b.k()) {
                this.f5996b.f();
            }
            this.f5996b.v();
        }
        parentInterstitialWrapper = null;
        super.onDestroy();
    }

    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.a(i10, keyEvent);
        }
        return super.onKeyDown(i10, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.w();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        n9 n9Var;
        try {
            super.onResume();
            if (!this.f5997c.get() && (n9Var = this.f5996b) != null) {
                n9Var.x();
            }
        } catch (IllegalArgumentException e10) {
            this.f5995a.L();
            if (t.a()) {
                this.f5995a.L().a("AppLovinFullscreenActivity", "Error was encountered in onResume().", e10);
            }
            this.f5995a.B().a("AppLovinFullscreenActivity", "onResume", (Throwable) e10);
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        n9 n9Var = this.f5996b;
        if (n9Var != null) {
            n9Var.y();
        }
    }

    public void onWindowFocusChanged(boolean z10) {
        if (this.f5996b != null) {
            if (!this.f5997c.getAndSet(false) || (this.f5996b instanceof s9)) {
                this.f5996b.c(z10);
            }
            if (z10) {
                r.a(this.f6000g, (Activity) this);
            }
        }
        super.onWindowFocusChanged(z10);
    }

    public void setPresenter(n9 n9Var) {
        this.f5996b = n9Var;
    }

    class a implements n9.d {
        a() {
        }

        public void a(n9 n9Var) {
            n9 unused = AppLovinFullscreenActivity.this.f5996b = n9Var;
            n9Var.A();
        }

        public void a(String str, Throwable th) {
            ob.a(AppLovinFullscreenActivity.parentInterstitialWrapper.f(), AppLovinFullscreenActivity.parentInterstitialWrapper.c(), str, th, AppLovinFullscreenActivity.this);
        }
    }

    private void a() {
        ob obVar;
        if (((Boolean) this.f5995a.a(oj.f10402s2)).booleanValue() && (obVar = parentInterstitialWrapper) != null && obVar.f() != null) {
            List g10 = parentInterstitialWrapper.f().g();
            if (!CollectionUtils.isEmpty(g10)) {
                s sVar = (s) g10.get(0);
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_url", sVar.c());
                JsonUtils.putStringIfValid(jSONObject, "app_killed_postback_backup_url", sVar.a());
                this.f5995a.i0().b(qj.N, jSONObject.toString());
                this.f5995a.i0().b(qj.M, Long.valueOf(System.currentTimeMillis()));
            }
        }
    }
}
