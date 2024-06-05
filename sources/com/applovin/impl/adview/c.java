package com.applovin.impl.adview;

import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.MotionEvent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.bq;
import com.applovin.impl.eq;
import com.applovin.impl.nq;
import com.applovin.impl.oj;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.x;
import com.applovin.impl.up;
import com.applovin.impl.x3;
import com.applovin.impl.zp;
import com.applovin.sdk.AppLovinAdSize;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c extends x {

    /* renamed from: a  reason: collision with root package name */
    private final k f6445a;

    /* renamed from: b  reason: collision with root package name */
    private final t f6446b;

    /* renamed from: c  reason: collision with root package name */
    private final a f6447c;

    public c(a aVar, k kVar) {
        this.f6445a = kVar;
        this.f6446b = kVar.L();
        this.f6447c = aVar;
    }

    private void a(bq bqVar, b bVar) {
        a(bqVar, bVar, (Bundle) null);
    }

    private void b() {
        this.f6447c.a();
    }

    /* access modifiers changed from: protected */
    public a c() {
        return this.f6447c;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (t.a()) {
            t tVar = this.f6446b;
            tVar.d("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (t.a()) {
            t tVar = this.f6446b;
            tVar.d("AdWebView", "Loaded URL: " + str);
        }
        a aVar = this.f6447c;
        if (aVar != null) {
            aVar.a(webView, str);
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        a aVar = this.f6447c;
        if (aVar != null) {
            b i10 = aVar.i();
            if (t.a()) {
                t tVar = this.f6446b;
                tVar.b("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + i10);
            }
        }
        if (zp.c(webResourceRequest.getUrl().toString())) {
            this.f6445a.B().a("adWebViewReceivedHttpError", webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        a aVar = this.f6447c;
        if (aVar != null) {
            b i10 = aVar.i();
            String str = "Received SSL error: " + sslError;
            if (t.a()) {
                this.f6446b.b("AdWebView", str + " for ad: " + i10);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.render_process_gone"), (Map<String, Object>) null);
        if (this.f6447c == null) {
            return true;
        }
        t.h("AdWebView", "Render process gone for ad: " + this.f6447c.i() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        b i10 = this.f6447c.i();
        if (i10 != null) {
            HashMap<String, String> hashMap = CollectionUtils.hashMap("top_main_method", "onRenderProcessGone");
            CollectionUtils.putStringIfValid("ad_size", i10.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i10.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i10.getDspName(), hashMap);
            if (x3.i()) {
                hashMap.put("source", renderProcessGoneDetail.didCrash() ? "crash" : "non_crash");
            }
            this.f6445a.B().a(o.b.WEB_VIEW_ERROR, (Map) hashMap);
        }
        if (((Boolean) this.f6445a.a(oj.N5)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f6445a.a(oj.Q5)).booleanValue()) {
                String valueOf = i10 != null ? String.valueOf(i10.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView != null && webView.equals(this.f6447c.g())) {
                this.f6447c.b();
                AppLovinAdSize m10 = this.f6447c.m();
                if (zp.a(m10)) {
                    this.f6447c.a(m10);
                    this.f6447c.G();
                }
            }
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!t.a()) {
            return false;
        }
        this.f6446b.b("AdWebView", "No url found for request");
        return false;
    }

    private void a(bq bqVar, b bVar, Bundle bundle) {
        eq e12 = bqVar.e1();
        if (e12 != null) {
            nq.a(e12.a(), this.f6447c.l());
            a(bVar, e12.b(), bundle);
        }
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
        a aVar = this.f6447c;
        if (aVar != null) {
            b i11 = aVar.i();
            String str3 = "Received error with error code: " + i10 + " with description \\'" + str + "\\' for URL: " + str2;
            if (t.a()) {
                this.f6446b.b("AdWebView", str3 + " for ad: " + i11);
            }
        }
        if (zp.c(str2)) {
            this.f6445a.B().a("adWebViewReceivedError", str2, i10);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }

    /* access modifiers changed from: protected */
    public boolean a(WebView webView, String str) {
        boolean z10;
        boolean z11;
        if (this.f6447c == null) {
            return true;
        }
        if (t.a()) {
            t tVar = this.f6446b;
            tVar.d("AdWebView", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof b)) {
            Uri parse = Uri.parse(str);
            b bVar = (b) webView;
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            b i10 = this.f6447c.i();
            if (i10 == null) {
                if (t.a()) {
                    this.f6446b.b("AdWebView", "Unable to process click, ad not found!");
                }
                return true;
            }
            Iterator it = i10.c0().iterator();
            while (true) {
                z10 = false;
                if (!it.hasNext()) {
                    z11 = true;
                    break;
                }
                String str2 = (String) it.next();
                if (StringUtils.isValidString(path) && path.contains(str2)) {
                    z11 = false;
                    break;
                }
            }
            boolean a10 = bVar.a();
            if (!i10.U0() || a10) {
                z10 = z11;
            }
            if (!"applovin".equals(scheme) || !"com.applovin.sdk".equals(host)) {
                if (z10) {
                    List w02 = i10.w0();
                    List v02 = i10.v0();
                    if ((w02.isEmpty() || w02.contains(scheme)) && (v02.isEmpty() || v02.contains(host))) {
                        if (i10 instanceof bq) {
                            bq bqVar = (bq) i10;
                            if (bqVar.v1()) {
                                a(bqVar, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else if (t.a()) {
                        this.f6446b.b("AdWebView", "URL is not whitelisted - bypassing click");
                    }
                }
            } else if ("/adservice/close_ad".equals(path)) {
                String str3 = this.f6445a.g0().getExtraParameters().get("enable_close_URL_ad_value");
                if (StringUtils.isValidString(str3) && Boolean.parseBoolean(str3)) {
                    i10.setMaxAdValue("close_url", str);
                }
                a();
            } else if ("/adservice/expand_ad".equals(path)) {
                if (!i10.V0() || a10) {
                    a(bVar.getLastClickEvent());
                } else {
                    if (t.a()) {
                        this.f6446b.b("AdWebView", "Skipping expand command without user interaction");
                    }
                    return true;
                }
            } else if ("/adservice/contract_ad".equals(path)) {
                b();
            } else if ("/adservice/no_op".equals(path)) {
                return true;
            } else {
                if ("/adservice/load_url".equals(path)) {
                    if (!i10.V0() || a10) {
                        up.a(parse, this.f6447c, this.f6445a);
                    } else {
                        if (t.a()) {
                            this.f6446b.b("AdWebView", "Skipping URL load command without user interaction");
                        }
                        return true;
                    }
                } else if ("/adservice/track_click_now".equals(path)) {
                    if (i10.V0() && !a10) {
                        if (t.a()) {
                            this.f6446b.b("AdWebView", "Skipping click tracking command without user interaction");
                        }
                        return true;
                    } else if (i10 instanceof bq) {
                        a((bq) i10, bVar);
                    } else {
                        a(bVar, Uri.parse("/adservice/track_click_now"));
                    }
                } else if ("/adservice/deeplink".equals(path)) {
                    if (!i10.V0() || a10) {
                        if (i10 instanceof bq) {
                            bq bqVar2 = (bq) i10;
                            if (bqVar2.v1()) {
                                a(bqVar2, bVar);
                            }
                        }
                        a(bVar, parse);
                    } else {
                        if (t.a()) {
                            this.f6446b.b("AdWebView", "Skipping deep link plus command without user interaction");
                        }
                        return true;
                    }
                } else if ("/adservice/postback".equals(path)) {
                    up.a(parse, i10, this.f6445a);
                } else if ("/playable_event".equals(path)) {
                    a(parse);
                } else if ("/adservice/direct_download".equals(path)) {
                    Bundle a11 = up.a(parse);
                    if (i10 instanceof bq) {
                        bq bqVar3 = (bq) i10;
                        if (bqVar3.v1()) {
                            a(bqVar3, bVar, a11);
                        }
                    }
                    a(bVar, i10.j(), a11);
                } else if ("/template_error".equals(path)) {
                    up.b(parse, i10, this.f6445a);
                } else if (this.f6447c.h() != null) {
                    if ("/video_began".equals(path)) {
                        this.f6447c.h().b(zp.a(parse.getQueryParameter("duration"), 0.0d));
                    } else if ("/video_completed".equals(path)) {
                        this.f6447c.h().e();
                    } else if ("/video_progress".equals(path)) {
                        this.f6447c.h().a(zp.a(parse.getQueryParameter("percent_viewed"), 0.0d));
                    } else if ("/video_waiting".equals(path)) {
                        this.f6447c.h().a();
                    } else if ("/video_resumed".equals(path)) {
                        this.f6447c.h().d();
                    }
                } else if ("/adservice/fully_watched".equals(path)) {
                    this.f6447c.z();
                } else {
                    if (t.a()) {
                        t tVar2 = this.f6446b;
                        tVar2.k("AdWebView", "Unknown URL: " + str);
                    }
                    if (t.a()) {
                        t tVar3 = this.f6446b;
                        tVar3.k("AdWebView", "Path: " + path);
                    }
                }
            }
        }
        return true;
    }

    private void a() {
        this.f6447c.y();
    }

    private void a(MotionEvent motionEvent) {
        this.f6447c.a(motionEvent);
    }

    private void a(b bVar, Uri uri) {
        a(bVar, uri, (Bundle) null);
    }

    private void a(b bVar, Uri uri, Bundle bundle) {
        b currentAd = bVar.getCurrentAd();
        AppLovinAdView k10 = this.f6447c.k();
        if (k10 != null && currentAd != null) {
            if (currentAd instanceof bq) {
                ((bq) currentAd).getAdEventTracker().v();
            }
            this.f6447c.a(currentAd, k10, uri, bVar.getAndClearLastClickEvent(), bundle);
        } else if (t.a()) {
            t tVar = this.f6446b;
            tVar.b("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(Uri uri) {
        String str;
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("success", false);
        String queryParameter = uri.getQueryParameter("type");
        if (booleanQueryParameter) {
            str = "Tracked event: " + queryParameter;
        } else {
            str = "Failed to track event: " + queryParameter;
        }
        zp.a(str, k.k());
    }
}
