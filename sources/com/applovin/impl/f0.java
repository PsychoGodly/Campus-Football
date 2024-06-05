package com.applovin.impl;

import android.content.Intent;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.applovin.impl.adview.a;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.ad.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.t;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

public class f0 extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    private final k f7559a;

    /* renamed from: b  reason: collision with root package name */
    private final t f7560b;

    /* renamed from: c  reason: collision with root package name */
    private final a f7561c;

    public f0(a aVar, k kVar) {
        this.f7559a = kVar;
        this.f7560b = kVar.L();
        this.f7561c = aVar;
    }

    private void a(ConsoleMessage consoleMessage) {
        AppLovinBroadcastManager.sendBroadcast(new Intent("com.applovin.al_onPoststitialShow_evaluation_error"), (Map<String, Object>) null);
        b i10 = this.f7561c.i();
        if (i10 != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("source", "AdWebView:onPoststitialShowEvaluationError");
            hashMap.put("top_main_method", consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber());
            hashMap.put("error_message", consoleMessage.message());
            CollectionUtils.putStringIfValid("ad_size", i10.getSize().toString(), hashMap);
            CollectionUtils.putStringIfValid("ad_id", String.valueOf(i10.getAdIdNumber()), hashMap);
            CollectionUtils.putStringIfValid("dsp_name", i10.getDspName(), hashMap);
            this.f7559a.B().a(o.b.TEMPLATE_ERROR, (Map) hashMap);
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = consoleMessage.messageLevel() + ": " + consoleMessage.sourceId() + ": " + consoleMessage.lineNumber() + ": " + consoleMessage.message();
        if (t.a()) {
            this.f7560b.a("AdWebView", str);
        }
        if (consoleMessage.messageLevel() != ConsoleMessage.MessageLevel.ERROR) {
            return true;
        }
        if (!consoleMessage.message().contains("al_onPoststitialShow") && !consoleMessage.message().contains("al_showPostitial")) {
            return true;
        }
        a(consoleMessage);
        return true;
    }

    public boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        if (!t.a()) {
            return true;
        }
        t tVar = this.f7560b;
        tVar.k("AdWebView", "Alert attempted: " + str2);
        return true;
    }

    public boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        if (!t.a()) {
            return true;
        }
        t tVar = this.f7560b;
        tVar.k("AdWebView", "JS onBeforeUnload attempted: " + str2);
        return true;
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        if (!t.a()) {
            return true;
        }
        t tVar = this.f7560b;
        tVar.k("AdWebView", "JS confirm attempted: " + str2);
        return true;
    }

    public void onProgressChanged(WebView webView, int i10) {
        a aVar;
        if (i10 == 100 && (aVar = this.f7561c) != null) {
            aVar.c(webView);
        }
    }

    public void onConsoleMessage(String str, int i10, String str2) {
        if (t.a()) {
            t tVar = this.f7560b;
            tVar.k("AdWebView", "console.log[" + i10 + "] :" + str);
        }
    }
}
