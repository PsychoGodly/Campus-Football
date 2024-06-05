package com.applovin.impl.adview;

import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.f0;
import com.applovin.impl.h3;
import com.applovin.impl.jq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.ur;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.mediation.MaxReward;
import com.unity3d.ads.adplayer.AndroidWebViewClient;
import java.util.ArrayList;
import java.util.List;

public class b extends h3 {

    /* renamed from: c  reason: collision with root package name */
    private final t f6437c;

    /* renamed from: d  reason: collision with root package name */
    private final k f6438d;

    /* renamed from: f  reason: collision with root package name */
    private com.applovin.impl.sdk.ad.b f6439f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6440g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6441h;

    /* renamed from: i  reason: collision with root package name */
    private final List f6442i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    private final Object f6443j = new Object();

    public b(k kVar, Context context) {
        super(context);
        if (kVar != null) {
            this.f6438d = kVar;
            this.f6437c = kVar.L();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (x3.k() && ((Boolean) kVar.a(oj.R5)).booleanValue()) {
                setWebViewRenderProcessClient(new d(kVar).a());
            }
            setOnTouchListener(d0.f6452a);
            setOnLongClickListener(new c0(this));
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private void a(String str, String str2, String str3, k kVar, bq bqVar) {
        String a10 = a(str3, str);
        if (StringUtils.isValidString(a10)) {
            if (t.a()) {
                t tVar = this.f6437c;
                tVar.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + a10);
            }
            loadDataWithBaseURL(str2, a10, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
            return;
        }
        String a11 = a((String) kVar.a(oj.O4), str);
        if (StringUtils.isValidString(a11)) {
            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled()) {
                a11 = kVar.Y().a(a11);
            }
            String str4 = a11;
            if (t.a()) {
                t tVar2 = this.f6437c;
                tVar2.a("AdWebView", "Rendering webview for VAST ad with resourceContents : " + str4);
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
            return;
        }
        if (t.a()) {
            t tVar3 = this.f6437c;
            tVar3.a("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
    }

    private void b() {
        synchronized (this.f6443j) {
            for (String a10 : this.f6442i) {
                ur.a(this, a10, "AdWebView", this.f6438d);
            }
            this.f6442i.clear();
        }
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f6440g = true;
        this.f6441h = false;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public com.applovin.impl.sdk.ad.b getCurrentAd() {
        return this.f6439f;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
    }

    public void scrollTo(int i10, int i11) {
    }

    public void setAdHtmlLoaded(boolean z10) {
        this.f6441h = z10;
        if (z10 && ((Boolean) this.f6438d.a(oj.f10358m6)).booleanValue()) {
            b();
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(View view, MotionEvent motionEvent) {
        if (view.hasFocus()) {
            return false;
        }
        view.requestFocus();
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean a(View view) {
        if (!t.a()) {
            return true;
        }
        this.f6437c.a("AdWebView", "Received a LongClick event.");
        return true;
    }

    public void a(c cVar) {
        x xVar;
        if (((Boolean) this.f6438d.a(oj.F1)).booleanValue()) {
            loadUrl(AndroidWebViewClient.BLANK_PAGE);
            clearView();
        }
        if (cVar != null) {
            xVar = cVar;
        } else {
            xVar = new x();
        }
        setWebViewClient(xVar);
        setWebChromeClient(new f0(cVar != null ? cVar.c() : null, this.f6438d));
        synchronized (this.f6442i) {
            this.f6442i.clear();
        }
        onResume();
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        if (!this.f6440g) {
            this.f6439f = bVar;
            try {
                applySettings(bVar);
                if (zp.a(bVar.getSize())) {
                    setVisibility(0);
                }
                if (bVar instanceof a) {
                    loadDataWithBaseURL(bVar.h(), ((a) bVar).e1(), "text/html", (String) null, MaxReward.DEFAULT_LABEL);
                    if (t.a()) {
                        this.f6437c.a("AdWebView", "AppLovinAd rendered");
                    }
                } else if (bVar instanceof bq) {
                    bq bqVar = (bq) bVar;
                    eq e12 = bqVar.e1();
                    if (e12 != null) {
                        jq d10 = e12.d();
                        Uri b10 = d10.b();
                        String uri = b10 != null ? b10.toString() : MaxReward.DEFAULT_LABEL;
                        String a10 = d10.a();
                        String g12 = bqVar.g1();
                        if (!StringUtils.isValidString(uri)) {
                            if (!StringUtils.isValidString(a10)) {
                                if (t.a()) {
                                    this.f6437c.b("AdWebView", "Unable to load companion ad. No resources provided.");
                                    return;
                                }
                                return;
                            }
                        }
                        if (d10.c() == jq.a.STATIC) {
                            if (t.a()) {
                                this.f6437c.a("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a11 = a((String) this.f6438d.a(oj.N4), uri);
                            if (bqVar.w1() && bqVar.isOpenMeasurementEnabled() && bqVar.x1()) {
                                a11 = this.f6438d.Y().a(a11);
                            }
                            loadDataWithBaseURL(bVar.h(), a11, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
                        } else if (d10.c() == jq.a.HTML) {
                            if (StringUtils.isValidString(a10)) {
                                String a12 = a(g12, a10);
                                String str = StringUtils.isValidString(a12) ? a12 : a10;
                                if (t.a()) {
                                    t tVar = this.f6437c;
                                    tVar.a("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str);
                                }
                                loadDataWithBaseURL(bVar.h(), str, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
                            } else if (StringUtils.isValidString(uri)) {
                                if (t.a()) {
                                    this.f6437c.a("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f6438d, bqVar);
                            }
                        } else if (d10.c() == jq.a.IFRAME) {
                            if (StringUtils.isValidString(uri)) {
                                if (t.a()) {
                                    this.f6437c.a("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                }
                                a(uri, bVar.h(), g12, this.f6438d, bqVar);
                            } else if (StringUtils.isValidString(a10)) {
                                String a13 = a(g12, a10);
                                String str2 = StringUtils.isValidString(a13) ? a13 : a10;
                                if (t.a()) {
                                    t tVar2 = this.f6437c;
                                    tVar2.a("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str2);
                                }
                                loadDataWithBaseURL(bVar.h(), str2, "text/html", (String) null, MaxReward.DEFAULT_LABEL);
                            }
                        } else if (t.a()) {
                            this.f6437c.b("AdWebView", "Failed to render VAST companion ad of invalid type");
                        }
                    } else if (t.a()) {
                        this.f6437c.a("AdWebView", "No companion ad provided.");
                    }
                }
            } catch (Throwable th) {
                String valueOf = bVar != null ? String.valueOf(bVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else {
            t.h("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    public void a(String str) {
        if (!((Boolean) this.f6438d.a(oj.f10358m6)).booleanValue()) {
            ur.a(this, str, "AdWebView", this.f6438d);
        } else if (this.f6441h) {
            ur.a(this, str, "AdWebView", this.f6438d);
        } else {
            synchronized (this.f6442i) {
                this.f6442i.add(str);
            }
        }
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }
}
