package com.applovin.impl.adview.activity;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.h0;
import com.applovin.impl.n9;
import com.applovin.impl.ob;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.tm;
import com.applovin.impl.xl;
import com.applovin.mediation.MaxReward;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class a implements ServiceConnection {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final k f6425a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final t f6426b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final WeakReference f6427c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f6428d = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public Messenger f6429e;

    /* renamed from: com.applovin.impl.adview.activity.a$a  reason: collision with other inner class name */
    class C0116a implements AppLovinAdLoadListener {
        C0116a() {
        }

        public void adReceived(AppLovinAd appLovinAd) {
            AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) a.this.f6427c.get();
            if (appLovinFullscreenActivity != null) {
                t unused = a.this.f6426b;
                if (t.a()) {
                    a.this.f6426b.a("AppLovinFullscreenActivity", "Presenting ad...");
                }
                b bVar = new b(a.this, (C0116a) null);
                n9.a((com.applovin.impl.sdk.ad.b) appLovinAd, bVar, bVar, bVar, (Map) null, a.this.f6425a, appLovinFullscreenActivity, new C0117a(appLovinFullscreenActivity, appLovinAd, bVar));
                return;
            }
            t unused2 = a.this.f6426b;
            if (t.a()) {
                t b10 = a.this.f6426b;
                b10.b("AppLovinFullscreenActivity", "Unable to present ad, parent activity has been GC'd - " + appLovinAd);
            }
        }

        public void failedToReceiveAd(int i10) {
            a.this.a();
        }

        /* renamed from: com.applovin.impl.adview.activity.a$a$a  reason: collision with other inner class name */
        class C0117a implements n9.d {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ AppLovinFullscreenActivity f6431a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ AppLovinAd f6432b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ b f6433c;

            C0117a(AppLovinFullscreenActivity appLovinFullscreenActivity, AppLovinAd appLovinAd, b bVar) {
                this.f6431a = appLovinFullscreenActivity;
                this.f6432b = appLovinAd;
                this.f6433c = bVar;
            }

            public void a(n9 n9Var) {
                this.f6431a.setPresenter(n9Var);
                n9Var.A();
            }

            public void a(String str, Throwable th) {
                ob.a((com.applovin.impl.sdk.ad.b) this.f6432b, this.f6433c, str, th, this.f6431a);
            }
        }
    }

    private class b implements AppLovinAdDisplayListener, AppLovinAdClickListener, AppLovinAdVideoPlaybackListener {
        private b() {
        }

        private void a(FullscreenAdService.c cVar) {
            a((Bundle) null, cVar);
        }

        public void adClicked(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_CLICKED);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_DISPLAYED);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_HIDDEN);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            a(FullscreenAdService.c.AD_VIDEO_STARTED);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d10, boolean z10) {
            Bundle bundle = new Bundle();
            bundle.putDouble("percent_viewed", d10);
            bundle.putBoolean("fully_watched", z10);
            a(bundle, FullscreenAdService.c.AD_VIDEO_ENDED);
        }

        /* synthetic */ b(a aVar, C0116a aVar2) {
            this();
        }

        private void a(Bundle bundle, FullscreenAdService.c cVar) {
            Message obtain = Message.obtain((Handler) null, cVar.b());
            if (bundle != null) {
                obtain.setData(bundle);
            }
            try {
                a.this.f6429e.send(obtain);
            } catch (RemoteException e10) {
                t unused = a.this.f6426b;
                if (t.a()) {
                    t b10 = a.this.f6426b;
                    b10.a("AppLovinFullscreenActivity", "Failed to forward callback (" + cVar.b() + ")", e10);
                }
            }
        }
    }

    private static class c extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference f6436a;

        /* synthetic */ c(a aVar, C0116a aVar2) {
            this(aVar);
        }

        public void handleMessage(Message message) {
            a aVar;
            if (message.what != FullscreenAdService.c.AD.b() || (aVar = (a) this.f6436a.get()) == null) {
                super.handleMessage(message);
            } else {
                aVar.a(message.getData().getString(FullscreenAdService.DATA_KEY_RAW_FULL_AD_RESPONSE));
            }
        }

        private c(a aVar) {
            this.f6436a = new WeakReference(aVar);
        }
    }

    public a(AppLovinFullscreenActivity appLovinFullscreenActivity, k kVar) {
        this.f6425a = kVar;
        this.f6426b = kVar.L();
        this.f6427c = new WeakReference(appLovinFullscreenActivity);
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f6428d.compareAndSet(false, true)) {
            if (t.a()) {
                t tVar = this.f6426b;
                tVar.a("AppLovinFullscreenActivity", "Fullscreen ad service connected to " + componentName);
            }
            this.f6429e = new Messenger(iBinder);
            Message obtain = Message.obtain((Handler) null, FullscreenAdService.c.AD.b());
            obtain.replyTo = new Messenger(new c(this, (C0116a) null));
            try {
                if (t.a()) {
                    this.f6426b.a("AppLovinFullscreenActivity", "Requesting ad from FullscreenAdService...");
                }
                this.f6429e.send(obtain);
            } catch (RemoteException e10) {
                if (t.a()) {
                    this.f6426b.a("AppLovinFullscreenActivity", "Failed to send ad request message to FullscreenAdService", e10);
                }
                a();
            }
        }
    }

    public void onServiceDisconnected(ComponentName componentName) {
        if (this.f6428d.compareAndSet(true, false) && t.a()) {
            t tVar = this.f6426b;
            tVar.a("AppLovinFullscreenActivity", "FullscreenAdService disconnected from " + componentName);
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        AppLovinFullscreenActivity appLovinFullscreenActivity = (AppLovinFullscreenActivity) this.f6427c.get();
        if (appLovinFullscreenActivity != null) {
            if (t.a()) {
                this.f6426b.a("AppLovinFullscreenActivity", "Dismissing...");
            }
            appLovinFullscreenActivity.dismiss();
        } else if (t.a()) {
            this.f6426b.b("AppLovinFullscreenActivity", "Unable to dismiss parent Activity");
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = JsonUtils.getString(jSONObject, "zone_id", MaxReward.DEFAULT_LABEL);
            if (!TextUtils.isEmpty(string)) {
                this.f6425a.l0().a((xl) new tm(jSONObject, h0.a(string), new C0116a(), this.f6425a));
                return;
            }
            throw new IllegalStateException("No zone identifier found in ad response: " + jSONObject);
        } catch (JSONException e10) {
            if (t.a()) {
                t tVar = this.f6426b;
                tVar.a("AppLovinFullscreenActivity", "Unable to process ad: " + str, e10);
            }
            a();
        }
    }
}
