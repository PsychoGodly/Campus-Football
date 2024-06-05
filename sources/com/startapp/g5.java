package com.startapp;

import android.content.Context;
import android.webkit.WebView;
import com.startapp.sdk.adsbase.mraid.bridge.MraidState;

/* compiled from: Sta */
public final class g5 {
    public static void a(MraidState mraidState, WebView webView) {
        j9.a(webView, true, "mraid.fireStateChangeEvent", mraidState.name().toLowerCase());
    }

    public static void b(Context context, int i10, int i11, WebView webView) {
        j9.a(webView, true, "mraid.setScreenSize", Integer.valueOf(Math.round(((float) i10) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i11) / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(Context context, int i10, int i11, WebView webView) {
        j9.a(webView, true, "mraid.setMaxSize", Integer.valueOf(Math.round(((float) i10) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i11) / context.getResources().getDisplayMetrics().density)));
    }

    public static void b(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        j9.a(webView, true, "mraid.setDefaultPosition", Integer.valueOf(Math.round(((float) i10) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i11) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i12) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i13) / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(Context context, int i10, int i11, int i12, int i13, WebView webView) {
        j9.a(webView, true, "mraid.setCurrentPosition", Integer.valueOf(Math.round(((float) i10) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i11) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i12) / context.getResources().getDisplayMetrics().density)), Integer.valueOf(Math.round(((float) i13) / context.getResources().getDisplayMetrics().density)));
    }

    public static void a(WebView webView, String str, String str2) {
        j9.a(webView, true, "mraid.fireErrorEvent", str, str2);
    }

    public static void a(WebView webView, String str, boolean z10) {
        j9.a(webView, false, "mraid.setSupports", str, Boolean.valueOf(z10));
    }
}
