package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.i;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lc.j;
import lc.k;

public class ChromeCustomTabsChannelDelegate extends ChannelDelegateImpl {
    private ChromeCustomTabsActivity chromeCustomTabsActivity;

    public ChromeCustomTabsChannelDelegate(ChromeCustomTabsActivity chromeCustomTabsActivity2, k kVar) {
        super(kVar);
        this.chromeCustomTabsActivity = chromeCustomTabsActivity2;
    }

    public void dispose() {
        super.dispose();
        this.chromeCustomTabsActivity = null;
    }

    public void onClosed() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onClosed", new HashMap());
        }
    }

    public void onCompletedInitialLoad() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onCompletedInitialLoad", new HashMap());
        }
    }

    public void onGreatestScrollPercentageIncreased(int i10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("scrollPercentage", Integer.valueOf(i10));
            channel.c("onGreatestScrollPercentageIncreased", hashMap);
        }
    }

    public void onItemActionPerform(int i10, String str, String str2) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("id", Integer.valueOf(i10));
            hashMap.put("url", str);
            hashMap.put("title", str2);
            channel.c("onItemActionPerform", hashMap);
        }
    }

    public void onMessageChannelReady() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onMessageChannelReady", new HashMap());
        }
    }

    public void onMethodCall(j jVar, k.d dVar) {
        i iVar;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        Activity activity;
        String str = jVar.f36116a;
        str.hashCode();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1526944655:
                if (str.equals("isEngagementSignalsApiAvailable")) {
                    c10 = 0;
                    break;
                }
                break;
            case -675108676:
                if (str.equals("launchUrl")) {
                    c10 = 1;
                    break;
                }
                break;
            case -334843312:
                if (str.equals("updateSecondaryToolbar")) {
                    c10 = 2;
                    break;
                }
                break;
            case 50870385:
                if (str.equals("updateActionButton")) {
                    c10 = 3;
                    break;
                }
                break;
            case 94756344:
                if (str.equals("close")) {
                    c10 = 4;
                    break;
                }
                break;
            case 1256059502:
                if (str.equals("validateRelationship")) {
                    c10 = 5;
                    break;
                }
                break;
            case 1392239787:
                if (str.equals("requestPostMessageChannel")) {
                    c10 = 6;
                    break;
                }
                break;
            case 1490029383:
                if (str.equals("postMessage")) {
                    c10 = 7;
                    break;
                }
                break;
            case 2000053463:
                if (str.equals("mayLaunchUrl")) {
                    c10 = 8;
                    break;
                }
                break;
        }
        Uri uri = null;
        switch (c10) {
            case 0:
                ChromeCustomTabsActivity chromeCustomTabsActivity2 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity2 == null || (iVar = chromeCustomTabsActivity2.customTabsSession) == null) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                try {
                    dVar.success(Boolean.valueOf(iVar.h(new Bundle())));
                    return;
                } catch (Throwable unused) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
            case 1:
                if (this.chromeCustomTabsActivity != null) {
                    String str2 = (String) jVar.a("url");
                    if (str2 != null) {
                        this.chromeCustomTabsActivity.launchUrl(str2, (Map) jVar.a("headers"), (String) jVar.a("referrer"), (List) jVar.a("otherLikelyURLs"));
                        dVar.success(Boolean.TRUE);
                        return;
                    }
                    dVar.success(Boolean.FALSE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 2:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateSecondaryToolbar(CustomTabsSecondaryToolbar.fromMap((Map) jVar.a("secondaryToolbar")));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 3:
                if (this.chromeCustomTabsActivity != null) {
                    this.chromeCustomTabsActivity.updateActionButton((byte[]) jVar.a("icon"), (String) jVar.a("description"));
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 4:
                ChromeCustomTabsActivity chromeCustomTabsActivity3 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity3 != null) {
                    chromeCustomTabsActivity3.onStop();
                    this.chromeCustomTabsActivity.onDestroy();
                    this.chromeCustomTabsActivity.close();
                    ChromeSafariBrowserManager chromeSafariBrowserManager = this.chromeCustomTabsActivity.manager;
                    if (!(chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || (activity = inAppWebViewFlutterPlugin.activity) == null)) {
                        Intent intent = new Intent(activity, activity.getClass());
                        intent.addFlags(67108864);
                        intent.addFlags(536870912);
                        activity.startActivity(intent);
                    }
                    this.chromeCustomTabsActivity.dispose();
                    dVar.success(Boolean.TRUE);
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            case 5:
                ChromeCustomTabsActivity chromeCustomTabsActivity4 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity4 == null || chromeCustomTabsActivity4.customTabsSession == null) {
                    dVar.success(Boolean.FALSE);
                    return;
                } else {
                    dVar.success(Boolean.valueOf(this.chromeCustomTabsActivity.customTabsSession.o(((Integer) jVar.a("relation")).intValue(), Uri.parse((String) jVar.a("origin")), (Bundle) null)));
                    return;
                }
            case 6:
                ChromeCustomTabsActivity chromeCustomTabsActivity5 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity5 == null || chromeCustomTabsActivity5.customTabsSession == null) {
                    dVar.success(Boolean.FALSE);
                    return;
                }
                String str3 = (String) jVar.a("targetOrigin");
                i iVar2 = this.chromeCustomTabsActivity.customTabsSession;
                Uri parse = Uri.parse((String) jVar.a("sourceOrigin"));
                if (str3 != null) {
                    uri = Uri.parse(str3);
                }
                dVar.success(Boolean.valueOf(iVar2.k(parse, uri, new Bundle())));
                return;
            case 7:
                ChromeCustomTabsActivity chromeCustomTabsActivity6 = this.chromeCustomTabsActivity;
                if (chromeCustomTabsActivity6 == null || chromeCustomTabsActivity6.customTabsSession == null) {
                    dVar.success(-3);
                    return;
                }
                dVar.success(Integer.valueOf(this.chromeCustomTabsActivity.customTabsSession.j((String) jVar.a("message"), new Bundle())));
                return;
            case 8:
                if (this.chromeCustomTabsActivity != null) {
                    dVar.success(Boolean.valueOf(this.chromeCustomTabsActivity.mayLaunchUrl((String) jVar.a("url"), (List) jVar.a("otherLikelyURLs"))));
                    return;
                }
                dVar.success(Boolean.FALSE);
                return;
            default:
                dVar.notImplemented();
                return;
        }
    }

    public void onNavigationEvent(int i10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("navigationEvent", Integer.valueOf(i10));
            channel.c("onNavigationEvent", hashMap);
        }
    }

    public void onOpened() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onOpened", new HashMap());
        }
    }

    public void onPostMessage(String str) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("message", str);
            channel.c("onPostMessage", hashMap);
        }
    }

    public void onRelationshipValidationResult(int i10, Uri uri, boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("relation", Integer.valueOf(i10));
            hashMap.put("requestedOrigin", uri.toString());
            hashMap.put("result", Boolean.valueOf(z10));
            channel.c("onRelationshipValidationResult", hashMap);
        }
    }

    public void onSecondaryItemActionPerform(String str, String str2) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(MediationMetaData.KEY_NAME, str);
            hashMap.put("url", str2);
            channel.c("onSecondaryItemActionPerform", hashMap);
        }
    }

    public void onServiceConnected() {
        k channel = getChannel();
        if (channel != null) {
            channel.c("onServiceConnected", new HashMap());
        }
    }

    public void onSessionEnded(boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("didUserInteract", Boolean.valueOf(z10));
            channel.c("onSessionEnded", hashMap);
        }
    }

    public void onVerticalScrollEvent(boolean z10) {
        k channel = getChannel();
        if (channel != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("isDirectionUp", Boolean.valueOf(z10));
            channel.c("onVerticalScrollEvent", hashMap);
        }
    }
}
