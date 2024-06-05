package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.n9;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ob implements AppLovinInterstitialAdDialog {

    /* renamed from: a  reason: collision with root package name */
    protected final k f10081a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference f10082b;

    /* renamed from: c  reason: collision with root package name */
    private final Map f10083c = Collections.synchronizedMap(new HashMap());

    /* renamed from: d  reason: collision with root package name */
    private volatile AppLovinAdLoadListener f10084d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile AppLovinAdDisplayListener f10085e;

    /* renamed from: f  reason: collision with root package name */
    private volatile AppLovinAdVideoPlaybackListener f10086f;

    /* renamed from: g  reason: collision with root package name */
    private volatile AppLovinAdClickListener f10087g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile com.applovin.impl.sdk.ad.b f10088h;

    class a implements AppLovinAdLoadListener {
        a() {
        }

        public void adReceived(AppLovinAd appLovinAd) {
            ob.this.b(appLovinAd);
            ob.this.showAndRender(appLovinAd);
        }

        public void failedToReceiveAd(int i10) {
            ob.this.b(i10);
        }
    }

    public ob(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f10081a = appLovinSdk.a();
            this.f10082b = new WeakReference(context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    private Context e() {
        return (Context) this.f10082b.get();
    }

    private void h() {
        if (this.f10081a.e().a() == null) {
            this.f10081a.F().c(aa.f6356r);
        }
    }

    public AppLovinAdDisplayListener c() {
        return this.f10085e;
    }

    public AppLovinAdVideoPlaybackListener d() {
        return this.f10086f;
    }

    public com.applovin.impl.sdk.ad.b f() {
        return this.f10088h;
    }

    public Map g() {
        return this.f10083c;
    }

    public void i() {
        com.applovin.impl.sdk.ad.b bVar = this.f10088h;
        long d10 = bVar.d();
        if (bVar.canExpire() && bVar.getTimeToLiveMillis() <= d10) {
            bVar.setExpired();
            bc.b(this.f10085e, (AppLovinAd) bVar);
        } else if (d10 >= 0) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new g00(this, bVar), d10);
        }
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f10087g = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f10085e = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10084d = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f10086f = appLovinAdVideoPlaybackListener;
    }

    public void setExtraInfo(String str, Object obj) {
        if (str != null) {
            this.f10083c.put(str, obj);
            return;
        }
        throw new IllegalArgumentException("No key specified");
    }

    public void show() {
        a((AppLovinAdLoadListener) new a());
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd a10 = zp.a(appLovinAd, this.f10081a);
        Context e10 = e();
        String a11 = a(a10, appLovinAd, e10);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAd, a11);
        } else {
            a((com.applovin.impl.sdk.ad.b) a10, e10);
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }

    public AppLovinAdClickListener b() {
        return this.f10087g;
    }

    private void b(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f10081a.d0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f10081a.e().a() == null && ((Boolean) this.f10081a.a(oj.K2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    public void a() {
        this.f10087g = null;
        this.f10084d = null;
        this.f10086f = null;
        this.f10085e = null;
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, i iVar) {
        if (viewGroup == null || iVar == null) {
            t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            a(appLovinAd, "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            return;
        }
        AppLovinAd a10 = zp.a(appLovinAd, this.f10081a);
        Context e10 = e();
        String a11 = a(a10, appLovinAd, e10);
        if (StringUtils.isValidString(a11)) {
            a(appLovinAd, a11);
            return;
        }
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(iVar, this, this.f10081a);
        iVar.a(appLovinFullscreenAdViewObserver);
        a((com.applovin.impl.sdk.ad.b) a10, viewGroup, appLovinFullscreenAdViewObserver, e10);
    }

    class b implements n9.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10090a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f10091b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ViewGroup f10092c;

        b(Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f10090a = context;
            this.f10091b = appLovinFullscreenAdViewObserver;
            this.f10092c = viewGroup;
        }

        public void a(n9 n9Var) {
            if (r.a((Activity) this.f10090a)) {
                t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                ob.a(ob.this.f10088h, ob.this.f10085e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", (Throwable) null, (AppLovinFullscreenActivity) null);
                return;
            }
            this.f10091b.setPresenter(n9Var);
            try {
                n9Var.a(this.f10092c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                t.h("InterstitialAdDialogWrapper", str);
                ob.a(ob.this.f10088h, ob.this.f10085e, str, (Throwable) null, (AppLovinFullscreenActivity) null);
            }
        }

        public void a(String str, Throwable th) {
            ob.a(ob.this.f10088h, ob.this.f10085e, str, th, (AppLovinFullscreenActivity) null);
        }
    }

    private void a(AppLovinAd appLovinAd, String str) {
        if (this.f10085e == null) {
            return;
        }
        if (this.f10085e instanceof lb) {
            ((lb) this.f10085e).onAdDisplayFailed(str);
        } else {
            this.f10085e.adHidden(appLovinAd);
        }
    }

    public static void a(com.applovin.impl.sdk.ad.b bVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        t.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof lb) {
            bc.a(appLovinAdDisplayListener, str);
        } else {
            bc.b(appLovinAdDisplayListener, (AppLovinAd) bVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    /* access modifiers changed from: private */
    public void b(AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new h00(this, appLovinAd));
    }

    /* access modifiers changed from: private */
    public void b(int i10) {
        AppLovinSdkUtils.runOnUiThread(new b00(this, i10));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.ad.b bVar) {
        this.f10081a.L();
        if (t.a()) {
            this.f10081a.L().a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(bVar);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(AppLovinAd appLovinAd) {
        if (this.f10084d != null) {
            this.f10084d.adReceived(appLovinAd);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(int i10) {
        if (this.f10084d != null) {
            this.f10084d.failedToReceiveAd(i10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context) {
        this.f10081a.L();
        if (t.a()) {
            this.f10081a.L().a("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
        }
        b(context);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(ViewGroup viewGroup, Context context, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f10081a.L();
        if (t.a()) {
            t L = this.f10081a.L();
            L.a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(-16777216);
        n9.a(this.f10088h, this.f10087g, this.f10085e, this.f10086f, this.f10083c, this.f10081a, (Activity) context, new b(context, appLovinFullscreenAdViewObserver, viewGroup));
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f10081a.i().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private String a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            t.h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        } else if (appLovinAd == null) {
            t.h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        } else if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f10081a.a(oj.Y1)).booleanValue()) {
            return null;
        } else {
            t.h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
            return "Attempting to show ad again";
        }
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context, Runnable runnable) {
        if (!TextUtils.isEmpty(bVar.H()) || !bVar.Y0() || c4.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(bVar.O()).setMessage(bVar.N()).setPositiveButton(bVar.M(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new a00(runnable));
        create.show();
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, Context context) {
        h();
        this.f10081a.f().a((h8) bVar);
        this.f10088h = bVar;
        long max = Math.max(0, ((Long) this.f10081a.a(oj.f10370o2)).longValue());
        this.f10081a.L();
        if (t.a()) {
            t L = this.f10081a.L();
            L.a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, (Runnable) new d00(this, context, max));
    }

    private void a(com.applovin.impl.sdk.ad.b bVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        h();
        this.f10081a.f().a((h8) bVar);
        this.f10088h = bVar;
        long max = Math.max(0, ((Long) this.f10081a.a(oj.f10370o2)).longValue());
        this.f10081a.L();
        if (t.a()) {
            t L = this.f10081a.L();
            L.a("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(bVar, context, (Runnable) new e00(this, context, viewGroup, appLovinFullscreenAdViewObserver, max));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, long j10) {
        new Handler(context.getMainLooper()).postDelayed(new c00(this, context), j10);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Context context, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, long j10) {
        new Handler(context.getMainLooper()).postDelayed(new f00(this, viewGroup, context, appLovinFullscreenAdViewObserver), j10);
    }
}
