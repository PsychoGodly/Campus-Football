package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.network.d;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.HashMap;
import java.util.Map;

public abstract class up {

    class a extends p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f12628a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.applovin.impl.adview.a f12629b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f12630c;

        a(String str, com.applovin.impl.adview.a aVar, k kVar) {
            this.f12628a = str;
            this.f12629b = aVar;
            this.f12630c = kVar;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof AppLovinWebViewActivity) {
                ((AppLovinWebViewActivity) activity).loadUrl(this.f12628a, (AppLovinWebViewActivity.EventListener) null);
                bc.c(this.f12629b.e(), (AppLovinAd) this.f12629b.i(), this.f12629b.k());
            }
        }

        public void onActivityDestroyed(Activity activity) {
            if (activity instanceof AppLovinWebViewActivity) {
                bc.a(this.f12629b.e(), (AppLovinAd) this.f12629b.i(), this.f12629b.k());
                this.f12630c.e().b(this);
            }
        }
    }

    public static void a(Uri uri, b bVar, k kVar) {
        String queryParameter = uri.getQueryParameter("n");
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", bVar.getClCode());
            kVar.Z().e(d.b().d(appendQueryParameter).a(false).b(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
            return;
        }
        kVar.L();
        if (t.a()) {
            t L = kVar.L();
            L.b("UriUtils", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    public static boolean b(Uri uri) {
        return uri != null && "applovin".equalsIgnoreCase(uri.getScheme()) && "com.applovin.sdk".equalsIgnoreCase(uri.getHost()) && "/adservice/deeplink".equals(uri.getPath());
    }

    public static void b(Uri uri, b bVar, k kVar) {
        String emptyIfNull = StringUtils.emptyIfNull(uri.getQueryParameter("error"));
        String emptyIfNull2 = StringUtils.emptyIfNull(uri.getQueryParameter("exception"));
        String emptyIfNull3 = StringUtils.emptyIfNull(uri.getQueryParameter("details"));
        HashMap<String, String> hashMap = CollectionUtils.hashMap("source", emptyIfNull);
        CollectionUtils.putStringIfValid("top_main_method", emptyIfNull2, hashMap);
        CollectionUtils.putStringIfValid("details", emptyIfNull3, hashMap);
        if (bVar != null) {
            CollectionUtils.putStringIfValid("ad_size", bVar.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(bVar.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", bVar.getDspName(), hashMap);
        }
        kVar.B().a(o.b.TEMPLATE_ERROR, (Map) hashMap);
    }

    public static Bundle a(Uri uri) {
        Bundle bundle = new Bundle();
        for (String next : uri.getQueryParameterNames()) {
            bundle.putString(next, uri.getQueryParameter(next));
        }
        return bundle;
    }

    public static void a(Uri uri, com.applovin.impl.adview.a aVar, k kVar) {
        com.applovin.impl.adview.b g10 = aVar.g();
        String queryParameter = uri.getQueryParameter("n");
        if (TextUtils.isEmpty(queryParameter)) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("UriUtils", "Could not find url to load from query in original uri");
                return;
            }
            return;
        }
        String queryParameter2 = uri.getQueryParameter("load_type");
        if ("external".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (t.a()) {
                t L = kVar.L();
                L.a("UriUtils", "Loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, kVar);
        } else if ("internal".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (t.a()) {
                t L2 = kVar.L();
                L2.a("UriUtils", "Loading new page in WebView: " + queryParameter);
            }
            g10.loadUrl(queryParameter);
            String queryParameter3 = uri.getQueryParameter("bg_color");
            if (StringUtils.isValidString(queryParameter3)) {
                g10.setBackgroundColor(Color.parseColor(queryParameter3));
            }
        } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (t.a()) {
                t L3 = kVar.L();
                L3.a("UriUtils", "Loading new page in slide-up webview: " + queryParameter);
            }
            kVar.e().a(new a(queryParameter, aVar, kVar));
            Intent intent = new Intent(k.k(), AppLovinWebViewActivity.class);
            intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, kVar.d0());
            intent.setFlags(268435456);
            k.k().startActivity(intent);
        } else if (!"in_app_v2".equalsIgnoreCase(queryParameter2)) {
            kVar.L();
            if (t.a()) {
                kVar.L().b("UriUtils", "Could not find load type in original uri");
            }
        } else if (aVar.j() != null) {
            kVar.L();
            if (t.a()) {
                t L4 = kVar.L();
                L4.a("UriUtils", "Loading new page in Custom Tabs: " + queryParameter);
            }
            kVar.w().a(queryParameter, aVar, kVar.p0());
        } else {
            kVar.L();
            if (t.a()) {
                t L5 = kVar.L();
                L5.a("UriUtils", "Custom Tabs not supported, loading new page externally: " + queryParameter);
            }
            a(queryParameter, aVar, kVar);
        }
    }

    public static boolean a(Uri uri, Context context, k kVar) {
        boolean z10 = false;
        if (uri == null) {
            return false;
        }
        try {
            kVar.L();
            if (t.a()) {
                t L = kVar.L();
                L.d("UriUtils", "Opening URI: " + uri);
            }
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            if (!(context instanceof Activity)) {
                intent.setFlags(268435456);
            }
            if ("market".equals(intent.getScheme()) || "play.google.com".equals(uri.getHost())) {
                intent.setPackage("com.android.vending");
            }
            kVar.f0().pauseForClick();
            context.startActivity(intent);
            z10 = true;
        } catch (Throwable th) {
            kVar.L();
            if (t.a()) {
                t L2 = kVar.L();
                L2.a("UriUtils", "Unable to open \"" + uri + "\".", th);
            }
            kVar.B().a("UriUtils", "openUri", th, (Map) CollectionUtils.hashMap("url", uri.getHost() + uri.getPath()));
        }
        if (!z10) {
            kVar.f0().resumeForClick();
        }
        return z10;
    }

    private static void a(String str, com.applovin.impl.adview.a aVar, k kVar) {
        a(Uri.parse(str), aVar.g().getContext(), kVar);
        bc.b(aVar.e(), (AppLovinAd) aVar.i(), aVar.k());
    }
}
