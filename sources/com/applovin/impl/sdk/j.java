package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.c4;
import com.applovin.impl.oj;
import com.applovin.impl.p;
import com.applovin.impl.sdk.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class j implements AppLovinWebViewActivity.EventListener, i.a {
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final AtomicBoolean f11639h = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static WeakReference f11640i;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f11641a;

    /* renamed from: b  reason: collision with root package name */
    private final t f11642b;

    /* renamed from: c  reason: collision with root package name */
    private AppLovinUserService.OnConsentDialogDismissListener f11643c;

    /* renamed from: d  reason: collision with root package name */
    private i f11644d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public WeakReference f11645e = new WeakReference((Object) null);

    /* renamed from: f  reason: collision with root package name */
    private p f11646f;

    /* renamed from: g  reason: collision with root package name */
    private AtomicBoolean f11647g = new AtomicBoolean();

    class a extends p {
        a() {
        }

        public void onActivityStarted(Activity activity) {
            WeakReference unused = j.this.f11645e = new WeakReference(activity);
        }
    }

    class b extends p {
        b() {
        }

        public void onActivityStarted(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                if (!j.this.f() || j.f11640i.get() != activity) {
                    AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                    WeakReference unused = j.f11640i = new WeakReference(appLovinWebViewActivity);
                    appLovinWebViewActivity.loadUrl((String) j.this.f11641a.a(oj.f10312h0), j.this);
                }
                j.f11639h.set(false);
            }
        }
    }

    j(k kVar) {
        this.f11641a = kVar;
        this.f11642b = kVar.L();
        if (kVar.H() != null) {
            this.f11645e = new WeakReference(kVar.H());
        }
        k.a(k.k()).a(new a());
        this.f11644d = new i(this, kVar);
    }

    private void e() {
        this.f11641a.e().b(this.f11646f);
        if (f()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f11640i.get();
            f11640i = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f11643c;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f11643c = null;
                }
            }
        }
    }

    public void a() {
    }

    public void b(long j10) {
        AppLovinSdkUtils.runOnUiThread(new o0(this, j10));
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        WeakReference weakReference = f11640i;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void g() {
        if (!this.f11647g.getAndSet(true)) {
            AppLovinSdkUtils.runOnUiThread(new r0(this, (String) this.f11641a.a(oj.f10312h0)));
        }
    }

    public void onReceivedEvent(String str) {
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, k.k());
            e();
        } else if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, k.k());
            a(((Boolean) this.f11641a.a(oj.f10336k0)).booleanValue(), ((Long) this.f11641a.a(oj.f10376p0)).longValue());
        } else if ("closed".equalsIgnoreCase(str)) {
            a(((Boolean) this.f11641a.a(oj.f10344l0)).booleanValue(), ((Long) this.f11641a.a(oj.f10384q0)).longValue());
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            a(((Boolean) this.f11641a.a(oj.f10352m0)).booleanValue(), ((Long) this.f11641a.a(oj.f10392r0)).longValue());
        }
    }

    public void b() {
        Activity activity = (Activity) this.f11645e.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new p0(this, activity), ((Long) this.f11641a.a(oj.f10328j0)).longValue());
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        WebView a10 = zp.a(k.k(), "preloading consent dialog", true);
        if (a10 != null) {
            a10.loadUrl(str);
        }
    }

    public void a(Activity activity, AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new q0(this, onConsentDialogDismissListener, activity));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener, Activity activity) {
        if (a(this.f11641a) && !f11639h.getAndSet(true)) {
            this.f11645e = new WeakReference(activity);
            this.f11643c = onConsentDialogDismissListener;
            this.f11646f = new b();
            this.f11641a.e().a(this.f11646f);
            Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f11641a.d0());
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) this.f11641a.a(oj.f10320i0));
            activity.startActivity(intent);
        } else if (onConsentDialogDismissListener != null) {
            onConsentDialogDismissListener.onDismiss();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(long j10) {
        if (t.a()) {
            this.f11642b.a("ConsentDialogManager", "Scheduling repeating consent alert");
        }
        this.f11644d.a(j10, this.f11641a, (i.a) this);
    }

    private void a(boolean z10, long j10) {
        e();
        if (z10) {
            b(j10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
    }

    private boolean a(k kVar) {
        if (f()) {
            t.h("AppLovinSdk", "Consent dialog already showing");
            return false;
        } else if (!c4.a(k.k())) {
            t.h("AppLovinSdk", "No internet available, skip showing of consent dialog");
            return false;
        } else if (!((Boolean) kVar.a(oj.f10304g0)).booleanValue()) {
            if (t.a()) {
                this.f11642b.b("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) kVar.a(oj.f10312h0))) {
            return true;
        } else {
            if (t.a()) {
                this.f11642b.b("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
    }
}
