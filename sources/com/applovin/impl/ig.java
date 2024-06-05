package com.applovin.impl;

import android.view.View;
import android.webkit.WebView;
import com.applovin.impl.sdk.AppLovinAdBase;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdkUtils;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSession;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class ig {

    /* renamed from: a  reason: collision with root package name */
    protected final AppLovinAdBase f8535a;

    /* renamed from: b  reason: collision with root package name */
    protected final k f8536b;

    /* renamed from: c  reason: collision with root package name */
    protected final t f8537c;

    /* renamed from: d  reason: collision with root package name */
    protected final String f8538d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f8539e;

    /* renamed from: f  reason: collision with root package name */
    protected AdSession f8540f;

    /* renamed from: g  reason: collision with root package name */
    protected AdEvents f8541g;

    public ig(AppLovinAdBase appLovinAdBase) {
        this.f8535a = appLovinAdBase;
        this.f8536b = appLovinAdBase.getSdk();
        this.f8537c = appLovinAdBase.getSdk().L();
        String str = "AdEventTracker:" + appLovinAdBase.getAdIdNumber();
        if (StringUtils.isValidString(appLovinAdBase.getDspName())) {
            str = str + ":" + appLovinAdBase.getDspName();
        }
        this.f8538d = str;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str, Runnable runnable) {
        try {
            if (this.f8539e) {
                if (t.a()) {
                    t tVar = this.f8537c;
                    String str2 = this.f8538d;
                    tVar.a(str2, "Running operation: " + str);
                }
                runnable.run();
            }
        } catch (Throwable th) {
            if (t.a()) {
                t tVar2 = this.f8537c;
                String str3 = this.f8538d;
                tVar2.a(str3, "Failed to run operation: " + str, th);
            }
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b(WebView webView) {
        AdSessionContext a10;
        if (!this.f8535a.isOpenMeasurementEnabled()) {
            if (t.a()) {
                this.f8537c.d(this.f8538d, "Skip starting session - Open Measurement disabled");
            }
        } else if (this.f8540f == null) {
            if (t.a()) {
                this.f8537c.a(this.f8538d, "Starting session");
            }
            AdSessionConfiguration a11 = a();
            if (a11 != null && (a10 = a(webView)) != null) {
                try {
                    AdSession createAdSession = AdSession.createAdSession(a11, a10);
                    this.f8540f = createAdSession;
                    try {
                        this.f8541g = AdEvents.createAdEvents(createAdSession);
                        a(this.f8540f);
                        this.f8540f.start();
                        this.f8539e = true;
                        if (t.a()) {
                            this.f8537c.a(this.f8538d, "Session started");
                        }
                    } catch (Throwable th) {
                        if (t.a()) {
                            this.f8537c.a(this.f8538d, "Failed to create ad events", th);
                        }
                    }
                } catch (Throwable th2) {
                    if (t.a()) {
                        this.f8537c.a(this.f8538d, "Failed to create session", th2);
                    }
                }
            }
        } else if (t.a()) {
            t tVar = this.f8537c;
            String str = this.f8538d;
            tVar.k(str, "Attempting to start session again for ad: " + this.f8535a);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f8541g.impressionOccurred();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f8541g.loaded();
    }

    /* access modifiers changed from: protected */
    public abstract AdSessionConfiguration a();

    /* access modifiers changed from: protected */
    public abstract AdSessionContext a(WebView webView);

    /* access modifiers changed from: protected */
    public void a(AdSession adSession) {
    }

    public void e() {
        c((WebView) null);
    }

    public void f() {
        b("stop session", (Runnable) new dy(this));
    }

    public void g() {
        b("track impression event", (Runnable) new cy(this));
    }

    public void h() {
        b("track loaded", (Runnable) new by(this));
    }

    public void c(WebView webView) {
        AppLovinSdkUtils.runOnUiThread(new fy(this, webView));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(String str) {
        this.f8540f.error(ErrorType.VIDEO, str);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(View view, List list) {
        this.f8540f.registerAdView(view);
        this.f8540f.removeAllFriendlyObstructions();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            kg kgVar = (kg) it.next();
            if (kgVar.c() != null) {
                try {
                    this.f8540f.addFriendlyObstruction(kgVar.c(), kgVar.b(), kgVar.a());
                } catch (Throwable th) {
                    if (t.a()) {
                        t tVar = this.f8537c;
                        String str = this.f8538d;
                        tVar.a(str, "Failed to add friendly obstruction (" + kgVar + ")", th);
                    }
                }
            }
        }
    }

    public void a(View view) {
        b(view, Collections.emptyList());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.f8539e = false;
        this.f8540f.finish();
        this.f8540f = null;
        this.f8541g = null;
    }

    /* access modifiers changed from: protected */
    public void b(String str, Runnable runnable) {
        AppLovinSdkUtils.runOnUiThread(new hy(this, str, runnable));
    }

    public void b(String str) {
        b("track error", (Runnable) new gy(this, str));
    }

    public void b(View view, List list) {
        b("update main view: " + view, (Runnable) new ey(this, view, list));
    }
}
