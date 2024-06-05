package com.iab.omid.library.applovin.adsession;

import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import com.iab.omid.library.applovin.internal.e;
import com.iab.omid.library.applovin.internal.f;
import com.iab.omid.library.applovin.utils.d;
import com.iab.omid.library.applovin.utils.g;
import com.iab.omid.library.applovin.utils.i;
import com.iab.omid.library.applovin.weakreference.a;
import j1.b;
import j1.l;
import j1.r;
import j1.s;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONException;
import org.json.JSONObject;

public class JavaScriptSessionService {
    /* access modifiers changed from: private */
    public static String JS_MESSAGE_DATA_AD_SESSION_ID = "adSessionId";
    /* access modifiers changed from: private */
    public static String JS_MESSAGE_KEY_DATA = "data";
    /* access modifiers changed from: private */
    public static String JS_MESSAGE_KEY_METHOD = "method";
    private static String JS_MESSAGE_LISTENER_JS_SESSION_SERVICE = "omidJsSessionService";
    /* access modifiers changed from: private */
    public static String JS_MESSAGE_METHOD_FINISH_SESSION = "finishSession";
    /* access modifiers changed from: private */
    public static String JS_MESSAGE_METHOD_START_SESSION = "startSession";
    private static i webViewUtil = new i();
    private final HashMap<String, AdSession> adSessions = new HashMap<>();
    private final f friendlyObstructions = new f();
    private final boolean isHtmlAdView;
    private final Partner partner;
    private a weakAdView;
    private final WebView webView;

    public interface TearDownHandler {
        void onTearDown(boolean z10);
    }

    private JavaScriptSessionService(Partner partner2, WebView webView2, boolean z10) {
        g.a();
        g.a((Object) partner2, "Partner is null");
        g.a((Object) webView2, "WebView is null");
        this.partner = partner2;
        this.webView = webView2;
        this.isHtmlAdView = z10;
        addWebViewListener();
    }

    private void addWebViewListener() {
        if (s.a("WEB_MESSAGE_LISTENER")) {
            removeWebViewListener();
            webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE, new HashSet(Arrays.asList(new String[]{"*"})), new r.b() {
                public void onPostMessage(WebView webView, l lVar, Uri uri, boolean z10, b bVar) {
                    try {
                        JSONObject jSONObject = new JSONObject(lVar.c());
                        String string = jSONObject.getString(JavaScriptSessionService.JS_MESSAGE_KEY_METHOD);
                        String string2 = jSONObject.getJSONObject(JavaScriptSessionService.JS_MESSAGE_KEY_DATA).getString(JavaScriptSessionService.JS_MESSAGE_DATA_AD_SESSION_ID);
                        if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_START_SESSION)) {
                            JavaScriptSessionService.this.startSession(string2);
                        } else if (string.equals(JavaScriptSessionService.JS_MESSAGE_METHOD_FINISH_SESSION)) {
                            JavaScriptSessionService.this.finishSession(string2);
                        } else {
                            d.b("Unexpected method in JavaScriptSessionService: " + string);
                        }
                    } catch (JSONException e10) {
                        d.a("Error parsing JS message in JavaScriptSessionService.", e10);
                    }
                }
            });
            return;
        }
        throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
    }

    public static JavaScriptSessionService create(Partner partner2, WebView webView2, boolean z10) {
        return new JavaScriptSessionService(partner2, webView2, z10);
    }

    private AdSessionConfiguration createAdSessionConfiguration() {
        CreativeType creativeType = CreativeType.DEFINED_BY_JAVASCRIPT;
        ImpressionType impressionType = ImpressionType.DEFINED_BY_JAVASCRIPT;
        Owner owner = Owner.JAVASCRIPT;
        return AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, owner, false);
    }

    private AdSessionContext createAdSessionContext() {
        return this.isHtmlAdView ? AdSessionContext.createHtmlAdSessionContext(this.partner, this.webView, (String) null, (String) null) : AdSessionContext.createJavascriptAdSessionContext(this.partner, this.webView, (String) null, (String) null);
    }

    /* access modifiers changed from: private */
    public void finishSession(String str) {
        AdSession adSession = this.adSessions.get(str);
        if (adSession != null) {
            adSession.finish();
            this.adSessions.remove(str);
        }
    }

    /* access modifiers changed from: private */
    public void removeWebViewListener() {
        webViewUtil.a(this.webView, JS_MESSAGE_LISTENER_JS_SESSION_SERVICE);
    }

    /* access modifiers changed from: private */
    public void startSession(String str) {
        a aVar = new a(createAdSessionConfiguration(), createAdSessionContext(), str);
        this.adSessions.put(str, aVar);
        aVar.registerAdView(this.isHtmlAdView ? this.webView : getAdView());
        for (e next : this.friendlyObstructions.a()) {
            aVar.addFriendlyObstruction((View) next.c().get(), next.b(), next.a());
        }
        aVar.start();
    }

    public void addFriendlyObstruction(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        for (AdSession addFriendlyObstruction : this.adSessions.values()) {
            addFriendlyObstruction.addFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }
        this.friendlyObstructions.a(view, friendlyObstructionPurpose, str);
    }

    /* access modifiers changed from: package-private */
    public View getAdView() {
        a aVar = this.weakAdView;
        if (aVar == null) {
            return null;
        }
        return (View) aVar.get();
    }

    public void removeAllFriendlyObstructions() {
        for (AdSession removeAllFriendlyObstructions : this.adSessions.values()) {
            removeAllFriendlyObstructions.removeAllFriendlyObstructions();
        }
        this.friendlyObstructions.b();
    }

    public void removeFriendlyObstruction(View view) {
        for (AdSession removeFriendlyObstruction : this.adSessions.values()) {
            removeFriendlyObstruction.removeFriendlyObstruction(view);
        }
        this.friendlyObstructions.c(view);
    }

    public void setAdView(View view) {
        if (!this.isHtmlAdView) {
            for (AdSession registerAdView : this.adSessions.values()) {
                registerAdView.registerAdView(view);
            }
            this.weakAdView = new a(view);
        } else if (view != this.webView) {
            throw new UnsupportedOperationException("For HTML-rendered ads, the ad view is automatically set to the web view and cannot be changed.");
        }
    }

    public void tearDown(final TearDownHandler tearDownHandler) {
        for (AdSession finish : this.adSessions.values()) {
            finish.finish();
        }
        final Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                JavaScriptSessionService.this.removeWebViewListener();
                tearDownHandler.onTearDown(true);
                timer.cancel();
            }
        }, 1000);
    }
}
