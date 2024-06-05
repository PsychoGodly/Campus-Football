package com.startapp;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;

/* compiled from: Sta */
public final class j5 {
    public static void a(Context context, WebView webView, k5 k5Var) {
        if (k5Var == null) {
            k5Var = new k5(context);
        }
        boolean z10 = true;
        g5.a(webView, "mraid.SUPPORTED_FEATURES.CALENDAR", k5Var.f16036b.contains("calendar") && Build.VERSION.SDK_INT >= 14 && a0.a(k5Var.f16035a, "android.permission.WRITE_CALENDAR"));
        g5.a(webView, "mraid.SUPPORTED_FEATURES.INLINEVIDEO", k5Var.f16036b.contains("inlineVideo"));
        g5.a(webView, "mraid.SUPPORTED_FEATURES.SMS", k5Var.f16036b.contains("sms") && a0.a(k5Var.f16035a, "android.permission.SEND_SMS"));
        g5.a(webView, "mraid.SUPPORTED_FEATURES.STOREPICTURE", k5Var.f16036b.contains("storePicture"));
        if (!k5Var.f16036b.contains("tel") || !a0.a(k5Var.f16035a, "android.permission.CALL_PHONE")) {
            z10 = false;
        }
        g5.a(webView, "mraid.SUPPORTED_FEATURES.TEL", z10);
    }
}
