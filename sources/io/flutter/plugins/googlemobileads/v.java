package io.flutter.plugins.googlemobileads;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.webkit.WebView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import io.flutter.embedding.engine.a;
import io.flutter.plugins.webviewflutter.n6;
import n4.r;
import n4.x;

/* compiled from: FlutterMobileAdsWrapper */
public class v {
    public void a(Context context) {
        MobileAds.disableMediationAdapterInitialization(context);
    }

    public x b() {
        return MobileAds.getRequestConfiguration();
    }

    public String c() {
        return MobileAds.getVersion().toString();
    }

    public void d(Context context, OnInitializationCompleteListener onInitializationCompleteListener) {
        MobileAds.initialize(context, onInitializationCompleteListener);
    }

    public void e(Context context, r rVar) {
        MobileAds.openAdInspector(context, rVar);
    }

    public void f(Context context, String str) {
        MobileAds.openDebugMenu(context, str);
    }

    public void g(int i10, a aVar) {
        WebView a10 = n6.a(aVar, (long) i10);
        if (Build.VERSION.SDK_INT < 21) {
            Log.w("FlutterMobileAdsWrapper", "MobileAds.registerWebView does not support API levels less than 21");
        } else if (a10 == null) {
            Log.w("FlutterMobileAdsWrapper", "MobileAds.registerWebView unable to find webView with id: " + i10);
        } else {
            MobileAds.registerWebView(a10);
        }
    }

    public void h(boolean z10) {
        MobileAds.setAppMuted(z10);
    }

    public void i(double d10) {
        MobileAds.setAppVolume((float) d10);
    }
}
