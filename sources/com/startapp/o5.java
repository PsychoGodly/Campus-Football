package com.startapp;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;

/* compiled from: Sta */
public class o5 extends WebViewClient {
    private static final String LOG_TAG = o5.class.getSimpleName();
    private static final String MRAID_JS = "mraid.js";
    private static final String MRAID_PREFIX = "mraid://";
    private e5 controller;
    private boolean isMraidInjected = false;

    public o5(e5 e5Var) {
        this.controller = e5Var;
    }

    private WebResourceResponse createMraidInjectionResponse() {
        StringBuilder a10 = p0.a("javascript:");
        a10.append(f5.a());
        return new WebResourceResponse("text/javascript", "UTF-8", new ByteArrayInputStream(a10.toString().getBytes()));
    }

    public boolean invokeMraidMethod(String str) {
        Class<e5> cls = e5.class;
        String[] strArr = {"close", "resize"};
        String[] strArr2 = {"createCalendarEvent", "expand", "open", "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {"setOrientationProperties", "setResizeProperties"};
        try {
            Map<String, String> a10 = m5.a(str);
            String str2 = a10.get("command");
            if (Arrays.asList(strArr).contains(str2)) {
                cls.getDeclaredMethod(str2, new Class[0]).invoke(this.controller, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = cls.getDeclaredMethod(str2, new Class[]{String.class});
                char c10 = 65535;
                int hashCode = str2.hashCode();
                String str3 = "useCustomClose";
                if (hashCode != -733616544) {
                    if (hashCode == 1614272768) {
                        if (str2.equals(str3)) {
                            c10 = 1;
                        }
                    }
                } else if (str2.equals("createCalendarEvent")) {
                    c10 = 0;
                }
                if (c10 == 0) {
                    str3 = "eventJSON";
                } else if (c10 != 1) {
                    str3 = "url";
                }
                declaredMethod.invoke(this.controller, new Object[]{a10.get(str3)});
            } else if (Arrays.asList(strArr3).contains(str2)) {
                cls.getDeclaredMethod(str2, new Class[]{Map.class}).invoke(this.controller, new Object[]{a10});
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean isMraidUrl(String str) {
        return str != null && str.startsWith(MRAID_PREFIX);
    }

    public boolean matchesInjectionUrl(String str) {
        try {
            return MRAID_JS.equals(Uri.parse(str.toLowerCase(Locale.US)).getLastPathSegment());
        } catch (Exception unused) {
            return false;
        }
    }

    public void onReceivedError(WebView webView, int i10, String str, String str2) {
        super.onReceivedError(webView, i10, str, str2);
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (this.isMraidInjected || !matchesInjectionUrl(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        this.isMraidInjected = true;
        return createMraidInjectionResponse();
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (webView == null || str == null || j9.b(webView.getContext(), str)) {
            return true;
        }
        if (isMraidUrl(str)) {
            return invokeMraidMethod(str);
        }
        return this.controller.open(str);
    }
}
